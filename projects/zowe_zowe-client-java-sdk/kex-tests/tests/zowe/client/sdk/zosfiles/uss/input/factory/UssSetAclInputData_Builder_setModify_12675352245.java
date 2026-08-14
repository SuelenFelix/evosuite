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

public class UssSetAclInputData_Builder_setModify_12675352245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3100;

    public UssSetAclInputData_Builder_setModify_12675352245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3189 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term3188 = ((Class) term3189).getDeclaredField((String) "SUPPRESS");
        ((Field) term3188).setAccessible(true);
        Object enum10 = ((Field) term3188).get((Object) null);
        Class<? extends Object> term3435 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term3434 = ((Class) term3435).getDeclaredField((String) "EVERY");
        ((Field) term3434).setAccessible(true);
        Object enum11 = ((Field) term3434).get((Object) null);
        term3100 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder"));
        setBooleanField(term3100, term3100.getClass(), "abort", true);
        setField(term3100, term3100.getClass(), "links", enum10);
        setField(term3100, term3100.getClass(), "deleteType", enum11);
        setField(term3100, term3100.getClass(), "set", "LQFpaHEwXR");
        setField(term3100, term3100.getClass(), "modify", "oVcInYnLWB");
        setField(term3100, term3100.getClass(), "delete", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "setModify", argTypes, term3100, args);
    }

};


