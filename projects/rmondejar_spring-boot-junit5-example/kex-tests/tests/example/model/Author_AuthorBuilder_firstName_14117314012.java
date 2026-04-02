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

public class Author_AuthorBuilder_firstName_14117314012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122;

    public Author_AuthorBuilder_firstName_14117314012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term123 = new Long(5127676408959197577L);
        Long term164 = new Long(-6573104506744284592L);
        Long term174 = new Long(-4920224193275732920L);
        Object term163 = newInstance(Class.forName("example.model.Book"));
        Object term169 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term173 = newInstance(Class.forName("example.model.Author"));
        setField(term163, term163.getClass(), "id", term164);
        setField(term163, term163.getClass(), "title", "");
        setField(term163, term163.getClass(), "description", "");
        setField(term163, term163.getClass(), "genre", "");
        setField(term169, term169.getClass(), "intVal", null);
        setIntField(term169, term169.getClass(), "scale", 51);
        setIntField(term169, term169.getClass(), "precision", 0);
        setField(term169, term169.getClass(), "stringCache", null);
        setLongField(term169, term169.getClass(), "intCompact", -9223372036854775808L);
        setField(term163, term163.getClass(), "price", term169);
        setField(term173, term173.getClass(), "id", term174);
        setField(term173, term173.getClass(), "firstName", null);
        setField(term173, term173.getClass(), "lastName", null);
        setField(term173, term173.getClass(), "email", null);
        setField(term173, term173.getClass(), "books", null);
        setField(term163, term163.getClass(), "author", term173);
        Long term177 = new Long(-5892135042702373494L);
        Object term176 = newInstance(Class.forName("example.model.Book"));
        Object term182 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term186 = newInstance(Class.forName("example.model.Author"));
        setField(term176, term176.getClass(), "id", term177);
        setField(term176, term176.getClass(), "title", "");
        setField(term176, term176.getClass(), "description", "");
        setField(term176, term176.getClass(), "genre", "");
        setField(term182, term182.getClass(), "intVal", null);
        setIntField(term182, term182.getClass(), "scale", 52);
        setIntField(term182, term182.getClass(), "precision", 0);
        setField(term182, term182.getClass(), "stringCache", null);
        setLongField(term182, term182.getClass(), "intCompact", -9223372036854775808L);
        setField(term176, term176.getClass(), "price", term182);
        setField(term186, term186.getClass(), "id", null);
        setField(term186, term186.getClass(), "firstName", null);
        setField(term186, term186.getClass(), "lastName", null);
        setField(term186, term186.getClass(), "email", null);
        setField(term186, term186.getClass(), "books", null);
        setField(term176, term176.getClass(), "author", term186);
        ArrayList term161 = new ArrayList();
        ((ArrayList) term161).add(term163);
        ((ArrayList) term161).add(term176);
        term122 = newInstance(Class.forName("example.model.Author$AuthorBuilder"));
        setField(term122, term122.getClass(), "id", term123);
        setField(term122, term122.getClass(), "firstName", "xLbjWUgOIL");
        setField(term122, term122.getClass(), "lastName", "jDtqGUpnZN");
        setField(term122, term122.getClass(), "email", "nGKItKLYNC");
        setField(term122, term122.getClass(), "books", term161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author$AuthorBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JqXGgAhZPl";
        callMethod(klass, "firstName", argTypes, term122, args);
    }

};


