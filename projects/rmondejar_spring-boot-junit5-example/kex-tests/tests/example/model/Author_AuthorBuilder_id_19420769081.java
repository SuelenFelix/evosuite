package example.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static example.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class Author_AuthorBuilder_id_19420769081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term90;

    public Author_AuthorBuilder_id_19420769081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Long term43 = new Long(6375119433582206027L);
        Long term53 = new Long(-8257434502486459194L);
        Object term42 = newInstance(Class.forName("example.model.Book"));
        Object term48 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term52 = newInstance(Class.forName("example.model.Author"));
        setField(term42, term42.getClass(), "id", term43);
        setField(term42, term42.getClass(), "title", "");
        setField(term42, term42.getClass(), "description", "");
        setField(term42, term42.getClass(), "genre", "");
        setField(term48, term48.getClass(), "intVal", null);
        setIntField(term48, term48.getClass(), "scale", 53);
        setIntField(term48, term48.getClass(), "precision", 0);
        setField(term48, term48.getClass(), "stringCache", null);
        setLongField(term48, term48.getClass(), "intCompact", -9223372036854775808L);
        setField(term42, term42.getClass(), "price", term48);
        setField(term52, term52.getClass(), "id", term53);
        setField(term52, term52.getClass(), "firstName", null);
        setField(term52, term52.getClass(), "lastName", null);
        setField(term52, term52.getClass(), "email", null);
        setField(term52, term52.getClass(), "books", null);
        setField(term42, term42.getClass(), "author", term52);
        Long term56 = new Long(2535595959091595249L);
        Object term55 = newInstance(Class.forName("example.model.Book"));
        Object term61 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term65 = newInstance(Class.forName("example.model.Author"));
        setField(term55, term55.getClass(), "id", term56);
        setField(term55, term55.getClass(), "title", "");
        setField(term55, term55.getClass(), "description", "");
        setField(term55, term55.getClass(), "genre", "");
        setField(term61, term61.getClass(), "intVal", null);
        setIntField(term61, term61.getClass(), "scale", 53);
        setIntField(term61, term61.getClass(), "precision", 0);
        setField(term61, term61.getClass(), "stringCache", null);
        setLongField(term61, term61.getClass(), "intCompact", -9223372036854775808L);
        setField(term55, term55.getClass(), "price", term61);
        setField(term65, term65.getClass(), "id", null);
        setField(term65, term65.getClass(), "firstName", null);
        setField(term65, term65.getClass(), "lastName", null);
        setField(term65, term65.getClass(), "email", null);
        setField(term65, term65.getClass(), "books", null);
        setField(term55, term55.getClass(), "author", term65);
        Long term67 = new Long(6967924379644551255L);
        Object term66 = newInstance(Class.forName("example.model.Book"));
        Object term72 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term76 = newInstance(Class.forName("example.model.Author"));
        setField(term66, term66.getClass(), "id", term67);
        setField(term66, term66.getClass(), "title", "");
        setField(term66, term66.getClass(), "description", "");
        setField(term66, term66.getClass(), "genre", "");
        setField(term72, term72.getClass(), "intVal", null);
        setIntField(term72, term72.getClass(), "scale", 52);
        setIntField(term72, term72.getClass(), "precision", 0);
        setField(term72, term72.getClass(), "stringCache", null);
        setLongField(term72, term72.getClass(), "intCompact", -9223372036854775808L);
        setField(term66, term66.getClass(), "price", term72);
        setField(term76, term76.getClass(), "id", null);
        setField(term76, term76.getClass(), "firstName", null);
        setField(term76, term76.getClass(), "lastName", null);
        setField(term76, term76.getClass(), "email", null);
        setField(term76, term76.getClass(), "books", null);
        setField(term66, term66.getClass(), "author", term76);
        Long term78 = new Long(-872011222785455006L);
        Object term77 = newInstance(Class.forName("example.model.Book"));
        Object term83 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term87 = newInstance(Class.forName("example.model.Author"));
        setField(term77, term77.getClass(), "id", term78);
        setField(term77, term77.getClass(), "title", "");
        setField(term77, term77.getClass(), "description", "");
        setField(term77, term77.getClass(), "genre", "");
        setField(term83, term83.getClass(), "intVal", null);
        setIntField(term83, term83.getClass(), "scale", 52);
        setIntField(term83, term83.getClass(), "precision", 0);
        setField(term83, term83.getClass(), "stringCache", null);
        setLongField(term83, term83.getClass(), "intCompact", -9223372036854775808L);
        setField(term77, term77.getClass(), "price", term83);
        setField(term87, term87.getClass(), "id", null);
        setField(term87, term87.getClass(), "firstName", null);
        setField(term87, term87.getClass(), "lastName", null);
        setField(term87, term87.getClass(), "email", null);
        setField(term87, term87.getClass(), "books", null);
        setField(term77, term77.getClass(), "author", term87);
        ArrayList term40 = new ArrayList();
        ((ArrayList) term40).add(term42);
        ((ArrayList) term40).add(term55);
        ((ArrayList) term40).add(term66);
        ((ArrayList) term40).add(term77);
        ((ArrayList) term40).add(term55);
        term1 = newInstance(Class.forName("example.model.Author$AuthorBuilder"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "firstName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "lastName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "email", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "books", term40);
        term90 = new Long(-316468845751588286L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author$AuthorBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term90;
        callMethod(klass, "id", argTypes, term1, args);
    }

};


