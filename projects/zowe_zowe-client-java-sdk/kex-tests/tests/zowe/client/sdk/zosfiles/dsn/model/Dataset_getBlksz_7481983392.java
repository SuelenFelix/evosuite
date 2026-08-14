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

public class Dataset_getBlksz_7481983392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3160;

    public Dataset_getBlksz_7481983392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3160 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term3160, term3160.getClass(), "dsname", "wfaXBpWAUH");
        setField(term3160, term3160.getClass(), "blksz", "VMeAzAHwZj");
        setField(term3160, term3160.getClass(), "catnm", "PznxWXsZME");
        setField(term3160, term3160.getClass(), "cdate", "ZzIujlwVsw");
        setField(term3160, term3160.getClass(), "dev", "LWyEaeIyAo");
        setField(term3160, term3160.getClass(), "dsntp", "yVMkkQhvmN");
        setField(term3160, term3160.getClass(), "dsorg", "mvrkADEgpp");
        setField(term3160, term3160.getClass(), "edate", "pXOkjyeIRb");
        setField(term3160, term3160.getClass(), "extx", "GgZWSjxjyE");
        setField(term3160, term3160.getClass(), "lrectl", "EeBVbzjcCI");
        setField(term3160, term3160.getClass(), "migr", "UfQtPRyWRC");
        setField(term3160, term3160.getClass(), "mvol", "FPvxVzzSvD");
        setField(term3160, term3160.getClass(), "ovf", "WHcwFgsGFC");
        setField(term3160, term3160.getClass(), "rdate", "HzqpegHiRq");
        setField(term3160, term3160.getClass(), "recfm", "jwsfVjMoJT");
        setField(term3160, term3160.getClass(), "sizex", "ZfdXfCCFDf");
        setField(term3160, term3160.getClass(), "spacu", "MwwjNtdOFT");
        setField(term3160, term3160.getClass(), "used", "VYkqXKVlAJ");
        setField(term3160, term3160.getClass(), "vol", "XkIoWJRNwN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlksz", argTypes, term3160, args);
    }

};


