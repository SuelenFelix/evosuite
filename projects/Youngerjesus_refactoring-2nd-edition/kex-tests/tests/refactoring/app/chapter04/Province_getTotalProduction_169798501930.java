package refactoring.app.chapter04;

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
import static refactoring.app.chapter04.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Province_getTotalProduction_169798501930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1214;

    public Province_getTotalProduction_169798501930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1214 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1214, term1214.getClass(), "name", null);
        setField(term1214, term1214.getClass(), "producers", null);
        setIntField(term1214, term1214.getClass(), "totalProduction", 0);
        setIntField(term1214, term1214.getClass(), "demand", 0);
        setIntField(term1214, term1214.getClass(), "price", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalProduction", argTypes, term1214, args);
    }

};


