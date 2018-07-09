PImage mustache;
PImage Friend;
void setup(){
  Friend = loadImage("Friend.png");
  size(700,600);
  Friend.resize(width,height);
     mustache = loadImage("mustache.png");
}
void draw(){
  background(Friend);
   image(mustache, mouseX, mouseY);
}