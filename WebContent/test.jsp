<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>checked demo</title>
  <style>
  div {
    color: red;
  }
  </style>
  <script src="https://code.jquery.com/jquery-3.5.0.js"></script>
</head>
<body>
 
 
  <p>
    <input type="checkbox" name="newsletter" value="Hourly" checked="checked">
 
    <input type="checkbox" name="newsletter1" value="Daily">
    <input type="checkbox" name="newsletter2" value="Weekly">
 
    <input type="checkbox" name="newsletter3" value="Monthly" checked>
    <input type="checkbox" name="newsletter4" value="Yearly">
  </p>
 
<div></div>
 
<script>
var countChecked = function() {
  var n = $( "input:value" ).length;
  $( "div" ).text(n);
};
countChecked();
 
$( "input[type=checkbox]" ).on( "click", countChecked );
</script>
 
</body>
</html>