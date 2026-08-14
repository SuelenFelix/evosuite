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

public class Url_toString_20598981361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36243;

    public Url_toString_20598981361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36304 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term36303 = ((Class) term36304).getDeclaredField((String) "RSQUARE");
        ((Field) term36303).setAccessible(true);
        Object enum119 = ((Field) term36303).get((Object) null);
        term36243 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Url"));
        setField(term36243, term36243.getClass(), "url", "qCpEbQDHdF");
        setField(term36243, term36243.getClass(), "nodeType", enum119);
        setIntField(term36243, term36243.getClass(), "start", 1935707624);
        setIntField(term36243, term36243.getClass(), "end", 1507074215);
        setField(term36243, term36243.getClass(), "file", "AHbZyFOmlo");
        setField(term36243, term36243.getClass(), "parent", null);
        setField(term36243, term36243.getClass(), "name", "TwfWVQGiIj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Url");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term36243, args);
    }

};


