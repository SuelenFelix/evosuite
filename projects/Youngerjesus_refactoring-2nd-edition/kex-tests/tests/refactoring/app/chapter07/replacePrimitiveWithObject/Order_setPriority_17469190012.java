package refactoring.app.chapter07.replacePrimitiveWithObject;

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
import static refactoring.app.chapter07.replacePrimitiveWithObject.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Order_setPriority_17469190012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;

    public Order_setPriority_17469190012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("refactoring.app.chapter07.replacePrimitiveWithObject.Order"));
        Object term94 = newInstance(Class.forName("refactoring.app.chapter07.replacePrimitiveWithObject.Priority"));
        setField(term94, term94.getClass(), "value", "jJCZpVmanW");
        setField(term93, term93.getClass(), "priority", term94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.replacePrimitiveWithObject.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "setPriority", argTypes, term93, args);
    }

};


