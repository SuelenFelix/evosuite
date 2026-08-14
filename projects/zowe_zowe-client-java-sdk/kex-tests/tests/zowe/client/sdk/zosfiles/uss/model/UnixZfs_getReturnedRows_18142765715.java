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

public class UnixZfs_getReturnedRows_18142765715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2354;

    public UnixZfs_getReturnedRows_18142765715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2415 = new Long(-1333707622307134180L);
        Long term2417 = new Long(-4360569253593381888L);
        Long term2419 = new Long(1457594663983990440L);
        Long term2421 = new Long(3452833434644634217L);
        Long term2423 = new Long(-8603648071751666348L);
        Long term2437 = new Long(-7884871963229073324L);
        Long term2439 = new Long(-8649738738252714180L);
        Long term2441 = new Long(-7278883608542636188L);
        Long term2443 = new Long(-1539859611880912454L);
        Long term2445 = new Long(4100236067313034103L);
        term2354 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term2354, term2354.getClass(), "name", "jiKYgYHqIS");
        setField(term2354, term2354.getClass(), "mountpoint", "DfISiziTgG");
        setField(term2354, term2354.getClass(), "fstname", "XqgfKFvPSD");
        setField(term2354, term2354.getClass(), "status", "JiVRgTZvKc");
        setField(term2354, term2354.getClass(), "mode", "XPKmummaqg");
        setField(term2354, term2354.getClass(), "dev", term2415);
        setField(term2354, term2354.getClass(), "fstype", term2417);
        setField(term2354, term2354.getClass(), "bsize", term2419);
        setField(term2354, term2354.getClass(), "bavail", term2421);
        setField(term2354, term2354.getClass(), "blocks", term2423);
        setField(term2354, term2354.getClass(), "sysname", "BKLfkLiZTH");
        setField(term2354, term2354.getClass(), "readibc", term2437);
        setField(term2354, term2354.getClass(), "writeibc", term2439);
        setField(term2354, term2354.getClass(), "diribc", term2441);
        setField(term2354, term2354.getClass(), "returnedRows", term2443);
        setField(term2354, term2354.getClass(), "totalRows", term2445);
        setBooleanField(term2354, term2354.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReturnedRows", argTypes, term2354, args);
    }

};


