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

public class Dataset_getMvol_112640316112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7350;

    public Dataset_getMvol_112640316112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7350 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term7350, term7350.getClass(), "dsname", "RDnkgWkcbz");
        setField(term7350, term7350.getClass(), "blksz", "IBpaxltauX");
        setField(term7350, term7350.getClass(), "catnm", "hePqROaplw");
        setField(term7350, term7350.getClass(), "cdate", "PJcSNDruWd");
        setField(term7350, term7350.getClass(), "dev", "VVNNlAePXF");
        setField(term7350, term7350.getClass(), "dsntp", "jnwVnmKAFv");
        setField(term7350, term7350.getClass(), "dsorg", "TXyHhqeCjR");
        setField(term7350, term7350.getClass(), "edate", "lZIgPZPgTu");
        setField(term7350, term7350.getClass(), "extx", "iuCxnHGMoW");
        setField(term7350, term7350.getClass(), "lrectl", "GPSEWEDSTo");
        setField(term7350, term7350.getClass(), "migr", "RCOqfVsRHt");
        setField(term7350, term7350.getClass(), "mvol", "TSyCeEZPaT");
        setField(term7350, term7350.getClass(), "ovf", "JeZFtaqkzW");
        setField(term7350, term7350.getClass(), "rdate", "vOVuNSCCLe");
        setField(term7350, term7350.getClass(), "recfm", "fzeqPnzpnt");
        setField(term7350, term7350.getClass(), "sizex", "RxbhrFBjkO");
        setField(term7350, term7350.getClass(), "spacu", "aanyiAOJCl");
        setField(term7350, term7350.getClass(), "used", "VDokbsCuqq");
        setField(term7350, term7350.getClass(), "vol", "xClUIcPECX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMvol", argTypes, term7350, args);
    }

};


