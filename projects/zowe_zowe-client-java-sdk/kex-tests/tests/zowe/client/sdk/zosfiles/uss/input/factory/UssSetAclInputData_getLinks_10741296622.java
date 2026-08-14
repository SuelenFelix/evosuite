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

public class UssSetAclInputData_getLinks_10741296622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8674;

    public UssSetAclInputData_getLinks_10741296622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8751 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term8750 = ((Class) term8751).getDeclaredField((String) "SUPPRESS");
        ((Field) term8750).setAccessible(true);
        Object enum28 = ((Field) term8750).get((Object) null);
        Class<? extends Object> term8997 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term8996 = ((Class) term8997).getDeclaredField((String) "EVERY");
        ((Field) term8996).setAccessible(true);
        Object enum29 = ((Field) term8996).get((Object) null);
        term8674 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData"));
        setBooleanField(term8674, term8674.getClass(), "abort", true);
        setField(term8674, term8674.getClass(), "links", enum28);
        setField(term8674, term8674.getClass(), "deleteType", enum29);
        setField(term8674, term8674.getClass(), "set", "GzFkzHGYFt");
        setField(term8674, term8674.getClass(), "modify", "tShwQLRGNe");
        setField(term8674, term8674.getClass(), "delete", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLinks", argTypes, term8674, args);
    }

};


