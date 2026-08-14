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

public class UssSetAclInputData_Builder_setDelete_15922211436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3736;

    public UssSetAclInputData_Builder_setDelete_15922211436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3819 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term3818 = ((Class) term3819).getDeclaredField((String) "CHANGE");
        ((Field) term3818).setAccessible(true);
        Object enum12 = ((Field) term3818).get((Object) null);
        Class<? extends Object> term4059 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term4058 = ((Class) term4059).getDeclaredField((String) "FILE");
        ((Field) term4058).setAccessible(true);
        Object enum13 = ((Field) term4058).get((Object) null);
        term3736 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder"));
        setBooleanField(term3736, term3736.getClass(), "abort", true);
        setField(term3736, term3736.getClass(), "links", enum12);
        setField(term3736, term3736.getClass(), "deleteType", enum13);
        setField(term3736, term3736.getClass(), "set", "tbcdzjIfER");
        setField(term3736, term3736.getClass(), "modify", "HyxfbSQYBe");
        setField(term3736, term3736.getClass(), "delete", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "setDelete", argTypes, term3736, args);
    }

};


