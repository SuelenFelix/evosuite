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

public class UssGetAclInputData_Builder_user_20729681032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50495;

    public UssGetAclInputData_Builder_user_20729681032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50542 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term50541 = ((Class) term50542).getDeclaredField((String) "ACCESS");
        ((Field) term50541).setAccessible(true);
        Object enum146 = ((Field) term50541).get((Object) null);
        term50495 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder"));
        setField(term50495, term50495.getClass(), "type", enum146);
        setField(term50495, term50495.getClass(), "user", "IkpjUOuWQU");
        setBooleanField(term50495, term50495.getClass(), "usecommas", false);
        setBooleanField(term50495, term50495.getClass(), "suppressheader", false);
        setBooleanField(term50495, term50495.getClass(), "suppressbaseacl", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "boSSpezHeU";
        callMethod(klass, "user", argTypes, term50495, args);
    }

};


