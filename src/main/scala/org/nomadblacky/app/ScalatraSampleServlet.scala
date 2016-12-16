package org.nomadblacky.app

import org.scalatra._

class ScalatraSampleServlet extends ScalatrasampleStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
