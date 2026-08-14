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
import java.lang.Integer;

public class UssListInputData_Builder_maxLength_138663693916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46272;
     Object term46275;

    public UssListInputData_Builder_maxLength_138663693916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46272 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term46272, term46272.getClass(), "path", null);
        setField(term46272, term46272.getClass(), "maxLength", null);
        setField(term46272, term46272.getClass(), "group", null);
        setField(term46272, term46272.getClass(), "user", null);
        setField(term46272, term46272.getClass(), "mtime", null);
        setField(term46272, term46272.getClass(), "size", null);
        setField(term46272, term46272.getClass(), "name", null);
        setField(term46272, term46272.getClass(), "perm", null);
        setField(term46272, term46272.getClass(), "type", null);
        setField(term46272, term46272.getClass(), "depth", null);
        setBooleanField(term46272, term46272.getClass(), "filesys", false);
        setBooleanField(term46272, term46272.getClass(), "symlinks", false);
        term46275 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term46275;
        callMethod(klass, "maxLength", argTypes, term46272, args);
    }

};


