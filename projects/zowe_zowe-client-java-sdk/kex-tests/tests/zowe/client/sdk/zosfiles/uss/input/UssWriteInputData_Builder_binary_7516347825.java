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
import java.lang.Boolean;

public class UssWriteInputData_Builder_binary_7516347825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9136;
     Object term9170;

    public UssWriteInputData_Builder_binary_7516347825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9136 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder"));
        byte[] term9149 = (byte[]) newByteArray(6);
        setField(term9136, term9136.getClass(), "textContent", "tShwQLRGNe");
        setByteElement(term9149, 0, (byte) 67);
        setByteElement(term9149, 1, (byte) 78);
        setByteElement(term9149, 2, (byte) 87);
        setByteElement(term9149, 3, (byte) 121);
        setByteElement(term9149, 4, (byte) -99);
        setByteElement(term9149, 5, (byte) -2);
        setField(term9136, term9136.getClass(), "binaryContent", term9149);
        setField(term9136, term9136.getClass(), "fileEncoding", "LvtrsXUliU");
        setBooleanField(term9136, term9136.getClass(), "crlf", true);
        setBooleanField(term9136, term9136.getClass(), "binary", false);
        term9170 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9170;
        callMethod(klass, "binary", argTypes, term9136, args);
    }

};


