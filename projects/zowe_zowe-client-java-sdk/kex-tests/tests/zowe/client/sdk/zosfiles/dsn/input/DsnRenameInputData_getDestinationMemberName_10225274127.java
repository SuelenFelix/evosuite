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

public class DsnRenameInputData_getDestinationMemberName_10225274127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10899;

    public DsnRenameInputData_getDestinationMemberName_10225274127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10959 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.RenameType");
        Field term10958 = ((Class) term10959).getDeclaredField((String) "MEMBER");
        ((Field) term10958).setAccessible(true);
        Object enum5 = ((Field) term10958).get((Object) null);
        term10899 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData"));
        setField(term10899, term10899.getClass(), "type", enum5);
        setField(term10899, term10899.getClass(), "sourceDatasetName", "YsUtbngnRO");
        setField(term10899, term10899.getClass(), "destinationDatasetName", "JisaWUxcNb");
        setField(term10899, term10899.getClass(), "sourceMemberName", "NxgmYPzWCI");
        setField(term10899, term10899.getClass(), "destinationMemberName", "SqjyKmayBx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDestinationMemberName", argTypes, term10899, args);
    }

};


