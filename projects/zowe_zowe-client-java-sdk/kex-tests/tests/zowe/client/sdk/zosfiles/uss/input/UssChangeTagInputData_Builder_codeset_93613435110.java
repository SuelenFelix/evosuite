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

public class UssChangeTagInputData_Builder_codeset_93613435110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19793;

    public UssChangeTagInputData_Builder_codeset_93613435110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19793 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder"));
        setField(term19793, term19793.getClass(), "action", null);
        setField(term19793, term19793.getClass(), "type", null);
        setField(term19793, term19793.getClass(), "codeset", null);
        setBooleanField(term19793, term19793.getClass(), "recursive", false);
        setField(term19793, term19793.getClass(), "links", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "codeset", argTypes, term19793, args);
    }

};


