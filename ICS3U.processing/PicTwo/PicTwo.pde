
void setup() {
size (1200,800);
frameRate(60);
background(0);
rotate(PI/3.0);
fill(255);
rect(600, -1100, 100, 1500);
rotate(radians(240));
fill(255);
rect(-100,-2000, 100, 150000000);
}
void draw() {
stroke(1);
strokeWeight(1);
fill(255,0,0);
rect(550,400,100,800);
fill(0,0,255);
rect(550,400,800,100);
fill(255,255,0);
rect(550,0,100,400);
fill(0,255,0);
rect(0,400,650,100);
fill(255,230,117);
ellipse(600,400,280,290);
fill(255);
ellipse(550,400,65,75);
ellipse(650,400,65,75);
fill(0);
ellipse(640,400,25,25);
ellipse(540,400,25,25);
fill(255,230,117);
strokeWeight(2);
arc(625, 500, 100, 50, radians(180), radians(270));
arc(600, 425, 25, 25, radians(0), radians(90));
fill(0,0,255);
arc(600, 350, 265, 290, radians(180), radians(360));
fill(255,0,0);
ellipse(600,200,50,50);
noStroke();
rect(469,320,263,30);

}
