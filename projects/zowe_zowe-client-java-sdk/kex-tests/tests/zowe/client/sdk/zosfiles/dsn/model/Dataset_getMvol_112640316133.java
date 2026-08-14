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

public class Dataset_getMvol_112640316133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11132;

    public Dataset_getMvol_112640316133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11132 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term11132, term11132.getClass(), "dsname", null);
        setField(term11132, term11132.getClass(), "blksz", null);
        setField(term11132, term11132.getClass(), "catnm", null);
        setField(term11132, term11132.getClass(), "cdate", null);
        setField(term11132, term11132.getClass(), "dev", null);
        setField(term11132, term11132.getClass(), "dsntp", null);
        setField(term11132, term11132.getClass(), "dsorg", null);
        setField(term11132, term11132.getClass(), "edate", null);
        setField(term11132, term11132.getClass(), "extx", null);
        setField(term11132, term11132.getClass(), "lrectl", null);
        setField(term11132, term11132.getClass(), "migr", null);
        setField(term11132, term11132.getClass(), "mvol", null);
        setField(term11132, term11132.getClass(), "ovf", null);
        setField(term11132, term11132.getClass(), "rdate", null);
        setField(term11132, term11132.getClass(), "recfm", null);
        setField(term11132, term11132.getClass(), "sizex", null);
        setField(term11132, term11132.getClass(), "spacu", null);
        setField(term11132, term11132.getClass(), "used", null);
        setField(term11132, term11132.getClass(), "vol", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMvol", argTypes, term11132, args);
    }

};


