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

public class UssSetAclInputData_Builder_build_9979411427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4357;

    public UssSetAclInputData_Builder_build_9979411427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4428 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term4427 = ((Class) term4428).getDeclaredField((String) "FOLLOW");
        ((Field) term4427).setAccessible(true);
        Object enum14 = ((Field) term4427).get((Object) null);
        Class<? extends Object> term4668 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term4667 = ((Class) term4668).getDeclaredField((String) "FILE");
        ((Field) term4667).setAccessible(true);
        Object enum15 = ((Field) term4667).get((Object) null);
        term4357 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder"));
        setBooleanField(term4357, term4357.getClass(), "abort", true);
        setField(term4357, term4357.getClass(), "links", enum14);
        setField(term4357, term4357.getClass(), "deleteType", enum15);
        setField(term4357, term4357.getClass(), "set", "RkybSrpybU");
        setField(term4357, term4357.getClass(), "modify", "xOEqzGAmDU");
        setField(term4357, term4357.getClass(), "delete", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4357, args);
    }

};


