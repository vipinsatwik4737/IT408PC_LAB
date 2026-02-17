import java.lang.reflect.Method;
import java.lang.annotation.*;

class AnnotationMain {

    @Bullet(str = "Camlin", dbl = 12.36658)
    public static void anyMethod() {

        try {
            Method mtd = AnnotationMain.class.getMethod("anyMethod");
            Bullet b = mtd.getAnnotation(Bullet.class);

            if (b != null) {
                System.out.println("String... " + b.str());
                System.out.println("Double... " + b.dbl());
            } else {
                System.out.println("Annotation not found.");
            }

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public static void main(String... args) {
        anyMethod();
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Bullet {
    String str();
    double dbl();
}