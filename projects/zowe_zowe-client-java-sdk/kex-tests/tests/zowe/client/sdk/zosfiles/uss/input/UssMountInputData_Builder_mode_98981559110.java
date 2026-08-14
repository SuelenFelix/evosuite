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

public class UssMountInputData_Builder_mode_98981559110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13759;

    public UssMountInputData_Builder_mode_98981559110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13759 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder"));
        setField(term13759, term13759.getClass(), "action", null);
        setField(term13759, term13759.getClass(), "mountPoint", null);
        setField(term13759, term13759.getClass(), "fsType", null);
        setField(term13759, term13759.getClass(), "mode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssMountInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.MountModeType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mode", argTypes, term13759, args);
    }

};


