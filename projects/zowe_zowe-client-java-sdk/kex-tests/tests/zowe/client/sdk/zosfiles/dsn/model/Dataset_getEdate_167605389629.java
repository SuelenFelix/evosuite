package zowe.client.sdk.zosfiles.dsn.model;

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
import static zowe.client.sdk.zosfiles.dsn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Dataset_getEdate_167605389629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11128;

    public Dataset_getEdate_167605389629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11128 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term11128, term11128.getClass(), "dsname", null);
        setField(term11128, term11128.getClass(), "blksz", null);
        setField(term11128, term11128.getClass(), "catnm", null);
        setField(term11128, term11128.getClass(), "cdate", null);
        setField(term11128, term11128.getClass(), "dev", null);
        setField(term11128, term11128.getClass(), "dsntp", null);
        setField(term11128, term11128.getClass(), "dsorg", null);
        setField(term11128, term11128.getClass(), "edate", null);
        setField(term11128, term11128.getClass(), "extx", null);
        setField(term11128, term11128.getClass(), "lrectl", null);
        setField(term11128, term11128.getClass(), "migr", null);
        setField(term11128, term11128.getClass(), "mvol", null);
        setField(term11128, term11128.getClass(), "ovf", null);
        setField(term11128, term11128.getClass(), "rdate", null);
        setField(term11128, term11128.getClass(), "recfm", null);
        setField(term11128, term11128.getClass(), "sizex", null);
        setField(term11128, term11128.getClass(), "spacu", null);
        setField(term11128, term11128.getClass(), "used", null);
        setField(term11128, term11128.getClass(), "vol", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdate", argTypes, term11128, args);
    }

};


