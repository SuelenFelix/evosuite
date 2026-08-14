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

public class DsnCopyInputData_Builder_fromDataSet_19780448742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17220;

    public DsnCopyInputData_Builder_fromDataSet_19780448742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17220 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder"));
        setField(term17220, term17220.getClass(), "fromVolser", "xypryEkUPF");
        setField(term17220, term17220.getClass(), "fromDataSet", "zyZTzHNjQr");
        setField(term17220, term17220.getClass(), "toVolser", "YSrFKQQwXE");
        setField(term17220, term17220.getClass(), "toDataSet", "qxhOsmyyjm");
        setBooleanField(term17220, term17220.getClass(), "replace", true);
        setBooleanField(term17220, term17220.getClass(), "copyAllMembers", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DuKcNfVVYR";
        callMethod(klass, "fromDataSet", argTypes, term17220, args);
    }

};


