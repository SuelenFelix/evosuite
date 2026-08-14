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

public class UnixZfs_toString_9231386237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3006;

    public UnixZfs_toString_9231386237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3006 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term3006, term3006.getClass(), "name", null);
        setField(term3006, term3006.getClass(), "mountpoint", null);
        setField(term3006, term3006.getClass(), "fstname", null);
        setField(term3006, term3006.getClass(), "status", null);
        setField(term3006, term3006.getClass(), "mode", null);
        setField(term3006, term3006.getClass(), "dev", null);
        setField(term3006, term3006.getClass(), "fstype", null);
        setField(term3006, term3006.getClass(), "bsize", null);
        setField(term3006, term3006.getClass(), "bavail", null);
        setField(term3006, term3006.getClass(), "blocks", null);
        setField(term3006, term3006.getClass(), "sysname", null);
        setField(term3006, term3006.getClass(), "readibc", null);
        setField(term3006, term3006.getClass(), "writeibc", null);
        setField(term3006, term3006.getClass(), "diribc", null);
        setField(term3006, term3006.getClass(), "returnedRows", null);
        setField(term3006, term3006.getClass(), "totalRows", null);
        setBooleanField(term3006, term3006.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3006, args);
    }

};


