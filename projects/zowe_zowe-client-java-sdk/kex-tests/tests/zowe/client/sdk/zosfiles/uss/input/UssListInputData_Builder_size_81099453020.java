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

public class UssListInputData_Builder_size_81099453020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46286;
     Object term46289;

    public UssListInputData_Builder_size_81099453020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46286 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term46286, term46286.getClass(), "path", null);
        setField(term46286, term46286.getClass(), "maxLength", null);
        setField(term46286, term46286.getClass(), "group", null);
        setField(term46286, term46286.getClass(), "user", null);
        setField(term46286, term46286.getClass(), "mtime", null);
        setField(term46286, term46286.getClass(), "size", null);
        setField(term46286, term46286.getClass(), "name", null);
        setField(term46286, term46286.getClass(), "perm", null);
        setField(term46286, term46286.getClass(), "type", null);
        setField(term46286, term46286.getClass(), "depth", null);
        setBooleanField(term46286, term46286.getClass(), "filesys", false);
        setBooleanField(term46286, term46286.getClass(), "symlinks", false);
        term46289 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term46289;
        callMethod(klass, "size", argTypes, term46286, args);
    }

};


