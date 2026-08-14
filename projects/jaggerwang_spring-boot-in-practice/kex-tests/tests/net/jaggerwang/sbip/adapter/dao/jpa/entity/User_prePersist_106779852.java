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
import java.lang.Object;

public class User_prePersist_106779852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27741;

    public User_prePersist_106779852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27742 = new Long(-2922851649897789783L);
        Long term27792 = new Long(5023047512459111304L);
        term27741 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term27806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27811 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27821 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27741, term27741.getClass(), "id", term27742);
        setField(term27741, term27741.getClass(), "username", "zaloBqlrSo");
        setField(term27741, term27741.getClass(), "password", "vvoLrMGCoN");
        setField(term27741, term27741.getClass(), "mobile", "pXdglvyrQe");
        setField(term27741, term27741.getClass(), "email", "OcfNzHYdki");
        setField(term27741, term27741.getClass(), "avatarId", term27792);
        setField(term27741, term27741.getClass(), "intro", "uPuCVuZYOI");
        setIntField(term27807, term27807.getClass(), "year", 2025);
        setShortField(term27807, term27807.getClass(), "month", (short) 8);
        setShortField(term27807, term27807.getClass(), "day", (short) 4);
        setField(term27806, term27806.getClass(), "date", term27807);
        setByteField(term27811, term27811.getClass(), "hour", (byte) 7);
        setByteField(term27811, term27811.getClass(), "minute", (byte) 29);
        setByteField(term27811, term27811.getClass(), "second", (byte) 4);
        setIntField(term27811, term27811.getClass(), "nano", 175288511);
        setField(term27806, term27806.getClass(), "time", term27811);
        setField(term27741, term27741.getClass(), "createdAt", term27806);
        setIntField(term27817, term27817.getClass(), "year", 2029);
        setShortField(term27817, term27817.getClass(), "month", (short) 9);
        setShortField(term27817, term27817.getClass(), "day", (short) 1);
        setField(term27816, term27816.getClass(), "date", term27817);
        setByteField(term27821, term27821.getClass(), "hour", (byte) 19);
        setByteField(term27821, term27821.getClass(), "minute", (byte) 56);
        setByteField(term27821, term27821.getClass(), "second", (byte) 46);
        setIntField(term27821, term27821.getClass(), "nano", 657110114);
        setField(term27816, term27816.getClass(), "time", term27821);
        setField(term27741, term27741.getClass(), "updatedAt", term27816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term27741, args);
    }

};


