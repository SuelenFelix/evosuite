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

public class HandleExceptionStatement_getRescueStatement_2547694353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1640;

    public HandleExceptionStatement_getRescueStatement_2547694353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1642 = new ArrayList();
        ((ArrayList) term1642).add((Object)null);
        Integer term1646 = new Integer(454281060);
        ArrayList term1661 = new ArrayList();
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        ((ArrayList) term1661).add((Object)null);
        Integer term1665 = new Integer(-1786399638);
        ArrayList term1680 = new ArrayList();
        ((ArrayList) term1680).add((Object)null);
        ((ArrayList) term1680).add((Object)null);
        ((ArrayList) term1680).add((Object)null);
        Integer term1684 = new Integer(2055867847);
        Integer term1710 = new Integer(-1048298087);
        term1640 = newInstance(Class.forName("org.example.toylanguage.statement.HandleExceptionStatement"));
        Object term1641 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        Object term1660 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        Object term1679 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term1641, term1641.getClass(), "statements2Execute", term1642);
        setField(term1641, term1641.getClass(), "rowNumber", term1646);
        setField(term1641, term1641.getClass(), "blockName", "eqJfYWRaEL");
        setField(term1640, term1640.getClass(), "beginStatement", term1641);
        setField(term1660, term1660.getClass(), "statements2Execute", term1661);
        setField(term1660, term1660.getClass(), "rowNumber", term1665);
        setField(term1660, term1660.getClass(), "blockName", "fhkbdRViHi");
        setField(term1640, term1640.getClass(), "rescueStatement", term1660);
        setField(term1679, term1679.getClass(), "statements2Execute", term1680);
        setField(term1679, term1679.getClass(), "rowNumber", term1684);
        setField(term1679, term1679.getClass(), "blockName", "uWHnvSvaPl");
        setField(term1640, term1640.getClass(), "ensureStatement", term1679);
        setField(term1640, term1640.getClass(), "errorVariable", "kBdSllIBVz");
        setField(term1640, term1640.getClass(), "rowNumber", term1710);
        setField(term1640, term1640.getClass(), "blockName", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.HandleExceptionStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRescueStatement", argTypes, term1640, args);
    }

};


