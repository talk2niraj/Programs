package dustin.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

/**
 * Very simple demonstration of JDK 7's/Project Coin's "Diamond Operator."
 */
public class DiamondOperatorDemo
{
   /** Use of "raw" type. */
   private static Set<String> rawWithoutExplicitTyping()
   {
      final Set<String> names = new HashSet();
      addNames(names);
      return names;
   }

   /** Explicitly specifying generic class's instantiation parameter type. */
   private static Set<String> explicitTypingExplicitlySpecified()
   {
      final Set<String> names = new HashSet<String>();
      addNames(names);
      return names;
   }

   /** 
    * Inferring generic class's instantiation parameter type with JDK 7's
    * 'Diamond Operator.'
    */
   private static Set<String> explicitTypingInferredWithDiamond()
   {
      final Set<String> names = new HashSet<>();
      addNames(names);
      return names;
   }

   private static void addNames(final Set<String> namesToAddTo)
   {
      namesToAddTo.add("Dustin");
      namesToAddTo.add("Rett");
      namesToAddTo.add("Homer");
   }

   /**
    * Main executable function.
    */
   public static void main(final String[] arguments)
   {
      out.println(rawWithoutExplicitTyping());
      out.println(explicitTypingExplicitlySpecified());
      out.println(explicitTypingInferredWithDiamond());
   }
}