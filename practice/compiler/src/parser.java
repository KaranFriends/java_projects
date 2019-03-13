import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;
class parser
{
    static int keyword = 0, punctuation = 0, identifier = 0;
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fr = null;
        try {
            fr = new FileReader("/home/karanraj/Desktop/data.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }

        // read from FileReader till the end of file
        //while ((ch=fr.read())!=-1)
        //    System.out.print((char)ch);

        BufferedReader br = new BufferedReader(fr);
        String s;
        int line = 0;
        List<String> ss = new ArrayList<String>();
        System.out.println("the code is");
        while ((s = br.readLine()) != null) {
            System.out.println(s);
            ss.add(s);
            line++;
        }


        for (String e : ss) {

            System.out.println("total keyword  " + keyword);
            System.out.println("total punctuations  " + punctuation);
            System.out.println("total identifier   " + identifier);
            System.out.println("total lines   " + line);
            fr.close();
        }
    }

    static void run(String e)
        {
            String[] sss=e.split(" ");

            for(String ee : sss)
            {
                if(ee.equals("boolean") || ee.equals("byte") || ee.equals("char") || ee.equals("double") || ee.equals("float")
                        || ee.equals("short") || ee.equals("void") || ee.equals("int") || ee.equals("volatile")
                        || ee.equals("long") || ee.equals("while") || ee.equals("for") || ee.equals("do")
                        || ee.equals("switch") || ee.equals("break") || ee.equals("continue") || ee.equals("case")
                        || ee.equals("default") || ee.equals("if") || ee.equals("else") || ee.equals("try")
                        || ee.equals("catch") || ee.equals("finally") || ee.equals("class") || ee.equals("abstract")
                        || ee.equals("extends") || ee.equals("final") || ee.equals("implements") || ee.equals("import")
                        || ee.equals("instanceof") || ee.equals("interface") || ee.equals("native") || ee.equals("new")
                        || ee.equals("package") || ee.equals("private") || ee.equals("protected") || ee.equals("public")
                        || ee.equals("return") || ee.equals("static") || ee.equals("super") || ee.equals("synchronized")
                        || ee.equals("this") || ee.equals("throw") || ee.equals("throws") || ee.equals("transient")
                )
                    keyword++;

                else
                {

                    if(ee.contains("(") || ee.contains(")") || ee.contains("{")|| ee.contains("}")|| ee.contains("[")
                            || ee.contains("]")|| ee.contains(";")|| ee.contains(",")|| ee.contains(".")|| ee.contains(":"))
                    {
                        punctuation++;
                        
                    }
                }
            }
            return;
        }

}