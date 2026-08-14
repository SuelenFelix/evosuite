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

public class StartTsoInputData_setRegionSize_39475293813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1970;

    public StartTsoInputData_setRegionSize_39475293813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1970 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term1970, term1970.getClass(), "account", "jSpAteRute");
        setField(term1970, term1970.getClass(), "characterSet", "swZVeJAxjt");
        setField(term1970, term1970.getClass(), "codePage", "xOcJIiQQDu");
        setField(term1970, term1970.getClass(), "columns", "GVizqqzXpy");
        setField(term1970, term1970.getClass(), "logonProcedure", "JqXGgAhZPl");
        setField(term1970, term1970.getClass(), "regionSize", "jiKYgYHqIS");
        setField(term1970, term1970.getClass(), "rows", "DfISiziTgG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XqgfKFvPSD";
        callMethod(klass, "setRegionSize", argTypes, term1970, args);
    }

};


