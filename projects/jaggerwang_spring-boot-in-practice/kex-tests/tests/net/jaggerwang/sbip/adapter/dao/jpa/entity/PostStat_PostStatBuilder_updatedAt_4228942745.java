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

public class PostStat_PostStatBuilder_updatedAt_4228942745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31741;
     Object term31768;

    public PostStat_PostStatBuilder_updatedAt_4228942745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31742 = new Long(-5597498165246748176L);
        Long term31744 = new Long(6174523862926526279L);
        Long term31746 = new Long(4977537501907213732L);
        term31741 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder"));
        Object term31748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31753 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31763 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31741, term31741.getClass(), "id", term31742);
        setField(term31741, term31741.getClass(), "postId", term31744);
        setField(term31741, term31741.getClass(), "likeCount", term31746);
        setIntField(term31749, term31749.getClass(), "year", 2013);
        setShortField(term31749, term31749.getClass(), "month", (short) 8);
        setShortField(term31749, term31749.getClass(), "day", (short) 27);
        setField(term31748, term31748.getClass(), "date", term31749);
        setByteField(term31753, term31753.getClass(), "hour", (byte) 16);
        setByteField(term31753, term31753.getClass(), "minute", (byte) 55);
        setByteField(term31753, term31753.getClass(), "second", (byte) 23);
        setIntField(term31753, term31753.getClass(), "nano", 979193613);
        setField(term31748, term31748.getClass(), "time", term31753);
        setField(term31741, term31741.getClass(), "createdAt", term31748);
        setIntField(term31759, term31759.getClass(), "year", 2015);
        setShortField(term31759, term31759.getClass(), "month", (short) 1);
        setShortField(term31759, term31759.getClass(), "day", (short) 10);
        setField(term31758, term31758.getClass(), "date", term31759);
        setByteField(term31763, term31763.getClass(), "hour", (byte) 2);
        setByteField(term31763, term31763.getClass(), "minute", (byte) 48);
        setByteField(term31763, term31763.getClass(), "second", (byte) 41);
        setIntField(term31763, term31763.getClass(), "nano", 572611941);
        setField(term31758, term31758.getClass(), "time", term31763);
        setField(term31741, term31741.getClass(), "updatedAt", term31758);
        term31768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31773 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31769, term31769.getClass(), "year", 2013);
        setShortField(term31769, term31769.getClass(), "month", (short) 10);
        setShortField(term31769, term31769.getClass(), "day", (short) 23);
        setField(term31768, term31768.getClass(), "date", term31769);
        setByteField(term31773, term31773.getClass(), "hour", (byte) 4);
        setByteField(term31773, term31773.getClass(), "minute", (byte) 33);
        setByteField(term31773, term31773.getClass(), "second", (byte) 51);
        setIntField(term31773, term31773.getClass(), "nano", 626320293);
        setField(term31768, term31768.getClass(), "time", term31773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term31768;
        callMethod(klass, "updatedAt", argTypes, term31741, args);
    }

};


