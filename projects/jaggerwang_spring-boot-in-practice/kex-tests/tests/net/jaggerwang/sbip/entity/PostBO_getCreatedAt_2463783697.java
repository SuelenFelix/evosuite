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

public class PostBO_getCreatedAt_2463783697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14996;

    public PostBO_getCreatedAt_2463783697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14997 = new Long(-2951854704066477061L);
        Long term14999 = new Long(174253963298276221L);
        Class<? extends Object> term15061 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term15060 = ((Class) term15061).getDeclaredField((String) "VIDEO");
        ((Field) term15060).setAccessible(true);
        Object enum39 = ((Field) term15060).get((Object) null);
        Long term15024 = new Long(3713624957161771816L);
        Long term15026 = new Long(6130232388739280211L);
        Long term15028 = new Long(3423965054378869855L);
        Long term15030 = new Long(-593735869267672817L);
        Long term15032 = new Long(6041374912351843923L);
        Long term15034 = new Long(2535970782317488741L);
        ArrayList term15022 = new ArrayList();
        ((ArrayList) term15022).add(term15024);
        ((ArrayList) term15022).add(term15026);
        ((ArrayList) term15022).add(term15028);
        ((ArrayList) term15022).add(term15030);
        ((ArrayList) term15022).add(term15032);
        ((ArrayList) term15022).add(term15034);
        Long term15038 = new Long(-5258945362776941718L);
        term14996 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term15040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15055 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14996, term14996.getClass(), "id", term14997);
        setField(term14996, term14996.getClass(), "userId", term14999);
        setField(term14996, term14996.getClass(), "type", enum39);
        setField(term14996, term14996.getClass(), "text", "DbiCVtPPCT");
        setField(term14996, term14996.getClass(), "imageIds", term15022);
        setField(term14996, term14996.getClass(), "videoId", term15038);
        setIntField(term15041, term15041.getClass(), "year", 2023);
        setShortField(term15041, term15041.getClass(), "month", (short) 5);
        setShortField(term15041, term15041.getClass(), "day", (short) 31);
        setField(term15040, term15040.getClass(), "date", term15041);
        setByteField(term15045, term15045.getClass(), "hour", (byte) 13);
        setByteField(term15045, term15045.getClass(), "minute", (byte) 29);
        setByteField(term15045, term15045.getClass(), "second", (byte) 29);
        setIntField(term15045, term15045.getClass(), "nano", 621312201);
        setField(term15040, term15040.getClass(), "time", term15045);
        setField(term14996, term14996.getClass(), "createdAt", term15040);
        setIntField(term15051, term15051.getClass(), "year", 2020);
        setShortField(term15051, term15051.getClass(), "month", (short) 10);
        setShortField(term15051, term15051.getClass(), "day", (short) 26);
        setField(term15050, term15050.getClass(), "date", term15051);
        setByteField(term15055, term15055.getClass(), "hour", (byte) 10);
        setByteField(term15055, term15055.getClass(), "minute", (byte) 50);
        setByteField(term15055, term15055.getClass(), "second", (byte) 16);
        setIntField(term15055, term15055.getClass(), "nano", 613429);
        setField(term15050, term15050.getClass(), "time", term15055);
        setField(term14996, term14996.getClass(), "updatedAt", term15050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term14996, args);
    }

};


