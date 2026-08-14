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
     Object term304851;
     Object term304900;
     Object term304982;
     Object term304984;
     Object term304998;

    public TestInference_checkType_5421083975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304851 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference"));
        setField(term304851, term304851.getClass(), "testFile", "YRIQOuomci");
        setField(term304851, term304851.getClass(), "expecteRefsFile", "IvIJBAZVKF");
        setField(term304851, term304851.getClass(), "missingRefsFile", "wKIgrbFWVG");
        setField(term304851, term304851.getClass(), "wrongTypeFile", "VhWamhmJkG");
        Class<? extends Object> term305096 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term305095 = ((Class) term305096).getDeclaredField((String) "SCOPE");
        ((Field) term305095).setAccessible(true);
        Object enum998 = ((Field) term305095).get((Object) null);
        HashMap term304934 = new HashMap();
        Set<Object> term305332 =  ((Map) term304934).keySet();
        HashSet term304933 = new HashSet((Collection<? extends Object>) term305332);
        Object term304903 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term304903, term304903.getClass(), "isBuiltin", true);
        setBooleanField(term304903, term304903.getClass(), "isSynthetic", false);
        setField(term304903, term304903.getClass(), "name", "wAooJbXKDp");
        setField(term304903, term304903.getClass(), "node", null);
        setField(term304903, term304903.getClass(), "qname", "CmeJChKlxD");
        setField(term304903, term304903.getClass(), "type", null);
        setField(term304903, term304903.getClass(), "kind", enum998);
        setField(term304903, term304903.getClass(), "refs", term304933);
        setIntField(term304903, term304903.getClass(), "start", -1042470635);
        setIntField(term304903, term304903.getClass(), "end", -524352937);
        setIntField(term304903, term304903.getClass(), "bodyStart", 1472218987);
        setIntField(term304903, term304903.getClass(), "bodyEnd", 805176809);
        setField(term304903, term304903.getClass(), "fileOrUrl", "ykMBkjJHCt");
        Class<? extends Object> term305344 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term305343 = ((Class) term305344).getDeclaredField((String) "DATATYPE");
        ((Field) term305343).setAccessible(true);
        Object enum999 = ((Field) term305343).get((Object) null);
        HashSet term304963 = new HashSet();
        Object term304956 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term304956, term304956.getClass(), "isBuiltin", true);
        setBooleanField(term304956, term304956.getClass(), "isSynthetic", false);
        setField(term304956, term304956.getClass(), "name", "");
        setField(term304956, term304956.getClass(), "node", null);
        setField(term304956, term304956.getClass(), "qname", "");
        setField(term304956, term304956.getClass(), "type", null);
        setField(term304956, term304956.getClass(), "kind", enum999);
        setField(term304956, term304956.getClass(), "refs", term304963);
        setIntField(term304956, term304956.getClass(), "start", -82632953);
        setIntField(term304956, term304956.getClass(), "end", -1473876284);
        setIntField(term304956, term304956.getClass(), "bodyStart", -1389314671);
        setIntField(term304956, term304956.getClass(), "bodyEnd", -499699841);
        setField(term304956, term304956.getClass(), "fileOrUrl", "");
        term304900 = new LinkedList();
        ((LinkedList) term304900).add(term304903);
        ((LinkedList) term304900).add(term304956);
        term304982 = new Integer(360972386);
        term304984 = new Integer(-2063884849);
        term304998 = (Object[]) newArray("java.lang.String", 3);
        setElement(term304998, 0, "lnaaPhjFrk");
        setElement(term304998, 1, "pmrwOMPSht");
        setElement(term304998, 2, "INqCuCsEDd");
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
        args[0] = term304900;
        args[1] = "qStzbctyLJ";
        args[2] = term304982;
        args[3] = term304984;
        args[4] = "DwFOZqjQsc";
        args[5] = term304998;
        callMethod(klass, "checkType", argTypes, term304851, args);
    }

};


