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

public class UnionType_addType_15553106752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54089;

    public UnionType_addType_15553106752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term54091 = new HashMap();
        Set<Object> term54126 =  ((Map) term54091).keySet();
        HashSet term54090 = new HashSet((Collection<? extends Object>) term54126);
        HashMap term54097 = new HashMap();
        Class<? extends Object> term54128 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term54127 = ((Class) term54128).getDeclaredField((String) "GLOBAL");
        ((Field) term54127).setAccessible(true);
        Object enum182 = ((Field) term54127).get((Object) null);
        term54089 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType"));
        Object term54096 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term54089, term54089.getClass(), "types", term54090);
        setField(term54096, term54096.getClass(), "globalNames", null);
        setField(term54096, term54096.getClass(), "table", term54097);
        setField(term54096, term54096.getClass(), "parent", null);
        setField(term54096, term54096.getClass(), "forwarding", term54096);
        setField(term54096, term54096.getClass(), "supers", null);
        setField(term54096, term54096.getClass(), "globalSymbols", null);
        setField(term54096, term54096.getClass(), "stateType", enum182);
        setField(term54096, term54096.getClass(), "type", null);
        setField(term54096, term54096.getClass(), "path", "");
        setField(term54089, term54089.getClass(), "table", term54096);
        setField(term54089, term54089.getClass(), "file", "pFWiDEnVnU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addType", argTypes, term54089, args);
    }

};


