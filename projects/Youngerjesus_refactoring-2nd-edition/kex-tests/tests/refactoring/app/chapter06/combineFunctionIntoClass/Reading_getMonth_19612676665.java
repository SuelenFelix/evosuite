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
import java.lang.Object;

public class Reading_getMonth_19612676665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;

    public Reading_getMonth_19612676665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Reading"));
        Object term29 = newInstance(Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Customer"));
        setField(term28, term28.getClass(), "customer", term29);
        setIntField(term28, term28.getClass(), "quantity", 597278769);
        setIntField(term28, term28.getClass(), "month", -1685132342);
        setIntField(term28, term28.getClass(), "year", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Reading");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMonth", argTypes, term28, args);
    }

};


