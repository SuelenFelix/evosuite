package tech.jiayezheng.miniJuliaSonar.type;

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
import static tech.jiayezheng.miniJuliaSonar.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Type_CyclicTypeRecorder_push_1216504801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Type_CyclicTypeRecorder_push_1216504801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        HashMap term9 = new HashMap();
        Set<Object> term17 =  ((Map) term9).keySet();
        HashSet term8 = new HashSet((Collection<? extends Object>) term17);
        term1 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type$CyclicTypeRecorder"));
        setIntField(term1, term1.getClass(), "count", 568599855);
        setField(term1, term1.getClass(), "elements", term3);
        setField(term1, term1.getClass(), "used", term8);
        setField(term1, term1.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type$CyclicTypeRecorder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "push", argTypes, term1, args);
    }

};


