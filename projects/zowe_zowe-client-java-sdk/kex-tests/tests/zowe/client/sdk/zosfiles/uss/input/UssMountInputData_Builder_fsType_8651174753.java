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

public class UssMountInputData_Builder_fsType_8651174753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11523;

    public UssMountInputData_Builder_fsType_8651174753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11603 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountActionType");
        Field term11602 = ((Class) term11603).getDeclaredField((String) "UNMOUNT");
        ((Field) term11602).setAccessible(true);
        Object enum32 = ((Field) term11602).get((Object) null);
        Class<? extends Object> term11901 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Field term11900 = ((Class) term11901).getDeclaredField((String) "READY_ONLY");
        ((Field) term11900).setAccessible(true);
        Object enum33 = ((Field) term11900).get((Object) null);
        term11523 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder"));
        setField(term11523, term11523.getClass(), "action", enum32);
        setField(term11523, term11523.getClass(), "mountPoint", "GVizqqzXpy");
        setField(term11523, term11523.getClass(), "fsType", "JqXGgAhZPl");
        setField(term11523, term11523.getClass(), "mode", enum33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jiKYgYHqIS";
        callMethod(klass, "fsType", argTypes, term11523, args);
    }

};


