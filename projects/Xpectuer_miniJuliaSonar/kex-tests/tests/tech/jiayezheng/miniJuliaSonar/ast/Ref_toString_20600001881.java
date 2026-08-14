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

public class Ref_toString_20600001881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33522;

    public Ref_toString_20600001881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33561 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term33560 = ((Class) term33561).getDeclaredField((String) "KeyWord");
        ((Field) term33560).setAccessible(true);
        Object enum110 = ((Field) term33560).get((Object) null);
        term33522 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Ref"));
        setField(term33522, term33522.getClass(), "name", null);
        setField(term33522, term33522.getClass(), "index", null);
        setField(term33522, term33522.getClass(), "nodeType", enum110);
        setIntField(term33522, term33522.getClass(), "start", -1692331299);
        setIntField(term33522, term33522.getClass(), "end", 479531250);
        setField(term33522, term33522.getClass(), "file", "QduALnDSVo");
        setField(term33522, term33522.getClass(), "parent", null);
        setField(term33522, term33522.getClass(), "name", "izPpKDErnQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Ref");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term33522, args);
    }

};


