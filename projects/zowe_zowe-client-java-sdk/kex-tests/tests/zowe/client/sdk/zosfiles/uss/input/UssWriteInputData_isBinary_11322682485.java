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

public class UssWriteInputData_isBinary_11322682485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29992;

    public UssWriteInputData_isBinary_11322682485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29992 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData"));
        byte[] term30005 = (byte[]) newByteArray(5);
        setField(term29992, term29992.getClass(), "textContent", "VYkqXKVlAJ");
        setByteElement(term30005, 0, (byte) -23);
        setByteElement(term30005, 1, (byte) 100);
        setByteElement(term30005, 2, (byte) 106);
        setByteElement(term30005, 3, (byte) -57);
        setByteElement(term30005, 4, (byte) -103);
        setField(term29992, term29992.getClass(), "binaryContent", term30005);
        setField(term29992, term29992.getClass(), "fileEncoding", "XkIoWJRNwN");
        setBooleanField(term29992, term29992.getClass(), "crlf", true);
        setBooleanField(term29992, term29992.getClass(), "binary", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBinary", argTypes, term29992, args);
    }

};


