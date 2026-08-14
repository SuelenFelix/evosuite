package zowe.client.sdk.zosfiles.uss.methods;

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
import static zowe.client.sdk.zosfiles.uss.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UssChangeTag_changeCommon_2636961586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;
     Object term128;

    public UssChangeTag_changeCommon_2636961586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssChangeTag"));
        setField(term115, term115.getClass(), "connection", null);
        setField(term115, term115.getClass(), "request", null);
        Class<? extends Object> term253 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term252 = ((Class) term253).getDeclaredField((String) "REMOVE");
        ((Field) term252).setAccessible(true);
        Object enum0 = ((Field) term252).get((Object) null);
        Class<? extends Object> term576 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term575 = ((Class) term576).getDeclaredField((String) "MIXED");
        ((Field) term575).setAccessible(true);
        Object enum1 = ((Field) term575).get((Object) null);
        Class<? extends Object> term906 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term905 = ((Class) term906).getDeclaredField((String) "SUPPRESS");
        ((Field) term905).setAccessible(true);
        Object enum2 = ((Field) term905).get((Object) null);
        term128 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData"));
        setField(term128, term128.getClass(), "action", enum0);
        setField(term128, term128.getClass(), "type", enum1);
        setField(term128, term128.getClass(), "codeset", "SzjVpOQTyS");
        setBooleanField(term128, term128.getClass(), "recursive", false);
        setField(term128, term128.getClass(), "links", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssChangeTag");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData");
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = term128;
        callMethod(klass, "changeCommon", argTypes, term115, args);
    }

};


