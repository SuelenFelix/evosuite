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
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;

public class DsnList_getResponse_11182878745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1252;
     Object term1253;
     Object term1334;

    public DsnList_getResponse_11182878745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1252 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList"));
        setField(term1252, term1252.getClass(), "connection", null);
        setField(term1252, term1252.getClass(), "request", null);
        Class<? extends Object> term1390 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term1389 = ((Class) term1390).getDeclaredField((String) "BASE");
        ((Field) term1389).setAccessible(true);
        Object enum2 = ((Field) term1389).get((Object) null);
        term1253 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term1253, term1253.getClass(), "volume", "TEParAifyi");
        setField(term1253, term1253.getClass(), "attribute", enum2);
        setField(term1253, term1253.getClass(), "maxLength", "OWDIEULEFu");
        setField(term1253, term1253.getClass(), "start", "dWRymuLBtr");
        setField(term1253, term1253.getClass(), "recall", "AijpHYOFuy");
        setField(term1253, term1253.getClass(), "pattern", "SbAoxhfrkn");
        setField(term1253, term1253.getClass(), "responseTimeout", "kuTXqwMtDB");
        term1334 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term1253;
        args[1] = term1334;
        args[2] = "IDCWpPLRkE";
        callMethod(klass, "getResponse", argTypes, term1252, args);
    }

};


