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

public class Producer_setName_19939973603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1437;

    public Producer_setName_19939973603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1467 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1467, term1467.getClass(), "name", null);
        setIntField(term1467, term1467.getClass(), "cost", -75143033);
        setIntField(term1467, term1467.getClass(), "production", 797015478);
        setField(term1467, term1467.getClass(), "province", null);
        Object term1470 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1470, term1470.getClass(), "name", null);
        setIntField(term1470, term1470.getClass(), "cost", 0);
        setIntField(term1470, term1470.getClass(), "production", 0);
        setField(term1470, term1470.getClass(), "province", null);
        Object term1473 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1473, term1473.getClass(), "name", null);
        setIntField(term1473, term1473.getClass(), "cost", 0);
        setIntField(term1473, term1473.getClass(), "production", 0);
        setField(term1473, term1473.getClass(), "province", null);
        Object term1476 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1476, term1476.getClass(), "name", null);
        setIntField(term1476, term1476.getClass(), "cost", 998679955);
        setIntField(term1476, term1476.getClass(), "production", 953741504);
        setField(term1476, term1476.getClass(), "province", null);
        ArrayList term1465 = new ArrayList();
        ((ArrayList) term1465).add(term1467);
        ((ArrayList) term1465).add(term1470);
        ((ArrayList) term1465).add(term1473);
        ((ArrayList) term1465).add(term1473);
        ((ArrayList) term1465).add(term1476);
        term1437 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1452 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1437, term1437.getClass(), "name", "IoSfuKDFRe");
        setIntField(term1437, term1437.getClass(), "cost", -1780848958);
        setIntField(term1437, term1437.getClass(), "production", 1235045850);
        setField(term1452, term1452.getClass(), "name", "AWYyZiNfsm");
        setField(term1452, term1452.getClass(), "producers", term1465);
        setIntField(term1452, term1452.getClass(), "totalProduction", -20399281);
        setIntField(term1452, term1452.getClass(), "demand", -830170410);
        setIntField(term1452, term1452.getClass(), "price", -1742790308);
        setField(term1437, term1437.getClass(), "province", term1452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Producer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cSHGbqKqlN";
        callMethod(klass, "setName", argTypes, term1437, args);
    }

};


