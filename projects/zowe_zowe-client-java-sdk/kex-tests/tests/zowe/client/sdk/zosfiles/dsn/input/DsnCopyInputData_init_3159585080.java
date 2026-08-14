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

public class DsnCopyInputData_init_3159585080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17881;

    public DsnCopyInputData_init_3159585080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17881 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder"));
        setField(term17881, term17881.getClass(), "fromVolser", "VGiXZZTWRO");
        setField(term17881, term17881.getClass(), "fromDataSet", "MlPtwXnJOJ");
        setField(term17881, term17881.getClass(), "toVolser", "DbfiyFeaTe");
        setField(term17881, term17881.getClass(), "toDataSet", "dQxXGBtDLZ");
        setBooleanField(term17881, term17881.getClass(), "replace", true);
        setBooleanField(term17881, term17881.getClass(), "copyAllMembers", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term17881;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


