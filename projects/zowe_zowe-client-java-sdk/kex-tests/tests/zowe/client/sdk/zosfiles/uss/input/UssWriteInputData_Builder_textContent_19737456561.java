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

public class UssWriteInputData_Builder_textContent_19737456561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8863;

    public UssWriteInputData_Builder_textContent_19737456561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8863 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder"));
        byte[] term8876 = (byte[]) newByteArray(5);
        setField(term8863, term8863.getClass(), "textContent", "xrwlQZdwCp");
        setByteElement(term8876, 0, (byte) 47);
        setByteElement(term8876, 1, (byte) 48);
        setByteElement(term8876, 2, (byte) 89);
        setByteElement(term8876, 3, (byte) 75);
        setByteElement(term8876, 4, (byte) 18);
        setField(term8863, term8863.getClass(), "binaryContent", term8876);
        setField(term8863, term8863.getClass(), "fileEncoding", "IDCWpPLRkE");
        setBooleanField(term8863, term8863.getClass(), "crlf", false);
        setBooleanField(term8863, term8863.getClass(), "binary", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssWriteInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nyiiPDVjAc";
        callMethod(klass, "textContent", argTypes, term8863, args);
    }

};


