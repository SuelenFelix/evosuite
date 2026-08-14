package net.alenzen.a2l.validation;

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
import static net.alenzen.a2l.validation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class FormulaValidationError_init_2136069580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17505;
     Object term17560;

    public FormulaValidationError_init_2136069580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17508 = newInstance(Class.forName("net.alenzen.a2l.FormulaSyntaxError"));
        setIntField(term17508, term17508.getClass(), "line", 1265463001);
        setIntField(term17508, term17508.getClass(), "charPosition", 335112684);
        setField(term17508, term17508.getClass(), "message", "tlzpzIjMib");
        Object term17524 = newInstance(Class.forName("net.alenzen.a2l.FormulaSyntaxError"));
        setIntField(term17524, term17524.getClass(), "line", 1551099402);
        setIntField(term17524, term17524.getClass(), "charPosition", -2027534003);
        setField(term17524, term17524.getClass(), "message", "");
        Object term17529 = newInstance(Class.forName("net.alenzen.a2l.FormulaSyntaxError"));
        setIntField(term17529, term17529.getClass(), "line", 1063420942);
        setIntField(term17529, term17529.getClass(), "charPosition", 1375330971);
        setField(term17529, term17529.getClass(), "message", null);
        term17505 = new LinkedList();
        ((LinkedList) term17505).add(term17508);
        ((LinkedList) term17505).add(term17524);
        ((LinkedList) term17505).add(term17529);
        ((LinkedList) term17505).add((Object)null);
        ((LinkedList) term17505).add((Object)null);
        ((LinkedList) term17505).add((Object)null);
        ((LinkedList) term17505).add((Object)null);
        ((LinkedList) term17505).add((Object)null);
        ((LinkedList) term17505).add((Object)null);
        Object term17563 = newInstance(Class.forName("net.alenzen.a2l.FormulaSyntaxError"));
        setIntField(term17563, term17563.getClass(), "line", -1845499264);
        setIntField(term17563, term17563.getClass(), "charPosition", -505439934);
        setField(term17563, term17563.getClass(), "message", "PCipZnmBOF");
        Object term17579 = newInstance(Class.forName("net.alenzen.a2l.FormulaSyntaxError"));
        setIntField(term17579, term17579.getClass(), "line", -344842608);
        setIntField(term17579, term17579.getClass(), "charPosition", 941650513);
        setField(term17579, term17579.getClass(), "message", "");
        Object term17584 = newInstance(Class.forName("net.alenzen.a2l.FormulaSyntaxError"));
        setIntField(term17584, term17584.getClass(), "line", 444029505);
        setIntField(term17584, term17584.getClass(), "charPosition", -1034506028);
        setField(term17584, term17584.getClass(), "message", null);
        term17560 = new LinkedList();
        ((LinkedList) term17560).add(term17563);
        ((LinkedList) term17560).add(term17579);
        ((LinkedList) term17560).add(term17584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.FormulaValidationError");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("net.alenzen.a2l.Formula");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term17505;
        args[2] = term17560;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


