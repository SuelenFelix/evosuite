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

public class Order_getPriorityString_3458037121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;

    public Order_getPriorityString_3458037121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("refactoring.app.chapter07.replacePrimitiveWithObject.Order"));
        Object term70 = newInstance(Class.forName("refactoring.app.chapter07.replacePrimitiveWithObject.Priority"));
        setField(term70, term70.getClass(), "value", "xxtlPwDYFs");
        setField(term69, term69.getClass(), "priority", term70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.replacePrimitiveWithObject.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPriorityString", argTypes, term69, args);
    }

};


