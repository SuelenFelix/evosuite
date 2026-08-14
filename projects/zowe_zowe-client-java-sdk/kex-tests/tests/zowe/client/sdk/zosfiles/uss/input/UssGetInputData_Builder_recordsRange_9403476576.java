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

public class UssGetInputData_Builder_recordsRange_9403476576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54204;

    public UssGetInputData_Builder_recordsRange_9403476576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term54230 = new Integer(-1214628358);
        term54204 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder"));
        setField(term54204, term54204.getClass(), "search", "MRFLbEGYKG");
        setField(term54204, term54204.getClass(), "research", "BYrGukTyof");
        setBooleanField(term54204, term54204.getClass(), "insensitive", true);
        setField(term54204, term54204.getClass(), "maxreturnsize", term54230);
        setIntField(term54204, term54204.getClass(), "queryCount", 1048535127);
        setBooleanField(term54204, term54204.getClass(), "binary", true);
        setField(term54204, term54204.getClass(), "recordsRange", "jiCGTTzKGB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MqICFYzDJj";
        callMethod(klass, "recordsRange", argTypes, term54204, args);
    }

};


