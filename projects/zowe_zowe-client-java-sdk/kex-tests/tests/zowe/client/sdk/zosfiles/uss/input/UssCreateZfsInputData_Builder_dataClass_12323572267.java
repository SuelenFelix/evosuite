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

public class UssCreateZfsInputData_Builder_dataClass_12323572267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53183;

    public UssCreateZfsInputData_Builder_dataClass_12323572267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term53184 = new Integer(628918458);
        Integer term53186 = new Integer(-1274456137);
        Integer term53188 = new Integer(1041916673);
        Integer term53190 = new Integer(-601863069);
        Integer term53192 = new Integer(663292551);
        ArrayList term53230 = new ArrayList();
        ((ArrayList) term53230).add("UuYWMTqWTV");
        ((ArrayList) term53230).add("DSFGlcaXUb");
        Integer term53258 = new Integer(-1885090354);
        term53183 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term53183, term53183.getClass(), "owner", term53184);
        setField(term53183, term53183.getClass(), "group", term53186);
        setField(term53183, term53183.getClass(), "perms", term53188);
        setField(term53183, term53183.getClass(), "cylsPri", term53190);
        setField(term53183, term53183.getClass(), "cylsSec", term53192);
        setField(term53183, term53183.getClass(), "storageClass", "mKaHyMybrK");
        setField(term53183, term53183.getClass(), "managementClass", "AyrEXuGrEj");
        setField(term53183, term53183.getClass(), "dataClass", "yevIIoVYHq");
        setField(term53183, term53183.getClass(), "volumes", term53230);
        setField(term53183, term53183.getClass(), "timeout", term53258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sHMXNUzNeM";
        callMethod(klass, "dataClass", argTypes, term53183, args);
    }

};


