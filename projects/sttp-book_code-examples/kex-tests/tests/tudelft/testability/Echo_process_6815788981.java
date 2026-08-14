package tudelft.testability;

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
import static tudelft.testability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class Echo_process_6815788981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term35;

    public Echo_process_6815788981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("tudelft.testability.Echo"));
        Object term34 = newInstance(Class.forName("tudelft.testability.SystemWrapper"));
        setField(term31, term31.getClass(), "result", "");
        setField(term31, term31.getClass(), "system", term34);
        term35 = new LinkedList();
        ((LinkedList) term35).add("sjlJAEtRrb");
        ((LinkedList) term35).add("MuLcgQHgqz");
        ((LinkedList) term35).add("");
        ((LinkedList) term35).add((Object)null);
        ((LinkedList) term35).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.testability.Echo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term35;
        callMethod(klass, "process", argTypes, term31, args);
    }

};


