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
import java.util.LinkedList;

public class Post_PostBuilder_imageIds_11822700805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25498;
     Object term25564;

    public Post_PostBuilder_imageIds_11822700805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25499 = new Long(4006388896509492239L);
        Long term25501 = new Long(-6314099457945626605L);
        Class<? extends Object> term25580 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term25579 = ((Class) term25580).getDeclaredField((String) "VIDEO");
        ((Field) term25579).setAccessible(true);
        Object enum64 = ((Field) term25579).get((Object) null);
        Long term25526 = new Long(-8697239524885136781L);
        Long term25528 = new Long(6465539339431559532L);
        Long term25530 = new Long(-5304831679802174866L);
        Long term25532 = new Long(1909175111101717943L);
        Long term25534 = new Long(8499930868919012909L);
        Long term25536 = new Long(6252795312796363233L);
        Long term25538 = new Long(3968143267572761057L);
        ArrayList term25524 = new ArrayList();
        ((ArrayList) term25524).add(term25526);
        ((ArrayList) term25524).add(term25528);
        ((ArrayList) term25524).add(term25530);
        ((ArrayList) term25524).add(term25532);
        ((ArrayList) term25524).add(term25534);
        ((ArrayList) term25524).add(term25536);
        ((ArrayList) term25524).add(term25538);
        Long term25542 = new Long(2712394591642260550L);
        term25498 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        Object term25544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25549 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25554 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25555 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25559 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25498, term25498.getClass(), "id", term25499);
        setField(term25498, term25498.getClass(), "userId", term25501);
        setField(term25498, term25498.getClass(), "type", enum64);
        setField(term25498, term25498.getClass(), "text", "ypEdrstygY");
        setField(term25498, term25498.getClass(), "imageIds", term25524);
        setField(term25498, term25498.getClass(), "videoId", term25542);
        setIntField(term25545, term25545.getClass(), "year", 2024);
        setShortField(term25545, term25545.getClass(), "month", (short) 11);
        setShortField(term25545, term25545.getClass(), "day", (short) 16);
        setField(term25544, term25544.getClass(), "date", term25545);
        setByteField(term25549, term25549.getClass(), "hour", (byte) 23);
        setByteField(term25549, term25549.getClass(), "minute", (byte) 40);
        setByteField(term25549, term25549.getClass(), "second", (byte) 40);
        setIntField(term25549, term25549.getClass(), "nano", 810133212);
        setField(term25544, term25544.getClass(), "time", term25549);
        setField(term25498, term25498.getClass(), "createdAt", term25544);
        setIntField(term25555, term25555.getClass(), "year", 2018);
        setShortField(term25555, term25555.getClass(), "month", (short) 5);
        setShortField(term25555, term25555.getClass(), "day", (short) 15);
        setField(term25554, term25554.getClass(), "date", term25555);
        setByteField(term25559, term25559.getClass(), "hour", (byte) 17);
        setByteField(term25559, term25559.getClass(), "minute", (byte) 19);
        setByteField(term25559, term25559.getClass(), "second", (byte) 28);
        setIntField(term25559, term25559.getClass(), "nano", 153049369);
        setField(term25554, term25554.getClass(), "time", term25559);
        setField(term25498, term25498.getClass(), "updatedAt", term25554);
        Long term25567 = new Long(-1211273460223868511L);
        Long term25570 = new Long(-8172564209423941839L);
        Long term25573 = new Long(-4561371668792438386L);
        Long term25576 = new Long(7065003857377879971L);
        term25564 = new LinkedList();
        ((LinkedList) term25564).add(term25567);
        ((LinkedList) term25564).add(term25570);
        ((LinkedList) term25564).add(term25573);
        ((LinkedList) term25564).add(term25576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term25564;
        callMethod(klass, "imageIds", argTypes, term25498, args);
    }

};


