int x;
int y;
String word;
int maxY  = 121;
int maxX = 120;
int minY = 123;
int minX = 120;
final int SIZE_FACTOR = 100;
void setup(){

String[] lines = loadStrings("drawme(3).txt");
size(600,400);
beginShape();
for (int i = 0; i < lines.length;i++){
word = lines[i];
String[] q = splitTokens(word, ", ()");
for (int j = 0; j < q.length; j = j +2) {
  
x = Integer.parseInt(q[j]);
y = Integer.parseInt(q[j+1]);
x = 8 * (x + width/2);
y = 8 * (y + height/2);

System.out.println(x + " " + y);


vertex(x, y);

}
endShape(CLOSE);
}

}
