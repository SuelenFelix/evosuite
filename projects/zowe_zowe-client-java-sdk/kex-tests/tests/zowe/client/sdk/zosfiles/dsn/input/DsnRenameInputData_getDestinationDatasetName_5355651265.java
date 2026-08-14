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

public class DsnRenameInputData_getDestinationDatasetName_5355651265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10197;

    public DsnRenameInputData_getDestinationDatasetName_5355651265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10258 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.RenameType");
        Field term10257 = ((Class) term10258).getDeclaredField((String) "DATASET");
        ((Field) term10257).setAccessible(true);
        Object enum3 = ((Field) term10257).get((Object) null);
        term10197 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData"));
        setField(term10197, term10197.getClass(), "type", enum3);
        setField(term10197, term10197.getClass(), "sourceDatasetName", "GGzwMoHZXC");
        setField(term10197, term10197.getClass(), "destinationDatasetName", "IpmgwHTgnG");
        setField(term10197, term10197.getClass(), "sourceMemberName", "tIpkeYIezR");
        setField(term10197, term10197.getClass(), "destinationMemberName", "YkZtEtthvz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDestinationDatasetName", argTypes, term10197, args);
    }

};


