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

public class Dataset_getDev_1908853865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4417;

    public Dataset_getDev_1908853865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4417 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term4417, term4417.getClass(), "dsname", "tRxZafjqIx");
        setField(term4417, term4417.getClass(), "blksz", "DhjNLmRMCu");
        setField(term4417, term4417.getClass(), "catnm", "PgPzMSEjjX");
        setField(term4417, term4417.getClass(), "cdate", "wzsPSPcRdj");
        setField(term4417, term4417.getClass(), "dev", "kGMQdqJYyB");
        setField(term4417, term4417.getClass(), "dsntp", "XJJNClzHRf");
        setField(term4417, term4417.getClass(), "dsorg", "HDaezxQfQR");
        setField(term4417, term4417.getClass(), "edate", "iikZEapDlu");
        setField(term4417, term4417.getClass(), "extx", "nhoHrZfnIN");
        setField(term4417, term4417.getClass(), "lrectl", "ZkMALXpEAZ");
        setField(term4417, term4417.getClass(), "migr", "tXfQjSqDzN");
        setField(term4417, term4417.getClass(), "mvol", "BjugTaMcxJ");
        setField(term4417, term4417.getClass(), "ovf", "vGiuZVPJNH");
        setField(term4417, term4417.getClass(), "rdate", "tlzpzIjMib");
        setField(term4417, term4417.getClass(), "recfm", "AZdLeSugwv");
        setField(term4417, term4417.getClass(), "sizex", "RMsXuyzKJV");
        setField(term4417, term4417.getClass(), "spacu", "FwPbDZcHmB");
        setField(term4417, term4417.getClass(), "used", "hOncybyCAH");
        setField(term4417, term4417.getClass(), "vol", "QduALnDSVo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDev", argTypes, term4417, args);
    }

};


