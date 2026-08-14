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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class UssGetAclInputData_Builder_suppressbaseacl_16368138835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51388;
     Object term51416;

    public UssGetAclInputData_Builder_suppressbaseacl_16368138835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51419 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term51418 = ((Class) term51419).getDeclaredField((String) "DIR");
        ((Field) term51418).setAccessible(true);
        Object enum149 = ((Field) term51418).get((Object) null);
        term51388 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder"));
        setField(term51388, term51388.getClass(), "type", enum149);
        setField(term51388, term51388.getClass(), "user", "ZwZIDwYcSW");
        setBooleanField(term51388, term51388.getClass(), "usecommas", false);
        setBooleanField(term51388, term51388.getClass(), "suppressheader", true);
        setBooleanField(term51388, term51388.getClass(), "suppressbaseacl", false);
        term51416 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term51416;
        callMethod(klass, "suppressbaseacl", argTypes, term51388, args);
    }

};


