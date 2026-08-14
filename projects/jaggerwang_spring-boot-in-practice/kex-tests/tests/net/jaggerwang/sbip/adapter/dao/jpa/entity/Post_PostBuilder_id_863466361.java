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

public class Post_PostBuilder_id_863466361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24129;
     Object term24190;

    public Post_PostBuilder_id_863466361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24130 = new Long(-7006877527579112761L);
        Long term24132 = new Long(-8699693633047465617L);
        Class<? extends Object> term24193 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term24192 = ((Class) term24193).getDeclaredField((String) "TEXT");
        ((Field) term24192).setAccessible(true);
        Object enum59 = ((Field) term24192).get((Object) null);
        Long term24156 = new Long(-590890905395927244L);
        Long term24158 = new Long(6978548804004471804L);
        Long term24160 = new Long(-8957441653116712448L);
        Long term24162 = new Long(-5761087225966065493L);
        Long term24164 = new Long(493557348274366095L);
        ArrayList term24154 = new ArrayList();
        ((ArrayList) term24154).add(term24156);
        ((ArrayList) term24154).add(term24158);
        ((ArrayList) term24154).add(term24160);
        ((ArrayList) term24154).add(term24162);
        ((ArrayList) term24154).add(term24164);
        Long term24168 = new Long(8699742215739444902L);
        term24129 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        Object term24170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24175 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24185 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24129, term24129.getClass(), "id", term24130);
        setField(term24129, term24129.getClass(), "userId", term24132);
        setField(term24129, term24129.getClass(), "type", enum59);
        setField(term24129, term24129.getClass(), "text", "UBRmXJmfrt");
        setField(term24129, term24129.getClass(), "imageIds", term24154);
        setField(term24129, term24129.getClass(), "videoId", term24168);
        setIntField(term24171, term24171.getClass(), "year", 2017);
        setShortField(term24171, term24171.getClass(), "month", (short) 11);
        setShortField(term24171, term24171.getClass(), "day", (short) 19);
        setField(term24170, term24170.getClass(), "date", term24171);
        setByteField(term24175, term24175.getClass(), "hour", (byte) 2);
        setByteField(term24175, term24175.getClass(), "minute", (byte) 52);
        setByteField(term24175, term24175.getClass(), "second", (byte) 15);
        setIntField(term24175, term24175.getClass(), "nano", 625778933);
        setField(term24170, term24170.getClass(), "time", term24175);
        setField(term24129, term24129.getClass(), "createdAt", term24170);
        setIntField(term24181, term24181.getClass(), "year", 2015);
        setShortField(term24181, term24181.getClass(), "month", (short) 10);
        setShortField(term24181, term24181.getClass(), "day", (short) 3);
        setField(term24180, term24180.getClass(), "date", term24181);
        setByteField(term24185, term24185.getClass(), "hour", (byte) 10);
        setByteField(term24185, term24185.getClass(), "minute", (byte) 45);
        setByteField(term24185, term24185.getClass(), "second", (byte) 18);
        setIntField(term24185, term24185.getClass(), "nano", 333457081);
        setField(term24180, term24180.getClass(), "time", term24185);
        setField(term24129, term24129.getClass(), "updatedAt", term24180);
        term24190 = new Long(8261619652909874476L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term24190;
        callMethod(klass, "id", argTypes, term24129, args);
    }

};


