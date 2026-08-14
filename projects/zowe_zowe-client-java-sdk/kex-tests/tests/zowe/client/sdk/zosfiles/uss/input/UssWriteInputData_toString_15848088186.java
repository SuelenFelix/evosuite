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

public class UssWriteInputData_toString_15848088186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30050;

    public UssWriteInputData_toString_15848088186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30050 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData"));
        byte[] term30063 = (byte[]) newByteArray(2);
        setField(term30050, term30050.getClass(), "textContent", "aNWLJdrZMq");
        setByteElement(term30063, 0, (byte) 98);
        setByteElement(term30063, 1, (byte) 79);
        setField(term30050, term30050.getClass(), "binaryContent", term30063);
        setField(term30050, term30050.getClass(), "fileEncoding", "HHmNoYxIGj");
        setBooleanField(term30050, term30050.getClass(), "crlf", false);
        setBooleanField(term30050, term30050.getClass(), "binary", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30050, args);
    }

};


