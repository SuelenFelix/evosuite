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

public class UssMountInputData_Builder_build_12981104865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13116;

    public UssMountInputData_Builder_build_12981104865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13182 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term13181 = ((Class) term13182).getDeclaredField((String) "UNMOUNT");
        ((Field) term13181).setAccessible(true);
        Object enum37 = ((Field) term13181).get((Object) null);
        Class<? extends Object> term13480 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term13479 = ((Class) term13480).getDeclaredField((String) "READ_WRITE");
        ((Field) term13479).setAccessible(true);
        Object enum38 = ((Field) term13479).get((Object) null);
        term13116 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder"));
        setField(term13116, term13116.getClass(), "action", enum37);
        setField(term13116, term13116.getClass(), "mountPoint", "JiVRgTZvKc");
        setField(term13116, term13116.getClass(), "fsType", "XPKmummaqg");
        setField(term13116, term13116.getClass(), "mode", enum38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term13116, args);
    }

};


