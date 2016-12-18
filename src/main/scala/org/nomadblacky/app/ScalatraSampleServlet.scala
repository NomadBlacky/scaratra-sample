package org.nomadblacky.app

import org.scalatra._

class ScalatraSampleServlet extends ScalatrasampleStack {

  before() {
    contentType = "text/html"
  }

  get("/") {
    <html>
      <head>
        <link rel="stylesheet" type="text/css" href="stylesheet/default.css"></link>
      </head>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
        <p><a href="hoge">hoge</a></p>
        <p><img src="images/crossbeats.png"></img></p>
        <p><a href="react">react</a></p>
      </body>
    </html>
  }

  get("/aaa/:p") {
    params("p")
  }

  get("/twirl/:p") {
    
  }

  notFound {
    <h1>Not found.</h1>
  }

}
