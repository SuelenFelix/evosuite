package zowe.client.sdk.zosfiles.uss.input.factory;

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
import static zowe.client.sdk.zosfiles.uss.input.factory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UssSetAclInputData_init_1559011760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7476;

    public UssSetAclInputData_init_1559011760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7549 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term7548 = ((Class) term7549).getDeclaredField((String) "FOLLOW");
        ((Field) term7548).setAccessible(true);
        Object enum24 = ((Field) term7548).get((Object) null);
        Class<? extends Object> term7789 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term7788 = ((Class) term7789).getDeclaredField((String) "EVERY");
        ((Field) term7788).setAccessible(true);
        Object enum25 = ((Field) term7788).get((Object) null);
        term7476 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder"));
        setBooleanField(term7476, term7476.getClass(), "abort", false);
        setField(term7476, term7476.getClass(), "links", enum24);
        setField(term7476, term7476.getClass(), "deleteType", enum25);
        setField(term7476, term7476.getClass(), "set", "aKnKipADSo");
        setField(term7476, term7476.getClass(), "modify", "wSQxaModmm");
        setField(term7476, term7476.getClass(), "delete", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term7476;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


