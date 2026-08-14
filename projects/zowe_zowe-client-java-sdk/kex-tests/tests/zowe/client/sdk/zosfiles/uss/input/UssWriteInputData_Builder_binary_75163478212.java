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
import java.lang.Boolean;

public class UssWriteInputData_Builder_binary_75163478212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9264;
     Object term9267;

    public UssWriteInputData_Builder_binary_75163478212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9264 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder"));
        setField(term9264, term9264.getClass(), "textContent", null);
        setField(term9264, term9264.getClass(), "binaryContent", null);
        setField(term9264, term9264.getClass(), "fileEncoding", null);
        setBooleanField(term9264, term9264.getClass(), "crlf", false);
        setBooleanField(term9264, term9264.getClass(), "binary", false);
        term9267 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9267;
        callMethod(klass, "binary", argTypes, term9264, args);
    }

};


