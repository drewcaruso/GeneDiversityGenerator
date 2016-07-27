# GeneDiversityGenerator

GeneDiversityGenerator created by Andrew Caruso May 2016.
This project emulated genetic expression programmiing, and takes the VMAT2 protein sequence, and loads it into an array vmat2Array. There are then methods that mutate the sequence be it adding, deleting, changing, or doing nothing to the original amino acid sequence. The mutate() method then randomly generates mutations to an unchanged sequence, mutating at a rate controlled by random probability. Once the mutate method runs on a sequence, it saves that sequence into a list. At the end of runtime, there are a few hundred sequences that have been mutated saved into a populated list. The sequences are outputted as strings to easy analysis through the console. 

FUTURE DIRECTIONS:
The mutate sequence only mutates an unchanged sequence once before storing it inlist, new code will be written to transfer the strings outputting into the list back to arrays to be mutated yet again.

There also needs to be a "kill" method that will note whether the mutation done on the sequence is too damaging to continue, and remove it from the list.
