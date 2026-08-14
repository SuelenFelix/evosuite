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

public class Dataset_getVol_20779706419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10283;

    public Dataset_getVol_20779706419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10283 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term10283, term10283.getClass(), "dsname", "jqrVEUvYEz");
        setField(term10283, term10283.getClass(), "blksz", "QITgiBrmfj");
        setField(term10283, term10283.getClass(), "catnm", "pXxkiXgQnq");
        setField(term10283, term10283.getClass(), "cdate", "tKmrUDURku");
        setField(term10283, term10283.getClass(), "dev", "JeZbrwZmsP");
        setField(term10283, term10283.getClass(), "dsntp", "bxyfeicqrK");
        setField(term10283, term10283.getClass(), "dsorg", "vBnWPlsZMk");
        setField(term10283, term10283.getClass(), "edate", "fIZsWucfXz");
        setField(term10283, term10283.getClass(), "extx", "IApvtmfhnq");
        setField(term10283, term10283.getClass(), "lrectl", "VSaNnhMpRc");
        setField(term10283, term10283.getClass(), "migr", "QNjNTLlUaV");
        setField(term10283, term10283.getClass(), "mvol", "hIYsRyOZxk");
        setField(term10283, term10283.getClass(), "ovf", "RjNoEywJbC");
        setField(term10283, term10283.getClass(), "rdate", "RTTvrwwhou");
        setField(term10283, term10283.getClass(), "recfm", "lRORwXipuk");
        setField(term10283, term10283.getClass(), "sizex", "fVdTcjgHdw");
        setField(term10283, term10283.getClass(), "spacu", "wwAwLLcLPp");
        setField(term10283, term10283.getClass(), "used", "nHpMKOmlpQ");
        setField(term10283, term10283.getClass(), "vol", "fKhrQsJToZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVol", argTypes, term10283, args);
    }

};


