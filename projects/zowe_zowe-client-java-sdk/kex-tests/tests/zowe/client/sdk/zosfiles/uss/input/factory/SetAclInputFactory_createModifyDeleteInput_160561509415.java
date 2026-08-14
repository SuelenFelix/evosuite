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

public class SetAclInputFactory_createModifyDeleteInput_160561509415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7151;
     Object enum23;

    public SetAclInputFactory_createModifyDeleteInput_160561509415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7151 = new Boolean(true);
        Class<? extends Object> term7196 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term7195 = ((Class) term7196).getDeclaredField((String) "SUPPRESS");
        ((Field) term7195).setAccessible(true);
        enum23 = ((Field) term7195).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.SetAclInputFactory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("zowe.client.sdk.zosfiles.uss.types.LinkType");
        Object[] args = new Object[4];
        args[0] = "IDCWpPLRkE";
        args[1] = "nyiiPDVjAc";
        args[2] = term7151;
        args[3] = enum23;
        callMethod(klass, "createModifyDeleteInput", argTypes, null, args);
    }

};


