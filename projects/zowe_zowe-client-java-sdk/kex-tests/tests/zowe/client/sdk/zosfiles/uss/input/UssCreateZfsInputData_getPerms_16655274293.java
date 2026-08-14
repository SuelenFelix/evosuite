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

public class UssCreateZfsInputData_getPerms_16655274293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48519;

    public UssCreateZfsInputData_getPerms_16655274293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48520 = new Integer(1551099402);
        Integer term48522 = new Integer(-2027534003);
        Integer term48524 = new Integer(1063420942);
        Integer term48526 = new Integer(1375330971);
        Integer term48528 = new Integer(-478195677);
        ArrayList term48566 = new ArrayList();
        ((ArrayList) term48566).add("RDnkgWkcbz");
        ((ArrayList) term48566).add("IBpaxltauX");
        Integer term48594 = new Integer(972867650);
        term48519 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term48519, term48519.getClass(), "owner", term48520);
        setField(term48519, term48519.getClass(), "group", term48522);
        setField(term48519, term48519.getClass(), "perms", term48524);
        setField(term48519, term48519.getClass(), "cylsPri", term48526);
        setField(term48519, term48519.getClass(), "cylsSec", term48528);
        setField(term48519, term48519.getClass(), "storageClass", "YAXkVjQZcV");
        setField(term48519, term48519.getClass(), "managementClass", "pumvwBWvpy");
        setField(term48519, term48519.getClass(), "dataClass", "HwLHeGLyhe");
        setField(term48519, term48519.getClass(), "volumes", term48566);
        setField(term48519, term48519.getClass(), "timeout", term48594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerms", argTypes, term48519, args);
    }

};


