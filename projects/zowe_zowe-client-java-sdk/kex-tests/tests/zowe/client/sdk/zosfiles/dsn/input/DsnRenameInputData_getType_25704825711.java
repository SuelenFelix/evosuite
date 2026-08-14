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

public class DsnRenameInputData_getType_25704825711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11250;

    public DsnRenameInputData_getType_25704825711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11250 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData"));
        setField(term11250, term11250.getClass(), "type", null);
        setField(term11250, term11250.getClass(), "sourceDatasetName", null);
        setField(term11250, term11250.getClass(), "destinationDatasetName", null);
        setField(term11250, term11250.getClass(), "sourceMemberName", null);
        setField(term11250, term11250.getClass(), "destinationMemberName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term11250, args);
    }

};


