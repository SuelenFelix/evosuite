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

public class UnixFile_getMtime_15876753978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4119;

    public UnixFile_getMtime_15876753978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4144 = new Long(2191130532479601175L);
        Long term4146 = new Long(860079646007397083L);
        Long term4160 = new Long(3230472384687362867L);
        term4119 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term4119, term4119.getClass(), "name", "smnHEqRFRx");
        setField(term4119, term4119.getClass(), "mode", "XYtryyobou");
        setField(term4119, term4119.getClass(), "size", term4144);
        setField(term4119, term4119.getClass(), "uid", term4146);
        setField(term4119, term4119.getClass(), "user", "OYbzXylRWW");
        setField(term4119, term4119.getClass(), "gid", term4160);
        setField(term4119, term4119.getClass(), "group", "DSNsTGYXDF");
        setField(term4119, term4119.getClass(), "mtime", "sQvGcVjdEx");
        setField(term4119, term4119.getClass(), "target", "rLHAoqXgPh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMtime", argTypes, term4119, args);
    }

};


