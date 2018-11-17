import ddf.minim.*;          //at the very top of your sketch //<>//
AudioSample correct;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch
int X;
int Y; 
PImage donkey;
PImage tail;


void setup(){
donkey = loadImage("donkey.png");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
donkey.resize(width, height);
tail.resize(50, 100);
size(585, 420);     //replace width, height with your picture's dimensions
image(tail, mouseX-10, mouseY-20);
Minim minim = new Minim(this);     //In the setup method
correct = minim.loadSample("correct.wav");     //In setup. Change the file name if you need to
}

void draw(){

if(dist(0, 0, mouseX, mouseY) < 30){
  background (donkey);
}
else{
  background(#00AAC6);
}
image(tail, X, Y);
rect(1, 1, 30, 30);
rect(483, 80, 40, 40);
  if(mousePressed){
   X=mouseX;
   Y=mouseY;
   print (mouseX +" " + mouseY);
  }
 if(mouseX>443&&mouseX<483&&mouseY>80&&mouseY<120){
   if (playSound) {
     correct.trigger();
     playSound = false;
}
 }
 
 

}