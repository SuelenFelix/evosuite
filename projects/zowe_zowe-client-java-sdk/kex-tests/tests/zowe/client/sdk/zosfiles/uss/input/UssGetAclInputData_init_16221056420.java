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

public class UssGetAclInputData_init_16221056420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38218;

    public UssGetAclInputData_init_16221056420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38291 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.GetAclType");
        Field term38290 = ((Class) term38291).getDeclaredField((String) "DIR");
        ((Field) term38290).setAccessible(true);
        Object enum119 = ((Field) term38290).get((Object) null);
        term38218 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder"));
        setField(term38218, term38218.getClass(), "type", enum119);
        setField(term38218, term38218.getClass(), "user", "AZdLeSugwv");
        setBooleanField(term38218, term38218.getClass(), "usecommas", false);
        setBooleanField(term38218, term38218.getClass(), "suppressheader", true);
        setBooleanField(term38218, term38218.getClass(), "suppressbaseacl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term38218;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


