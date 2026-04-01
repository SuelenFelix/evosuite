package org.example.toylanguage.statement;

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
import static org.example.toylanguage.statement.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class HandleExceptionStatement_execute_4410752871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1372;

    public HandleExceptionStatement_execute_4410752871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1374 = new ArrayList();
        ((ArrayList) term1374).add((Object)null);
        Integer term1378 = new Integer(-157887805);
        ArrayList term1393 = new ArrayList();
        Integer term1397 = new Integer(1876565163);
        ArrayList term1412 = new ArrayList();
        ((ArrayList) term1412).add((Object)null);
        ((ArrayList) term1412).add((Object)null);
        Integer term1416 = new Integer(-817164822);
        Integer term1442 = new Integer(-1016503459);
        term1372 = newInstance(Class.forName("org.example.toylanguage.statement.HandleExceptionStatement"));
        Object term1373 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        Object term1392 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        Object term1411 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term1373, term1373.getClass(), "statements2Execute", term1374);
        setField(term1373, term1373.getClass(), "rowNumber", term1378);
        setField(term1373, term1373.getClass(), "blockName", "JDswTTCZHV");
        setField(term1372, term1372.getClass(), "beginStatement", term1373);
        setField(term1392, term1392.getClass(), "statements2Execute", term1393);
        setField(term1392, term1392.getClass(), "rowNumber", term1397);
        setField(term1392, term1392.getClass(), "blockName", "onpbIeEKoi");
        setField(term1372, term1372.getClass(), "rescueStatement", term1392);
        setField(term1411, term1411.getClass(), "statements2Execute", term1412);
        setField(term1411, term1411.getClass(), "rowNumber", term1416);
        setField(term1411, term1411.getClass(), "blockName", "YRHGsAkhxb");
        setField(term1372, term1372.getClass(), "ensureStatement", term1411);
        setField(term1372, term1372.getClass(), "errorVariable", "ffYhPOzlUs");
        setField(term1372, term1372.getClass(), "rowNumber", term1442);
        setField(term1372, term1372.getClass(), "blockName", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.HandleExceptionStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "execute", argTypes, term1372, args);
    }

};


