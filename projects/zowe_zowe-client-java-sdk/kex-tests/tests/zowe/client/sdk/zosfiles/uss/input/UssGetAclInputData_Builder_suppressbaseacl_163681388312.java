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
import java.lang.Boolean;

public class UssGetAclInputData_Builder_suppressbaseacl_163681388312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51983;
     Object term51987;

    public UssGetAclInputData_Builder_suppressbaseacl_163681388312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51983 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder"));
        setField(term51983, term51983.getClass(), "type", null);
        setField(term51983, term51983.getClass(), "user", null);
        setBooleanField(term51983, term51983.getClass(), "usecommas", false);
        setBooleanField(term51983, term51983.getClass(), "suppressheader", false);
        setBooleanField(term51983, term51983.getClass(), "suppressbaseacl", false);
        term51987 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term51987;
        callMethod(klass, "suppressbaseacl", argTypes, term51983, args);
    }

};


