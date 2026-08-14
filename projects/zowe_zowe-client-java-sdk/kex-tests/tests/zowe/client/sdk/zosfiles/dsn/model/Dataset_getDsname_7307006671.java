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

public class Dataset_getDsname_7307006671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2741;

    public Dataset_getDsname_7307006671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2741 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term2741, term2741.getClass(), "dsname", "XylxrMBraH");
        setField(term2741, term2741.getClass(), "blksz", "pORebkoRdD");
        setField(term2741, term2741.getClass(), "catnm", "mXGCWJDOqA");
        setField(term2741, term2741.getClass(), "cdate", "dpNsDgfPso");
        setField(term2741, term2741.getClass(), "dev", "hCWPJQKpdc");
        setField(term2741, term2741.getClass(), "dsntp", "WzMEhMXkKx");
        setField(term2741, term2741.getClass(), "dsorg", "XOiDvlDhdc");
        setField(term2741, term2741.getClass(), "edate", "AdxvLJhNLe");
        setField(term2741, term2741.getClass(), "extx", "lHfTrWKMPk");
        setField(term2741, term2741.getClass(), "lrectl", "JDaAnsVTGV");
        setField(term2741, term2741.getClass(), "migr", "mLUZFTfjle");
        setField(term2741, term2741.getClass(), "mvol", "xIeFjkHkOe");
        setField(term2741, term2741.getClass(), "ovf", "SdCKLMIYnX");
        setField(term2741, term2741.getClass(), "rdate", "OJJtVNPyKZ");
        setField(term2741, term2741.getClass(), "recfm", "AKNapTAfmD");
        setField(term2741, term2741.getClass(), "sizex", "xJgPlLxpgC");
        setField(term2741, term2741.getClass(), "spacu", "EYtfuJaxiM");
        setField(term2741, term2741.getClass(), "used", "gCWtLVKVVe");
        setField(term2741, term2741.getClass(), "vol", "fWKJoSoCwE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDsname", argTypes, term2741, args);
    }

};


