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

public class Style_compareTo_12710017572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7215;
     Object term7315;

    public Style_compareTo_12710017572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7371 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term7370 = ((Class) term7371).getDeclaredField((String) "LOCAL");
        ((Field) term7370).setAccessible(true);
        Object enum23 = ((Field) term7370).get((Object) null);
        ArrayList term7263 = new ArrayList();
        ((ArrayList) term7263).add("QXzGXbEXMu");
        ((ArrayList) term7263).add("qxSDVejjiY");
        ((ArrayList) term7263).add("xBsXSDjXYK");
        ((ArrayList) term7263).add("sEnIVFtZuQ");
        term7215 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term7215, term7215.getClass(), "type", enum23);
        setIntField(term7215, term7215.getClass(), "start", -1772434990);
        setIntField(term7215, term7215.getClass(), "end", -1845499264);
        setField(term7215, term7215.getClass(), "message", "sEccwbJKYE");
        setField(term7215, term7215.getClass(), "url", "AWRooQKkdW");
        setField(term7215, term7215.getClass(), "id", "vjxIhXHxGR");
        setField(term7215, term7215.getClass(), "highlight", term7263);
        Class<? extends Object> term7693 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term7692 = ((Class) term7693).getDeclaredField((String) "FUNCTION");
        ((Field) term7692).setAccessible(true);
        Object enum24 = ((Field) term7692).get((Object) null);
        ArrayList term7366 = new ArrayList();
        term7315 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term7315, term7315.getClass(), "type", enum24);
        setIntField(term7315, term7315.getClass(), "start", -505439934);
        setIntField(term7315, term7315.getClass(), "end", -344842608);
        setField(term7315, term7315.getClass(), "message", "ZVecLZMLHF");
        setField(term7315, term7315.getClass(), "url", "fztQhjqwdP");
        setField(term7315, term7315.getClass(), "id", "eVpkWxjuki");
        setField(term7315, term7315.getClass(), "highlight", term7366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Object[] args = new Object[1];
        args[0] = term7315;
        callMethod(klass, "compareTo", argTypes, term7215, args);
    }

};


