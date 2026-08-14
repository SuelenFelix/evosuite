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

public class UssCreateZfsInputData_Builder_build_112447381410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53657;

    public UssCreateZfsInputData_Builder_build_112447381410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term53658 = new Integer(114754804);
        Integer term53660 = new Integer(1687361082);
        Integer term53662 = new Integer(584893196);
        Integer term53664 = new Integer(497269071);
        Integer term53666 = new Integer(-1899301124);
        ArrayList term53704 = new ArrayList();
        ((ArrayList) term53704).add("hIYsRyOZxk");
        ((ArrayList) term53704).add("RjNoEywJbC");
        Integer term53732 = new Integer(-1882480155);
        term53657 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term53657, term53657.getClass(), "owner", term53658);
        setField(term53657, term53657.getClass(), "group", term53660);
        setField(term53657, term53657.getClass(), "perms", term53662);
        setField(term53657, term53657.getClass(), "cylsPri", term53664);
        setField(term53657, term53657.getClass(), "cylsSec", term53666);
        setField(term53657, term53657.getClass(), "storageClass", "IApvtmfhnq");
        setField(term53657, term53657.getClass(), "managementClass", "VSaNnhMpRc");
        setField(term53657, term53657.getClass(), "dataClass", "QNjNTLlUaV");
        setField(term53657, term53657.getClass(), "volumes", term53704);
        setField(term53657, term53657.getClass(), "timeout", term53732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term53657, args);
    }

};


