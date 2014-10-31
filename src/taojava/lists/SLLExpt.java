package taojava.lists;

import java.io.PrintWriter;

/**
 * Some simple experiments with SimpleLinkedLists.
 */
public class SLLExpt
{
  public static void main(String[] args)
    throws Exception
  {
    PrintWriter pen = new PrintWriter(System.out, true);
  //  SimpleListExpt.expt(pen, new SimpleLinkedList<String>());
    
    SimpleLinkedList<String> vm = new SimpleLinkedList<String>();
    SimpleListExpt.add(pen, vm, 
            new String[] { "Hey", "Where", "Did", "We", "Go?" });
    SimpleListExpt.setForwardExpt(pen, vm);
  } // main(String[]
} // SLLExpt
