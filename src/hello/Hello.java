> package hello;
> public class Hello {
>   public static void main(String[] args) {
>     System.out.println("Hello from Pipeline CI!");
>   }
> }
> ^[[200~cat > src/hello/Hello.java << 'EOF'
package hello;
public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello from Pipeline CI!");
  }
}
