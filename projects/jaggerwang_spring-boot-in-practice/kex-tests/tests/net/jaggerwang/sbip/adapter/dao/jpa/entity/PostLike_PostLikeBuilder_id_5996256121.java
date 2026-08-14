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

public class PostLike_PostLikeBuilder_id_5996256121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22806;
     Object term22833;

    public PostLike_PostLikeBuilder_id_5996256121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22807 = new Long(4892304277320345810L);
        Long term22809 = new Long(-3271370917942710167L);
        Long term22811 = new Long(-8928717808154338062L);
        term22806 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder"));
        Object term22813 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22814 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22818 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22828 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22806, term22806.getClass(), "id", term22807);
        setField(term22806, term22806.getClass(), "userId", term22809);
        setField(term22806, term22806.getClass(), "postId", term22811);
        setIntField(term22814, term22814.getClass(), "year", 2027);
        setShortField(term22814, term22814.getClass(), "month", (short) 5);
        setShortField(term22814, term22814.getClass(), "day", (short) 22);
        setField(term22813, term22813.getClass(), "date", term22814);
        setByteField(term22818, term22818.getClass(), "hour", (byte) 6);
        setByteField(term22818, term22818.getClass(), "minute", (byte) 8);
        setByteField(term22818, term22818.getClass(), "second", (byte) 27);
        setIntField(term22818, term22818.getClass(), "nano", 955380448);
        setField(term22813, term22813.getClass(), "time", term22818);
        setField(term22806, term22806.getClass(), "createdAt", term22813);
        setIntField(term22824, term22824.getClass(), "year", 2029);
        setShortField(term22824, term22824.getClass(), "month", (short) 1);
        setShortField(term22824, term22824.getClass(), "day", (short) 12);
        setField(term22823, term22823.getClass(), "date", term22824);
        setByteField(term22828, term22828.getClass(), "hour", (byte) 15);
        setByteField(term22828, term22828.getClass(), "minute", (byte) 27);
        setByteField(term22828, term22828.getClass(), "second", (byte) 0);
        setIntField(term22828, term22828.getClass(), "nano", 592641552);
        setField(term22823, term22823.getClass(), "time", term22828);
        setField(term22806, term22806.getClass(), "updatedAt", term22823);
        term22833 = new Long(4628458998884457238L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term22833;
        callMethod(klass, "id", argTypes, term22806, args);
    }

};


