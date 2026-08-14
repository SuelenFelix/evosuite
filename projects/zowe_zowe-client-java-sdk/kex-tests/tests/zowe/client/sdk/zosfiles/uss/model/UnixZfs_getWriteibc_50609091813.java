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

public class UnixZfs_getWriteibc_50609091813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2046;

    public UnixZfs_getWriteibc_50609091813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2107 = new Long(-2255965562447970862L);
        Long term2109 = new Long(148047808219672941L);
        Long term2111 = new Long(7489064039921396098L);
        Long term2113 = new Long(6843866297465638866L);
        Long term2115 = new Long(-4023935540989049732L);
        Long term2129 = new Long(855932984568615096L);
        Long term2131 = new Long(-1616722610139554082L);
        Long term2133 = new Long(7495904023107549024L);
        Long term2135 = new Long(8802866251294305945L);
        Long term2137 = new Long(4513004407927379358L);
        term2046 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term2046, term2046.getClass(), "name", "jUbSRrkrYZ");
        setField(term2046, term2046.getClass(), "mountpoint", "bWWfajKbEX");
        setField(term2046, term2046.getClass(), "fstname", "cAPeiZHKGJ");
        setField(term2046, term2046.getClass(), "status", "LvJFtLBaxj");
        setField(term2046, term2046.getClass(), "mode", "PHvxnGHptP");
        setField(term2046, term2046.getClass(), "dev", term2107);
        setField(term2046, term2046.getClass(), "fstype", term2109);
        setField(term2046, term2046.getClass(), "bsize", term2111);
        setField(term2046, term2046.getClass(), "bavail", term2113);
        setField(term2046, term2046.getClass(), "blocks", term2115);
        setField(term2046, term2046.getClass(), "sysname", "TimdotUuNC");
        setField(term2046, term2046.getClass(), "readibc", term2129);
        setField(term2046, term2046.getClass(), "writeibc", term2131);
        setField(term2046, term2046.getClass(), "diribc", term2133);
        setField(term2046, term2046.getClass(), "returnedRows", term2135);
        setField(term2046, term2046.getClass(), "totalRows", term2137);
        setBooleanField(term2046, term2046.getClass(), "moreRows", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWriteibc", argTypes, term2046, args);
    }

};


