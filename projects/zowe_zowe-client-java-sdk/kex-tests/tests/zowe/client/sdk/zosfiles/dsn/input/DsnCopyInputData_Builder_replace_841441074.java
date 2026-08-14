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

public class DsnCopyInputData_Builder_replace_841441074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17446;
     Object term17497;

    public DsnCopyInputData_Builder_replace_841441074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17446 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder"));
        setField(term17446, term17446.getClass(), "fromVolser", "vpZIqpFbKM");
        setField(term17446, term17446.getClass(), "fromDataSet", "dAbwpJCDif");
        setField(term17446, term17446.getClass(), "toVolser", "ATSXJPySio");
        setField(term17446, term17446.getClass(), "toDataSet", "XZkOUcbfFg");
        setBooleanField(term17446, term17446.getClass(), "replace", true);
        setBooleanField(term17446, term17446.getClass(), "copyAllMembers", true);
        term17497 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17497;
        callMethod(klass, "replace", argTypes, term17446, args);
    }

};


