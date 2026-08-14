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

public class UssCreateZfsInputData_Builder_timeout_4138370489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53528;
     Object term53605;

    public UssCreateZfsInputData_Builder_timeout_4138370489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term53529 = new Integer(1358829571);
        Integer term53531 = new Integer(991356662);
        Integer term53533 = new Integer(-506958186);
        Integer term53535 = new Integer(-507387516);
        Integer term53537 = new Integer(-1970452551);
        ArrayList term53575 = new ArrayList();
        ((ArrayList) term53575).add("vBnWPlsZMk");
        ((ArrayList) term53575).add("fIZsWucfXz");
        Integer term53603 = new Integer(-1896376975);
        term53528 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term53528, term53528.getClass(), "owner", term53529);
        setField(term53528, term53528.getClass(), "group", term53531);
        setField(term53528, term53528.getClass(), "perms", term53533);
        setField(term53528, term53528.getClass(), "cylsPri", term53535);
        setField(term53528, term53528.getClass(), "cylsSec", term53537);
        setField(term53528, term53528.getClass(), "storageClass", "tKmrUDURku");
        setField(term53528, term53528.getClass(), "managementClass", "JeZbrwZmsP");
        setField(term53528, term53528.getClass(), "dataClass", "bxyfeicqrK");
        setField(term53528, term53528.getClass(), "volumes", term53575);
        setField(term53528, term53528.getClass(), "timeout", term53603);
        term53605 = new Integer(729658803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term53605;
        callMethod(klass, "timeout", argTypes, term53528, args);
    }

};


