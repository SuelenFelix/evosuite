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
import java.lang.Boolean;
import java.lang.String;
import java.lang.Object;

public class SetAclInputFactory_createModifyInput_16471429309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6429;
     Object enum21;

    public SetAclInputFactory_createModifyInput_16471429309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6429 = new Boolean(true);
        Class<? extends Object> term6464 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term6463 = ((Class) term6464).getDeclaredField((String) "SUPPRESS");
        ((Field) term6463).setAccessible(true);
        enum21 = ((Field) term6463).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.SetAclInputFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("zowe.client.sdk.zosfiles.uss.types.LinkType");
        Object[] args = new Object[3];
        args[0] = "TEParAifyi";
        args[1] = term6429;
        args[2] = enum21;
        callMethod(klass, "createModifyInput", argTypes, null, args);
    }

};


