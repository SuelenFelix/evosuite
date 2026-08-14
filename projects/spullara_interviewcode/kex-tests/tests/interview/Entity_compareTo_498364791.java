package interview;

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
import static interview.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Entity_compareTo_498364791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;
     Object term228;

    public Entity_compareTo_498364791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225 = newInstance(Class.forName("interview.Entity"));
        setIntField(term225, term225.getClass(), "start", 2055867847);
        setIntField(term225, term225.getClass(), "end", -1048298087);
        setField(term225, term225.getClass(), "html", null);
        term228 = newInstance(Class.forName("interview.Entity"));
        setIntField(term228, term228.getClass(), "start", 292681826);
        setIntField(term228, term228.getClass(), "end", 458147407);
        setField(term228, term228.getClass(), "html", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("interview.Entity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("interview.Entity");
        Object[] args = new Object[1];
        args[0] = term228;
        callMethod(klass, "compareTo", argTypes, term225, args);
    }

};


