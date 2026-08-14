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

public class Description_replace_14340317575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;
     Object term260;
     Object term262;

    public Description_replace_14340317575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Description"));
        setField(term259, term259.getClass(), "desc", null);
        setField(term259, term259.getClass(), "longDesc", null);
        term260 = new Character((char) 0);
        term262 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.Description");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term260;
        args[1] = term262;
        callMethod(klass, "replace", argTypes, term259, args);
    }

};


