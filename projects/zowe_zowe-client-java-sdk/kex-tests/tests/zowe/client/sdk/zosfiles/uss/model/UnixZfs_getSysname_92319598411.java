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

public class UnixZfs_getSysname_92319598411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1738;

    public UnixZfs_getSysname_92319598411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1799 = new Long(1597484336218508869L);
        Long term1801 = new Long(-685023850445639859L);
        Long term1803 = new Long(-6950146046121430355L);
        Long term1805 = new Long(1667122142089513324L);
        Long term1807 = new Long(-6342139649364011743L);
        Long term1821 = new Long(-4924950707540628022L);
        Long term1823 = new Long(-4393710401270724527L);
        Long term1825 = new Long(-4822736661741380518L);
        Long term1827 = new Long(-5386201758403679145L);
        Long term1829 = new Long(-7268507582722666254L);
        term1738 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term1738, term1738.getClass(), "name", "whBvTVIIlC");
        setField(term1738, term1738.getClass(), "mountpoint", "IgRJUzaCwW");
        setField(term1738, term1738.getClass(), "fstname", "JUmudUmaaV");
        setField(term1738, term1738.getClass(), "status", "KoyGrUJeJW");
        setField(term1738, term1738.getClass(), "mode", "HqBOwkVqjD");
        setField(term1738, term1738.getClass(), "dev", term1799);
        setField(term1738, term1738.getClass(), "fstype", term1801);
        setField(term1738, term1738.getClass(), "bsize", term1803);
        setField(term1738, term1738.getClass(), "bavail", term1805);
        setField(term1738, term1738.getClass(), "blocks", term1807);
        setField(term1738, term1738.getClass(), "sysname", "MAcUBcBckh");
        setField(term1738, term1738.getClass(), "readibc", term1821);
        setField(term1738, term1738.getClass(), "writeibc", term1823);
        setField(term1738, term1738.getClass(), "diribc", term1825);
        setField(term1738, term1738.getClass(), "returnedRows", term1827);
        setField(term1738, term1738.getClass(), "totalRows", term1829);
        setBooleanField(term1738, term1738.getClass(), "moreRows", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSysname", argTypes, term1738, args);
    }

};


