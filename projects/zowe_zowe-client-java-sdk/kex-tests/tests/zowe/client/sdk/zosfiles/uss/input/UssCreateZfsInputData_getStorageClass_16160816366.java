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

public class UssCreateZfsInputData_getStorageClass_16160816366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49120;

    public UssCreateZfsInputData_getStorageClass_16160816366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term49121 = new Integer(-344842608);
        Integer term49123 = new Integer(941650513);
        Integer term49125 = new Integer(444029505);
        Integer term49127 = new Integer(-1034506028);
        Integer term49129 = new Integer(-1263114719);
        ArrayList term49167 = new ArrayList();
        ((ArrayList) term49167).add("zsWKWiTFuo");
        ((ArrayList) term49167).add("UPUbwyHQKN");
        Integer term49195 = new Integer(-894662986);
        term49120 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term49120, term49120.getClass(), "owner", term49121);
        setField(term49120, term49120.getClass(), "group", term49123);
        setField(term49120, term49120.getClass(), "perms", term49125);
        setField(term49120, term49120.getClass(), "cylsPri", term49127);
        setField(term49120, term49120.getClass(), "cylsSec", term49129);
        setField(term49120, term49120.getClass(), "storageClass", "IHqvyhMtuM");
        setField(term49120, term49120.getClass(), "managementClass", "dAldIGYAXV");
        setField(term49120, term49120.getClass(), "dataClass", "mLwibAPEsa");
        setField(term49120, term49120.getClass(), "volumes", term49167);
        setField(term49120, term49120.getClass(), "timeout", term49195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStorageClass", argTypes, term49120, args);
    }

};


