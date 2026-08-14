package legacyfighter.dietary.newproducts;

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
import static legacyfighter.dietary.newproducts.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class Description_replace_14340317572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;
     Object term234;
     Object term236;

    public Description_replace_14340317572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Description"));
        setField(term209, term209.getClass(), "desc", "jJCZpVmanW");
        setField(term209, term209.getClass(), "longDesc", "EGtDIRbSSb");
        term234 = new Character('P');
        term236 = new Character('A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.Description");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term234;
        args[1] = term236;
        callMethod(klass, "replace", argTypes, term209, args);
    }

};


