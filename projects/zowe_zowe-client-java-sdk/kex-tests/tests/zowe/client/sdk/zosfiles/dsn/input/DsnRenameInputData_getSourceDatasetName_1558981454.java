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

public class DsnRenameInputData_getSourceDatasetName_1558981454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9844;

    public DsnRenameInputData_getSourceDatasetName_1558981454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9905 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.RenameType");
        Field term9904 = ((Class) term9905).getDeclaredField((String) "DATASET");
        ((Field) term9904).setAccessible(true);
        Object enum2 = ((Field) term9904).get((Object) null);
        term9844 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData"));
        setField(term9844, term9844.getClass(), "type", enum2);
        setField(term9844, term9844.getClass(), "sourceDatasetName", "MnovcqFhCl");
        setField(term9844, term9844.getClass(), "destinationDatasetName", "qYtAeLzOhW");
        setField(term9844, term9844.getClass(), "sourceMemberName", "tJzmOfcUnY");
        setField(term9844, term9844.getClass(), "destinationMemberName", "TKlccZUpjz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSourceDatasetName", argTypes, term9844, args);
    }

};


