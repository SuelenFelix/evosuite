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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class TestInference_checkType_5421083975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304845;
     Object term304894;
     Object term304976;
     Object term304978;
     Object term304992;

    public TestInference_checkType_5421083975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304845 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference"));
        setField(term304845, term304845.getClass(), "testFile", "YRIQOuomci");
        setField(term304845, term304845.getClass(), "expecteRefsFile", "IvIJBAZVKF");
        setField(term304845, term304845.getClass(), "missingRefsFile", "wKIgrbFWVG");
        setField(term304845, term304845.getClass(), "wrongTypeFile", "VhWamhmJkG");
        Class<? extends Object> term305090 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term305089 = ((Class) term305090).getDeclaredField((String) "SCOPE");
        ((Field) term305089).setAccessible(true);
        Object enum998 = ((Field) term305089).get((Object) null);
        HashMap term304928 = new HashMap();
        Set<Object> term305326 =  ((Map) term304928).keySet();
        HashSet term304927 = new HashSet((Collection<? extends Object>) term305326);
        Object term304897 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term304897, term304897.getClass(), "isBuiltin", true);
        setBooleanField(term304897, term304897.getClass(), "isSynthetic", false);
        setField(term304897, term304897.getClass(), "name", "wAooJbXKDp");
        setField(term304897, term304897.getClass(), "node", null);
        setField(term304897, term304897.getClass(), "qname", "CmeJChKlxD");
        setField(term304897, term304897.getClass(), "type", null);
        setField(term304897, term304897.getClass(), "kind", enum998);
        setField(term304897, term304897.getClass(), "refs", term304927);
        setIntField(term304897, term304897.getClass(), "start", -1042470635);
        setIntField(term304897, term304897.getClass(), "end", -524352937);
        setIntField(term304897, term304897.getClass(), "bodyStart", 1472218987);
        setIntField(term304897, term304897.getClass(), "bodyEnd", 805176809);
        setField(term304897, term304897.getClass(), "fileOrUrl", "ykMBkjJHCt");
        Class<? extends Object> term305338 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term305337 = ((Class) term305338).getDeclaredField((String) "DATATYPE");
        ((Field) term305337).setAccessible(true);
        Object enum999 = ((Field) term305337).get((Object) null);
        HashSet term304957 = new HashSet();
        Object term304950 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term304950, term304950.getClass(), "isBuiltin", true);
        setBooleanField(term304950, term304950.getClass(), "isSynthetic", false);
        setField(term304950, term304950.getClass(), "name", "");
        setField(term304950, term304950.getClass(), "node", null);
        setField(term304950, term304950.getClass(), "qname", "");
        setField(term304950, term304950.getClass(), "type", null);
        setField(term304950, term304950.getClass(), "kind", enum999);
        setField(term304950, term304950.getClass(), "refs", term304957);
        setIntField(term304950, term304950.getClass(), "start", -82632953);
        setIntField(term304950, term304950.getClass(), "end", -1473876284);
        setIntField(term304950, term304950.getClass(), "bodyStart", -1389314671);
        setIntField(term304950, term304950.getClass(), "bodyEnd", -499699841);
        setField(term304950, term304950.getClass(), "fileOrUrl", "");
        term304894 = new LinkedList();
        ((LinkedList) term304894).add(term304897);
        ((LinkedList) term304894).add(term304950);
        term304976 = new Integer(360972386);
        term304978 = new Integer(-2063884849);
        term304992 = (Object[]) newArray("java.lang.String", 3);
        setElement(term304992, 0, "lnaaPhjFrk");
        setElement(term304992, 1, "pmrwOMPSht");
        setElement(term304992, 2, "INqCuCsEDd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[6];
        args[0] = term304894;
        args[1] = "qStzbctyLJ";
        args[2] = term304976;
        args[3] = term304978;
        args[4] = "DwFOZqjQsc";
        args[5] = term304992;
        callMethod(klass, "checkType", argTypes, term304845, args);
    }

};


