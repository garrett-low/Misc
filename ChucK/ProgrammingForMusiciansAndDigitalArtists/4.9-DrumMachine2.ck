// drum machine, version 2.0

// SndBufs for kick (bass) and snare drums
SndBuf kick => Gain master => dac;
SndBuf snare => master;

// load up some samples of those
me.dir()+"/audio/kick_01.wav" => kick.read;
me.dir()+"/audio/snare_01.wav" => snare.read;

// declare a new tempo variable
0.15 :: second => dur tempo;

while (true) 
{
    for (0 => int beat; beat < 16; beat++) 
    {
        // play kick drum on beat 0, 4, 8, 12
        if (beat==0 || beat==4 || beat==8 || beat==12)
        {
            0 => kick.pos;
        }
        // play snare drum on beat 4, 10, 13, and 14
        if (beat==4 || beat==10 || beat==13 || beat==14)
        {
            0 => snare.pos;
        }
        tempo => now;
    }
}