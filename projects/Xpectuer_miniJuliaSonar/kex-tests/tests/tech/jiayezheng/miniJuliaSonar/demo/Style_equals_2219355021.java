package tech.jiayezheng.miniJuliaSonar.demo;

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
import static tech.jiayezheng.miniJuliaSonar.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Style_equals_2219355021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6792;
     Object term6892;

    public Style_equals_2219355021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6894 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term6893 = ((Class) term6894).getDeclaredField((String) "CLASS");
        ((Field) term6893).setAccessible(true);
        Object enum22 = ((Field) term6893).get((Object) null);
        ArrayList term6840 = new ArrayList();
        ((ArrayList) term6840).add("JiVRgTZvKc");
        ((ArrayList) term6840).add("XPKmummaqg");
        ((ArrayList) term6840).add("BKLfkLiZTH");
        ((ArrayList) term6840).add("SPpkrGcPRr");
        term6792 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term6792, term6792.getClass(), "type", enum22);
        setIntField(term6792, term6792.getClass(), "start", 1114000454);
        setIntField(term6792, term6792.getClass(), "end", -556405712);
        setField(term6792, term6792.getClass(), "message", "jiKYgYHqIS");
        setField(term6792, term6792.getClass(), "url", "DfISiziTgG");
        setField(term6792, term6792.getClass(), "id", "XqgfKFvPSD");
        setField(term6792, term6792.getClass(), "highlight", term6840);
        term6892 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6892;
        callMethod(klass, "equals", argTypes, term6792, args);
    }

};


