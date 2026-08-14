package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FileBO_FileBOBuilder_meta_10943429936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1793;
     Object term1878;

    public FileBO_FileBOBuilder_meta_10943429936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1794 = new Long(5127676408959197577L);
        Long term1796 = new Long(-6573104506744284592L);
        Class<? extends Object> term1906 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term1905 = ((Class) term1906).getDeclaredField((String) "LOCAL");
        ((Field) term1905).setAccessible(true);
        Object enum5 = ((Field) term1905).get((Object) null);
        Long term1844 = new Long(-4920224193275732920L);
        term1793 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$FileBOBuilder"));
        Object term1831 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term1858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1868 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1869 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1873 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1793, term1793.getClass(), "id", term1794);
        setField(term1793, term1793.getClass(), "userId", term1796);
        setField(term1793, term1793.getClass(), "region", enum5);
        setField(term1793, term1793.getClass(), "bucket", "xOEqzGAmDU");
        setField(term1793, term1793.getClass(), "path", "eZFUvlxvGV");
        setField(term1831, term1831.getClass(), "name", "BYqFIqCKAV");
        setField(term1831, term1831.getClass(), "size", term1844);
        setField(term1831, term1831.getClass(), "type", "vrQLuWIDJX");
        setField(term1793, term1793.getClass(), "meta", term1831);
        setIntField(term1859, term1859.getClass(), "year", 2019);
        setShortField(term1859, term1859.getClass(), "month", (short) 2);
        setShortField(term1859, term1859.getClass(), "day", (short) 21);
        setField(term1858, term1858.getClass(), "date", term1859);
        setByteField(term1863, term1863.getClass(), "hour", (byte) 5);
        setByteField(term1863, term1863.getClass(), "minute", (byte) 41);
        setByteField(term1863, term1863.getClass(), "second", (byte) 11);
        setIntField(term1863, term1863.getClass(), "nano", 859829782);
        setField(term1858, term1858.getClass(), "time", term1863);
        setField(term1793, term1793.getClass(), "createdAt", term1858);
        setIntField(term1869, term1869.getClass(), "year", 2018);
        setShortField(term1869, term1869.getClass(), "month", (short) 9);
        setShortField(term1869, term1869.getClass(), "day", (short) 28);
        setField(term1868, term1868.getClass(), "date", term1869);
        setByteField(term1873, term1873.getClass(), "hour", (byte) 3);
        setByteField(term1873, term1873.getClass(), "minute", (byte) 37);
        setByteField(term1873, term1873.getClass(), "second", (byte) 46);
        setIntField(term1873, term1873.getClass(), "nano", 763326845);
        setField(term1868, term1868.getClass(), "time", term1873);
        setField(term1793, term1793.getClass(), "updatedAt", term1868);
        Long term1891 = new Long(8428634514691209827L);
        term1878 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        setField(term1878, term1878.getClass(), "name", "flxyYxBRtu");
        setField(term1878, term1878.getClass(), "size", term1891);
        setField(term1878, term1878.getClass(), "type", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO$FileBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta");
        Object[] args = new Object[1];
        args[0] = term1878;
        callMethod(klass, "meta", argTypes, term1793, args);
    }

};


