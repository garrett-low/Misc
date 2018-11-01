// drum machine, version 1.0

// SndBufs for kick (bass) and snare drums
SndBuf kick => Gain master => dac;
SndBuf snare => master;

// load up some samples of those
me.dir()+"/audio/kick_01.wav" => kick.read;
me.dir()+"/audio/snare_01.wav" => snare.read;

while (true) {
    // beat 1, play kick drum alone
    0 => kick.pos;
    0.6 :: second => now;
    
    // play both drums on beat 2
    0 => kick.pos;
    0 => snare.pos;
    0.6 :: second => now;
}