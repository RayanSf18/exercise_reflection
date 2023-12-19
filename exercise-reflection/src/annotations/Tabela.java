package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to explicitly specify the corresponding database table name
 * for a class.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
public @interface Tabela {

    /**
     * The name of the corresponding table in the database. By default, it
     * uses the class name.
     */
    String name() default "";

}