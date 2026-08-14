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

public class UssWriteInputData_getBinaryContent_19684630712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29824;

    public UssWriteInputData_getBinaryContent_19684630712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29824 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData"));
        byte[] term29837 = (byte[]) newByteArray(1);
        setField(term29824, term29824.getClass(), "textContent", "FPvxVzzSvD");
        setByteElement(term29837, 0, (byte) 42);
        setField(term29824, term29824.getClass(), "binaryContent", term29837);
        setField(term29824, term29824.getClass(), "fileEncoding", "WHcwFgsGFC");
        setBooleanField(term29824, term29824.getClass(), "crlf", false);
        setBooleanField(term29824, term29824.getClass(), "binary", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBinaryContent", argTypes, term29824, args);
    }

};


