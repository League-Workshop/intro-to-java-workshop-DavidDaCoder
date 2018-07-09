void setup(){
  fill(#ff0000);
size(500,500);
}
void draw(){
  if(mousePressed){
   fill(#00ffff);
  }else{
fill(#ff0000);
  }
  ellipse(250,250,200,200);
}