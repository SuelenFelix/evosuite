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

public class UnixZfs_getBavail_8582929889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1430;

    public UnixZfs_getBavail_8582929889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1491 = new Long(6689117472719450333L);
        Long term1493 = new Long(5836128569274066678L);
        Long term1495 = new Long(-2177368829816872572L);
        Long term1497 = new Long(-8463029266761149071L);
        Long term1499 = new Long(3133860696238261492L);
        Long term1513 = new Long(7247160664318067468L);
        Long term1515 = new Long(2135754395358000892L);
        Long term1517 = new Long(-8085190702504231560L);
        Long term1519 = new Long(1672578078364590450L);
        Long term1521 = new Long(4949335493504695457L);
        term1430 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term1430, term1430.getClass(), "name", "ytSBIKXogI");
        setField(term1430, term1430.getClass(), "mountpoint", "nHXjMycHlU");
        setField(term1430, term1430.getClass(), "fstname", "ieCtQFdkii");
        setField(term1430, term1430.getClass(), "status", "dEnhdmILtU");
        setField(term1430, term1430.getClass(), "mode", "hoicvmsovO");
        setField(term1430, term1430.getClass(), "dev", term1491);
        setField(term1430, term1430.getClass(), "fstype", term1493);
        setField(term1430, term1430.getClass(), "bsize", term1495);
        setField(term1430, term1430.getClass(), "bavail", term1497);
        setField(term1430, term1430.getClass(), "blocks", term1499);
        setField(term1430, term1430.getClass(), "sysname", "eqJfYWRaEL");
        setField(term1430, term1430.getClass(), "readibc", term1513);
        setField(term1430, term1430.getClass(), "writeibc", term1515);
        setField(term1430, term1430.getClass(), "diribc", term1517);
        setField(term1430, term1430.getClass(), "returnedRows", term1519);
        setField(term1430, term1430.getClass(), "totalRows", term1521);
        setBooleanField(term1430, term1430.getClass(), "moreRows", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBavail", argTypes, term1430, args);
    }

};


