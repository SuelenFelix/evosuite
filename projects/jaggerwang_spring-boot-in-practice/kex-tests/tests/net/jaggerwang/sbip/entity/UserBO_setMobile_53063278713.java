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
import java.lang.Object;

public class UserBO_setMobile_53063278713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26578;

    public UserBO_setMobile_53063278713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26579 = new Long(-2720964670491002091L);
        Long term26629 = new Long(-723697646775816649L);
        term26578 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term26643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26648 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26658 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26578, term26578.getClass(), "id", term26579);
        setField(term26578, term26578.getClass(), "username", "NHbOFFjyVK");
        setField(term26578, term26578.getClass(), "password", "zaloBqlrSo");
        setField(term26578, term26578.getClass(), "mobile", "vvoLrMGCoN");
        setField(term26578, term26578.getClass(), "email", "pXdglvyrQe");
        setField(term26578, term26578.getClass(), "avatarId", term26629);
        setField(term26578, term26578.getClass(), "intro", "OcfNzHYdki");
        setIntField(term26644, term26644.getClass(), "year", 2010);
        setShortField(term26644, term26644.getClass(), "month", (short) 11);
        setShortField(term26644, term26644.getClass(), "day", (short) 14);
        setField(term26643, term26643.getClass(), "date", term26644);
        setByteField(term26648, term26648.getClass(), "hour", (byte) 4);
        setByteField(term26648, term26648.getClass(), "minute", (byte) 49);
        setByteField(term26648, term26648.getClass(), "second", (byte) 50);
        setIntField(term26648, term26648.getClass(), "nano", 621399921);
        setField(term26643, term26643.getClass(), "time", term26648);
        setField(term26578, term26578.getClass(), "createdAt", term26643);
        setIntField(term26654, term26654.getClass(), "year", 2027);
        setShortField(term26654, term26654.getClass(), "month", (short) 1);
        setShortField(term26654, term26654.getClass(), "day", (short) 20);
        setField(term26653, term26653.getClass(), "date", term26654);
        setByteField(term26658, term26658.getClass(), "hour", (byte) 8);
        setByteField(term26658, term26658.getClass(), "minute", (byte) 5);
        setByteField(term26658, term26658.getClass(), "second", (byte) 44);
        setIntField(term26658, term26658.getClass(), "nano", 960768267);
        setField(term26653, term26653.getClass(), "time", term26658);
        setField(term26578, term26578.getClass(), "updatedAt", term26653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uPuCVuZYOI";
        callMethod(klass, "setMobile", argTypes, term26578, args);
    }

};


