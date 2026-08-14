package zowe.client.sdk.zosfiles.dsn.methods;

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
import static zowe.client.sdk.zosfiles.dsn.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnUpdate_rename_1845716552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3054;
     Object term3055;

    public DsnUpdate_rename_1845716552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3054 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnUpdate"));
        setField(term3054, term3054.getClass(), "connection", null);
        setField(term3054, term3054.getClass(), "request", null);
        Class<? extends Object> term3137 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.RenameType");
        Field term3136 = ((Class) term3137).getDeclaredField((String) "DATASET");
        ((Field) term3136).setAccessible(true);
        Object enum5 = ((Field) term3136).get((Object) null);
        term3055 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData"));
        setField(term3055, term3055.getClass(), "type", enum5);
        setField(term3055, term3055.getClass(), "sourceDatasetName", "HqBOwkVqjD");
        setField(term3055, term3055.getClass(), "destinationDatasetName", "MAcUBcBckh");
        setField(term3055, term3055.getClass(), "sourceMemberName", "oVgzLbrsFr");
        setField(term3055, term3055.getClass(), "destinationMemberName", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnUpdate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData");
        Object[] args = new Object[1];
        args[0] = term3055;
        callMethod(klass, "rename", argTypes, term3054, args);
    }

};


