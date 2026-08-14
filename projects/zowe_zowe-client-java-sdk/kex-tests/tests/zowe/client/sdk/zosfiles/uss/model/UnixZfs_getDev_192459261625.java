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

public class UnixZfs_getDev_192459261625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2982;

    public UnixZfs_getDev_192459261625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2982 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term2982, term2982.getClass(), "name", null);
        setField(term2982, term2982.getClass(), "mountpoint", null);
        setField(term2982, term2982.getClass(), "fstname", null);
        setField(term2982, term2982.getClass(), "status", null);
        setField(term2982, term2982.getClass(), "mode", null);
        setField(term2982, term2982.getClass(), "dev", null);
        setField(term2982, term2982.getClass(), "fstype", null);
        setField(term2982, term2982.getClass(), "bsize", null);
        setField(term2982, term2982.getClass(), "bavail", null);
        setField(term2982, term2982.getClass(), "blocks", null);
        setField(term2982, term2982.getClass(), "sysname", null);
        setField(term2982, term2982.getClass(), "readibc", null);
        setField(term2982, term2982.getClass(), "writeibc", null);
        setField(term2982, term2982.getClass(), "diribc", null);
        setField(term2982, term2982.getClass(), "returnedRows", null);
        setField(term2982, term2982.getClass(), "totalRows", null);
        setBooleanField(term2982, term2982.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDev", argTypes, term2982, args);
    }

};


