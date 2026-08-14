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

public class UssCreateZfsInputData_getTimeout_134915849910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49782;

    public UssCreateZfsInputData_getTimeout_134915849910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term49783 = new Integer(-1963434938);
        Integer term49785 = new Integer(906181092);
        Integer term49787 = new Integer(1045657203);
        Integer term49789 = new Integer(1386130016);
        Integer term49791 = new Integer(1072005683);
        ArrayList term49829 = new ArrayList();
        ((ArrayList) term49829).add("IEYhJmgCVd");
        ((ArrayList) term49829).add("KSJeYkkvpk");
        ((ArrayList) term49829).add("qUtkFGMNUV");
        ((ArrayList) term49829).add("mGRiYhnMcR");
        ((ArrayList) term49829).add("NFlvfJCVPO");
        Integer term49893 = new Integer(1861318859);
        term49782 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term49782, term49782.getClass(), "owner", term49783);
        setField(term49782, term49782.getClass(), "group", term49785);
        setField(term49782, term49782.getClass(), "perms", term49787);
        setField(term49782, term49782.getClass(), "cylsPri", term49789);
        setField(term49782, term49782.getClass(), "cylsSec", term49791);
        setField(term49782, term49782.getClass(), "storageClass", "dtGZCsKXbW");
        setField(term49782, term49782.getClass(), "managementClass", "bdyhHbDAmJ");
        setField(term49782, term49782.getClass(), "dataClass", "BBXiTNHqGE");
        setField(term49782, term49782.getClass(), "volumes", term49829);
        setField(term49782, term49782.getClass(), "timeout", term49893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeout", argTypes, term49782, args);
    }

};


