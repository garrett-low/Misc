// two sine waves in stereo
SinOsc s => dac.left;
SinOsc t => dac.right;

// set frequencies
220 => s.freq;
361 => t.freq;

// advance time
3 :: second => now;