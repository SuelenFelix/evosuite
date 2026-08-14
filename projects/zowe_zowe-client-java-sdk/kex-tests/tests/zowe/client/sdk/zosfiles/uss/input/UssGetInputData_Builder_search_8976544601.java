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

public class UssGetInputData_Builder_search_8976544601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53794;

    public UssGetInputData_Builder_search_8976544601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term53820 = new Integer(-1410220680);
        term53794 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder"));
        setField(term53794, term53794.getClass(), "search", "RTTvrwwhou");
        setField(term53794, term53794.getClass(), "research", "lRORwXipuk");
        setBooleanField(term53794, term53794.getClass(), "insensitive", true);
        setField(term53794, term53794.getClass(), "maxreturnsize", term53820);
        setIntField(term53794, term53794.getClass(), "queryCount", -883034806);
        setBooleanField(term53794, term53794.getClass(), "binary", true);
        setField(term53794, term53794.getClass(), "recordsRange", "fVdTcjgHdw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wwAwLLcLPp";
        callMethod(klass, "search", argTypes, term53794, args);
    }

};


