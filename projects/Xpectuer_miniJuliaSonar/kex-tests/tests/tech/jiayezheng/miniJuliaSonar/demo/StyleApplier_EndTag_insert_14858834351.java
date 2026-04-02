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
     Object term11653;

    public StyleApplier_EndTag_insert_14858834351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11714 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term11713 = ((Class) term11714).getDeclaredField((String) "LOCAL");
        ((Field) term11713).setAccessible(true);
        Object enum32 = ((Field) term11713).get((Object) null);
        ArrayList term11703 = new ArrayList();
        ((ArrayList) term11703).add("");
        ((ArrayList) term11703).add("");
        ((ArrayList) term11703).add("");
        ((ArrayList) term11703).add("");
        ((ArrayList) term11703).add("");
        ((ArrayList) term11703).add("");
        term11653 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier$EndTag"));
        Object term11655 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term11653, term11653.getClass(), "this$0", null);
        setIntField(term11653, term11653.getClass(), "offset", -341152642);
        setField(term11655, term11655.getClass(), "type", enum32);
        setIntField(term11655, term11655.getClass(), "start", -2015854073);
        setIntField(term11655, term11655.getClass(), "end", 538259104);
        setField(term11655, term11655.getClass(), "message", "tXfQjSqDzN");
        setField(term11655, term11655.getClass(), "url", "BjugTaMcxJ");
        setField(term11655, term11655.getClass(), "id", "vGiuZVPJNH");
        setField(term11655, term11655.getClass(), "highlight", term11703);
        setField(term11653, term11653.getClass(), "style", term11655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier$EndTag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "insert", argTypes, term11653, args);
    }

};


