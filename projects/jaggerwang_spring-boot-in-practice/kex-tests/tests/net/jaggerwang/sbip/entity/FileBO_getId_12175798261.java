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

public class FileBO_getId_12175798261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4180;

    public FileBO_getId_12175798261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4181 = new Long(-7612550318181586304L);
        Long term4183 = new Long(-2170847986967241072L);
        Class<? extends Object> term4266 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term4265 = ((Class) term4266).getDeclaredField((String) "LOCAL");
        ((Field) term4265).setAccessible(true);
        Object enum10 = ((Field) term4265).get((Object) null);
        Long term4231 = new Long(4044358158040652353L);
        term4180 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term4218 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term4245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4250 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4260 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4180, term4180.getClass(), "id", term4181);
        setField(term4180, term4180.getClass(), "userId", term4183);
        setField(term4180, term4180.getClass(), "region", enum10);
        setField(term4180, term4180.getClass(), "bucket", "tPlsykYBqO");
        setField(term4180, term4180.getClass(), "path", "bLPjGVBhlX");
        setField(term4218, term4218.getClass(), "name", "whBvTVIIlC");
        setField(term4218, term4218.getClass(), "size", term4231);
        setField(term4218, term4218.getClass(), "type", "IgRJUzaCwW");
        setField(term4180, term4180.getClass(), "meta", term4218);
        setIntField(term4246, term4246.getClass(), "year", 2015);
        setShortField(term4246, term4246.getClass(), "month", (short) 3);
        setShortField(term4246, term4246.getClass(), "day", (short) 10);
        setField(term4245, term4245.getClass(), "date", term4246);
        setByteField(term4250, term4250.getClass(), "hour", (byte) 23);
        setByteField(term4250, term4250.getClass(), "minute", (byte) 34);
        setByteField(term4250, term4250.getClass(), "second", (byte) 44);
        setIntField(term4250, term4250.getClass(), "nano", 587322824);
        setField(term4245, term4245.getClass(), "time", term4250);
        setField(term4180, term4180.getClass(), "createdAt", term4245);
        setIntField(term4256, term4256.getClass(), "year", 2027);
        setShortField(term4256, term4256.getClass(), "month", (short) 8);
        setShortField(term4256, term4256.getClass(), "day", (short) 26);
        setField(term4255, term4255.getClass(), "date", term4256);
        setByteField(term4260, term4260.getClass(), "hour", (byte) 5);
        setByteField(term4260, term4260.getClass(), "minute", (byte) 11);
        setByteField(term4260, term4260.getClass(), "second", (byte) 9);
        setIntField(term4260, term4260.getClass(), "nano", 219245092);
        setField(term4255, term4255.getClass(), "time", term4260);
        setField(term4180, term4180.getClass(), "updatedAt", term4255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4180, args);
    }

};


