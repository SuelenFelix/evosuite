package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;

public class Board_init_186620108527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21481;
     Object term21507;
     Object term21509;
     Object term21570;
     Object term21630;

    public Board_init_186620108527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21481 = new Integer(-1121709274);
        term21507 = new Integer(-532304223);
        Class<? extends Object> term21691 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term21690 = ((Class) term21691).getDeclaredField((String) "USER");
        ((Field) term21690).setAccessible(true);
        Object enum51 = ((Field) term21690).get((Object) null);
        term21509 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term21567 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term21509, term21509.getClass(), "id", 666218293);
        setField(term21509, term21509.getClass(), "username", "IbOvZLmtSE");
        setField(term21509, term21509.getClass(), "password", "AOsIglRFcp");
        setField(term21509, term21509.getClass(), "email", "bdONLhBZoA");
        setField(term21509, term21509.getClass(), "role", enum51);
        setField(term21509, term21509.getClass(), "oauth", "qPVeRcolUe");
        setIntField(term21567, term21567.getClass(), "nanos", 858000000);
        setLongField(term21567, term21567.getClass(), "fastTime", 1418894925000L);
        setField(term21567, term21567.getClass(), "cdate", null);
        setField(term21509, term21509.getClass(), "createDate", term21567);
        ArrayList term21594 = new ArrayList();
        ((ArrayList) term21594).add((Object)null);
        ((ArrayList) term21594).add((Object)null);
        ((ArrayList) term21594).add((Object)null);
        ((ArrayList) term21594).add((Object)null);
        ((ArrayList) term21594).add((Object)null);
        Class<? extends Object> term21865 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term21864 = ((Class) term21865).getDeclaredField((String) "USER");
        ((Field) term21864).setAccessible(true);
        Object enum52 = ((Field) term21864).get((Object) null);
        Object term21573 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term21587 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term21592 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term21597 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21598 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term21606 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term21609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21614 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term21573, term21573.getClass(), "id", 1737876343);
        setField(term21573, term21573.getClass(), "content", "AscZyfQFkU");
        setIntField(term21587, term21587.getClass(), "id", -897937940);
        setField(term21587, term21587.getClass(), "title", "");
        setField(term21587, term21587.getClass(), "content", "");
        setIntField(term21587, term21587.getClass(), "count", 1523261232);
        setIntField(term21592, term21592.getClass(), "id", -428988337);
        setField(term21592, term21592.getClass(), "username", null);
        setField(term21592, term21592.getClass(), "password", null);
        setField(term21592, term21592.getClass(), "email", null);
        setField(term21592, term21592.getClass(), "role", enum51);
        setField(term21592, term21592.getClass(), "oauth", null);
        setField(term21592, term21592.getClass(), "createDate", null);
        setField(term21587, term21587.getClass(), "user", term21592);
        setField(term21587, term21587.getClass(), "replys", term21594);
        setField(term21597, term21597.getClass(), "date", null);
        setField(term21597, term21597.getClass(), "time", null);
        setField(term21587, term21587.getClass(), "createDate", term21597);
        setField(term21573, term21573.getClass(), "board", term21587);
        setIntField(term21598, term21598.getClass(), "id", 237134844);
        setField(term21598, term21598.getClass(), "username", "");
        setField(term21598, term21598.getClass(), "password", "");
        setField(term21598, term21598.getClass(), "email", "");
        setField(term21598, term21598.getClass(), "role", enum52);
        setField(term21598, term21598.getClass(), "oauth", "");
        setIntField(term21606, term21606.getClass(), "nanos", 443000000);
        setLongField(term21606, term21606.getClass(), "fastTime", 1293726798000L);
        setField(term21606, term21606.getClass(), "cdate", null);
        setField(term21598, term21598.getClass(), "createDate", term21606);
        setField(term21573, term21573.getClass(), "user", term21598);
        setIntField(term21610, term21610.getClass(), "year", 2019);
        setShortField(term21610, term21610.getClass(), "month", (short) 11);
        setShortField(term21610, term21610.getClass(), "day", (short) 22);
        setField(term21609, term21609.getClass(), "date", term21610);
        setByteField(term21614, term21614.getClass(), "hour", (byte) 12);
        setByteField(term21614, term21614.getClass(), "minute", (byte) 32);
        setByteField(term21614, term21614.getClass(), "second", (byte) 48);
        setIntField(term21614, term21614.getClass(), "nano", 850810582);
        setField(term21609, term21609.getClass(), "time", term21614);
        setField(term21573, term21573.getClass(), "createDate", term21609);
        Object term21620 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term21623 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term21626 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term21628 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term21620, term21620.getClass(), "id", 2076413861);
        setField(term21620, term21620.getClass(), "content", "");
        setIntField(term21623, term21623.getClass(), "id", 66817373);
        setField(term21623, term21623.getClass(), "title", null);
        setField(term21623, term21623.getClass(), "content", null);
        setIntField(term21623, term21623.getClass(), "count", 1459628013);
        setField(term21623, term21623.getClass(), "user", null);
        setField(term21623, term21623.getClass(), "replys", null);
        setField(term21623, term21623.getClass(), "createDate", null);
        setField(term21620, term21620.getClass(), "board", term21623);
        setIntField(term21626, term21626.getClass(), "id", -201010601);
        setField(term21626, term21626.getClass(), "username", null);
        setField(term21626, term21626.getClass(), "password", null);
        setField(term21626, term21626.getClass(), "email", null);
        setField(term21626, term21626.getClass(), "role", enum51);
        setField(term21626, term21626.getClass(), "oauth", null);
        setField(term21626, term21626.getClass(), "createDate", null);
        setField(term21620, term21620.getClass(), "user", term21626);
        setField(term21628, term21628.getClass(), "date", null);
        setField(term21628, term21628.getClass(), "time", null);
        setField(term21620, term21620.getClass(), "createDate", term21628);
        term21570 = new LinkedList();
        ((LinkedList) term21570).add(term21573);
        ((LinkedList) term21570).add(term21620);
        term21630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21635 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term21631, term21631.getClass(), "year", 2014);
        setShortField(term21631, term21631.getClass(), "month", (short) 5);
        setShortField(term21631, term21631.getClass(), "day", (short) 30);
        setField(term21630, term21630.getClass(), "date", term21631);
        setByteField(term21635, term21635.getClass(), "hour", (byte) 10);
        setByteField(term21635, term21635.getClass(), "minute", (byte) 34);
        setByteField(term21635, term21635.getClass(), "second", (byte) 17);
        setIntField(term21635, term21635.getClass(), "nano", 917654429);
        setField(term21630, term21630.getClass(), "time", term21635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("com.cos.blog.model.User");
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[7];
        args[0] = term21481;
        args[1] = "pvjlKAnxzJ";
        args[2] = "ejxUBDQQKB";
        args[3] = term21507;
        args[4] = term21509;
        args[5] = term21570;
        args[6] = term21630;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


