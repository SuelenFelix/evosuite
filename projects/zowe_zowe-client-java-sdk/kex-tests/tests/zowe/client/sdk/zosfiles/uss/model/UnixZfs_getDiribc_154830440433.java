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

public class UnixZfs_getDiribc_154830440433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2998;

    public UnixZfs_getDiribc_154830440433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2998 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term2998, term2998.getClass(), "name", null);
        setField(term2998, term2998.getClass(), "mountpoint", null);
        setField(term2998, term2998.getClass(), "fstname", null);
        setField(term2998, term2998.getClass(), "status", null);
        setField(term2998, term2998.getClass(), "mode", null);
        setField(term2998, term2998.getClass(), "dev", null);
        setField(term2998, term2998.getClass(), "fstype", null);
        setField(term2998, term2998.getClass(), "bsize", null);
        setField(term2998, term2998.getClass(), "bavail", null);
        setField(term2998, term2998.getClass(), "blocks", null);
        setField(term2998, term2998.getClass(), "sysname", null);
        setField(term2998, term2998.getClass(), "readibc", null);
        setField(term2998, term2998.getClass(), "writeibc", null);
        setField(term2998, term2998.getClass(), "diribc", null);
        setField(term2998, term2998.getClass(), "returnedRows", null);
        setField(term2998, term2998.getClass(), "totalRows", null);
        setBooleanField(term2998, term2998.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiribc", argTypes, term2998, args);
    }

};


