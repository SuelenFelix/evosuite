package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UssChangeOwnerInputData_Builder_owner_12332907691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30120;

    public UssChangeOwnerInputData_Builder_owner_12332907691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30197 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term30196 = ((Class) term30197).getDeclaredField((String) "FOLLOW");
        ((Field) term30196).setAccessible(true);
        Object enum93 = ((Field) term30196).get((Object) null);
        term30120 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder"));
        setField(term30120, term30120.getClass(), "owner", "PtirvZmsGt");
        setField(term30120, term30120.getClass(), "group", "HWkpTmtlrc");
        setBooleanField(term30120, term30120.getClass(), "recursive", true);
        setField(term30120, term30120.getClass(), "links", enum93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hMmaoREuCK";
        callMethod(klass, "owner", argTypes, term30120, args);
    }

};


