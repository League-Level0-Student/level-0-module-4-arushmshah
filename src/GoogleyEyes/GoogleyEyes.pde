
PImage face;
void setup(){
face = loadImage("GarethBaleFunny.png");
size(990,600);        
face.resize(990,600);



}
void draw(){
  background(face);
  if(mouseX<235){
    mouseX=235;
  } 

    if(mouseY<95){
    mouseY=95;
  } 
   if(mouseX>250){
    mouseX=250;
 } 
  
  if(mouseY>107){
    mouseY=107;
  } 

  fill(#FFFFFF);
  ellipse(240,100,25,18);
  fill(#000000);
  ellipse(mouseX,mouseY,5,5);
  
  fill(#FFFFFF);
  ellipse(270,100,25,18);
  fill(#000000);
  ellipse(mouseX+30,mouseY,5,5);
  }