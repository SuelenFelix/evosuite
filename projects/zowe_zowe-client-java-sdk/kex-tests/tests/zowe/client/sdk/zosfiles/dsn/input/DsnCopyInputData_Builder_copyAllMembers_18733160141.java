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
import java.lang.Boolean;

public class DsnCopyInputData_Builder_copyAllMembers_18733160141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17127;
     Object term17178;

    public DsnCopyInputData_Builder_copyAllMembers_18733160141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17127 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder"));
        setField(term17127, term17127.getClass(), "fromVolser", "MpJsPKLTIU");
        setField(term17127, term17127.getClass(), "fromDataSet", "IiNCZfdouL");
        setField(term17127, term17127.getClass(), "toVolser", "AhOHzCsHKW");
        setField(term17127, term17127.getClass(), "toDataSet", "UqgLPaaAHi");
        setBooleanField(term17127, term17127.getClass(), "replace", true);
        setBooleanField(term17127, term17127.getClass(), "copyAllMembers", false);
        term17178 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17178;
        callMethod(klass, "copyAllMembers", argTypes, term17127, args);
    }

};


