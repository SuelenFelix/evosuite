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

public class UssListInputData_isSymlinks_18504952226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62205;

    public UssListInputData_isSymlinks_18504952226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62205 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term62205, term62205.getClass(), "path", null);
        setField(term62205, term62205.getClass(), "maxLength", null);
        setField(term62205, term62205.getClass(), "group", null);
        setField(term62205, term62205.getClass(), "user", null);
        setField(term62205, term62205.getClass(), "mtime", null);
        setField(term62205, term62205.getClass(), "size", null);
        setField(term62205, term62205.getClass(), "name", null);
        setField(term62205, term62205.getClass(), "perm", null);
        setField(term62205, term62205.getClass(), "type", null);
        setField(term62205, term62205.getClass(), "depth", null);
        setBooleanField(term62205, term62205.getClass(), "filesys", false);
        setBooleanField(term62205, term62205.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSymlinks", argTypes, term62205, args);
    }

};


