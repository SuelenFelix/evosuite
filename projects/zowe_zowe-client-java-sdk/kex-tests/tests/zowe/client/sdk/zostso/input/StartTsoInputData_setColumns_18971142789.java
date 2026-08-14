package zowe.client.sdk.zostso.input;

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
import static zowe.client.sdk.zostso.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StartTsoInputData_setColumns_18971142789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1306;

    public StartTsoInputData_setColumns_18971142789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1306 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term1306, term1306.getClass(), "account", "nHXjMycHlU");
        setField(term1306, term1306.getClass(), "characterSet", "ieCtQFdkii");
        setField(term1306, term1306.getClass(), "codePage", "dEnhdmILtU");
        setField(term1306, term1306.getClass(), "columns", "hoicvmsovO");
        setField(term1306, term1306.getClass(), "logonProcedure", "eqJfYWRaEL");
        setField(term1306, term1306.getClass(), "regionSize", "fhkbdRViHi");
        setField(term1306, term1306.getClass(), "rows", "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kBdSllIBVz";
        callMethod(klass, "setColumns", argTypes, term1306, args);
    }

};


