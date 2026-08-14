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
import java.lang.Long;

public class UnixFile_getSize_9190566153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3424;

    public UnixFile_getSize_9190566153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3449 = new Long(8540994973773607992L);
        Long term3451 = new Long(-2338103433822116635L);
        Long term3465 = new Long(-1885698929232124806L);
        term3424 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term3424, term3424.getClass(), "name", "wfaXBpWAUH");
        setField(term3424, term3424.getClass(), "mode", "VMeAzAHwZj");
        setField(term3424, term3424.getClass(), "size", term3449);
        setField(term3424, term3424.getClass(), "uid", term3451);
        setField(term3424, term3424.getClass(), "user", "PznxWXsZME");
        setField(term3424, term3424.getClass(), "gid", term3465);
        setField(term3424, term3424.getClass(), "group", "ZzIujlwVsw");
        setField(term3424, term3424.getClass(), "mtime", "LWyEaeIyAo");
        setField(term3424, term3424.getClass(), "target", "yVMkkQhvmN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term3424, args);
    }

};


