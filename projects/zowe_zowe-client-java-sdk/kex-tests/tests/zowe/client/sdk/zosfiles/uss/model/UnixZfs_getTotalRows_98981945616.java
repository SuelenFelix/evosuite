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

public class UnixZfs_getTotalRows_98981945616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2508;

    public UnixZfs_getTotalRows_98981945616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2569 = new Long(1195529027276497124L);
        Long term2571 = new Long(-2783999800714825789L);
        Long term2573 = new Long(4266570509071948633L);
        Long term2575 = new Long(-7291742736502427077L);
        Long term2577 = new Long(-8121849829073967555L);
        Long term2591 = new Long(5219030281405653303L);
        Long term2593 = new Long(-8471550651709805183L);
        Long term2595 = new Long(-948292411727204525L);
        Long term2597 = new Long(-8892586408602479513L);
        Long term2599 = new Long(4616440478358528406L);
        term2508 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term2508, term2508.getClass(), "name", "SPpkrGcPRr");
        setField(term2508, term2508.getClass(), "mountpoint", "sEccwbJKYE");
        setField(term2508, term2508.getClass(), "fstname", "AWRooQKkdW");
        setField(term2508, term2508.getClass(), "status", "vjxIhXHxGR");
        setField(term2508, term2508.getClass(), "mode", "QXzGXbEXMu");
        setField(term2508, term2508.getClass(), "dev", term2569);
        setField(term2508, term2508.getClass(), "fstype", term2571);
        setField(term2508, term2508.getClass(), "bsize", term2573);
        setField(term2508, term2508.getClass(), "bavail", term2575);
        setField(term2508, term2508.getClass(), "blocks", term2577);
        setField(term2508, term2508.getClass(), "sysname", "qxSDVejjiY");
        setField(term2508, term2508.getClass(), "readibc", term2591);
        setField(term2508, term2508.getClass(), "writeibc", term2593);
        setField(term2508, term2508.getClass(), "diribc", term2595);
        setField(term2508, term2508.getClass(), "returnedRows", term2597);
        setField(term2508, term2508.getClass(), "totalRows", term2599);
        setBooleanField(term2508, term2508.getClass(), "moreRows", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalRows", argTypes, term2508, args);
    }

};


