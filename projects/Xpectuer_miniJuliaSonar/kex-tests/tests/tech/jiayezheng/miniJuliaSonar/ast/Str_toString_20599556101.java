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

public class Str_toString_20599556101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6930;

    public Str_toString_20599556101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6987 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term6986 = ((Class) term6987).getDeclaredField((String) "Ref");
        ((Field) term6986).setAccessible(true);
        Object enum21 = ((Field) term6986).get((Object) null);
        term6930 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Str"));
        setField(term6930, term6930.getClass(), "s", "tShwQLRGNe");
        setField(term6930, term6930.getClass(), "nodeType", enum21);
        setIntField(term6930, term6930.getClass(), "start", 458147407);
        setIntField(term6930, term6930.getClass(), "end", -184153539);
        setField(term6930, term6930.getClass(), "file", "LvtrsXUliU");
        setField(term6930, term6930.getClass(), "parent", null);
        setField(term6930, term6930.getClass(), "name", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Str");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6930, args);
    }

};


