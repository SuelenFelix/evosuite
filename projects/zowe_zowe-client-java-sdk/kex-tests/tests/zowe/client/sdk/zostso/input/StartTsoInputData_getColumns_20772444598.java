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

public class StartTsoInputData_getColumns_20772444598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1151;

    public StartTsoInputData_getColumns_20772444598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1151 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term1151, term1151.getClass(), "account", "UoYtihxVaS");
        setField(term1151, term1151.getClass(), "characterSet", "JDswTTCZHV");
        setField(term1151, term1151.getClass(), "codePage", "onpbIeEKoi");
        setField(term1151, term1151.getClass(), "columns", "YRHGsAkhxb");
        setField(term1151, term1151.getClass(), "logonProcedure", "ffYhPOzlUs");
        setField(term1151, term1151.getClass(), "regionSize", "MLqYREekMl");
        setField(term1151, term1151.getClass(), "rows", "ytSBIKXogI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumns", argTypes, term1151, args);
    }

};


