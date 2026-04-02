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
     Object term10001;
     Object term10035;

    public StyleApplier_toCSS_5064028514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10001 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier"));
        Object term10002 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10003 = (byte[]) newByteArray(16);
        setField(term10001, term10001.getClass(), "tags", null);
        setField(term10002, term10002.getClass(), "value", term10003);
        setByteField(term10002, term10002.getClass(), "coder", (byte) 79);
        setIntField(term10002, term10002.getClass(), "count", 1072005683);
        setField(term10001, term10001.getClass(), "buffer", term10002);
        setField(term10001, term10001.getClass(), "source", "VGizxZnyHX");
        setIntField(term10001, term10001.getClass(), "sourceOffset", 1861318859);
        Class<? extends Object> term10200 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term10199 = ((Class) term10200).getDeclaredField((String) "BUILTIN");
        ((Field) term10199).setAccessible(true);
        Object enum28 = ((Field) term10199).get((Object) null);
        ArrayList term10085 = new ArrayList();
        ((ArrayList) term10085).add("YpJbIgJWWv");
        ((ArrayList) term10085).add("JppkknKVOw");
        ((ArrayList) term10085).add("iljANwuEjk");
        ((ArrayList) term10085).add("kNqaJKIATy");
        ((ArrayList) term10085).add("vKQukfbJUd");
        ((ArrayList) term10085).add("lFRJFUMVbx");
        ((ArrayList) term10085).add("sZdUNdggUW");
        term10035 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term10035, term10035.getClass(), "type", enum28);
        setIntField(term10035, term10035.getClass(), "start", 1474524152);
        setIntField(term10035, term10035.getClass(), "end", 568954359);
        setField(term10035, term10035.getClass(), "message", "kVEZMHmRtR");
        setField(term10035, term10035.getClass(), "url", "ekxGuOYIwi");
        setField(term10035, term10035.getClass(), "id", "RbVQXSpxXy");
        setField(term10035, term10035.getClass(), "highlight", term10085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Object[] args = new Object[1];
        args[0] = term10035;
        callMethod(klass, "toCSS", argTypes, term10001, args);
    }

};


