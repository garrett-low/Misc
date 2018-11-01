// Using dac.chan() to connect to multiple speakers
SinOsc s0 => dac.chan(0);
SinOsc s1 => dac.chan(1);
//SinOsc s2 => dac.chan(2);
//SinOsc s3 => dac.chan(3);

// set frequencies
220 => s0.freq;
361 => s1.freq;
//110 => s2.freq;
//440 => s3.freq;

// advance time
3 :: second => now;