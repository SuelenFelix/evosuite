package zowe.client.sdk.zosfiles.dsn.methods;

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
import static zowe.client.sdk.zosfiles.dsn.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class DsnList_getResult_17962864044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1225;
     Object term1226;
     Object term1238;

    public DsnList_getResult_17962864044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1225 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList"));
        setField(term1225, term1225.getClass(), "connection", null);
        setField(term1225, term1225.getClass(), "request", null);
        Object term1229 = newInstance(Class.forName("java.lang.Object"));
        Object term1231 = newInstance(Class.forName("java.lang.Object"));
        Object term1233 = newInstance(Class.forName("java.lang.Object"));
        term1226 = new LinkedList();
        ((LinkedList) term1226).add(term1229);
        ((LinkedList) term1226).add(term1231);
        ((LinkedList) term1226).add(term1233);
        ((LinkedList) term1226).add((Object)null);
        ((LinkedList) term1226).add((Object)null);
        Object term1241 = newInstance(Class.forName("java.lang.Object"));
        Object term1243 = newInstance(Class.forName("java.lang.Object"));
        Object term1245 = newInstance(Class.forName("java.lang.Object"));
        term1238 = new LinkedList();
        ((LinkedList) term1238).add(term1241);
        ((LinkedList) term1238).add(term1243);
        ((LinkedList) term1238).add(term1245);
        ((LinkedList) term1238).add((Object)null);
        ((LinkedList) term1238).add((Object)null);
        ((LinkedList) term1238).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("zowe.client.sdk.rest.Response");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1226;
        args[2] = term1238;
        callMethod(klass, "getResult", argTypes, term1225, args);
    }

};


