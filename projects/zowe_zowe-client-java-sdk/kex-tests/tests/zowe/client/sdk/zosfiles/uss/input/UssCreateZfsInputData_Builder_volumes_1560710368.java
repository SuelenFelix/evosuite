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
import java.util.LinkedList;

public class UssCreateZfsInputData_Builder_volumes_1560710368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53332;
     Object term53445;

    public UssCreateZfsInputData_Builder_volumes_1560710368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term53333 = new Integer(-2066804303);
        Integer term53335 = new Integer(-1731761810);
        Integer term53337 = new Integer(197109649);
        Integer term53339 = new Integer(-1239406390);
        Integer term53341 = new Integer(1557431527);
        ArrayList term53379 = new ArrayList();
        ((ArrayList) term53379).add("UDlkdccCRn");
        ((ArrayList) term53379).add("McpzErOcYb");
        ((ArrayList) term53379).add("jqrVEUvYEz");
        ((ArrayList) term53379).add("QITgiBrmfj");
        ((ArrayList) term53379).add("pXxkiXgQnq");
        Integer term53443 = new Integer(-1504890659);
        term53332 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term53332, term53332.getClass(), "owner", term53333);
        setField(term53332, term53332.getClass(), "group", term53335);
        setField(term53332, term53332.getClass(), "perms", term53337);
        setField(term53332, term53332.getClass(), "cylsPri", term53339);
        setField(term53332, term53332.getClass(), "cylsSec", term53341);
        setField(term53332, term53332.getClass(), "storageClass", "gPzGDOEPPw");
        setField(term53332, term53332.getClass(), "managementClass", "rwKoAngzCu");
        setField(term53332, term53332.getClass(), "dataClass", "VUkRVwROTl");
        setField(term53332, term53332.getClass(), "volumes", term53379);
        setField(term53332, term53332.getClass(), "timeout", term53443);
        term53445 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term53445;
        callMethod(klass, "volumes", argTypes, term53332, args);
    }

};


