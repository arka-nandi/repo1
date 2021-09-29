<html>
<head>
<style type="text/css">
#bodycontent label { padding-right:20px }
h1 {text-align: center;color: green}
input {
  font-size: 16px;
  font-size: max(16px, 1em);
  font-family: inherit;
  padding: 0.25em 0.5em;
  background-color: #fff;
  border: 2px solid var(--input-border);
  border-radius: 4px;
}
</style>
</head>
<body style="background-color:powderblue;">
<h1>Online form submission</h1>
<form action="/Registration" modelAttribute="Registration" method="post">
  <label for="lname">Name:</label>
  <input type="text" id="lname" name="name"><br><br>
  <label for="email">Email:</label>
  <input type="email" id="email" name="email"><br><br>
  
  <label for="phone"> phone number:</label>
  <input type="tel" id="phone" name="phone"><br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>