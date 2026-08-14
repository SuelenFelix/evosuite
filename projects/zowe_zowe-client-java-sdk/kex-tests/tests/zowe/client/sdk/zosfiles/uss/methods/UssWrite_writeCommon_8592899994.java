package zowe.client.sdk.zosfiles.uss.methods;

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
import static zowe.client.sdk.zosfiles.uss.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UssWrite_writeCommon_8592899994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2631;
     Object term2644;

    public UssWrite_writeCommon_8592899994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2631 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssWrite"));
        setField(term2631, term2631.getClass(), "connection", null);
        setField(term2631, term2631.getClass(), "request", null);
        term2644 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData"));
        byte[] term2657 = (byte[]) newByteArray(3);
        setField(term2644, term2644.getClass(), "textContent", "OWDIEULEFu");
        setByteElement(term2657, 0, (byte) 18);
        setByteElement(term2657, 1, (byte) -58);
        setByteElement(term2657, 2, (byte) -29);
        setField(term2644, term2644.getClass(), "binaryContent", term2657);
        setField(term2644, term2644.getClass(), "fileEncoding", "dWRymuLBtr");
        setBooleanField(term2644, term2644.getClass(), "crlf", false);
        setBooleanField(term2644, term2644.getClass(), "binary", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssWrite");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData");
        Object[] args = new Object[2];
        args[0] = "TEParAifyi";
        args[1] = term2644;
        callMethod(klass, "writeCommon", argTypes, term2631, args);
    }

};


