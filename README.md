# GeneDiversityGenerator

GeneDiversityGenerator created by Andrew Caruso May 2016.
This project emulated genetic expression programming, and takes the VMAT2 protein sequence, and loads it into an array vmat2Array. There are then methods that mutate the sequence be it adding, deleting, changing, or doing nothing to the original amino acid sequence. The mutate() method then randomly generates mutations to an unchanged sequence, mutating at a rate controlled by random probability. Once the mutate method runs on a sequence, it saves that sequence into a list. At the end of runtime, there are a few hundred sequences that have been mutated saved into a populated list. The sequences are outputted as strings to easy analysis through the console. 

NOTE: Current values for method call probability not exact. Built to be changing values. Current values at any given time not indictive of real biological simulation.

FUTURE DIRECTIONS:
The mutate sequence only mutates an unchanged sequence once before storing it in a list, new code will be written to transfer the strings outputting into the list back to arrays to be mutated yet again.

Also, the mutations are only happening at the amino acid level. Meaning from a biological standpoint this does not directly mimic how the DNA would be altered. The assumption with this build of the code notes that "addAminoAcid" is a mutation that is strong enough to add an entire new amino acid into the protein sequence (something that doesn't really come with one single mutation), it also does not take into account the reading frame since the sequence is all coding portions. Future builds can and should introduce the sequence at the DNA level, so that changes could better mimic actual human biology. 

There also needs to be a "kill" method that will note whether the mutation done on the sequence is too damaging to continue (ideally this sequence would not be viable to produce normal functionality), and remove it from the list.
