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

public class UssCreateZfsInputData_getCylsSec_6817395625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48905;

    public UssCreateZfsInputData_getCylsSec_6817395625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48906 = new Integer(1442160736);
        Integer term48908 = new Integer(1114000454);
        Integer term48910 = new Integer(-556405712);
        Integer term48912 = new Integer(-1772434990);
        Integer term48914 = new Integer(-1845499264);
        ArrayList term48952 = new ArrayList();
        ((ArrayList) term48952).add("aanyiAOJCl");
        ((ArrayList) term48952).add("VDokbsCuqq");
        ((ArrayList) term48952).add("xClUIcPECX");
        ((ArrayList) term48952).add("avhRaGZaBF");
        ((ArrayList) term48952).add("JkgoRtImdE");
        ((ArrayList) term48952).add("qFGKIJjlmV");
        Integer term49028 = new Integer(-505439934);
        term48905 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term48905, term48905.getClass(), "owner", term48906);
        setField(term48905, term48905.getClass(), "group", term48908);
        setField(term48905, term48905.getClass(), "perms", term48910);
        setField(term48905, term48905.getClass(), "cylsPri", term48912);
        setField(term48905, term48905.getClass(), "cylsSec", term48914);
        setField(term48905, term48905.getClass(), "storageClass", "vOVuNSCCLe");
        setField(term48905, term48905.getClass(), "managementClass", "fzeqPnzpnt");
        setField(term48905, term48905.getClass(), "dataClass", "RxbhrFBjkO");
        setField(term48905, term48905.getClass(), "volumes", term48952);
        setField(term48905, term48905.getClass(), "timeout", term49028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCylsSec", argTypes, term48905, args);
    }

};


