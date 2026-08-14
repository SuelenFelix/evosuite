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

public class UssCreateZfsInputData_getManagementClass_8509523607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49247;

    public UssCreateZfsInputData_getManagementClass_8509523607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term49248 = new Integer(304775596);
        Integer term49250 = new Integer(-1347665717);
        Integer term49252 = new Integer(-1888585309);
        Integer term49254 = new Integer(683666002);
        Integer term49256 = new Integer(1596213415);
        ArrayList term49294 = new ArrayList();
        ((ArrayList) term49294).add("PvmBHIXaMY");
        Integer term49310 = new Integer(-268815336);
        term49247 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term49247, term49247.getClass(), "owner", term49248);
        setField(term49247, term49247.getClass(), "group", term49250);
        setField(term49247, term49247.getClass(), "perms", term49252);
        setField(term49247, term49247.getClass(), "cylsPri", term49254);
        setField(term49247, term49247.getClass(), "cylsSec", term49256);
        setField(term49247, term49247.getClass(), "storageClass", "lgQkrXANyI");
        setField(term49247, term49247.getClass(), "managementClass", "MeTmRZXErV");
        setField(term49247, term49247.getClass(), "dataClass", "jNxbVmoZgq");
        setField(term49247, term49247.getClass(), "volumes", term49294);
        setField(term49247, term49247.getClass(), "timeout", term49310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getManagementClass", argTypes, term49247, args);
    }

};


