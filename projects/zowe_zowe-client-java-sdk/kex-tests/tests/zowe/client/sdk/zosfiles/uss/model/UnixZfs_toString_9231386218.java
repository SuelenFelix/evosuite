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

public class UnixZfs_toString_9231386218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2816;

    public UnixZfs_toString_9231386218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2877 = new Long(3090901538358721367L);
        Long term2879 = new Long(-1677189124507026637L);
        Long term2881 = new Long(4795660804170399986L);
        Long term2883 = new Long(-4030863184426321096L);
        Long term2885 = new Long(-8010214112439224349L);
        Long term2899 = new Long(-6673920710396545553L);
        Long term2901 = new Long(3412644969878030772L);
        Long term2903 = new Long(6698455537431331246L);
        Long term2905 = new Long(-8327432141027603933L);
        Long term2907 = new Long(-433040798405298080L);
        term2816 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term2816, term2816.getClass(), "name", "OEXDRUKcFl");
        setField(term2816, term2816.getClass(), "mountpoint", "RYdKCNNMBR");
        setField(term2816, term2816.getClass(), "fstname", "yGtHPyvYiQ");
        setField(term2816, term2816.getClass(), "status", "MvRIxilFMJ");
        setField(term2816, term2816.getClass(), "mode", "iNwOJRBEjp");
        setField(term2816, term2816.getClass(), "dev", term2877);
        setField(term2816, term2816.getClass(), "fstype", term2879);
        setField(term2816, term2816.getClass(), "bsize", term2881);
        setField(term2816, term2816.getClass(), "bavail", term2883);
        setField(term2816, term2816.getClass(), "blocks", term2885);
        setField(term2816, term2816.getClass(), "sysname", "XylxrMBraH");
        setField(term2816, term2816.getClass(), "readibc", term2899);
        setField(term2816, term2816.getClass(), "writeibc", term2901);
        setField(term2816, term2816.getClass(), "diribc", term2903);
        setField(term2816, term2816.getClass(), "returnedRows", term2905);
        setField(term2816, term2816.getClass(), "totalRows", term2907);
        setBooleanField(term2816, term2816.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2816, args);
    }

};


