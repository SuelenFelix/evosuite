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

public class Dataset_getOvf_20153518813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7769;

    public Dataset_getOvf_20153518813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7769 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term7769, term7769.getClass(), "dsname", "avhRaGZaBF");
        setField(term7769, term7769.getClass(), "blksz", "JkgoRtImdE");
        setField(term7769, term7769.getClass(), "catnm", "qFGKIJjlmV");
        setField(term7769, term7769.getClass(), "cdate", "IHqvyhMtuM");
        setField(term7769, term7769.getClass(), "dev", "dAldIGYAXV");
        setField(term7769, term7769.getClass(), "dsntp", "mLwibAPEsa");
        setField(term7769, term7769.getClass(), "dsorg", "zsWKWiTFuo");
        setField(term7769, term7769.getClass(), "edate", "UPUbwyHQKN");
        setField(term7769, term7769.getClass(), "extx", "lgQkrXANyI");
        setField(term7769, term7769.getClass(), "lrectl", "MeTmRZXErV");
        setField(term7769, term7769.getClass(), "migr", "jNxbVmoZgq");
        setField(term7769, term7769.getClass(), "mvol", "PvmBHIXaMY");
        setField(term7769, term7769.getClass(), "ovf", "hulYxtowxw");
        setField(term7769, term7769.getClass(), "rdate", "GNEmuHPNcU");
        setField(term7769, term7769.getClass(), "recfm", "IoSfuKDFRe");
        setField(term7769, term7769.getClass(), "sizex", "AWYyZiNfsm");
        setField(term7769, term7769.getClass(), "spacu", "ITRRYiuDwH");
        setField(term7769, term7769.getClass(), "used", "llRfwANcVF");
        setField(term7769, term7769.getClass(), "vol", "sUEeHQTWkA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOvf", argTypes, term7769, args);
    }

};


