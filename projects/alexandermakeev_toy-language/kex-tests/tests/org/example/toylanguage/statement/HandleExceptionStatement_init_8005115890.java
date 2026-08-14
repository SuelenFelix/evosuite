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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class HandleExceptionStatement_init_8005115890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1239;
     Object term1253;
     Object term1272;
     Object term1291;

    public HandleExceptionStatement_init_8005115890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1239 = new Integer(679763016);
        ArrayList term1254 = new ArrayList();
        ((ArrayList) term1254).add((Object)null);
        ((ArrayList) term1254).add((Object)null);
        ((ArrayList) term1254).add((Object)null);
        ((ArrayList) term1254).add((Object)null);
        ((ArrayList) term1254).add((Object)null);
        Integer term1258 = new Integer(1962444399);
        term1253 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term1253, term1253.getClass(), "statements2Execute", term1254);
        setField(term1253, term1253.getClass(), "rowNumber", term1258);
        setField(term1253, term1253.getClass(), "blockName", "jDtqGUpnZN");
        ArrayList term1273 = new ArrayList();
        ((ArrayList) term1273).add((Object)null);
        ((ArrayList) term1273).add((Object)null);
        Integer term1277 = new Integer(767834723);
        term1272 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term1272, term1272.getClass(), "statements2Execute", term1273);
        setField(term1272, term1272.getClass(), "rowNumber", term1277);
        setField(term1272, term1272.getClass(), "blockName", "nGKItKLYNC");
        ArrayList term1292 = new ArrayList();
        ((ArrayList) term1292).add((Object)null);
        ((ArrayList) term1292).add((Object)null);
        ((ArrayList) term1292).add((Object)null);
        Integer term1296 = new Integer(-602026508);
        term1291 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term1291, term1291.getClass(), "statements2Execute", term1292);
        setField(term1291, term1291.getClass(), "rowNumber", term1296);
        setField(term1291, term1291.getClass(), "blockName", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.HandleExceptionStatement");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.example.toylanguage.statement.CompositeStatement");
        argTypes[3] = Class.forName("org.example.toylanguage.statement.CompositeStatement");
        argTypes[4] = Class.forName("org.example.toylanguage.statement.CompositeStatement");
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term1239;
        args[1] = "xLbjWUgOIL";
        args[2] = term1253;
        args[3] = term1272;
        args[4] = term1291;
        args[5] = "UoYtihxVaS";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


