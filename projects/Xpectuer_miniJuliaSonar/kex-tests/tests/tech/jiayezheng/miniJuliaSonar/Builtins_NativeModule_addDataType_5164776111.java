package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Builtins_NativeModule_addDataType_5164776111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326401;

    public Builtins_NativeModule_addDataType_5164776111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term326473 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term326472 = ((Class) term326473).getDeclaredField((String) "Continue");
        ((Field) term326472).setAccessible(true);
        Object enum1066 = ((Field) term326472).get((Object) null);
        term326401 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Url"));
        setField(term326401, term326401.getClass(), "url", "lLOVzTOZrn");
        setField(term326401, term326401.getClass(), "nodeType", enum1066);
        setIntField(term326401, term326401.getClass(), "start", 498473526);
        setIntField(term326401, term326401.getClass(), "end", 1186917020);
        setField(term326401, term326401.getClass(), "file", "LKnFPHURqD");
        setField(term326401, term326401.getClass(), "parent", null);
        setField(term326401, term326401.getClass(), "name", "OnkfuPhhWD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins$NativeModule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Url");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[3];
        args[0] = "ejNlGaFszD";
        args[1] = term326401;
        args[2] = null;
        callMethod(klass, "addDataType", argTypes, null, args);
    }

};


