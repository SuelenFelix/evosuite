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

public class UssSetAcl_deleteByType_20392150905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2922;
     Object enum6;

    public UssSetAcl_deleteByType_20392150905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2922 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssSetAcl"));
        setField(term2922, term2922.getClass(), "connection", null);
        setField(term2922, term2922.getClass(), "request", null);
        Class<? extends Object> term3024 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term3023 = ((Class) term3024).getDeclaredField((String) "ACCESS");
        ((Field) term3023).setAccessible(true);
        enum6 = ((Field) term3023).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssSetAcl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Object[] args = new Object[2];
        args[0] = "UlajhuVLaP";
        args[1] = enum6;
        callMethod(klass, "deleteByType", argTypes, term2922, args);
    }

};


