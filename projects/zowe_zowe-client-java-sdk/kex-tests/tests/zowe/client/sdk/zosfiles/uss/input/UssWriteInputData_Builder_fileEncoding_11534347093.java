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

public class UssWriteInputData_Builder_fileEncoding_11534347093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9006;

    public UssWriteInputData_Builder_fileEncoding_11534347093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9006 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder"));
        byte[] term9019 = (byte[]) newByteArray(4);
        setField(term9006, term9006.getClass(), "textContent", "UlajhuVLaP");
        setByteElement(term9019, 0, (byte) 83);
        setByteElement(term9019, 1, (byte) 74);
        setByteElement(term9019, 2, (byte) -71);
        setByteElement(term9019, 3, (byte) 49);
        setField(term9006, term9006.getClass(), "binaryContent", term9019);
        setField(term9006, term9006.getClass(), "fileEncoding", "gGSMzuGICf");
        setBooleanField(term9006, term9006.getClass(), "crlf", false);
        setBooleanField(term9006, term9006.getClass(), "binary", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxCBltsObl";
        callMethod(klass, "fileEncoding", argTypes, term9006, args);
    }

};


