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

public class UssWriteInputData_getFileEncoding_3396495383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29874;

    public UssWriteInputData_getFileEncoding_3396495383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29874 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData"));
        byte[] term29887 = (byte[]) newByteArray(6);
        setField(term29874, term29874.getClass(), "textContent", "HzqpegHiRq");
        setByteElement(term29887, 0, (byte) 72);
        setByteElement(term29887, 1, (byte) 111);
        setByteElement(term29887, 2, (byte) 99);
        setByteElement(term29887, 3, (byte) -12);
        setByteElement(term29887, 4, (byte) -61);
        setByteElement(term29887, 5, (byte) -85);
        setField(term29874, term29874.getClass(), "binaryContent", term29887);
        setField(term29874, term29874.getClass(), "fileEncoding", "jwsfVjMoJT");
        setBooleanField(term29874, term29874.getClass(), "crlf", true);
        setBooleanField(term29874, term29874.getClass(), "binary", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileEncoding", argTypes, term29874, args);
    }

};


