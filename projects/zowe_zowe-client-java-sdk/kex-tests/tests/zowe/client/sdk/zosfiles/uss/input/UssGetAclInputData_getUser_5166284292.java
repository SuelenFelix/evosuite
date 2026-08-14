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

public class UssGetAclInputData_getUser_5166284292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38825;

    public UssGetAclInputData_getUser_5166284292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38854 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term38853 = ((Class) term38854).getDeclaredField((String) "DIR");
        ((Field) term38853).setAccessible(true);
        Object enum121 = ((Field) term38853).get((Object) null);
        term38825 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData"));
        setField(term38825, term38825.getClass(), "type", enum121);
        setField(term38825, term38825.getClass(), "user", "FwPbDZcHmB");
        setBooleanField(term38825, term38825.getClass(), "useCommas", true);
        setBooleanField(term38825, term38825.getClass(), "suppressHeader", false);
        setBooleanField(term38825, term38825.getClass(), "suppressBaseAcl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term38825, args);
    }

};


