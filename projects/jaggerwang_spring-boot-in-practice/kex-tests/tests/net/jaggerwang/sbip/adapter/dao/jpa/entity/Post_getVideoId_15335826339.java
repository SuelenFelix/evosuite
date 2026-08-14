package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_getVideoId_15335826339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6780;

    public Post_getVideoId_15335826339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6781 = new Long(6426732259596412988L);
        Long term6783 = new Long(185793058502220865L);
        Class<? extends Object> term6846 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term6845 = ((Class) term6846).getDeclaredField((String) "TEXT");
        ((Field) term6845).setAccessible(true);
        Object enum18 = ((Field) term6845).get((Object) null);
        Long term6807 = new Long(-7698746988132548371L);
        Long term6809 = new Long(2145420811068634601L);
        Long term6811 = new Long(2191130532479601175L);
        Long term6813 = new Long(860079646007397083L);
        Long term6815 = new Long(3230472384687362867L);
        Long term6817 = new Long(-1145146470850585022L);
        Long term6819 = new Long(1993646237353405740L);
        ArrayList term6805 = new ArrayList();
        ((ArrayList) term6805).add(term6807);
        ((ArrayList) term6805).add(term6809);
        ((ArrayList) term6805).add(term6811);
        ((ArrayList) term6805).add(term6813);
        ((ArrayList) term6805).add(term6815);
        ((ArrayList) term6805).add(term6817);
        ((ArrayList) term6805).add(term6819);
        Long term6823 = new Long(-4043093655001688454L);
        term6780 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term6825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6830 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6840 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6780, term6780.getClass(), "id", term6781);
        setField(term6780, term6780.getClass(), "userId", term6783);
        setField(term6780, term6780.getClass(), "type", enum18);
        setField(term6780, term6780.getClass(), "text", "UoYtihxVaS");
        setField(term6780, term6780.getClass(), "imageIds", term6805);
        setField(term6780, term6780.getClass(), "videoId", term6823);
        setIntField(term6826, term6826.getClass(), "year", 2019);
        setShortField(term6826, term6826.getClass(), "month", (short) 8);
        setShortField(term6826, term6826.getClass(), "day", (short) 12);
        setField(term6825, term6825.getClass(), "date", term6826);
        setByteField(term6830, term6830.getClass(), "hour", (byte) 14);
        setByteField(term6830, term6830.getClass(), "minute", (byte) 1);
        setByteField(term6830, term6830.getClass(), "second", (byte) 51);
        setIntField(term6830, term6830.getClass(), "nano", 499021786);
        setField(term6825, term6825.getClass(), "time", term6830);
        setField(term6780, term6780.getClass(), "createdAt", term6825);
        setIntField(term6836, term6836.getClass(), "year", 2014);
        setShortField(term6836, term6836.getClass(), "month", (short) 7);
        setShortField(term6836, term6836.getClass(), "day", (short) 22);
        setField(term6835, term6835.getClass(), "date", term6836);
        setByteField(term6840, term6840.getClass(), "hour", (byte) 9);
        setByteField(term6840, term6840.getClass(), "minute", (byte) 40);
        setByteField(term6840, term6840.getClass(), "second", (byte) 34);
        setIntField(term6840, term6840.getClass(), "nano", 463008257);
        setField(term6835, term6835.getClass(), "time", term6840);
        setField(term6780, term6780.getClass(), "updatedAt", term6835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoId", argTypes, term6780, args);
    }

};


