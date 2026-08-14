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

public class Post_PostBuilder_createdAt_7914754357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26085;
     Object term26150;

    public Post_PostBuilder_createdAt_7914754357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26086 = new Long(-1283563319051310751L);
        Long term26088 = new Long(-1413653349314156044L);
        Class<? extends Object> term26161 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term26160 = ((Class) term26161).getDeclaredField((String) "TEXT");
        ((Field) term26160).setAccessible(true);
        Object enum66 = ((Field) term26160).get((Object) null);
        Long term26112 = new Long(742593745847006219L);
        Long term26114 = new Long(6801904611028883308L);
        Long term26116 = new Long(-7717027128782374599L);
        Long term26118 = new Long(4872921045907555824L);
        Long term26120 = new Long(6921855906793748590L);
        Long term26122 = new Long(7450182989722198450L);
        Long term26124 = new Long(675601558105654203L);
        ArrayList term26110 = new ArrayList();
        ((ArrayList) term26110).add(term26112);
        ((ArrayList) term26110).add(term26114);
        ((ArrayList) term26110).add(term26116);
        ((ArrayList) term26110).add(term26118);
        ((ArrayList) term26110).add(term26120);
        ((ArrayList) term26110).add(term26122);
        ((ArrayList) term26110).add(term26124);
        Long term26128 = new Long(-6481933642917183045L);
        term26085 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        Object term26130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26135 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26145 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26085, term26085.getClass(), "id", term26086);
        setField(term26085, term26085.getClass(), "userId", term26088);
        setField(term26085, term26085.getClass(), "type", enum66);
        setField(term26085, term26085.getClass(), "text", "ZKMLioamsY");
        setField(term26085, term26085.getClass(), "imageIds", term26110);
        setField(term26085, term26085.getClass(), "videoId", term26128);
        setIntField(term26131, term26131.getClass(), "year", 2025);
        setShortField(term26131, term26131.getClass(), "month", (short) 2);
        setShortField(term26131, term26131.getClass(), "day", (short) 24);
        setField(term26130, term26130.getClass(), "date", term26131);
        setByteField(term26135, term26135.getClass(), "hour", (byte) 10);
        setByteField(term26135, term26135.getClass(), "minute", (byte) 56);
        setByteField(term26135, term26135.getClass(), "second", (byte) 29);
        setIntField(term26135, term26135.getClass(), "nano", 207724630);
        setField(term26130, term26130.getClass(), "time", term26135);
        setField(term26085, term26085.getClass(), "createdAt", term26130);
        setIntField(term26141, term26141.getClass(), "year", 2027);
        setShortField(term26141, term26141.getClass(), "month", (short) 8);
        setShortField(term26141, term26141.getClass(), "day", (short) 16);
        setField(term26140, term26140.getClass(), "date", term26141);
        setByteField(term26145, term26145.getClass(), "hour", (byte) 1);
        setByteField(term26145, term26145.getClass(), "minute", (byte) 50);
        setByteField(term26145, term26145.getClass(), "second", (byte) 52);
        setIntField(term26145, term26145.getClass(), "nano", 161814778);
        setField(term26140, term26140.getClass(), "time", term26145);
        setField(term26085, term26085.getClass(), "updatedAt", term26140);
        term26150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26155 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term26151, term26151.getClass(), "year", 2018);
        setShortField(term26151, term26151.getClass(), "month", (short) 2);
        setShortField(term26151, term26151.getClass(), "day", (short) 16);
        setField(term26150, term26150.getClass(), "date", term26151);
        setByteField(term26155, term26155.getClass(), "hour", (byte) 16);
        setByteField(term26155, term26155.getClass(), "minute", (byte) 32);
        setByteField(term26155, term26155.getClass(), "second", (byte) 46);
        setIntField(term26155, term26155.getClass(), "nano", 932915298);
        setField(term26150, term26150.getClass(), "time", term26155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term26150;
        callMethod(klass, "createdAt", argTypes, term26085, args);
    }

};


