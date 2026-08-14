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

public class PostStatBO_PostStatBOBuilder_id_19735803721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21108;
     Object term21136;

    public PostStatBO_PostStatBOBuilder_id_19735803721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21109 = new Long(4811527754205378980L);
        Long term21111 = new Long(9174730812791817537L);
        Long term21114 = new Long(8024477479047145752L);
        term21108 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder"));
        Object term21116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21121 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21131 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21108, term21108.getClass(), "id", term21109);
        setField(term21108, term21108.getClass(), "postId", term21111);
        setBooleanField(term21108, term21108.getClass(), "likeCount$set", false);
        setField(term21108, term21108.getClass(), "likeCount$value", term21114);
        setIntField(term21117, term21117.getClass(), "year", 2025);
        setShortField(term21117, term21117.getClass(), "month", (short) 11);
        setShortField(term21117, term21117.getClass(), "day", (short) 16);
        setField(term21116, term21116.getClass(), "date", term21117);
        setByteField(term21121, term21121.getClass(), "hour", (byte) 12);
        setByteField(term21121, term21121.getClass(), "minute", (byte) 27);
        setByteField(term21121, term21121.getClass(), "second", (byte) 36);
        setIntField(term21121, term21121.getClass(), "nano", 699989217);
        setField(term21116, term21116.getClass(), "time", term21121);
        setField(term21108, term21108.getClass(), "createdAt", term21116);
        setIntField(term21127, term21127.getClass(), "year", 2018);
        setShortField(term21127, term21127.getClass(), "month", (short) 10);
        setShortField(term21127, term21127.getClass(), "day", (short) 3);
        setField(term21126, term21126.getClass(), "date", term21127);
        setByteField(term21131, term21131.getClass(), "hour", (byte) 12);
        setByteField(term21131, term21131.getClass(), "minute", (byte) 49);
        setByteField(term21131, term21131.getClass(), "second", (byte) 38);
        setIntField(term21131, term21131.getClass(), "nano", 549840711);
        setField(term21126, term21126.getClass(), "time", term21131);
        setField(term21108, term21108.getClass(), "updatedAt", term21126);
        term21136 = new Long(7006402814669334483L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term21136;
        callMethod(klass, "id", argTypes, term21108, args);
    }

};


