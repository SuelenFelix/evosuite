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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class StyleApplier_toCSS_5064028514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10007;
     Object term10041;

    public StyleApplier_toCSS_5064028514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10007 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier"));
        Object term10008 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10009 = (byte[]) newByteArray(16);
        setField(term10007, term10007.getClass(), "tags", null);
        setField(term10008, term10008.getClass(), "value", term10009);
        setByteField(term10008, term10008.getClass(), "coder", (byte) 79);
        setIntField(term10008, term10008.getClass(), "count", 1072005683);
        setField(term10007, term10007.getClass(), "buffer", term10008);
        setField(term10007, term10007.getClass(), "source", "VGizxZnyHX");
        setIntField(term10007, term10007.getClass(), "sourceOffset", 1861318859);
        Class<? extends Object> term10206 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term10205 = ((Class) term10206).getDeclaredField((String) "BUILTIN");
        ((Field) term10205).setAccessible(true);
        Object enum28 = ((Field) term10205).get((Object) null);
        ArrayList term10091 = new ArrayList();
        ((ArrayList) term10091).add("YpJbIgJWWv");
        ((ArrayList) term10091).add("JppkknKVOw");
        ((ArrayList) term10091).add("iljANwuEjk");
        ((ArrayList) term10091).add("kNqaJKIATy");
        ((ArrayList) term10091).add("vKQukfbJUd");
        ((ArrayList) term10091).add("lFRJFUMVbx");
        ((ArrayList) term10091).add("sZdUNdggUW");
        term10041 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term10041, term10041.getClass(), "type", enum28);
        setIntField(term10041, term10041.getClass(), "start", 1474524152);
        setIntField(term10041, term10041.getClass(), "end", 568954359);
        setField(term10041, term10041.getClass(), "message", "kVEZMHmRtR");
        setField(term10041, term10041.getClass(), "url", "ekxGuOYIwi");
        setField(term10041, term10041.getClass(), "id", "RbVQXSpxXy");
        setField(term10041, term10041.getClass(), "highlight", term10091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Object[] args = new Object[1];
        args[0] = term10041;
        callMethod(klass, "toCSS", argTypes, term10007, args);
    }

};


