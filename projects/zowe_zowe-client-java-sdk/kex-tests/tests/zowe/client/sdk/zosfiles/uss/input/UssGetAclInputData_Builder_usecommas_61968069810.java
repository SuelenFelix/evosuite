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

public class UssGetAclInputData_Builder_usecommas_61968069810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51971;
     Object term51975;

    public UssGetAclInputData_Builder_usecommas_61968069810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51971 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder"));
        setField(term51971, term51971.getClass(), "type", null);
        setField(term51971, term51971.getClass(), "user", null);
        setBooleanField(term51971, term51971.getClass(), "usecommas", false);
        setBooleanField(term51971, term51971.getClass(), "suppressheader", false);
        setBooleanField(term51971, term51971.getClass(), "suppressbaseacl", false);
        term51975 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term51975;
        callMethod(klass, "usecommas", argTypes, term51971, args);
    }

};


