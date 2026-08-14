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

public class UssWriteInputData_getBinaryContent_19684630719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30105;

    public UssWriteInputData_getBinaryContent_19684630719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30105 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData"));
        setField(term30105, term30105.getClass(), "textContent", null);
        setField(term30105, term30105.getClass(), "binaryContent", null);
        setField(term30105, term30105.getClass(), "fileEncoding", null);
        setBooleanField(term30105, term30105.getClass(), "crlf", false);
        setBooleanField(term30105, term30105.getClass(), "binary", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBinaryContent", argTypes, term30105, args);
    }

};


