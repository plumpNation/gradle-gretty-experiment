<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
  <head>
    <title>Web Demo JSP</title>
  </head>
  <body>
  <h1>I am a JSP</h1>

  <p>Say <a href="hello">Hello ${messages.hello}</a></p>

  <form method="post" action="hello">
    <h2>Name:</h2>
    <input type="text" id="say-hello-text-input" name="name" />
    <input type="submit" id="say-hello-button" value="Say Hello" />
  </form>
  </body>
</html>
