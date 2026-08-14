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
import java.lang.Integer;

public class UssListZfsInputData_Builder_fsname_5707350843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25894;

    public UssListZfsInputData_Builder_fsname_5707350843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25895 = new Integer(-522618178);
        term25894 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListZfsInputData$Builder"));
        setField(term25894, term25894.getClass(), "maxLength", term25895);
        setField(term25894, term25894.getClass(), "path", "pORebkoRdD");
        setField(term25894, term25894.getClass(), "fsname", "mXGCWJDOqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        callMethod(klass, "fsname", argTypes, term25894, args);
    }

};


