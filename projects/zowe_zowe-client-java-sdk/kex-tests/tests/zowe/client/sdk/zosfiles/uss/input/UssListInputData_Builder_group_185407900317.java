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

public class UssListInputData_Builder_group_185407900317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46277;

    public UssListInputData_Builder_group_185407900317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46277 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term46277, term46277.getClass(), "path", null);
        setField(term46277, term46277.getClass(), "maxLength", null);
        setField(term46277, term46277.getClass(), "group", null);
        setField(term46277, term46277.getClass(), "user", null);
        setField(term46277, term46277.getClass(), "mtime", null);
        setField(term46277, term46277.getClass(), "size", null);
        setField(term46277, term46277.getClass(), "name", null);
        setField(term46277, term46277.getClass(), "perm", null);
        setField(term46277, term46277.getClass(), "type", null);
        setField(term46277, term46277.getClass(), "depth", null);
        setBooleanField(term46277, term46277.getClass(), "filesys", false);
        setBooleanField(term46277, term46277.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "group", argTypes, term46277, args);
    }

};


