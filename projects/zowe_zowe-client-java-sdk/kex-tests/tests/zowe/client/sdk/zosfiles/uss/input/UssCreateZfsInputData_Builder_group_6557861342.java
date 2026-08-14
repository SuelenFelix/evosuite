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

public class UssCreateZfsInputData_Builder_group_6557861342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52190;
     Object term52279;

    public UssCreateZfsInputData_Builder_group_6557861342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term52191 = new Integer(1202361360);
        Integer term52193 = new Integer(-2015048153);
        Integer term52195 = new Integer(-2063457669);
        Integer term52197 = new Integer(-1222006000);
        Integer term52199 = new Integer(2095798786);
        ArrayList term52237 = new ArrayList();
        ((ArrayList) term52237).add("bKBSncrMEZ");
        ((ArrayList) term52237).add("yeSXGqQExb");
        ((ArrayList) term52237).add("uXYcXVYJZM");
        Integer term52277 = new Integer(-1565502840);
        term52190 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term52190, term52190.getClass(), "owner", term52191);
        setField(term52190, term52190.getClass(), "group", term52193);
        setField(term52190, term52190.getClass(), "perms", term52195);
        setField(term52190, term52190.getClass(), "cylsPri", term52197);
        setField(term52190, term52190.getClass(), "cylsSec", term52199);
        setField(term52190, term52190.getClass(), "storageClass", "WPxXsahPRq");
        setField(term52190, term52190.getClass(), "managementClass", "IENRuqmwUU");
        setField(term52190, term52190.getClass(), "dataClass", "GsWxOwXvSu");
        setField(term52190, term52190.getClass(), "volumes", term52237);
        setField(term52190, term52190.getClass(), "timeout", term52277);
        term52279 = new Integer(344323424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term52279;
        callMethod(klass, "group", argTypes, term52190, args);
    }

};


