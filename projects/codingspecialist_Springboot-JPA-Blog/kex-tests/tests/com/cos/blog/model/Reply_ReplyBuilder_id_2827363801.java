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

public class Reply_ReplyBuilder_id_2827363801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36674;
     Object term36865;

    public Reply_ReplyBuilder_id_2827363801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36928 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term36927 = ((Class) term36928).getDeclaredField((String) "USER");
        ((Field) term36927).setAccessible(true);
        Object enum82 = ((Field) term36927).get((Object) null);
        Object term36773 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term36773, term36773.getClass(), "id", -298852874);
        setField(term36773, term36773.getClass(), "content", null);
        setField(term36773, term36773.getClass(), "board", null);
        setField(term36773, term36773.getClass(), "user", null);
        setField(term36773, term36773.getClass(), "createDate", null);
        Object term36775 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term36775, term36775.getClass(), "id", 0);
        setField(term36775, term36775.getClass(), "content", null);
        setField(term36775, term36775.getClass(), "board", null);
        setField(term36775, term36775.getClass(), "user", null);
        setField(term36775, term36775.getClass(), "createDate", null);
        Object term36777 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term36777, term36777.getClass(), "id", -1796760393);
        setField(term36777, term36777.getClass(), "content", null);
        setField(term36777, term36777.getClass(), "board", null);
        setField(term36777, term36777.getClass(), "user", null);
        setField(term36777, term36777.getClass(), "createDate", null);
        Object term36779 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term36779, term36779.getClass(), "id", 0);
        setField(term36779, term36779.getClass(), "content", null);
        setField(term36779, term36779.getClass(), "board", null);
        setField(term36779, term36779.getClass(), "user", null);
        setField(term36779, term36779.getClass(), "createDate", null);
        ArrayList term36771 = new ArrayList();
        ((ArrayList) term36771).add(term36773);
        ((ArrayList) term36771).add(term36775);
        ((ArrayList) term36771).add(term36777);
        ((ArrayList) term36771).add(term36779);
        Class<? extends Object> term37122 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term37121 = ((Class) term37122).getDeclaredField((String) "ADMIN");
        ((Field) term37121).setAccessible(true);
        Object enum83 = ((Field) term37121).get((Object) null);
        term36674 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        Object term36688 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term36715 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term36768 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term36783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36788 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36793 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term36852 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term36855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36860 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term36674, term36674.getClass(), "id", 2087383644);
        setField(term36674, term36674.getClass(), "content", "UonOkFcwuK");
        setIntField(term36688, term36688.getClass(), "id", 405527523);
        setField(term36688, term36688.getClass(), "title", "coDGKPmcIo");
        setField(term36688, term36688.getClass(), "content", "sNKnkClMjH");
        setIntField(term36688, term36688.getClass(), "count", -1123526433);
        setIntField(term36715, term36715.getClass(), "id", 910269225);
        setField(term36715, term36715.getClass(), "username", "DzuhSmFHcg");
        setField(term36715, term36715.getClass(), "password", "lHFGeijIrp");
        setField(term36715, term36715.getClass(), "email", "OjqiiqbEQC");
        setField(term36715, term36715.getClass(), "role", enum82);
        setField(term36715, term36715.getClass(), "oauth", "lOnziohwRj");
        setIntField(term36768, term36768.getClass(), "nanos", 308000000);
        setLongField(term36768, term36768.getClass(), "fastTime", 1853618246000L);
        setField(term36768, term36768.getClass(), "cdate", null);
        setField(term36715, term36715.getClass(), "createDate", term36768);
        setField(term36688, term36688.getClass(), "user", term36715);
        setField(term36688, term36688.getClass(), "replys", term36771);
        setIntField(term36784, term36784.getClass(), "year", 2011);
        setShortField(term36784, term36784.getClass(), "month", (short) 4);
        setShortField(term36784, term36784.getClass(), "day", (short) 30);
        setField(term36783, term36783.getClass(), "date", term36784);
        setByteField(term36788, term36788.getClass(), "hour", (byte) 5);
        setByteField(term36788, term36788.getClass(), "minute", (byte) 2);
        setByteField(term36788, term36788.getClass(), "second", (byte) 59);
        setIntField(term36788, term36788.getClass(), "nano", 800923694);
        setField(term36783, term36783.getClass(), "time", term36788);
        setField(term36688, term36688.getClass(), "createDate", term36783);
        setField(term36674, term36674.getClass(), "board", term36688);
        setIntField(term36793, term36793.getClass(), "id", -867925573);
        setField(term36793, term36793.getClass(), "username", "oRXjZDPrtE");
        setField(term36793, term36793.getClass(), "password", "UYdKOLuJyq");
        setField(term36793, term36793.getClass(), "email", "WzRmLCtUaL");
        setField(term36793, term36793.getClass(), "role", enum83);
        setField(term36793, term36793.getClass(), "oauth", "dqznIFBmKx");
        setIntField(term36852, term36852.getClass(), "nanos", 615000000);
        setLongField(term36852, term36852.getClass(), "fastTime", 1472731528000L);
        setField(term36852, term36852.getClass(), "cdate", null);
        setField(term36793, term36793.getClass(), "createDate", term36852);
        setField(term36674, term36674.getClass(), "user", term36793);
        setIntField(term36856, term36856.getClass(), "year", 2027);
        setShortField(term36856, term36856.getClass(), "month", (short) 5);
        setShortField(term36856, term36856.getClass(), "day", (short) 8);
        setField(term36855, term36855.getClass(), "date", term36856);
        setByteField(term36860, term36860.getClass(), "hour", (byte) 4);
        setByteField(term36860, term36860.getClass(), "minute", (byte) 0);
        setByteField(term36860, term36860.getClass(), "second", (byte) 19);
        setIntField(term36860, term36860.getClass(), "nano", 400713347);
        setField(term36855, term36855.getClass(), "time", term36860);
        setField(term36674, term36674.getClass(), "createDate", term36855);
        term36865 = new Integer(478422495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term36865;
        callMethod(klass, "id", argTypes, term36674, args);
    }

};


