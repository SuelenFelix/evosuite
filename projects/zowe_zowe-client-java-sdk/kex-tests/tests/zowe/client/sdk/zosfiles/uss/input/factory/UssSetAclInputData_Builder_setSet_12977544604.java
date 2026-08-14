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

public class UssSetAclInputData_Builder_setSet_12977544604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2479;

    public UssSetAclInputData_Builder_setSet_12977544604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2562 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term2561 = ((Class) term2562).getDeclaredField((String) "FOLLOW");
        ((Field) term2561).setAccessible(true);
        Object enum8 = ((Field) term2561).get((Object) null);
        Class<? extends Object> term2802 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term2801 = ((Class) term2802).getDeclaredField((String) "FILE");
        ((Field) term2801).setAccessible(true);
        Object enum9 = ((Field) term2801).get((Object) null);
        term2479 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder"));
        setBooleanField(term2479, term2479.getClass(), "abort", true);
        setField(term2479, term2479.getClass(), "links", enum8);
        setField(term2479, term2479.getClass(), "deleteType", enum9);
        setField(term2479, term2479.getClass(), "set", "RMFIsYGgne");
        setField(term2479, term2479.getClass(), "modify", "NRdvgJlhkX");
        setField(term2479, term2479.getClass(), "delete", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "setSet", argTypes, term2479, args);
    }

};


