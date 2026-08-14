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

public class StartTsoInputData_getRegionSize_6335698512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1815;

    public StartTsoInputData_getRegionSize_6335698512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1815 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term1815, term1815.getClass(), "account", "jUbSRrkrYZ");
        setField(term1815, term1815.getClass(), "characterSet", "bWWfajKbEX");
        setField(term1815, term1815.getClass(), "codePage", "cAPeiZHKGJ");
        setField(term1815, term1815.getClass(), "columns", "LvJFtLBaxj");
        setField(term1815, term1815.getClass(), "logonProcedure", "PHvxnGHptP");
        setField(term1815, term1815.getClass(), "regionSize", "TimdotUuNC");
        setField(term1815, term1815.getClass(), "rows", "PkWMRdJcBb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegionSize", argTypes, term1815, args);
    }

};


