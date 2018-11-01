/* Random triangle wave  music
Garrett Low */

TriOsc => dac;

while (true)
{
    Math.random2(30,1000) => t.freq;
    Math.random2f(30,1000) :: ms => now;
}