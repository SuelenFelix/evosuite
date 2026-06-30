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
import java.lang.Integer;

public class Province_setTotalProduction_109068886931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1218;
     Object term1222;

    public Province_setTotalProduction_109068886931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1218 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1218, term1218.getClass(), "name", null);
        setField(term1218, term1218.getClass(), "producers", null);
        setIntField(term1218, term1218.getClass(), "totalProduction", 0);
        setIntField(term1218, term1218.getClass(), "demand", 0);
        setIntField(term1218, term1218.getClass(), "price", 0);
        term1222 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1222;
        callMethod(klass, "setTotalProduction", argTypes, term1218, args);
    }

};


