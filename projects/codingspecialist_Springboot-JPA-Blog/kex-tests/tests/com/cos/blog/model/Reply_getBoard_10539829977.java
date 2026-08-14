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

public class Reply_getBoard_10539829977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3641;

    public Reply_getBoard_10539829977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3886 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term3885 = ((Class) term3886).getDeclaredField((String) "ADMIN");
        ((Field) term3885).setAccessible(true);
        Object enum6 = ((Field) term3885).get((Object) null);
        Object term3740 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term3740, term3740.getClass(), "id", -1210583429);
        setField(term3740, term3740.getClass(), "content", null);
        setField(term3740, term3740.getClass(), "board", null);
        setField(term3740, term3740.getClass(), "user", null);
        setField(term3740, term3740.getClass(), "createDate", null);
        Object term3742 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term3742, term3742.getClass(), "id", -1476117762);
        setField(term3742, term3742.getClass(), "content", null);
        setField(term3742, term3742.getClass(), "board", null);
        setField(term3742, term3742.getClass(), "user", null);
        setField(term3742, term3742.getClass(), "createDate", null);
        Object term3744 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term3744, term3744.getClass(), "id", -1963434938);
        setField(term3744, term3744.getClass(), "content", null);
        setField(term3744, term3744.getClass(), "board", null);
        setField(term3744, term3744.getClass(), "user", null);
        setField(term3744, term3744.getClass(), "createDate", null);
        Object term3746 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term3746, term3746.getClass(), "id", 1861318859);
        setField(term3746, term3746.getClass(), "content", null);
        setField(term3746, term3746.getClass(), "board", null);
        setField(term3746, term3746.getClass(), "user", null);
        setField(term3746, term3746.getClass(), "createDate", null);
        Object term3748 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term3748, term3748.getClass(), "id", 0);
        setField(term3748, term3748.getClass(), "content", null);
        setField(term3748, term3748.getClass(), "board", null);
        setField(term3748, term3748.getClass(), "user", null);
        setField(term3748, term3748.getClass(), "createDate", null);
        ArrayList term3738 = new ArrayList();
        ((ArrayList) term3738).add(term3740);
        ((ArrayList) term3738).add(term3742);
        ((ArrayList) term3738).add(term3744);
        ((ArrayList) term3738).add(term3746);
        ((ArrayList) term3738).add(term3748);
        term3641 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term3655 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term3682 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term3735 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3757 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3762 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term3812 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3815 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3816 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3820 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3641, term3641.getClass(), "id", -1888585309);
        setField(term3641, term3641.getClass(), "content", "OqbwYQfvAe");
        setIntField(term3655, term3655.getClass(), "id", 683666002);
        setField(term3655, term3655.getClass(), "title", "tRxZafjqIx");
        setField(term3655, term3655.getClass(), "content", "DhjNLmRMCu");
        setIntField(term3655, term3655.getClass(), "count", 1596213415);
        setIntField(term3682, term3682.getClass(), "id", -268815336);
        setField(term3682, term3682.getClass(), "username", "PgPzMSEjjX");
        setField(term3682, term3682.getClass(), "password", "wzsPSPcRdj");
        setField(term3682, term3682.getClass(), "email", "kGMQdqJYyB");
        setField(term3682, term3682.getClass(), "role", enum6);
        setField(term3682, term3682.getClass(), "oauth", "XJJNClzHRf");
        setIntField(term3735, term3735.getClass(), "nanos", 647000000);
        setLongField(term3735, term3735.getClass(), "fastTime", 1725111417000L);
        setField(term3735, term3735.getClass(), "cdate", null);
        setField(term3682, term3682.getClass(), "createDate", term3735);
        setField(term3655, term3655.getClass(), "user", term3682);
        setField(term3655, term3655.getClass(), "replys", term3738);
        setIntField(term3753, term3753.getClass(), "year", 2020);
        setShortField(term3753, term3753.getClass(), "month", (short) 5);
        setShortField(term3753, term3753.getClass(), "day", (short) 18);
        setField(term3752, term3752.getClass(), "date", term3753);
        setByteField(term3757, term3757.getClass(), "hour", (byte) 5);
        setByteField(term3757, term3757.getClass(), "minute", (byte) 46);
        setByteField(term3757, term3757.getClass(), "second", (byte) 13);
        setIntField(term3757, term3757.getClass(), "nano", 45893173);
        setField(term3752, term3752.getClass(), "time", term3757);
        setField(term3655, term3655.getClass(), "createDate", term3752);
        setField(term3641, term3641.getClass(), "board", term3655);
        setIntField(term3762, term3762.getClass(), "id", -341152642);
        setField(term3762, term3762.getClass(), "username", "nghfqDXyCG");
        setField(term3762, term3762.getClass(), "password", "WBAOTqErtm");
        setField(term3762, term3762.getClass(), "email", "PqtVXXZMqK");
        setField(term3762, term3762.getClass(), "role", enum6);
        setField(term3762, term3762.getClass(), "oauth", "rYbtIDVdnd");
        setIntField(term3812, term3812.getClass(), "nanos", 759000000);
        setLongField(term3812, term3812.getClass(), "fastTime", 1630941844000L);
        setField(term3812, term3812.getClass(), "cdate", null);
        setField(term3762, term3762.getClass(), "createDate", term3812);
        setField(term3641, term3641.getClass(), "user", term3762);
        setIntField(term3816, term3816.getClass(), "year", 2017);
        setShortField(term3816, term3816.getClass(), "month", (short) 4);
        setShortField(term3816, term3816.getClass(), "day", (short) 3);
        setField(term3815, term3815.getClass(), "date", term3816);
        setByteField(term3820, term3820.getClass(), "hour", (byte) 6);
        setByteField(term3820, term3820.getClass(), "minute", (byte) 51);
        setByteField(term3820, term3820.getClass(), "second", (byte) 10);
        setIntField(term3820, term3820.getClass(), "nano", 316377166);
        setField(term3815, term3815.getClass(), "time", term3820);
        setField(term3641, term3641.getClass(), "createDate", term3815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBoard", argTypes, term3641, args);
    }

};


