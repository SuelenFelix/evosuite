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

public class Missing_toString_8858445611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33856;

    public Missing_toString_8858445611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33896 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term33895 = ((Class) term33896).getDeclaredField((String) "Continue");
        ((Field) term33895).setAccessible(true);
        Object enum111 = ((Field) term33895).get((Object) null);
        term33856 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Missing"));
        setField(term33856, term33856.getClass(), "nodeType", enum111);
        setIntField(term33856, term33856.getClass(), "start", 534834644);
        setIntField(term33856, term33856.getClass(), "end", 1959097203);
        setField(term33856, term33856.getClass(), "file", "tlQSNgTkQX");
        setField(term33856, term33856.getClass(), "parent", null);
        setField(term33856, term33856.getClass(), "name", "PCipZnmBOF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Missing");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term33856, args);
    }

};


