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

public class StyleApplier_EndTag_insert_14858834351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11659;

    public StyleApplier_EndTag_insert_14858834351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11720 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term11719 = ((Class) term11720).getDeclaredField((String) "LOCAL");
        ((Field) term11719).setAccessible(true);
        Object enum32 = ((Field) term11719).get((Object) null);
        ArrayList term11709 = new ArrayList();
        ((ArrayList) term11709).add("");
        ((ArrayList) term11709).add("");
        ((ArrayList) term11709).add("");
        ((ArrayList) term11709).add("");
        ((ArrayList) term11709).add("");
        ((ArrayList) term11709).add("");
        term11659 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier$EndTag"));
        Object term11661 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term11659, term11659.getClass(), "this$0", null);
        setIntField(term11659, term11659.getClass(), "offset", -341152642);
        setField(term11661, term11661.getClass(), "type", enum32);
        setIntField(term11661, term11661.getClass(), "start", -2015854073);
        setIntField(term11661, term11661.getClass(), "end", 538259104);
        setField(term11661, term11661.getClass(), "message", "tXfQjSqDzN");
        setField(term11661, term11661.getClass(), "url", "BjugTaMcxJ");
        setField(term11661, term11661.getClass(), "id", "vGiuZVPJNH");
        setField(term11661, term11661.getClass(), "highlight", term11709);
        setField(term11659, term11659.getClass(), "style", term11661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier$EndTag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "insert", argTypes, term11659, args);
    }

};


