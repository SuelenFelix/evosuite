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

public class Dataset_toString_1452347920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10702;

    public Dataset_toString_1452347920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10702 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term10702, term10702.getClass(), "dsname", "wsysQLGFnl");
        setField(term10702, term10702.getClass(), "blksz", "ckQLZGFjMX");
        setField(term10702, term10702.getClass(), "catnm", "qphdrqUtNx");
        setField(term10702, term10702.getClass(), "cdate", "bwlLFAfNWx");
        setField(term10702, term10702.getClass(), "dev", "JWodNQzjjV");
        setField(term10702, term10702.getClass(), "dsntp", "CAgxWjhxNf");
        setField(term10702, term10702.getClass(), "dsorg", "goAoCMhKBu");
        setField(term10702, term10702.getClass(), "edate", "BWxJSgKHRT");
        setField(term10702, term10702.getClass(), "extx", "AGXoIndFnm");
        setField(term10702, term10702.getClass(), "lrectl", "mwmFMNEzkK");
        setField(term10702, term10702.getClass(), "migr", "kVAmKknVln");
        setField(term10702, term10702.getClass(), "mvol", "MRFLbEGYKG");
        setField(term10702, term10702.getClass(), "ovf", "BYrGukTyof");
        setField(term10702, term10702.getClass(), "rdate", "jiCGTTzKGB");
        setField(term10702, term10702.getClass(), "recfm", "MqICFYzDJj");
        setField(term10702, term10702.getClass(), "sizex", "YgQvdcBQKw");
        setField(term10702, term10702.getClass(), "spacu", "FiYYLuailz");
        setField(term10702, term10702.getClass(), "used", "XebAeSnCKZ");
        setField(term10702, term10702.getClass(), "vol", "GeddnXjHGy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10702, args);
    }

};


