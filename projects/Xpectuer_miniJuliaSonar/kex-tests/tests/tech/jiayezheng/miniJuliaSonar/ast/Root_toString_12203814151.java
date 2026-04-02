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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Root_toString_12203814151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46840;

    public Root_toString_12203814151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term46841 = new ArrayList();
        ((ArrayList) term46841).add((Object)null);
        Class<? extends Object> term46883 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term46882 = ((Class) term46883).getDeclaredField((String) "RSQUARE");
        ((Field) term46882).setAccessible(true);
        Object enum156 = ((Field) term46882).get((Object) null);
        term46840 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Root"));
        setField(term46840, term46840.getClass(), "args", term46841);
        setField(term46840, term46840.getClass(), "nodeType", enum156);
        setIntField(term46840, term46840.getClass(), "start", -1362856620);
        setIntField(term46840, term46840.getClass(), "end", -1835839814);
        setField(term46840, term46840.getClass(), "file", "NBrvVzvQHe");
        setField(term46840, term46840.getClass(), "parent", null);
        setField(term46840, term46840.getClass(), "name", "FjOiNAfBOc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Root");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term46840, args);
    }

};


