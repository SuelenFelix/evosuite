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

public class UssListZfsInputData_Builder_path_11699686072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25825;

    public UssListZfsInputData_Builder_path_11699686072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25826 = new Integer(1725571209);
        term25825 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListZfsInputData$Builder"));
        setField(term25825, term25825.getClass(), "maxLength", term25826);
        setField(term25825, term25825.getClass(), "path", "MvRIxilFMJ");
        setField(term25825, term25825.getClass(), "fsname", "iNwOJRBEjp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XylxrMBraH";
        callMethod(klass, "path", argTypes, term25825, args);
    }

};


