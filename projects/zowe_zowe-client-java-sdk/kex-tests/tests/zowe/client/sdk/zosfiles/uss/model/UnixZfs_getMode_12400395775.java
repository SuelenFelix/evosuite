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

public class UnixZfs_getMode_12400395775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814;

    public UnixZfs_getMode_12400395775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term875 = new Long(-5788180182343976541L);
        Long term877 = new Long(2936323121573284007L);
        Long term879 = new Long(-1154553077993834885L);
        Long term881 = new Long(-2850532706972744550L);
        Long term883 = new Long(-2644215923136513282L);
        Long term897 = new Long(-1468719814009985452L);
        Long term899 = new Long(-7738503207562305297L);
        Long term901 = new Long(3825396310311739952L);
        Long term903 = new Long(-3838084482494604218L);
        Long term905 = new Long(3892018155439224435L);
        term814 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term814, term814.getClass(), "name", "kuTXqwMtDB");
        setField(term814, term814.getClass(), "mountpoint", "Ghbwtircqb");
        setField(term814, term814.getClass(), "fstname", "xrwlQZdwCp");
        setField(term814, term814.getClass(), "status", "IDCWpPLRkE");
        setField(term814, term814.getClass(), "mode", "nyiiPDVjAc");
        setField(term814, term814.getClass(), "dev", term875);
        setField(term814, term814.getClass(), "fstype", term877);
        setField(term814, term814.getClass(), "bsize", term879);
        setField(term814, term814.getClass(), "bavail", term881);
        setField(term814, term814.getClass(), "blocks", term883);
        setField(term814, term814.getClass(), "sysname", "aKnKipADSo");
        setField(term814, term814.getClass(), "readibc", term897);
        setField(term814, term814.getClass(), "writeibc", term899);
        setField(term814, term814.getClass(), "diribc", term901);
        setField(term814, term814.getClass(), "returnedRows", term903);
        setField(term814, term814.getClass(), "totalRows", term905);
        setBooleanField(term814, term814.getClass(), "moreRows", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMode", argTypes, term814, args);
    }

};


