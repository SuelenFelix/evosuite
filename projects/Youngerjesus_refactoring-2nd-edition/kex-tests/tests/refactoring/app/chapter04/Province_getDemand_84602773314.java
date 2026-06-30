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
import java.util.ArrayList;
import java.lang.Object;

public class Province_getDemand_84602773314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term962;

    public Province_getDemand_84602773314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term977 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term981 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term977, term977.getClass(), "name", "");
        setIntField(term977, term977.getClass(), "cost", -511077684);
        setIntField(term977, term977.getClass(), "production", -711507760);
        setField(term981, term981.getClass(), "name", null);
        setField(term981, term981.getClass(), "producers", null);
        setIntField(term981, term981.getClass(), "totalProduction", -1281083262);
        setIntField(term981, term981.getClass(), "demand", 1059930704);
        setIntField(term981, term981.getClass(), "price", -1967153290);
        setField(term977, term977.getClass(), "province", term981);
        Object term985 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term989 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term985, term985.getClass(), "name", "");
        setIntField(term985, term985.getClass(), "cost", 1038029515);
        setIntField(term985, term985.getClass(), "production", 1137154606);
        setField(term989, term989.getClass(), "name", null);
        setField(term989, term989.getClass(), "producers", null);
        setIntField(term989, term989.getClass(), "totalProduction", 0);
        setIntField(term989, term989.getClass(), "demand", 0);
        setIntField(term989, term989.getClass(), "price", 0);
        setField(term985, term985.getClass(), "province", term989);
        ArrayList term975 = new ArrayList();
        ((ArrayList) term975).add(term977);
        ((ArrayList) term975).add(term985);
        ((ArrayList) term975).add(term985);
        term962 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term962, term962.getClass(), "name", "NJhGgctbdj");
        setField(term962, term962.getClass(), "producers", term975);
        setIntField(term962, term962.getClass(), "totalProduction", -1397251956);
        setIntField(term962, term962.getClass(), "demand", -796934571);
        setIntField(term962, term962.getClass(), "price", 405295896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDemand", argTypes, term962, args);
    }

};


