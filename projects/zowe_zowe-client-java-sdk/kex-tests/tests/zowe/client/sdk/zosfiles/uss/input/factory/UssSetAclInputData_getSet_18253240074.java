package zowe.client.sdk.zosfiles.uss.input.factory;

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
import static zowe.client.sdk.zosfiles.uss.input.factory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UssSetAclInputData_getSet_18253240074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9892;

    public UssSetAclInputData_getSet_18253240074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9967 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term9966 = ((Class) term9967).getDeclaredField((String) "FOLLOW");
        ((Field) term9966).setAccessible(true);
        Object enum32 = ((Field) term9966).get((Object) null);
        Class<? extends Object> term10207 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term10206 = ((Class) term10207).getDeclaredField((String) "ACCESS");
        ((Field) term10206).setAccessible(true);
        Object enum33 = ((Field) term10206).get((Object) null);
        term9892 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData"));
        setBooleanField(term9892, term9892.getClass(), "abort", true);
        setField(term9892, term9892.getClass(), "links", enum32);
        setField(term9892, term9892.getClass(), "deleteType", enum33);
        setField(term9892, term9892.getClass(), "set", "UiUYnPrcCi");
        setField(term9892, term9892.getClass(), "modify", "UoYtihxVaS");
        setField(term9892, term9892.getClass(), "delete", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSet", argTypes, term9892, args);
    }

};


