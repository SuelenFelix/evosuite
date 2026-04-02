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
import java.lang.String;

public class UnionType_typeEquals_4050156099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54697;
     Object term54734;

    public UnionType_typeEquals_4050156099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term54699 = new HashMap();
        Set<Object> term54735 =  ((Map) term54699).keySet();
        HashSet term54698 = new HashSet((Collection<? extends Object>) term54735);
        HashMap term54705 = new HashMap();
        Class<? extends Object> term54737 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term54736 = ((Class) term54737).getDeclaredField((String) "GLOBAL");
        ((Field) term54736).setAccessible(true);
        Object enum184 = ((Field) term54736).get((Object) null);
        term54697 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType"));
        Object term54704 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term54697, term54697.getClass(), "types", term54698);
        setField(term54704, term54704.getClass(), "globalNames", null);
        setField(term54704, term54704.getClass(), "table", term54705);
        setField(term54704, term54704.getClass(), "parent", null);
        setField(term54704, term54704.getClass(), "forwarding", term54704);
        setField(term54704, term54704.getClass(), "supers", null);
        setField(term54704, term54704.getClass(), "globalSymbols", null);
        setField(term54704, term54704.getClass(), "stateType", enum184);
        setField(term54704, term54704.getClass(), "type", null);
        setField(term54704, term54704.getClass(), "path", "");
        setField(term54697, term54697.getClass(), "table", term54704);
        setField(term54697, term54697.getClass(), "file", "UgvuvUxKed");
        term54734 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term54734;
        callMethod(klass, "typeEquals", argTypes, term54697, args);
    }

};


