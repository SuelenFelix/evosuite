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
import java.util.ArrayList;

public class PostBO_PostBOBuilder_type_9330122753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21914;
     Object enum62;

    public PostBO_PostBOBuilder_type_9330122753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21915 = new Long(-7370364068296402536L);
        Long term21917 = new Long(-1084263688306617320L);
        Class<? extends Object> term21985 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term21984 = ((Class) term21985).getDeclaredField((String) "IMAGE");
        ((Field) term21984).setAccessible(true);
        Object enum61 = ((Field) term21984).get((Object) null);
        Long term21942 = new Long(1193381106528373019L);
        Long term21944 = new Long(-1365372122034008688L);
        Long term21946 = new Long(-6108006981756732593L);
        Long term21948 = new Long(-3565554762799701668L);
        Long term21950 = new Long(-6837989212848250735L);
        ArrayList term21940 = new ArrayList();
        ((ArrayList) term21940).add(term21942);
        ((ArrayList) term21940).add(term21944);
        ((ArrayList) term21940).add(term21946);
        ((ArrayList) term21940).add(term21948);
        ((ArrayList) term21940).add(term21950);
        Long term21954 = new Long(-4231979631084175364L);
        term21914 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        Object term21956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21961 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21971 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21914, term21914.getClass(), "id", term21915);
        setField(term21914, term21914.getClass(), "userId", term21917);
        setField(term21914, term21914.getClass(), "type", enum61);
        setField(term21914, term21914.getClass(), "text", "ZkMALXpEAZ");
        setField(term21914, term21914.getClass(), "imageIds", term21940);
        setField(term21914, term21914.getClass(), "videoId", term21954);
        setIntField(term21957, term21957.getClass(), "year", 2028);
        setShortField(term21957, term21957.getClass(), "month", (short) 2);
        setShortField(term21957, term21957.getClass(), "day", (short) 8);
        setField(term21956, term21956.getClass(), "date", term21957);
        setByteField(term21961, term21961.getClass(), "hour", (byte) 16);
        setByteField(term21961, term21961.getClass(), "minute", (byte) 14);
        setByteField(term21961, term21961.getClass(), "second", (byte) 31);
        setIntField(term21961, term21961.getClass(), "nano", 824823232);
        setField(term21956, term21956.getClass(), "time", term21961);
        setField(term21914, term21914.getClass(), "createdAt", term21956);
        setIntField(term21967, term21967.getClass(), "year", 2018);
        setShortField(term21967, term21967.getClass(), "month", (short) 9);
        setShortField(term21967, term21967.getClass(), "day", (short) 8);
        setField(term21966, term21966.getClass(), "date", term21967);
        setByteField(term21971, term21971.getClass(), "hour", (byte) 14);
        setByteField(term21971, term21971.getClass(), "minute", (byte) 21);
        setByteField(term21971, term21971.getClass(), "second", (byte) 23);
        setIntField(term21971, term21971.getClass(), "nano", 316911941);
        setField(term21966, term21966.getClass(), "time", term21971);
        setField(term21914, term21914.getClass(), "updatedAt", term21966);
        Class<? extends Object> term22207 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term22206 = ((Class) term22207).getDeclaredField((String) "TEXT");
        ((Field) term22206).setAccessible(true);
        enum62 = ((Field) term22206).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostBO$Type");
        Object[] args = new Object[1];
        args[0] = enum62;
        callMethod(klass, "type", argTypes, term21914, args);
    }

};


