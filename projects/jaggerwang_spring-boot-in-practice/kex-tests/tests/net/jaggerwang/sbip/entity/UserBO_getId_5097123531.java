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

public class UserBO_getId_5097123531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24912;

    public UserBO_getId_5097123531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24913 = new Long(6437032166810658671L);
        Long term24963 = new Long(6044346825617132280L);
        term24912 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term24977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24982 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24992 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24912, term24912.getClass(), "id", term24913);
        setField(term24912, term24912.getClass(), "username", "QduALnDSVo");
        setField(term24912, term24912.getClass(), "password", "izPpKDErnQ");
        setField(term24912, term24912.getClass(), "mobile", "NnpwZBUTvx");
        setField(term24912, term24912.getClass(), "email", "tlQSNgTkQX");
        setField(term24912, term24912.getClass(), "avatarId", term24963);
        setField(term24912, term24912.getClass(), "intro", "PCipZnmBOF");
        setIntField(term24978, term24978.getClass(), "year", 2027);
        setShortField(term24978, term24978.getClass(), "month", (short) 11);
        setShortField(term24978, term24978.getClass(), "day", (short) 10);
        setField(term24977, term24977.getClass(), "date", term24978);
        setByteField(term24982, term24982.getClass(), "hour", (byte) 9);
        setByteField(term24982, term24982.getClass(), "minute", (byte) 27);
        setByteField(term24982, term24982.getClass(), "second", (byte) 5);
        setIntField(term24982, term24982.getClass(), "nano", 574938581);
        setField(term24977, term24977.getClass(), "time", term24982);
        setField(term24912, term24912.getClass(), "createdAt", term24977);
        setIntField(term24988, term24988.getClass(), "year", 2011);
        setShortField(term24988, term24988.getClass(), "month", (short) 8);
        setShortField(term24988, term24988.getClass(), "day", (short) 29);
        setField(term24987, term24987.getClass(), "date", term24988);
        setByteField(term24992, term24992.getClass(), "hour", (byte) 10);
        setByteField(term24992, term24992.getClass(), "minute", (byte) 15);
        setByteField(term24992, term24992.getClass(), "second", (byte) 18);
        setIntField(term24992, term24992.getClass(), "nano", 171360352);
        setField(term24987, term24987.getClass(), "time", term24992);
        setField(term24912, term24912.getClass(), "updatedAt", term24987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term24912, args);
    }

};


