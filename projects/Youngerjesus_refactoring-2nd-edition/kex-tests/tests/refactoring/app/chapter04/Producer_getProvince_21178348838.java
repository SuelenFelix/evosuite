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
import java.lang.Object;
import java.util.ArrayList;

public class Producer_getProvince_21178348838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1807;

    public Producer_getProvince_21178348838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1837 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1837, term1837.getClass(), "name", null);
        setIntField(term1837, term1837.getClass(), "cost", 1175146356);
        setIntField(term1837, term1837.getClass(), "production", -2137419728);
        setField(term1837, term1837.getClass(), "province", null);
        Object term1840 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1840, term1840.getClass(), "name", null);
        setIntField(term1840, term1840.getClass(), "cost", 196952878);
        setIntField(term1840, term1840.getClass(), "production", 802673242);
        setField(term1840, term1840.getClass(), "province", null);
        ArrayList term1835 = new ArrayList();
        ((ArrayList) term1835).add(term1837);
        ((ArrayList) term1835).add(term1840);
        term1807 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1822 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1807, term1807.getClass(), "name", "MnovcqFhCl");
        setIntField(term1807, term1807.getClass(), "cost", 81427089);
        setIntField(term1807, term1807.getClass(), "production", 755951489);
        setField(term1822, term1822.getClass(), "name", "qYtAeLzOhW");
        setField(term1822, term1822.getClass(), "producers", term1835);
        setIntField(term1822, term1822.getClass(), "totalProduction", 21095258);
        setIntField(term1822, term1822.getClass(), "demand", -1793997256);
        setIntField(term1822, term1822.getClass(), "price", -1271598018);
        setField(term1807, term1807.getClass(), "province", term1822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Producer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProvince", argTypes, term1807, args);
    }

};


