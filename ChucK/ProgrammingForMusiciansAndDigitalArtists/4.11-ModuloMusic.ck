// modulo math for music

// make and load a couple of SndBufs to "sonify" modulo
SndBuf clickhi => dac;
SndBuf clicklo => dac;
me.dir()+"/audio/click_02.wav" => clickhi.read;
me.dir()+"/audio/click_01.wav" => clicklo.read;

// define a number for our modulo
4 => int MOD;

for (0 => int beat; beat < 24; beat++) {
    // print out beat and beat modulo MOD
    <<< beat, "Modulo ", MOD, " is: ", beat % MOD >>>;
    
    // click this on every beat
    0 => clickhi.pos;
    
    // but only click this on every MODth beat
    if (beat % MOD == 0) {
        0 => clicklo.pos;
    }
    
    0.5 :: second => now;
}