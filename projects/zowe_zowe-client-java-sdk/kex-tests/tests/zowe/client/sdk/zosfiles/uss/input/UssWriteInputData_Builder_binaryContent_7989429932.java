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

public class UssWriteInputData_Builder_binaryContent_7989429932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8943;
     Object term8975;

    public UssWriteInputData_Builder_binaryContent_7989429932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8943 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder"));
        byte[] term8956 = (byte[]) newByteArray(4);
        setField(term8943, term8943.getClass(), "textContent", "aKnKipADSo");
        setByteElement(term8956, 0, (byte) -58);
        setByteElement(term8956, 1, (byte) -29);
        setByteElement(term8956, 2, (byte) -54);
        setByteElement(term8956, 3, (byte) -10);
        setField(term8943, term8943.getClass(), "binaryContent", term8956);
        setField(term8943, term8943.getClass(), "fileEncoding", "wSQxaModmm");
        setBooleanField(term8943, term8943.getClass(), "crlf", false);
        setBooleanField(term8943, term8943.getClass(), "binary", true);
        term8975 = (byte[]) newByteArray(3);
        setByteElement(term8975, 0, (byte) 79);
        setByteElement(term8975, 1, (byte) -119);
        setByteElement(term8975, 2, (byte) -66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8975;
        callMethod(klass, "binaryContent", argTypes, term8943, args);
    }

};


