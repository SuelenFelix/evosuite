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

public class UssListInputData_toString_161857395927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62208;

    public UssListInputData_toString_161857395927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62208 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term62208, term62208.getClass(), "path", null);
        setField(term62208, term62208.getClass(), "maxLength", null);
        setField(term62208, term62208.getClass(), "group", null);
        setField(term62208, term62208.getClass(), "user", null);
        setField(term62208, term62208.getClass(), "mtime", null);
        setField(term62208, term62208.getClass(), "size", null);
        setField(term62208, term62208.getClass(), "name", null);
        setField(term62208, term62208.getClass(), "perm", null);
        setField(term62208, term62208.getClass(), "type", null);
        setField(term62208, term62208.getClass(), "depth", null);
        setBooleanField(term62208, term62208.getClass(), "filesys", false);
        setBooleanField(term62208, term62208.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term62208, args);
    }

};


