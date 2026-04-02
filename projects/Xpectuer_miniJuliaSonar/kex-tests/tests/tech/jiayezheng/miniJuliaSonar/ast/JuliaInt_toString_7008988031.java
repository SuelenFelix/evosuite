package tech.jiayezheng.miniJuliaSonar.ast;

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
import static tech.jiayezheng.miniJuliaSonar.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class JuliaInt_toString_7008988031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22706;

    public JuliaInt_toString_7008988031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22766 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term22765 = ((Class) term22766).getDeclaredField((String) "Symbol");
        ((Field) term22765).setAccessible(true);
        Object enum74 = ((Field) term22765).get((Object) null);
        term22706 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaInt"));
        setField(term22706, term22706.getClass(), "value", "mLUZFTfjle");
        setField(term22706, term22706.getClass(), "nodeType", enum74);
        setIntField(term22706, term22706.getClass(), "start", 158873461);
        setIntField(term22706, term22706.getClass(), "end", -430151637);
        setField(term22706, term22706.getClass(), "file", "xIeFjkHkOe");
        setField(term22706, term22706.getClass(), "parent", null);
        setField(term22706, term22706.getClass(), "name", "SdCKLMIYnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaInt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term22706, args);
    }

};


