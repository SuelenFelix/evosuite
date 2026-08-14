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

public class Dataset_getVol_20779706440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11139;

    public Dataset_getVol_20779706440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11139 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term11139, term11139.getClass(), "dsname", null);
        setField(term11139, term11139.getClass(), "blksz", null);
        setField(term11139, term11139.getClass(), "catnm", null);
        setField(term11139, term11139.getClass(), "cdate", null);
        setField(term11139, term11139.getClass(), "dev", null);
        setField(term11139, term11139.getClass(), "dsntp", null);
        setField(term11139, term11139.getClass(), "dsorg", null);
        setField(term11139, term11139.getClass(), "edate", null);
        setField(term11139, term11139.getClass(), "extx", null);
        setField(term11139, term11139.getClass(), "lrectl", null);
        setField(term11139, term11139.getClass(), "migr", null);
        setField(term11139, term11139.getClass(), "mvol", null);
        setField(term11139, term11139.getClass(), "ovf", null);
        setField(term11139, term11139.getClass(), "rdate", null);
        setField(term11139, term11139.getClass(), "recfm", null);
        setField(term11139, term11139.getClass(), "sizex", null);
        setField(term11139, term11139.getClass(), "spacu", null);
        setField(term11139, term11139.getClass(), "used", null);
        setField(term11139, term11139.getClass(), "vol", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVol", argTypes, term11139, args);
    }

};


