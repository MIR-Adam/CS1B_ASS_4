/*------------------------------------------------------------------------
Two classes used by assignment #4.  Do not modify these defintions.

Place the definitions into your final submission,  with each element 
appearing above the main Foothill class, and your own classes below
Foothill. 

The imports are needed by my solution and will probably be needed
by yours, so you should place them in your project at the top of the
file(s).
----------------------------------------------------------------------- */
import java.lang.*;
import java.util.*;

// IntPair allows public, no filtering; classes that use it will protect it
class IntPair
{
   public long firstInt;
   public long secondInt;

   // constructors
   IntPair() { firstInt = secondInt = 0; }
   IntPair(long frst, long scnd) { firstInt = frst;  secondInt = scnd; }
   
   public String toString()
   {  
      return "(" + firstInt + ", " + secondInt + ")";
   }
};

//EncryptionSupport contains only static methods that clients can use wherever
//all method names should be fairly descriptive other than inverseMonN(), which
//you can take as a black-box (see description of assignment)