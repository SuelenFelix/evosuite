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
     Object term7221;
     Object term7321;

    public Style_compareTo_12710017572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7377 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term7376 = ((Class) term7377).getDeclaredField((String) "LOCAL");
        ((Field) term7376).setAccessible(true);
        Object enum23 = ((Field) term7376).get((Object) null);
        ArrayList term7269 = new ArrayList();
        ((ArrayList) term7269).add("QXzGXbEXMu");
        ((ArrayList) term7269).add("qxSDVejjiY");
        ((ArrayList) term7269).add("xBsXSDjXYK");
        ((ArrayList) term7269).add("sEnIVFtZuQ");
        term7221 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term7221, term7221.getClass(), "type", enum23);
        setIntField(term7221, term7221.getClass(), "start", -1772434990);
        setIntField(term7221, term7221.getClass(), "end", -1845499264);
        setField(term7221, term7221.getClass(), "message", "sEccwbJKYE");
        setField(term7221, term7221.getClass(), "url", "AWRooQKkdW");
        setField(term7221, term7221.getClass(), "id", "vjxIhXHxGR");
        setField(term7221, term7221.getClass(), "highlight", term7269);
        Class<? extends Object> term7699 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term7698 = ((Class) term7699).getDeclaredField((String) "FUNCTION");
        ((Field) term7698).setAccessible(true);
        Object enum24 = ((Field) term7698).get((Object) null);
        ArrayList term7372 = new ArrayList();
        term7321 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term7321, term7321.getClass(), "type", enum24);
        setIntField(term7321, term7321.getClass(), "start", -505439934);
        setIntField(term7321, term7321.getClass(), "end", -344842608);
        setField(term7321, term7321.getClass(), "message", "ZVecLZMLHF");
        setField(term7321, term7321.getClass(), "url", "fztQhjqwdP");
        setField(term7321, term7321.getClass(), "id", "eVpkWxjuki");
        setField(term7321, term7321.getClass(), "highlight", term7372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Object[] args = new Object[1];
        args[0] = term7321;
        callMethod(klass, "compareTo", argTypes, term7221, args);
    }

};


