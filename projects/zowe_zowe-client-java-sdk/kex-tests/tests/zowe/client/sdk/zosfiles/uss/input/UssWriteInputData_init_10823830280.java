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

public class UssWriteInputData_init_10823830280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29702;

    public UssWriteInputData_init_10823830280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29702 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder"));
        byte[] term29715 = (byte[]) newByteArray(6);
        setField(term29702, term29702.getClass(), "textContent", "pXOkjyeIRb");
        setByteElement(term29715, 0, (byte) -111);
        setByteElement(term29715, 1, (byte) 23);
        setByteElement(term29715, 2, (byte) -15);
        setByteElement(term29715, 3, (byte) 36);
        setByteElement(term29715, 4, (byte) 118);
        setByteElement(term29715, 5, (byte) 106);
        setField(term29702, term29702.getClass(), "binaryContent", term29715);
        setField(term29702, term29702.getClass(), "fileEncoding", "GgZWSjxjyE");
        setBooleanField(term29702, term29702.getClass(), "crlf", false);
        setBooleanField(term29702, term29702.getClass(), "binary", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term29702;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


