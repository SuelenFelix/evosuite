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

public class UssCopyInputData_Builder_recursive_20361859653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9346;
     Object term9361;

    public UssCopyInputData_Builder_recursive_20361859653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9346 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCopyInputData$Builder"));
        setField(term9346, term9346.getClass(), "from", "JDswTTCZHV");
        setBooleanField(term9346, term9346.getClass(), "overwrite", true);
        setBooleanField(term9346, term9346.getClass(), "recursive", false);
        term9361 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCopyInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9361;
        callMethod(klass, "recursive", argTypes, term9346, args);
    }

};


