package refactoring.app.chapter06.combineFunctionIntoClass;

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
import static refactoring.app.chapter06.combineFunctionIntoClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Reading_getYear_64922508313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;

    public Reading_getYear_64922508313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Reading"));
        setField(term64, term64.getClass(), "customer", null);
        setIntField(term64, term64.getClass(), "quantity", 0);
        setIntField(term64, term64.getClass(), "month", 0);
        setIntField(term64, term64.getClass(), "year", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Reading");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYear", argTypes, term64, args);
    }

};


