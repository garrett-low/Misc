// playing sounds in reverse
SndBuf mySound => dac;

me.dir()+"/audio/hihat_04.wav" => mySound.read;

mySound.samples() => int numSamples;

// play sound once forward
0 => mySound.pos;
numSamples :: samp => now;

// once backward
-1.0 => mySound.rate;
numSamples-1 => mySound.pos; // minus 1 for zero index
numSamples :: samp => now;