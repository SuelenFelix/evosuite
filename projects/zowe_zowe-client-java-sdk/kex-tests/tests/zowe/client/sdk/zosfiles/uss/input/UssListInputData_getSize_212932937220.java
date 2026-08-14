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

public class UssListInputData_getSize_212932937220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62187;

    public UssListInputData_getSize_212932937220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62187 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term62187, term62187.getClass(), "path", null);
        setField(term62187, term62187.getClass(), "maxLength", null);
        setField(term62187, term62187.getClass(), "group", null);
        setField(term62187, term62187.getClass(), "user", null);
        setField(term62187, term62187.getClass(), "mtime", null);
        setField(term62187, term62187.getClass(), "size", null);
        setField(term62187, term62187.getClass(), "name", null);
        setField(term62187, term62187.getClass(), "perm", null);
        setField(term62187, term62187.getClass(), "type", null);
        setField(term62187, term62187.getClass(), "depth", null);
        setBooleanField(term62187, term62187.getClass(), "filesys", false);
        setBooleanField(term62187, term62187.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term62187, args);
    }

};


