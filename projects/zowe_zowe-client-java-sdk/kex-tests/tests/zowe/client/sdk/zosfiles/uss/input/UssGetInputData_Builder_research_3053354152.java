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

public class UssGetInputData_Builder_research_3053354152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53888;

    public UssGetInputData_Builder_research_3053354152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term53914 = new Integer(389427431);
        term53888 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder"));
        setField(term53888, term53888.getClass(), "search", "nHpMKOmlpQ");
        setField(term53888, term53888.getClass(), "research", "fKhrQsJToZ");
        setBooleanField(term53888, term53888.getClass(), "insensitive", true);
        setField(term53888, term53888.getClass(), "maxreturnsize", term53914);
        setIntField(term53888, term53888.getClass(), "queryCount", 1585847225);
        setBooleanField(term53888, term53888.getClass(), "binary", false);
        setField(term53888, term53888.getClass(), "recordsRange", "wsysQLGFnl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ckQLZGFjMX";
        callMethod(klass, "research", argTypes, term53888, args);
    }

};


