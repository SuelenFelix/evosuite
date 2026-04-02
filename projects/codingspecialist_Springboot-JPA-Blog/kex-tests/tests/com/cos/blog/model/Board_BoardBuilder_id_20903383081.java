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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Integer;

public class Board_BoardBuilder_id_20903383081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30321;
     Object term30441;

    public Board_BoardBuilder_id_20903383081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30494 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term30493 = ((Class) term30494).getDeclaredField((String) "USER");
        ((Field) term30493).setAccessible(true);
        Object enum72 = ((Field) term30493).get((Object) null);
        Object term30411 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term30414 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term30417 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term30419 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term30411, term30411.getClass(), "id", -532304223);
        setField(term30411, term30411.getClass(), "content", "");
        setIntField(term30414, term30414.getClass(), "id", 666218293);
        setField(term30414, term30414.getClass(), "title", null);
        setField(term30414, term30414.getClass(), "content", null);
        setIntField(term30414, term30414.getClass(), "count", 1737876343);
        setField(term30414, term30414.getClass(), "user", null);
        setField(term30414, term30414.getClass(), "replys", null);
        setField(term30414, term30414.getClass(), "createDate", null);
        setField(term30411, term30411.getClass(), "board", term30414);
        setIntField(term30417, term30417.getClass(), "id", 1319026002);
        setField(term30417, term30417.getClass(), "username", null);
        setField(term30417, term30417.getClass(), "password", null);
        setField(term30417, term30417.getClass(), "email", null);
        setField(term30417, term30417.getClass(), "role", enum72);
        setField(term30417, term30417.getClass(), "oauth", null);
        setField(term30417, term30417.getClass(), "createDate", null);
        setField(term30411, term30411.getClass(), "user", term30417);
        setField(term30419, term30419.getClass(), "date", null);
        setField(term30419, term30419.getClass(), "time", null);
        setField(term30411, term30411.getClass(), "createDate", term30419);
        Object term30420 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term30423 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term30426 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term30428 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term30420, term30420.getClass(), "id", -1368173231);
        setField(term30420, term30420.getClass(), "content", "");
        setIntField(term30423, term30423.getClass(), "id", 0);
        setField(term30423, term30423.getClass(), "title", null);
        setField(term30423, term30423.getClass(), "content", null);
        setIntField(term30423, term30423.getClass(), "count", 0);
        setField(term30423, term30423.getClass(), "user", null);
        setField(term30423, term30423.getClass(), "replys", null);
        setField(term30423, term30423.getClass(), "createDate", null);
        setField(term30420, term30420.getClass(), "board", term30423);
        setIntField(term30426, term30426.getClass(), "id", 0);
        setField(term30426, term30426.getClass(), "username", null);
        setField(term30426, term30426.getClass(), "password", null);
        setField(term30426, term30426.getClass(), "email", null);
        setField(term30426, term30426.getClass(), "role", null);
        setField(term30426, term30426.getClass(), "oauth", null);
        setField(term30426, term30426.getClass(), "createDate", null);
        setField(term30420, term30420.getClass(), "user", term30426);
        setField(term30428, term30428.getClass(), "date", null);
        setField(term30428, term30428.getClass(), "time", null);
        setField(term30420, term30420.getClass(), "createDate", term30428);
        ArrayList term30409 = new ArrayList();
        ((ArrayList) term30409).add(term30411);
        ((ArrayList) term30409).add(term30420);
        term30321 = newInstance(Class.forName("com.cos.blog.model.Board$BoardBuilder"));
        Object term30348 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term30406 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term30431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30436 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30321, term30321.getClass(), "id", 2044137055);
        setField(term30321, term30321.getClass(), "title", "vNvzjymLXH");
        setField(term30321, term30321.getClass(), "content", "TCadyfXzAm");
        setIntField(term30321, term30321.getClass(), "count", -1452324619);
        setIntField(term30348, term30348.getClass(), "id", -1121709274);
        setField(term30348, term30348.getClass(), "username", "rSSEpZFUMc");
        setField(term30348, term30348.getClass(), "password", "DJHwHjvNlc");
        setField(term30348, term30348.getClass(), "email", "ZSBzHqaLtQ");
        setField(term30348, term30348.getClass(), "role", enum72);
        setField(term30348, term30348.getClass(), "oauth", "DCRuiaVwNa");
        setIntField(term30406, term30406.getClass(), "nanos", 684000000);
        setLongField(term30406, term30406.getClass(), "fastTime", 1654988832000L);
        setField(term30406, term30406.getClass(), "cdate", null);
        setField(term30348, term30348.getClass(), "createDate", term30406);
        setField(term30321, term30321.getClass(), "user", term30348);
        setField(term30321, term30321.getClass(), "replys", term30409);
        setIntField(term30432, term30432.getClass(), "year", 2024);
        setShortField(term30432, term30432.getClass(), "month", (short) 3);
        setShortField(term30432, term30432.getClass(), "day", (short) 27);
        setField(term30431, term30431.getClass(), "date", term30432);
        setByteField(term30436, term30436.getClass(), "hour", (byte) 23);
        setByteField(term30436, term30436.getClass(), "minute", (byte) 48);
        setByteField(term30436, term30436.getClass(), "second", (byte) 45);
        setIntField(term30436, term30436.getClass(), "nano", 181365728);
        setField(term30431, term30431.getClass(), "time", term30436);
        setField(term30321, term30321.getClass(), "createDate", term30431);
        term30441 = new Integer(892205855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board$BoardBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30441;
        callMethod(klass, "id", argTypes, term30321, args);
    }

};


