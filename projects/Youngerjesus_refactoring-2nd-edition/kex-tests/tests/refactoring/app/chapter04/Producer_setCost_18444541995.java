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
import java.lang.Integer;

public class Producer_setCost_18444541995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1596;
     Object term1637;

    public Producer_setCost_18444541995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1626 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1626, term1626.getClass(), "name", null);
        setIntField(term1626, term1626.getClass(), "cost", -819372164);
        setIntField(term1626, term1626.getClass(), "production", 958132675);
        setField(term1626, term1626.getClass(), "province", null);
        Object term1629 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term1629, term1629.getClass(), "name", null);
        setIntField(term1629, term1629.getClass(), "cost", 0);
        setIntField(term1629, term1629.getClass(), "production", 0);
        setField(term1629, term1629.getClass(), "province", null);
        ArrayList term1624 = new ArrayList();
        ((ArrayList) term1624).add(term1626);
        ((ArrayList) term1624).add(term1629);
        ((ArrayList) term1624).add(term1629);
        term1596 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term1611 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1596, term1596.getClass(), "name", "jiUSjqwSIQ");
        setIntField(term1596, term1596.getClass(), "cost", 1544768934);
        setIntField(term1596, term1596.getClass(), "production", -383508597);
        setField(term1611, term1611.getClass(), "name", "MgLCedQfoj");
        setField(term1611, term1611.getClass(), "producers", term1624);
        setIntField(term1611, term1611.getClass(), "totalProduction", 666218293);
        setIntField(term1611, term1611.getClass(), "demand", 1737876343);
        setIntField(term1611, term1611.getClass(), "price", -897937940);
        setField(term1596, term1596.getClass(), "province", term1611);
        term1637 = new Integer(1523261232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Producer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1637;
        callMethod(klass, "setCost", argTypes, term1596, args);
    }

};


