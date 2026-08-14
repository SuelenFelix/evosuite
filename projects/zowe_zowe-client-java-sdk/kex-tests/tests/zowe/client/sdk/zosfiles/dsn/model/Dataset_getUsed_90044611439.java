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

public class Dataset_getUsed_90044611439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11138;

    public Dataset_getUsed_90044611439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11138 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term11138, term11138.getClass(), "dsname", null);
        setField(term11138, term11138.getClass(), "blksz", null);
        setField(term11138, term11138.getClass(), "catnm", null);
        setField(term11138, term11138.getClass(), "cdate", null);
        setField(term11138, term11138.getClass(), "dev", null);
        setField(term11138, term11138.getClass(), "dsntp", null);
        setField(term11138, term11138.getClass(), "dsorg", null);
        setField(term11138, term11138.getClass(), "edate", null);
        setField(term11138, term11138.getClass(), "extx", null);
        setField(term11138, term11138.getClass(), "lrectl", null);
        setField(term11138, term11138.getClass(), "migr", null);
        setField(term11138, term11138.getClass(), "mvol", null);
        setField(term11138, term11138.getClass(), "ovf", null);
        setField(term11138, term11138.getClass(), "rdate", null);
        setField(term11138, term11138.getClass(), "recfm", null);
        setField(term11138, term11138.getClass(), "sizex", null);
        setField(term11138, term11138.getClass(), "spacu", null);
        setField(term11138, term11138.getClass(), "used", null);
        setField(term11138, term11138.getClass(), "vol", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsed", argTypes, term11138, args);
    }

};


