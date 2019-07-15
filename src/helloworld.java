#this is a demo for github exercise

public class helloworld{

  public Welcome(String wel){
    System.out.println(wel);
  }

 public static main void(String [] args){
    StringBuilder sb=new StringBuilder();
    for(String i:args){
    sb.append(i);
    }
    /*
    * for(int i=0,i<arg.length;i++){
    *    sb.append(args[i]);
    *  }
    */
    Welcome( sb.toString();)
 }
}
