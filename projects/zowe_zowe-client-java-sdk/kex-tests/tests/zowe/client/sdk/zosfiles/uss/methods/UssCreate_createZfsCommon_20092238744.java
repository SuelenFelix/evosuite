package zowe.client.sdk.zosfiles.uss.methods;

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
import static zowe.client.sdk.zosfiles.uss.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;

public class UssCreate_createZfsCommon_20092238744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2335;
     Object term2348;

    public UssCreate_createZfsCommon_20092238744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2335 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssCreate"));
        setField(term2335, term2335.getClass(), "connection", null);
        setField(term2335, term2335.getClass(), "request", null);
        Integer term2349 = new Integer(568599855);
        Integer term2351 = new Integer(1162663216);
        Integer term2353 = new Integer(1484323161);
        Integer term2355 = new Integer(391863371);
        Integer term2357 = new Integer(-1922583790);
        ArrayList term2395 = new ArrayList();
        ((ArrayList) term2395).add("RkybSrpybU");
        ((ArrayList) term2395).add("xOEqzGAmDU");
        ((ArrayList) term2395).add("eZFUvlxvGV");
        ((ArrayList) term2395).add("BYqFIqCKAV");
        ((ArrayList) term2395).add("vrQLuWIDJX");
        Integer term2459 = new Integer(-616727354);
        term2348 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term2348, term2348.getClass(), "owner", term2349);
        setField(term2348, term2348.getClass(), "group", term2351);
        setField(term2348, term2348.getClass(), "perms", term2353);
        setField(term2348, term2348.getClass(), "cylsPri", term2355);
        setField(term2348, term2348.getClass(), "cylsSec", term2357);
        setField(term2348, term2348.getClass(), "storageClass", "HyxfbSQYBe");
        setField(term2348, term2348.getClass(), "managementClass", "pCTimMblYc");
        setField(term2348, term2348.getClass(), "dataClass", "hNxWaHcfhY");
        setField(term2348, term2348.getClass(), "volumes", term2395);
        setField(term2348, term2348.getClass(), "timeout", term2459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssCreate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Object[] args = new Object[2];
        args[0] = "tbcdzjIfER";
        args[1] = term2348;
        callMethod(klass, "createZfsCommon", argTypes, term2335, args);
    }

};


