package zowe.client.sdk.zosfiles.uss.model;

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
import static zowe.client.sdk.zosfiles.uss.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UnixFile_getMtime_158767539719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4543;

    public UnixFile_getMtime_158767539719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4543 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term4543, term4543.getClass(), "name", null);
        setField(term4543, term4543.getClass(), "mode", null);
        setField(term4543, term4543.getClass(), "size", null);
        setField(term4543, term4543.getClass(), "uid", null);
        setField(term4543, term4543.getClass(), "user", null);
        setField(term4543, term4543.getClass(), "gid", null);
        setField(term4543, term4543.getClass(), "group", null);
        setField(term4543, term4543.getClass(), "mtime", null);
        setField(term4543, term4543.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMtime", argTypes, term4543, args);
    }

};


