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

public class FileBO_setMeta_197073169914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8739;
     Object term8824;

    public FileBO_setMeta_197073169914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8740 = new Long(4474998035090263139L);
        Long term8742 = new Long(2848819812340321742L);
        Class<? extends Object> term8852 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term8851 = ((Class) term8852).getDeclaredField((String) "LOCAL");
        ((Field) term8851).setAccessible(true);
        Object enum23 = ((Field) term8851).get((Object) null);
        Long term8790 = new Long(-8876856890348836498L);
        term8739 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term8777 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term8804 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8805 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8809 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8819 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8739, term8739.getClass(), "id", term8740);
        setField(term8739, term8739.getClass(), "userId", term8742);
        setField(term8739, term8739.getClass(), "region", enum23);
        setField(term8739, term8739.getClass(), "bucket", "WzMEhMXkKx");
        setField(term8739, term8739.getClass(), "path", "XOiDvlDhdc");
        setField(term8777, term8777.getClass(), "name", "AdxvLJhNLe");
        setField(term8777, term8777.getClass(), "size", term8790);
        setField(term8777, term8777.getClass(), "type", "lHfTrWKMPk");
        setField(term8739, term8739.getClass(), "meta", term8777);
        setIntField(term8805, term8805.getClass(), "year", 2012);
        setShortField(term8805, term8805.getClass(), "month", (short) 4);
        setShortField(term8805, term8805.getClass(), "day", (short) 25);
        setField(term8804, term8804.getClass(), "date", term8805);
        setByteField(term8809, term8809.getClass(), "hour", (byte) 21);
        setByteField(term8809, term8809.getClass(), "minute", (byte) 14);
        setByteField(term8809, term8809.getClass(), "second", (byte) 15);
        setIntField(term8809, term8809.getClass(), "nano", 561700934);
        setField(term8804, term8804.getClass(), "time", term8809);
        setField(term8739, term8739.getClass(), "createdAt", term8804);
        setIntField(term8815, term8815.getClass(), "year", 2011);
        setShortField(term8815, term8815.getClass(), "month", (short) 10);
        setShortField(term8815, term8815.getClass(), "day", (short) 25);
        setField(term8814, term8814.getClass(), "date", term8815);
        setByteField(term8819, term8819.getClass(), "hour", (byte) 10);
        setByteField(term8819, term8819.getClass(), "minute", (byte) 33);
        setByteField(term8819, term8819.getClass(), "second", (byte) 8);
        setIntField(term8819, term8819.getClass(), "nano", 268304014);
        setField(term8814, term8814.getClass(), "time", term8819);
        setField(term8739, term8739.getClass(), "updatedAt", term8814);
        Long term8837 = new Long(846579494941632714L);
        term8824 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        setField(term8824, term8824.getClass(), "name", "JDaAnsVTGV");
        setField(term8824, term8824.getClass(), "size", term8837);
        setField(term8824, term8824.getClass(), "type", "mLUZFTfjle");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta");
        Object[] args = new Object[1];
        args[0] = term8824;
        callMethod(klass, "setMeta", argTypes, term8739, args);
    }

};


