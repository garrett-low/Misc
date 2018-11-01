// playing multiple sound files (method2)
SndBuf snare[3];

// for fun, let's pan them to left, right and center
snare[0] => dac.left;
snare[1] => dac;
snare[2] => dac.right;

// pre-load all sound files at the beginning
me.dir()+"/audio/snare_01.wav" => snare[0].read;
me.dir()+"/audio/snare_02.wav" => snare[1].read;
me.dir()+"/audio/snare_03.wav" => snare[2].read;

// infinite loop
while (true) {
    // pick a random number between 0 and #files
    Math.random2(0,snare.cap()-1) => int which;
    
    // play that sample
    0 => snare[which].pos;
    
    // let it play
    0.5 :: second => now;
}