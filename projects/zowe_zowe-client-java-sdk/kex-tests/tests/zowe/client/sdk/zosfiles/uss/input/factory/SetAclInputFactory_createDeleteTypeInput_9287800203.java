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
import java.lang.Boolean;

public class SetAclInputFactory_createDeleteTypeInput_9287800203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum18;
     Object term5527;
     Object enum19;

    public SetAclInputFactory_createDeleteTypeInput_9287800203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5548 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term5547 = ((Class) term5548).getDeclaredField((String) "DIR");
        ((Field) term5547).setAccessible(true);
        enum18 = ((Field) term5547).get((Object) null);
        term5527 = new Boolean(true);
        Class<? extends Object> term5804 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term5803 = ((Class) term5804).getDeclaredField((String) "FOLLOW");
        ((Field) term5803).setAccessible(true);
        enum19 = ((Field) term5803).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.SetAclInputFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("zowe.client.sdk.zosfiles.uss.types.LinkType");
        Object[] args = new Object[3];
        args[0] = enum18;
        args[1] = term5527;
        args[2] = enum19;
        callMethod(klass, "createDeleteTypeInput", argTypes, null, args);
    }

};


