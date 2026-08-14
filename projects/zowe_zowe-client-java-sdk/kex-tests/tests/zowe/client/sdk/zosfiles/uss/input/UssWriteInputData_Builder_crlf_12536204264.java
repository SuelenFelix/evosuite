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

public class UssWriteInputData_Builder_crlf_12536204264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9084;
     Object term9113;

    public UssWriteInputData_Builder_crlf_12536204264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9084 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder"));
        byte[] term9097 = (byte[]) newByteArray(1);
        setField(term9084, term9084.getClass(), "textContent", "BndsHwAFMv");
        setByteElement(term9097, 0, (byte) -54);
        setField(term9084, term9084.getClass(), "binaryContent", term9097);
        setField(term9084, term9084.getClass(), "fileEncoding", "GzFkzHGYFt");
        setBooleanField(term9084, term9084.getClass(), "crlf", false);
        setBooleanField(term9084, term9084.getClass(), "binary", false);
        term9113 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9113;
        callMethod(klass, "crlf", argTypes, term9084, args);
    }

};


