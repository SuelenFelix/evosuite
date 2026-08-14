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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class Outliner_Branch_hasChildren_16048370284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248231;

    public Outliner_Branch_hasChildren_16048370284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term248232 = new ArrayList();
        Class<? extends Object> term248272 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term248271 = ((Class) term248272).getDeclaredField((String) "FUNCTION");
        ((Field) term248271).setAccessible(true);
        Object enum810 = ((Field) term248271).get((Object) null);
        term248231 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch"));
        setField(term248231, term248231.getClass(), "children", term248232);
        setField(term248231, term248231.getClass(), "qname", "ioALTdlErP");
        setIntField(term248231, term248231.getClass(), "offset", -232333014);
        setField(term248231, term248231.getClass(), "kind", enum810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasChildren", argTypes, term248231, args);
    }

};


