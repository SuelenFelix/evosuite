package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnRenameInputData_getType_2570482573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9491;

    public DsnRenameInputData_getType_2570482573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9552 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.RenameType");
        Field term9551 = ((Class) term9552).getDeclaredField((String) "DATASET");
        ((Field) term9551).setAccessible(true);
        Object enum1 = ((Field) term9551).get((Object) null);
        term9491 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData"));
        setField(term9491, term9491.getClass(), "type", enum1);
        setField(term9491, term9491.getClass(), "sourceDatasetName", "vhKzFyKPOT");
        setField(term9491, term9491.getClass(), "destinationDatasetName", "nQhIgWXdRc");
        setField(term9491, term9491.getClass(), "sourceMemberName", "EusenEbIoF");
        setField(term9491, term9491.getClass(), "destinationMemberName", "SScVQYSvWH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term9491, args);
    }

};


