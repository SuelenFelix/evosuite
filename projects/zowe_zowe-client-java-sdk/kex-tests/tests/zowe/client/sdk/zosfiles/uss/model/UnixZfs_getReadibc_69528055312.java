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

public class UnixZfs_getReadibc_69528055312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1892;

    public UnixZfs_getReadibc_69528055312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1953 = new Long(5671808784468963649L);
        Long term1955 = new Long(2297097306706899827L);
        Long term1957 = new Long(-900457279156388404L);
        Long term1959 = new Long(1084801489398441516L);
        Long term1961 = new Long(6273754186658578034L);
        Long term1975 = new Long(3620247240684476031L);
        Long term1977 = new Long(8313800941204938919L);
        Long term1979 = new Long(-1214968196781083707L);
        Long term1981 = new Long(-1804015692891701666L);
        Long term1983 = new Long(-6432617521836576658L);
        term1892 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term1892, term1892.getClass(), "name", "oVgzLbrsFr");
        setField(term1892, term1892.getClass(), "mountpoint", "vQVyKLdtaz");
        setField(term1892, term1892.getClass(), "fstname", "OWKQODBLzb");
        setField(term1892, term1892.getClass(), "status", "wGmYcqUkgE");
        setField(term1892, term1892.getClass(), "mode", "idgaQsnJpQ");
        setField(term1892, term1892.getClass(), "dev", term1953);
        setField(term1892, term1892.getClass(), "fstype", term1955);
        setField(term1892, term1892.getClass(), "bsize", term1957);
        setField(term1892, term1892.getClass(), "bavail", term1959);
        setField(term1892, term1892.getClass(), "blocks", term1961);
        setField(term1892, term1892.getClass(), "sysname", "VgZnGoIFwQ");
        setField(term1892, term1892.getClass(), "readibc", term1975);
        setField(term1892, term1892.getClass(), "writeibc", term1977);
        setField(term1892, term1892.getClass(), "diribc", term1979);
        setField(term1892, term1892.getClass(), "returnedRows", term1981);
        setField(term1892, term1892.getClass(), "totalRows", term1983);
        setBooleanField(term1892, term1892.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReadibc", argTypes, term1892, args);
    }

};


