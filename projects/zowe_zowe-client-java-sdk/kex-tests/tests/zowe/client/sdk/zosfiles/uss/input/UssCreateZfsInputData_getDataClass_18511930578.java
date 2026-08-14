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

public class UssCreateZfsInputData_getDataClass_18511930578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49352;

    public UssCreateZfsInputData_getDataClass_18511930578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term49353 = new Integer(-1210583429);
        Integer term49355 = new Integer(-663691365);
        Integer term49357 = new Integer(339854490);
        Integer term49359 = new Integer(-615654495);
        Integer term49361 = new Integer(-1476117762);
        ArrayList term49399 = new ArrayList();
        ((ArrayList) term49399).add("AWYyZiNfsm");
        ((ArrayList) term49399).add("ITRRYiuDwH");
        ((ArrayList) term49399).add("llRfwANcVF");
        ((ArrayList) term49399).add("sUEeHQTWkA");
        ((ArrayList) term49399).add("BDIRCxAWLA");
        ((ArrayList) term49399).add("eOJfbiZLnb");
        ((ArrayList) term49399).add("nKZKnxWYCK");
        ((ArrayList) term49399).add("JOqQxuzRuZ");
        ((ArrayList) term49399).add("RSaoipUlsg");
        Integer term49511 = new Integer(-341962980);
        term49352 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term49352, term49352.getClass(), "owner", term49353);
        setField(term49352, term49352.getClass(), "group", term49355);
        setField(term49352, term49352.getClass(), "perms", term49357);
        setField(term49352, term49352.getClass(), "cylsPri", term49359);
        setField(term49352, term49352.getClass(), "cylsSec", term49361);
        setField(term49352, term49352.getClass(), "storageClass", "hulYxtowxw");
        setField(term49352, term49352.getClass(), "managementClass", "GNEmuHPNcU");
        setField(term49352, term49352.getClass(), "dataClass", "IoSfuKDFRe");
        setField(term49352, term49352.getClass(), "volumes", term49399);
        setField(term49352, term49352.getClass(), "timeout", term49511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataClass", argTypes, term49352, args);
    }

};


