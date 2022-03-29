public class strings 
{
    public static void main(String[] args) 
    {
        String s = "Sharvil"; 
                System.out.println(s.codePointAt(0));
                System.out.println(s.codePointBefore(1));
                System.out.println(s.codePointCount(0, 4));
                System.out.println(s.codePointBefore(1));
                System.out.println(s.compareTo("Patil"));
                System.out.println(s.compareToIgnoreCase("Patil"));
                System.out.println(s.concat("Patil"));
                System.out.println(s.contains("S"));
                System.out.println(s.contentEquals("Sha"));
                System.out.println(s.endsWith("l"));
                System.out.println(s.equals("Sharv"));
                System.out.println(s.indexOf("arv"));
                System.out.println(s.hashCode());
                System.out.println(s.indent(4));
                System.out.println(s.intern());
                System.out.println(s.isBlank());
                System.out.println(s.isEmpty());
                System.out.println(s.lastIndexOf("ar")); 
                System.out.println(s.length());
                System.out.println(s.matches("Sharvil"));
                System.out.println(s.repeat(4));
                System.out.println(s.startsWith("Sh"));
                System.out.println(s.strip());
                System.out.println();               
    }    
}