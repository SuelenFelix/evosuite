package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;

public class UssCreateZfsInputData_Builder_managementClass_18041035036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52946;

    public UssCreateZfsInputData_Builder_managementClass_18041035036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term52947 = new Integer(-461771056);
        Integer term52949 = new Integer(-243422082);
        Integer term52951 = new Integer(1384592638);
        Integer term52953 = new Integer(-1002370457);
        Integer term52955 = new Integer(-2014576105);
        ArrayList term52993 = new ArrayList();
        ((ArrayList) term52993).add("aSATgQUpoe");
        ((ArrayList) term52993).add("VkPSXewZfB");
        ((ArrayList) term52993).add("ubodzJoMGW");
        ((ArrayList) term52993).add("weddIktxOA");
        ((ArrayList) term52993).add("uSlMeISsDD");
        ((ArrayList) term52993).add("WdCiTDUKqn");
        Integer term53069 = new Integer(1296895584);
        term52946 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term52946, term52946.getClass(), "owner", term52947);
        setField(term52946, term52946.getClass(), "group", term52949);
        setField(term52946, term52946.getClass(), "perms", term52951);
        setField(term52946, term52946.getClass(), "cylsPri", term52953);
        setField(term52946, term52946.getClass(), "cylsSec", term52955);
        setField(term52946, term52946.getClass(), "storageClass", "XjDhvToxJy");
        setField(term52946, term52946.getClass(), "managementClass", "nxSTJflLQy");
        setField(term52946, term52946.getClass(), "dataClass", "FlHzxEfFzI");
        setField(term52946, term52946.getClass(), "volumes", term52993);
        setField(term52946, term52946.getClass(), "timeout", term53069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PSizQDoxxe";
        callMethod(klass, "managementClass", argTypes, term52946, args);
    }

};


