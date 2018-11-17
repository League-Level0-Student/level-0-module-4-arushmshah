PImage donkey;
PImage tail;
void setup(){
donkey = loadImage("donkey.png");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
donkey.resize(width, height);
tail.resize(50, 100);
size(585, 420);     //replace width, height with your picture's dimensions
image(tail, mouseX-10, mouseY-20);
}

void draw(){
if(dist(0, 0, mouseX, mouseY) < 30){
  background (donkey);
}
else{
  background(#00AAC6);
}
image(tail, mouseX, mouseY);
rect(1, 1, 30, 30);
rect(483, 80, 40, 40);
if(dist(0, 0, mouseX, mouseY) < 30){
  background (donkey);
}
}