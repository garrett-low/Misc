/* Sine music
by Garrett Low
Oct 2018 */

SinOsc s => dac;

// Play one note
220 => s.freq;
1.0 => s.gain;
0.3 :: second => now;
0.0 => s.gain;
0.3 :: second => now;

// Play another note, same pitch
1.0 => s.gain;
0.3 :: second => now;

0.0 => s.gain;
0.3 :: second => now;

// Play two more notes, higher, less loud
330 => s.freq;
0.3 => s.gain;
0.3 :: second => now;

0.0 => s.gain;
0.3 :: second => now;

0.3 => s.gain;
0.3 :: second => now;

0.0 => s.gain;
0.3 :: second => now;