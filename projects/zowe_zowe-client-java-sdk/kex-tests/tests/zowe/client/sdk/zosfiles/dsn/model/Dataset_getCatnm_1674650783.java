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

public class Dataset_getCatnm_1674650783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3579;

    public Dataset_getCatnm_1674650783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3579 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term3579, term3579.getClass(), "dsname", "aNWLJdrZMq");
        setField(term3579, term3579.getClass(), "blksz", "HHmNoYxIGj");
        setField(term3579, term3579.getClass(), "catnm", "PtirvZmsGt");
        setField(term3579, term3579.getClass(), "cdate", "HWkpTmtlrc");
        setField(term3579, term3579.getClass(), "dev", "hMmaoREuCK");
        setField(term3579, term3579.getClass(), "dsntp", "VeDtgDzGAN");
        setField(term3579, term3579.getClass(), "dsorg", "aWYOWZFyaX");
        setField(term3579, term3579.getClass(), "edate", "BRIVNtfUWU");
        setField(term3579, term3579.getClass(), "extx", "DbiCVtPPCT");
        setField(term3579, term3579.getClass(), "lrectl", "WzFopsaDuG");
        setField(term3579, term3579.getClass(), "migr", "PapWxkhEWe");
        setField(term3579, term3579.getClass(), "mvol", "smnHEqRFRx");
        setField(term3579, term3579.getClass(), "ovf", "XYtryyobou");
        setField(term3579, term3579.getClass(), "rdate", "OYbzXylRWW");
        setField(term3579, term3579.getClass(), "recfm", "DSNsTGYXDF");
        setField(term3579, term3579.getClass(), "sizex", "sQvGcVjdEx");
        setField(term3579, term3579.getClass(), "spacu", "rLHAoqXgPh");
        setField(term3579, term3579.getClass(), "used", "zUlRdimJtU");
        setField(term3579, term3579.getClass(), "vol", "vwbEQQNQrx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCatnm", argTypes, term3579, args);
    }

};


