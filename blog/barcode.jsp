<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/JavaScript" src="/lib/jquery-3.6.0.min.js"></script>
<script type="text/JavaScript" src="/lib/jquery-barcode.js"></script>
<script type="text/JavaScript" src="/js/com.js"></script>
<link rel="stylesheet" type="text/css" href="/css/style.css">

<script language="javascript">
$(function(){
  
});  
  
function makeBarcode() {
    var keyword = document.form.keyword.value;
    if (keyword == null || keyword == ""){
      keyword = "9902204005700558990";
    }
  
    $("#bcTarget").barcode(keyword, "code128");   
}

</script>
<title>TITLE</title>
</head>
<body>
<div class="wrapper">
  <form name="form" id="form" method="post">
    <input type="text" name="keyword" value="" class="input-search"/>
    <input type="button" onClick="makeBarcode();" value="바코드 생성" class="btn-search"/>
  </form>
  
  <div id="bcTarget" class="barcodeImg"></div>  
</div>
</body>
</html>
</html>
