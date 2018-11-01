// playing multiple sounds
SndBuf snare => dac;

// make and fill an array of sound file paths+names
string snare_samples[3];
me.dir()+"/audio/snare_01.wav" => snare_samples[0];
me.dir()+"/audio/snare_02.wav" => snare_samples[1];
me.dir()+"/audio/snare_03.wav" => snare_samples[2];

// infinite loop
while (true) {
    // pick a random number between 0 and #files
    Math.random2(0,snare_samples.cap()-1) => int which;
    
    // load up that file
    snare_samples[which] => snare.read;
    
    // let it play
    0.5 :: second => now;
}