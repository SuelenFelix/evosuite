package refactoring.app.chapter01;

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
import static refactoring.app.chapter01.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class StatementData_init_20533284720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1330;
     Object term1359;

    public StatementData_init_20533284720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1345 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1345, term1345.getClass(), "playId", "");
        setIntField(term1345, term1345.getClass(), "audience", 1622346318);
        Object term1348 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1348, term1348.getClass(), "playId", "");
        setIntField(term1348, term1348.getClass(), "audience", 1048535127);
        Object term1351 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1351, term1351.getClass(), "playId", "");
        setIntField(term1351, term1351.getClass(), "audience", -655067527);
        Object term1354 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1354, term1354.getClass(), "playId", "");
        setIntField(term1354, term1354.getClass(), "audience", -6029667);
        ArrayList term1343 = new ArrayList();
        ((ArrayList) term1343).add(term1345);
        ((ArrayList) term1343).add(term1348);
        ((ArrayList) term1343).add(term1351);
        ((ArrayList) term1343).add(term1354);
        term1330 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        setField(term1330, term1330.getClass(), "customer", "IDCWpPLRkE");
        setField(term1330, term1330.getClass(), "performances", term1343);
        HashMap term1360 = new HashMap();
        term1359 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        setField(term1359, term1359.getClass(), "playMap", term1360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.StatementData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter01.Invoice");
        argTypes[1] = Class.forName("refactoring.app.chapter01.Plays");
        Object[] args = new Object[2];
        args[0] = term1330;
        args[1] = term1359;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


