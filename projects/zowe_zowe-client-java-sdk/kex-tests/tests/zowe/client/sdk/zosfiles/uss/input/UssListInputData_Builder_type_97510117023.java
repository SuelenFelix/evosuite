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

public class UssListInputData_Builder_type_97510117023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46297;

    public UssListInputData_Builder_type_97510117023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46297 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term46297, term46297.getClass(), "path", null);
        setField(term46297, term46297.getClass(), "maxLength", null);
        setField(term46297, term46297.getClass(), "group", null);
        setField(term46297, term46297.getClass(), "user", null);
        setField(term46297, term46297.getClass(), "mtime", null);
        setField(term46297, term46297.getClass(), "size", null);
        setField(term46297, term46297.getClass(), "name", null);
        setField(term46297, term46297.getClass(), "perm", null);
        setField(term46297, term46297.getClass(), "type", null);
        setField(term46297, term46297.getClass(), "depth", null);
        setBooleanField(term46297, term46297.getClass(), "filesys", false);
        setBooleanField(term46297, term46297.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "type", argTypes, term46297, args);
    }

};


