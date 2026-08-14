package one.digitalinnovation.gof;

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
import static one.digitalinnovation.gof.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Application_main_879401551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7138;

    public Application_main_879401551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7138 = (Object[]) newArray("java.lang.String", 5);
        setElement(term7138, 0, "nRvKihUSPj");
        setElement(term7138, 1, "BbNeQJpYPr");
        setElement(term7138, 2, "riMtzCoxNj");
        setElement(term7138, 3, "YAXkVjQZcV");
        setElement(term7138, 4, "pumvwBWvpy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.Application");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7138;
        callMethod(klass, "main", argTypes, null, args);
    }

};


