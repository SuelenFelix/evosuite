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

public class UssWriteInputData_Builder_build_92852906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9198;

    public UssWriteInputData_Builder_build_92852906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9198 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder"));
        byte[] term9211 = (byte[]) newByteArray(2);
        setField(term9198, term9198.getClass(), "textContent", "xLbjWUgOIL");
        setByteElement(term9211, 0, (byte) -16);
        setByteElement(term9211, 1, (byte) -112);
        setField(term9198, term9198.getClass(), "binaryContent", term9211);
        setField(term9198, term9198.getClass(), "fileEncoding", "jDtqGUpnZN");
        setBooleanField(term9198, term9198.getClass(), "crlf", true);
        setBooleanField(term9198, term9198.getClass(), "binary", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term9198, args);
    }

};


