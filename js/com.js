// null check
function isNull(str){
  if(str == null || str == "" || str == "undefined"){
    return true; 
  }
  
  return false;
}

// not null check
function isNotNull(str){
  if(str == null || str == "" || str == "undefined"){
    return false; 
  }
  
  return true;
}
