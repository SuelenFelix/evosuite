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

public class UssMountInputData_Builder_mountPoint_732038272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10871;

    public UssMountInputData_Builder_mountPoint_732038272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10945 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term10944 = ((Class) term10945).getDeclaredField((String) "MOUNT");
        ((Field) term10944).setAccessible(true);
        Object enum30 = ((Field) term10944).get((Object) null);
        Class<? extends Object> term11237 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term11236 = ((Class) term11237).getDeclaredField((String) "READ_WRITE");
        ((Field) term11236).setAccessible(true);
        Object enum31 = ((Field) term11236).get((Object) null);
        term10871 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder"));
        setField(term10871, term10871.getClass(), "action", enum30);
        setField(term10871, term10871.getClass(), "mountPoint", "jSpAteRute");
        setField(term10871, term10871.getClass(), "fsType", "swZVeJAxjt");
        setField(term10871, term10871.getClass(), "mode", enum31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOcJIiQQDu";
        callMethod(klass, "mountPoint", argTypes, term10871, args);
    }

};


