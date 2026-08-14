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

public class UnixZfs_getFstname_11945181822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2976;

    public UnixZfs_getFstname_11945181822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2976 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term2976, term2976.getClass(), "name", null);
        setField(term2976, term2976.getClass(), "mountpoint", null);
        setField(term2976, term2976.getClass(), "fstname", null);
        setField(term2976, term2976.getClass(), "status", null);
        setField(term2976, term2976.getClass(), "mode", null);
        setField(term2976, term2976.getClass(), "dev", null);
        setField(term2976, term2976.getClass(), "fstype", null);
        setField(term2976, term2976.getClass(), "bsize", null);
        setField(term2976, term2976.getClass(), "bavail", null);
        setField(term2976, term2976.getClass(), "blocks", null);
        setField(term2976, term2976.getClass(), "sysname", null);
        setField(term2976, term2976.getClass(), "readibc", null);
        setField(term2976, term2976.getClass(), "writeibc", null);
        setField(term2976, term2976.getClass(), "diribc", null);
        setField(term2976, term2976.getClass(), "returnedRows", null);
        setField(term2976, term2976.getClass(), "totalRows", null);
        setBooleanField(term2976, term2976.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFstname", argTypes, term2976, args);
    }

};


