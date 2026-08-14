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

public class DsnCopyInputData_getToVolser_8191917434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18245;

    public DsnCopyInputData_getToVolser_8191917434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18245 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData"));
        setField(term18245, term18245.getClass(), "fromVolser", "SibzENsyyy");
        setField(term18245, term18245.getClass(), "fromDataSet", "mrqGHotaef");
        setField(term18245, term18245.getClass(), "toVolser", "UbZGBpQZQW");
        setField(term18245, term18245.getClass(), "toDataSet", "SvGTualQPa");
        setBooleanField(term18245, term18245.getClass(), "replace", true);
        setBooleanField(term18245, term18245.getClass(), "copyAllMembers", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToVolser", argTypes, term18245, args);
    }

};


