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

public class Province_addProducer_141396504020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1174;

    public Province_addProducer_141396504020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1174 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1174, term1174.getClass(), "name", null);
        setField(term1174, term1174.getClass(), "producers", null);
        setIntField(term1174, term1174.getClass(), "totalProduction", 0);
        setIntField(term1174, term1174.getClass(), "demand", 0);
        setIntField(term1174, term1174.getClass(), "price", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter04.Producer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addProducer", argTypes, term1174, args);
    }

};


