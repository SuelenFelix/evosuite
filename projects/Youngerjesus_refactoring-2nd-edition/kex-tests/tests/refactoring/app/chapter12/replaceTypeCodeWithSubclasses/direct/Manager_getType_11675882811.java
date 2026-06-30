package refactoring.app.chapter12.replaceTypeCodeWithSubclasses.direct;

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
import static refactoring.app.chapter12.replaceTypeCodeWithSubclasses.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Manager_getType_11675882811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182;

    public Manager_getType_11675882811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182 = newInstance(Class.forName("refactoring.app.chapter12.replaceTypeCodeWithSubclasses.direct.Manager"));
        setField(term182, term182.getClass(), "name", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceTypeCodeWithSubclasses.direct.Manager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term182, args);
    }

};


