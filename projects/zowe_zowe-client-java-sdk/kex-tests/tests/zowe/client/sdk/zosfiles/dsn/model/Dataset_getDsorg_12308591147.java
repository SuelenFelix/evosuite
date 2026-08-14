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

public class Dataset_getDsorg_12308591147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5255;

    public Dataset_getDsorg_12308591147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5255 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term5255, term5255.getClass(), "dsname", "xvkbvaEGYd");
        setField(term5255, term5255.getClass(), "blksz", "HBGNxdNURv");
        setField(term5255, term5255.getClass(), "catnm", "mfCpTPPQQm");
        setField(term5255, term5255.getClass(), "cdate", "OcJCIDNIXA");
        setField(term5255, term5255.getClass(), "dev", "XfRABIFVEp");
        setField(term5255, term5255.getClass(), "dsntp", "MHGKyEnwKc");
        setField(term5255, term5255.getClass(), "dsorg", "ShIELyuULw");
        setField(term5255, term5255.getClass(), "edate", "IpQuOGMgmj");
        setField(term5255, term5255.getClass(), "extx", "pJbnHTYrxn");
        setField(term5255, term5255.getClass(), "lrectl", "iIRsCSYqXH");
        setField(term5255, term5255.getClass(), "migr", "nghfqDXyCG");
        setField(term5255, term5255.getClass(), "mvol", "WBAOTqErtm");
        setField(term5255, term5255.getClass(), "ovf", "PqtVXXZMqK");
        setField(term5255, term5255.getClass(), "rdate", "rYbtIDVdnd");
        setField(term5255, term5255.getClass(), "recfm", "UKAReurpHG");
        setField(term5255, term5255.getClass(), "sizex", "WVRMUmrljA");
        setField(term5255, term5255.getClass(), "spacu", "NTlKJDDWlk");
        setField(term5255, term5255.getClass(), "used", "vOuMEpOQAg");
        setField(term5255, term5255.getClass(), "vol", "SIODFGaQhr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDsorg", argTypes, term5255, args);
    }

};


