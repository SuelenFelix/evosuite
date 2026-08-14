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

public class UssWriteInputData_Builder_crlf_125362042611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9259;
     Object term9262;

    public UssWriteInputData_Builder_crlf_125362042611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9259 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder"));
        setField(term9259, term9259.getClass(), "textContent", null);
        setField(term9259, term9259.getClass(), "binaryContent", null);
        setField(term9259, term9259.getClass(), "fileEncoding", null);
        setBooleanField(term9259, term9259.getClass(), "crlf", false);
        setBooleanField(term9259, term9259.getClass(), "binary", false);
        term9262 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9262;
        callMethod(klass, "crlf", argTypes, term9259, args);
    }

};


