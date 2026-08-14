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

public class Dataset_getDsorg_123085911428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11127;

    public Dataset_getDsorg_123085911428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11127 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term11127, term11127.getClass(), "dsname", null);
        setField(term11127, term11127.getClass(), "blksz", null);
        setField(term11127, term11127.getClass(), "catnm", null);
        setField(term11127, term11127.getClass(), "cdate", null);
        setField(term11127, term11127.getClass(), "dev", null);
        setField(term11127, term11127.getClass(), "dsntp", null);
        setField(term11127, term11127.getClass(), "dsorg", null);
        setField(term11127, term11127.getClass(), "edate", null);
        setField(term11127, term11127.getClass(), "extx", null);
        setField(term11127, term11127.getClass(), "lrectl", null);
        setField(term11127, term11127.getClass(), "migr", null);
        setField(term11127, term11127.getClass(), "mvol", null);
        setField(term11127, term11127.getClass(), "ovf", null);
        setField(term11127, term11127.getClass(), "rdate", null);
        setField(term11127, term11127.getClass(), "recfm", null);
        setField(term11127, term11127.getClass(), "sizex", null);
        setField(term11127, term11127.getClass(), "spacu", null);
        setField(term11127, term11127.getClass(), "used", null);
        setField(term11127, term11127.getClass(), "vol", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDsorg", argTypes, term11127, args);
    }

};


