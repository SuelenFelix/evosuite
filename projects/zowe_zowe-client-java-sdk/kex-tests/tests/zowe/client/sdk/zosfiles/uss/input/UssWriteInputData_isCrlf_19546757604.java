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

public class UssWriteInputData_isCrlf_19546757604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29934;

    public UssWriteInputData_isCrlf_19546757604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29934 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData"));
        byte[] term29947 = (byte[]) newByteArray(5);
        setField(term29934, term29934.getClass(), "textContent", "ZfdXfCCFDf");
        setByteElement(term29947, 0, (byte) -22);
        setByteElement(term29947, 1, (byte) 93);
        setByteElement(term29947, 2, (byte) 69);
        setByteElement(term29947, 3, (byte) -74);
        setByteElement(term29947, 4, (byte) -123);
        setField(term29934, term29934.getClass(), "binaryContent", term29947);
        setField(term29934, term29934.getClass(), "fileEncoding", "MwwjNtdOFT");
        setBooleanField(term29934, term29934.getClass(), "crlf", true);
        setBooleanField(term29934, term29934.getClass(), "binary", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCrlf", argTypes, term29934, args);
    }

};


