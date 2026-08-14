package zowe.client.sdk.zosfiles.uss.model;

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
import static zowe.client.sdk.zosfiles.uss.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UnixZfs_getBsize_16300363268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1276;

    public UnixZfs_getBsize_16300363268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1337 = new Long(5510783420697225605L);
        Long term1339 = new Long(6005241913654469005L);
        Long term1341 = new Long(-1983291584002806658L);
        Long term1343 = new Long(5946780097489996391L);
        Long term1345 = new Long(-8652538484981166496L);
        Long term1359 = new Long(2701184207686293431L);
        Long term1361 = new Long(4474998035090263139L);
        Long term1363 = new Long(2848819812340321742L);
        Long term1365 = new Long(-8876856890348836498L);
        Long term1367 = new Long(846579494941632714L);
        term1276 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term1276, term1276.getClass(), "name", "UoYtihxVaS");
        setField(term1276, term1276.getClass(), "mountpoint", "JDswTTCZHV");
        setField(term1276, term1276.getClass(), "fstname", "onpbIeEKoi");
        setField(term1276, term1276.getClass(), "status", "YRHGsAkhxb");
        setField(term1276, term1276.getClass(), "mode", "ffYhPOzlUs");
        setField(term1276, term1276.getClass(), "dev", term1337);
        setField(term1276, term1276.getClass(), "fstype", term1339);
        setField(term1276, term1276.getClass(), "bsize", term1341);
        setField(term1276, term1276.getClass(), "bavail", term1343);
        setField(term1276, term1276.getClass(), "blocks", term1345);
        setField(term1276, term1276.getClass(), "sysname", "MLqYREekMl");
        setField(term1276, term1276.getClass(), "readibc", term1359);
        setField(term1276, term1276.getClass(), "writeibc", term1361);
        setField(term1276, term1276.getClass(), "diribc", term1363);
        setField(term1276, term1276.getClass(), "returnedRows", term1365);
        setField(term1276, term1276.getClass(), "totalRows", term1367);
        setBooleanField(term1276, term1276.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBsize", argTypes, term1276, args);
    }

};


