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

public class UserBO_setIntro_14894531916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27029;

    public UserBO_setIntro_14894531916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27030 = new Long(7199459243454109261L);
        Long term27080 = new Long(-1009485425289165749L);
        term27029 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term27094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27109 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27029, term27029.getClass(), "id", term27030);
        setField(term27029, term27029.getClass(), "username", "vKitydDVnM");
        setField(term27029, term27029.getClass(), "password", "urCiQnUFBM");
        setField(term27029, term27029.getClass(), "mobile", "EKjQdtKxAM");
        setField(term27029, term27029.getClass(), "email", "TXZAIPQJHt");
        setField(term27029, term27029.getClass(), "avatarId", term27080);
        setField(term27029, term27029.getClass(), "intro", "DIbeDHICho");
        setIntField(term27095, term27095.getClass(), "year", 2027);
        setShortField(term27095, term27095.getClass(), "month", (short) 5);
        setShortField(term27095, term27095.getClass(), "day", (short) 22);
        setField(term27094, term27094.getClass(), "date", term27095);
        setByteField(term27099, term27099.getClass(), "hour", (byte) 6);
        setByteField(term27099, term27099.getClass(), "minute", (byte) 8);
        setByteField(term27099, term27099.getClass(), "second", (byte) 27);
        setIntField(term27099, term27099.getClass(), "nano", 955380448);
        setField(term27094, term27094.getClass(), "time", term27099);
        setField(term27029, term27029.getClass(), "createdAt", term27094);
        setIntField(term27105, term27105.getClass(), "year", 2029);
        setShortField(term27105, term27105.getClass(), "month", (short) 1);
        setShortField(term27105, term27105.getClass(), "day", (short) 12);
        setField(term27104, term27104.getClass(), "date", term27105);
        setByteField(term27109, term27109.getClass(), "hour", (byte) 15);
        setByteField(term27109, term27109.getClass(), "minute", (byte) 27);
        setByteField(term27109, term27109.getClass(), "second", (byte) 0);
        setIntField(term27109, term27109.getClass(), "nano", 592641552);
        setField(term27104, term27104.getClass(), "time", term27109);
        setField(term27029, term27029.getClass(), "updatedAt", term27104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dJGPlmSRnz";
        callMethod(klass, "setIntro", argTypes, term27029, args);
    }

};


