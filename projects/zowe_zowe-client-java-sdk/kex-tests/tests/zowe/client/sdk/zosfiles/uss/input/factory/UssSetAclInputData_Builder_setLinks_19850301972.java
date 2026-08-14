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

public class UssSetAclInputData_Builder_setLinks_19850301972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740;
     Object enum4;

    public UssSetAclInputData_Builder_setLinks_19850301972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term831 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term830 = ((Class) term831).getDeclaredField((String) "CHANGE");
        ((Field) term830).setAccessible(true);
        Object enum2 = ((Field) term830).get((Object) null);
        Class<? extends Object> term1071 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term1070 = ((Class) term1071).getDeclaredField((String) "DIR");
        ((Field) term1070).setAccessible(true);
        Object enum3 = ((Field) term1070).get((Object) null);
        term740 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder"));
        setBooleanField(term740, term740.getClass(), "abort", false);
        setField(term740, term740.getClass(), "links", enum2);
        setField(term740, term740.getClass(), "deleteType", enum3);
        setField(term740, term740.getClass(), "set", "xxtlPwDYFs");
        setField(term740, term740.getClass(), "modify", "jJCZpVmanW");
        setField(term740, term740.getClass(), "delete", "EGtDIRbSSb");
        Class<? extends Object> term1357 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term1356 = ((Class) term1357).getDeclaredField((String) "SUPPRESS");
        ((Field) term1356).setAccessible(true);
        enum4 = ((Field) term1356).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.LinkType");
        Object[] args = new Object[1];
        args[0] = enum4;
        callMethod(klass, "setLinks", argTypes, term740, args);
    }

};


