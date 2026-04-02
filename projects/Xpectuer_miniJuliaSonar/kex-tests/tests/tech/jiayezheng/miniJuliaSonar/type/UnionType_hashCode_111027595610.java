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

public class UnionType_hashCode_111027595610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55001;

    public UnionType_hashCode_111027595610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term55003 = new HashMap();
        Set<Object> term55038 =  ((Map) term55003).keySet();
        HashSet term55002 = new HashSet((Collection<? extends Object>) term55038);
        HashMap term55009 = new HashMap();
        Class<? extends Object> term55040 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term55039 = ((Class) term55040).getDeclaredField((String) "GLOBAL");
        ((Field) term55039).setAccessible(true);
        Object enum185 = ((Field) term55039).get((Object) null);
        term55001 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType"));
        Object term55008 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term55001, term55001.getClass(), "types", term55002);
        setField(term55008, term55008.getClass(), "globalNames", null);
        setField(term55008, term55008.getClass(), "table", term55009);
        setField(term55008, term55008.getClass(), "parent", null);
        setField(term55008, term55008.getClass(), "forwarding", term55008);
        setField(term55008, term55008.getClass(), "supers", null);
        setField(term55008, term55008.getClass(), "globalSymbols", null);
        setField(term55008, term55008.getClass(), "stateType", enum185);
        setField(term55008, term55008.getClass(), "type", null);
        setField(term55008, term55008.getClass(), "path", "");
        setField(term55001, term55001.getClass(), "table", term55008);
        setField(term55001, term55001.getClass(), "file", "ljBBMsQpaM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term55001, args);
    }

};


