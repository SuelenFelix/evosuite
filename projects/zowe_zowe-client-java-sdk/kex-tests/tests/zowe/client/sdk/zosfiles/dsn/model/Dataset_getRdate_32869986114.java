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

public class Dataset_getRdate_32869986114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8188;

    public Dataset_getRdate_32869986114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8188 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term8188, term8188.getClass(), "dsname", "BDIRCxAWLA");
        setField(term8188, term8188.getClass(), "blksz", "eOJfbiZLnb");
        setField(term8188, term8188.getClass(), "catnm", "nKZKnxWYCK");
        setField(term8188, term8188.getClass(), "cdate", "JOqQxuzRuZ");
        setField(term8188, term8188.getClass(), "dev", "RSaoipUlsg");
        setField(term8188, term8188.getClass(), "dsntp", "cSHGbqKqlN");
        setField(term8188, term8188.getClass(), "dsorg", "pFAfANnxup");
        setField(term8188, term8188.getClass(), "edate", "FbSIUZyBXZ");
        setField(term8188, term8188.getClass(), "extx", "mhQDwIyrRi");
        setField(term8188, term8188.getClass(), "lrectl", "HpZXWDPhlg");
        setField(term8188, term8188.getClass(), "migr", "lBOokzEPfe");
        setField(term8188, term8188.getClass(), "mvol", "dtGZCsKXbW");
        setField(term8188, term8188.getClass(), "ovf", "bdyhHbDAmJ");
        setField(term8188, term8188.getClass(), "rdate", "BBXiTNHqGE");
        setField(term8188, term8188.getClass(), "recfm", "IEYhJmgCVd");
        setField(term8188, term8188.getClass(), "sizex", "KSJeYkkvpk");
        setField(term8188, term8188.getClass(), "spacu", "qUtkFGMNUV");
        setField(term8188, term8188.getClass(), "used", "mGRiYhnMcR");
        setField(term8188, term8188.getClass(), "vol", "NFlvfJCVPO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRdate", argTypes, term8188, args);
    }

};


