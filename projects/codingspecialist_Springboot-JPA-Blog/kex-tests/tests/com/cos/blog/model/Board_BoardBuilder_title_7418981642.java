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

public class Board_BoardBuilder_title_7418981642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30657;

    public Board_BoardBuilder_title_7418981642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30840 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term30839 = ((Class) term30840).getDeclaredField((String) "USER");
        ((Field) term30839).setAccessible(true);
        Object enum73 = ((Field) term30839).get((Object) null);
        Object term30747 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term30750 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term30753 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term30755 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term30747, term30747.getClass(), "id", 2076413861);
        setField(term30747, term30747.getClass(), "content", "");
        setIntField(term30750, term30750.getClass(), "id", 66817373);
        setField(term30750, term30750.getClass(), "title", null);
        setField(term30750, term30750.getClass(), "content", null);
        setIntField(term30750, term30750.getClass(), "count", 1459628013);
        setField(term30750, term30750.getClass(), "user", null);
        setField(term30750, term30750.getClass(), "replys", null);
        setField(term30750, term30750.getClass(), "createDate", null);
        setField(term30747, term30747.getClass(), "board", term30750);
        setIntField(term30753, term30753.getClass(), "id", 0);
        setField(term30753, term30753.getClass(), "username", null);
        setField(term30753, term30753.getClass(), "password", null);
        setField(term30753, term30753.getClass(), "email", null);
        setField(term30753, term30753.getClass(), "role", null);
        setField(term30753, term30753.getClass(), "oauth", null);
        setField(term30753, term30753.getClass(), "createDate", null);
        setField(term30747, term30747.getClass(), "user", term30753);
        setField(term30755, term30755.getClass(), "date", null);
        setField(term30755, term30755.getClass(), "time", null);
        setField(term30747, term30747.getClass(), "createDate", term30755);
        Object term30756 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term30759 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term30762 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term30764 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term30756, term30756.getClass(), "id", -1473876284);
        setField(term30756, term30756.getClass(), "content", "");
        setIntField(term30759, term30759.getClass(), "id", -1389314671);
        setField(term30759, term30759.getClass(), "title", null);
        setField(term30759, term30759.getClass(), "content", null);
        setIntField(term30759, term30759.getClass(), "count", -499699841);
        setField(term30759, term30759.getClass(), "user", null);
        setField(term30759, term30759.getClass(), "replys", null);
        setField(term30759, term30759.getClass(), "createDate", null);
        setField(term30756, term30756.getClass(), "board", term30759);
        setIntField(term30762, term30762.getClass(), "id", -1641507499);
        setField(term30762, term30762.getClass(), "username", null);
        setField(term30762, term30762.getClass(), "password", null);
        setField(term30762, term30762.getClass(), "email", null);
        setField(term30762, term30762.getClass(), "role", enum73);
        setField(term30762, term30762.getClass(), "oauth", null);
        setField(term30762, term30762.getClass(), "createDate", null);
        setField(term30756, term30756.getClass(), "user", term30762);
        setField(term30764, term30764.getClass(), "date", null);
        setField(term30764, term30764.getClass(), "time", null);
        setField(term30756, term30756.getClass(), "createDate", term30764);
        ArrayList term30745 = new ArrayList();
        ((ArrayList) term30745).add(term30747);
        ((ArrayList) term30745).add(term30756);
        term30657 = newInstance(Class.forName("com.cos.blog.model.Board$BoardBuilder"));
        Object term30684 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term30742 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term30767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30772 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30657, term30657.getClass(), "id", 1955560079);
        setField(term30657, term30657.getClass(), "title", "GUXdlpmVNQ");
        setField(term30657, term30657.getClass(), "content", "QxSwOpnogl");
        setIntField(term30657, term30657.getClass(), "count", -1330529019);
        setIntField(term30684, term30684.getClass(), "id", 237134844);
        setField(term30684, term30684.getClass(), "username", "wXeTrDfRqa");
        setField(term30684, term30684.getClass(), "password", "QsFsmwqvwM");
        setField(term30684, term30684.getClass(), "email", "pSDSdAjceB");
        setField(term30684, term30684.getClass(), "role", enum73);
        setField(term30684, term30684.getClass(), "oauth", "TGMaCYOqml");
        setIntField(term30742, term30742.getClass(), "nanos", 390000000);
        setLongField(term30742, term30742.getClass(), "fastTime", 1792458828000L);
        setField(term30742, term30742.getClass(), "cdate", null);
        setField(term30684, term30684.getClass(), "createDate", term30742);
        setField(term30657, term30657.getClass(), "user", term30684);
        setField(term30657, term30657.getClass(), "replys", term30745);
        setIntField(term30768, term30768.getClass(), "year", 2017);
        setShortField(term30768, term30768.getClass(), "month", (short) 1);
        setShortField(term30768, term30768.getClass(), "day", (short) 2);
        setField(term30767, term30767.getClass(), "date", term30768);
        setByteField(term30772, term30772.getClass(), "hour", (byte) 17);
        setByteField(term30772, term30772.getClass(), "minute", (byte) 7);
        setByteField(term30772, term30772.getClass(), "second", (byte) 40);
        setIntField(term30772, term30772.getClass(), "nano", 688544705);
        setField(term30767, term30767.getClass(), "time", term30772);
        setField(term30657, term30657.getClass(), "createDate", term30767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board$BoardBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JUAWRJdehl";
        callMethod(klass, "title", argTypes, term30657, args);
    }

};


