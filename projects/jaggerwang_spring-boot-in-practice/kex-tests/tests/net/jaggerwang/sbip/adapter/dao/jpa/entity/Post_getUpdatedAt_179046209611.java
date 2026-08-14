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

public class Post_getUpdatedAt_179046209611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7336;

    public Post_getUpdatedAt_179046209611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7337 = new Long(-1592696983130738594L);
        Long term7339 = new Long(6902365338255307910L);
        Class<? extends Object> term7401 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term7400 = ((Class) term7401).getDeclaredField((String) "IMAGE");
        ((Field) term7400).setAccessible(true);
        Object enum20 = ((Field) term7400).get((Object) null);
        Long term7364 = new Long(-8019730974733786399L);
        Long term7366 = new Long(394960377236392159L);
        Long term7368 = new Long(-2955854401507097864L);
        Long term7370 = new Long(329213208496958131L);
        Long term7372 = new Long(8107921244631636572L);
        Long term7374 = new Long(-7904053112604879960L);
        ArrayList term7362 = new ArrayList();
        ((ArrayList) term7362).add(term7364);
        ((ArrayList) term7362).add(term7366);
        ((ArrayList) term7362).add(term7368);
        ((ArrayList) term7362).add(term7370);
        ((ArrayList) term7362).add(term7372);
        ((ArrayList) term7362).add(term7374);
        Long term7378 = new Long(-6602460430714339690L);
        term7336 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term7380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7385 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7390 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7391 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7395 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7336, term7336.getClass(), "id", term7337);
        setField(term7336, term7336.getClass(), "userId", term7339);
        setField(term7336, term7336.getClass(), "type", enum20);
        setField(term7336, term7336.getClass(), "text", "onpbIeEKoi");
        setField(term7336, term7336.getClass(), "imageIds", term7362);
        setField(term7336, term7336.getClass(), "videoId", term7378);
        setIntField(term7381, term7381.getClass(), "year", 2013);
        setShortField(term7381, term7381.getClass(), "month", (short) 11);
        setShortField(term7381, term7381.getClass(), "day", (short) 19);
        setField(term7380, term7380.getClass(), "date", term7381);
        setByteField(term7385, term7385.getClass(), "hour", (byte) 6);
        setByteField(term7385, term7385.getClass(), "minute", (byte) 45);
        setByteField(term7385, term7385.getClass(), "second", (byte) 10);
        setIntField(term7385, term7385.getClass(), "nano", 288981190);
        setField(term7380, term7380.getClass(), "time", term7385);
        setField(term7336, term7336.getClass(), "createdAt", term7380);
        setIntField(term7391, term7391.getClass(), "year", 2025);
        setShortField(term7391, term7391.getClass(), "month", (short) 9);
        setShortField(term7391, term7391.getClass(), "day", (short) 18);
        setField(term7390, term7390.getClass(), "date", term7391);
        setByteField(term7395, term7395.getClass(), "hour", (byte) 16);
        setByteField(term7395, term7395.getClass(), "minute", (byte) 1);
        setByteField(term7395, term7395.getClass(), "second", (byte) 23);
        setIntField(term7395, term7395.getClass(), "nano", 178285726);
        setField(term7390, term7390.getClass(), "time", term7395);
        setField(term7336, term7336.getClass(), "updatedAt", term7390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term7336, args);
    }

};


