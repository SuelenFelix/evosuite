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

public class UssCreateZfsInputData_Builder_storageClass_17118227135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52709;

    public UssCreateZfsInputData_Builder_storageClass_17118227135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term52710 = new Integer(11724947);
        Integer term52712 = new Integer(1953277050);
        Integer term52714 = new Integer(1283079251);
        Integer term52716 = new Integer(-523949691);
        Integer term52718 = new Integer(1398204340);
        ArrayList term52756 = new ArrayList();
        ((ArrayList) term52756).add("lKrEAkypza");
        ((ArrayList) term52756).add("KtuuNAqGCQ");
        ((ArrayList) term52756).add("OGQsfjmReM");
        ((ArrayList) term52756).add("YsUtbngnRO");
        ((ArrayList) term52756).add("JisaWUxcNb");
        ((ArrayList) term52756).add("NxgmYPzWCI");
        Integer term52832 = new Integer(229204365);
        term52709 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term52709, term52709.getClass(), "owner", term52710);
        setField(term52709, term52709.getClass(), "group", term52712);
        setField(term52709, term52709.getClass(), "perms", term52714);
        setField(term52709, term52709.getClass(), "cylsPri", term52716);
        setField(term52709, term52709.getClass(), "cylsSec", term52718);
        setField(term52709, term52709.getClass(), "storageClass", "tIpkeYIezR");
        setField(term52709, term52709.getClass(), "managementClass", "YkZtEtthvz");
        setField(term52709, term52709.getClass(), "dataClass", "dwlZSxlXOo");
        setField(term52709, term52709.getClass(), "volumes", term52756);
        setField(term52709, term52709.getClass(), "timeout", term52832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SqjyKmayBx";
        callMethod(klass, "storageClass", argTypes, term52709, args);
    }

};


