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

public class UssCopy_copyCommon_10114775773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5452;
     Object term5465;

    public UssCopy_copyCommon_10114775773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5452 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssCopy"));
        setField(term5452, term5452.getClass(), "connection", null);
        setField(term5452, term5452.getClass(), "request", null);
        term5465 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCopyInputData"));
        setField(term5465, term5465.getClass(), "from", "KoyGrUJeJW");
        setBooleanField(term5465, term5465.getClass(), "overwrite", true);
        setBooleanField(term5465, term5465.getClass(), "recursive", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssCopy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCopyInputData");
        Object[] args = new Object[2];
        args[0] = "JUmudUmaaV";
        args[1] = term5465;
        callMethod(klass, "copyCommon", argTypes, term5452, args);
    }

};


