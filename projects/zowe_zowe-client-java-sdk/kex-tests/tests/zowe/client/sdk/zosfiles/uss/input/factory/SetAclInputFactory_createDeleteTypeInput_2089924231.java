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

public class SetAclInputFactory_createDeleteTypeInput_2089924231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum16;

    public SetAclInputFactory_createDeleteTypeInput_2089924231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4985 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term4984 = ((Class) term4985).getDeclaredField((String) "DIR");
        ((Field) term4984).setAccessible(true);
        enum16 = ((Field) term4984).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.SetAclInputFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Object[] args = new Object[1];
        args[0] = enum16;
        callMethod(klass, "createDeleteTypeInput", argTypes, null, args);
    }

};


