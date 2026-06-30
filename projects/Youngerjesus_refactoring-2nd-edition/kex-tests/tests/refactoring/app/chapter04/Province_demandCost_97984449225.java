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

public class Province_demandCost_97984449225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1194;

    public Province_demandCost_97984449225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1194 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1194, term1194.getClass(), "name", null);
        setField(term1194, term1194.getClass(), "producers", null);
        setIntField(term1194, term1194.getClass(), "totalProduction", 0);
        setIntField(term1194, term1194.getClass(), "demand", 0);
        setIntField(term1194, term1194.getClass(), "price", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "demandCost", argTypes, term1194, args);
    }

};


