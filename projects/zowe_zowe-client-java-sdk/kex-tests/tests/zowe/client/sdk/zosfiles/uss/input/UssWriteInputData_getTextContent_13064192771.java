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

public class UssWriteInputData_getTextContent_13064192771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29762;

    public UssWriteInputData_getTextContent_13064192771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29762 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData"));
        byte[] term29775 = (byte[]) newByteArray(7);
        setField(term29762, term29762.getClass(), "textContent", "EeBVbzjcCI");
        setByteElement(term29775, 0, (byte) 98);
        setByteElement(term29775, 1, (byte) 67);
        setByteElement(term29775, 2, (byte) 66);
        setByteElement(term29775, 3, (byte) -121);
        setByteElement(term29775, 4, (byte) -119);
        setByteElement(term29775, 5, (byte) 71);
        setByteElement(term29775, 6, (byte) 80);
        setField(term29762, term29762.getClass(), "binaryContent", term29775);
        setField(term29762, term29762.getClass(), "fileEncoding", "UfQtPRyWRC");
        setBooleanField(term29762, term29762.getClass(), "crlf", false);
        setBooleanField(term29762, term29762.getClass(), "binary", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTextContent", argTypes, term29762, args);
    }

};


