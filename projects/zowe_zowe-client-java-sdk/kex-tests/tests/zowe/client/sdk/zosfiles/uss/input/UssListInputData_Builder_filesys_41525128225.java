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

public class UssListInputData_Builder_filesys_41525128225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46305;
     Object term46308;

    public UssListInputData_Builder_filesys_41525128225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46305 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term46305, term46305.getClass(), "path", null);
        setField(term46305, term46305.getClass(), "maxLength", null);
        setField(term46305, term46305.getClass(), "group", null);
        setField(term46305, term46305.getClass(), "user", null);
        setField(term46305, term46305.getClass(), "mtime", null);
        setField(term46305, term46305.getClass(), "size", null);
        setField(term46305, term46305.getClass(), "name", null);
        setField(term46305, term46305.getClass(), "perm", null);
        setField(term46305, term46305.getClass(), "type", null);
        setField(term46305, term46305.getClass(), "depth", null);
        setBooleanField(term46305, term46305.getClass(), "filesys", false);
        setBooleanField(term46305, term46305.getClass(), "symlinks", false);
        term46308 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term46308;
        callMethod(klass, "filesys", argTypes, term46305, args);
    }

};


