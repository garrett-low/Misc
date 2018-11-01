// loading and playing stereo sound files
SndBuf2 myStereoSound => dac;

// load up a stereo file
me.dir()+"/audio/stereo_fx_01.wav" => myStereoSound.read;

// and let it play for the right amount of time
myStereoSound.length() => now;