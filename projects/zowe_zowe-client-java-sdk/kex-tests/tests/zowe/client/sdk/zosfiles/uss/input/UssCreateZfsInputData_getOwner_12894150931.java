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

public class UssCreateZfsInputData_getOwner_12894150931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48331;

    public UssCreateZfsInputData_getOwner_12894150931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48332 = new Integer(-2095575670);
        Integer term48334 = new Integer(1225272962);
        Integer term48336 = new Integer(1324040357);
        Integer term48338 = new Integer(-1588772968);
        Integer term48340 = new Integer(-93135961);
        ArrayList term48378 = new ArrayList();
        ((ArrayList) term48378).add("UDaboHZHhz");
        Integer term48394 = new Integer(-112921587);
        term48331 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term48331, term48331.getClass(), "owner", term48332);
        setField(term48331, term48331.getClass(), "group", term48334);
        setField(term48331, term48331.getClass(), "perms", term48336);
        setField(term48331, term48331.getClass(), "cylsPri", term48338);
        setField(term48331, term48331.getClass(), "cylsSec", term48340);
        setField(term48331, term48331.getClass(), "storageClass", "HHQcYMSBVc");
        setField(term48331, term48331.getClass(), "managementClass", "wdoqITnaAP");
        setField(term48331, term48331.getClass(), "dataClass", "rIPMBcrNqB");
        setField(term48331, term48331.getClass(), "volumes", term48378);
        setField(term48331, term48331.getClass(), "timeout", term48394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term48331, args);
    }

};


