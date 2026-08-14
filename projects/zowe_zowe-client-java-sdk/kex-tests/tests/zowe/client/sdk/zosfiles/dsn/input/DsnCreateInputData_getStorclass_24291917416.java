package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DsnCreateInputData_getStorclass_24291917416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7946;

    public DsnCreateInputData_getStorclass_24291917416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7995 = new Integer(-1034506028);
        Integer term7997 = new Integer(-1263114719);
        Integer term7999 = new Integer(-894662986);
        Integer term8001 = new Integer(304775596);
        Integer term8015 = new Integer(-1347665717);
        Integer term8017 = new Integer(-1888585309);
        term7946 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term7946, term7946.getClass(), "volser", "eOJfbiZLnb");
        setField(term7946, term7946.getClass(), "unit", "nKZKnxWYCK");
        setField(term7946, term7946.getClass(), "dsorg", "JOqQxuzRuZ");
        setField(term7946, term7946.getClass(), "alcunit", "RSaoipUlsg");
        setField(term7946, term7946.getClass(), "primary", term7995);
        setField(term7946, term7946.getClass(), "secondary", term7997);
        setField(term7946, term7946.getClass(), "dirblk", term7999);
        setField(term7946, term7946.getClass(), "avgblk", term8001);
        setField(term7946, term7946.getClass(), "recfm", "cSHGbqKqlN");
        setField(term7946, term7946.getClass(), "blksize", term8015);
        setField(term7946, term7946.getClass(), "lrecl", term8017);
        setField(term7946, term7946.getClass(), "storclass", "pFAfANnxup");
        setField(term7946, term7946.getClass(), "mgntclass", "FbSIUZyBXZ");
        setField(term7946, term7946.getClass(), "dataclass", "mhQDwIyrRi");
        setField(term7946, term7946.getClass(), "dsntype", "HpZXWDPhlg");
        setBooleanField(term7946, term7946.getClass(), "showAttributes", false);
        setField(term7946, term7946.getClass(), "size", "lBOokzEPfe");
        setField(term7946, term7946.getClass(), "responseTimeout", "dtGZCsKXbW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStorclass", argTypes, term7946, args);
    }

};


