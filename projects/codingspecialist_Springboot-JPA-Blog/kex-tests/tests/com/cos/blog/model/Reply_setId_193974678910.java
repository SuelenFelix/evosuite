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

public class Reply_setId_193974678910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4801;
     Object term4987;

    public Reply_setId_193974678910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5050 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term5049 = ((Class) term5050).getDeclaredField((String) "ADMIN");
        ((Field) term5049).setAccessible(true);
        Object enum9 = ((Field) term5049).get((Object) null);
        Object term4900 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4900, term4900.getClass(), "id", 114754804);
        setField(term4900, term4900.getClass(), "content", null);
        setField(term4900, term4900.getClass(), "board", null);
        setField(term4900, term4900.getClass(), "user", null);
        setField(term4900, term4900.getClass(), "createDate", null);
        Object term4902 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4902, term4902.getClass(), "id", 1102721075);
        setField(term4902, term4902.getClass(), "content", null);
        setField(term4902, term4902.getClass(), "board", null);
        setField(term4902, term4902.getClass(), "user", null);
        setField(term4902, term4902.getClass(), "createDate", null);
        Object term4904 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4904, term4904.getClass(), "id", 0);
        setField(term4904, term4904.getClass(), "content", null);
        setField(term4904, term4904.getClass(), "board", null);
        setField(term4904, term4904.getClass(), "user", null);
        setField(term4904, term4904.getClass(), "createDate", null);
        Object term4906 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4906, term4906.getClass(), "id", 0);
        setField(term4906, term4906.getClass(), "content", null);
        setField(term4906, term4906.getClass(), "board", null);
        setField(term4906, term4906.getClass(), "user", null);
        setField(term4906, term4906.getClass(), "createDate", null);
        Object term4908 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4908, term4908.getClass(), "id", 0);
        setField(term4908, term4908.getClass(), "content", null);
        setField(term4908, term4908.getClass(), "board", null);
        setField(term4908, term4908.getClass(), "user", null);
        setField(term4908, term4908.getClass(), "createDate", null);
        Object term4910 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4910, term4910.getClass(), "id", -1899301124);
        setField(term4910, term4910.getClass(), "content", null);
        setField(term4910, term4910.getClass(), "board", null);
        setField(term4910, term4910.getClass(), "user", null);
        setField(term4910, term4910.getClass(), "createDate", null);
        ArrayList term4898 = new ArrayList();
        ((ArrayList) term4898).add(term4900);
        ((ArrayList) term4898).add(term4902);
        ((ArrayList) term4898).add(term4900);
        ((ArrayList) term4898).add(term4904);
        ((ArrayList) term4898).add(term4904);
        ((ArrayList) term4898).add(term4906);
        ((ArrayList) term4898).add(term4908);
        ((ArrayList) term4898).add(term4910);
        ((ArrayList) term4898).add(term4904);
        term4801 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term4815 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term4842 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term4895 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4914 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4915 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4919 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4924 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term4974 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4982 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4801, term4801.getClass(), "id", -507387516);
        setField(term4801, term4801.getClass(), "content", "IHqvyhMtuM");
        setIntField(term4815, term4815.getClass(), "id", -1970452551);
        setField(term4815, term4815.getClass(), "title", "dAldIGYAXV");
        setField(term4815, term4815.getClass(), "content", "mLwibAPEsa");
        setIntField(term4815, term4815.getClass(), "count", -1896376975);
        setIntField(term4842, term4842.getClass(), "id", 729658803);
        setField(term4842, term4842.getClass(), "username", "zsWKWiTFuo");
        setField(term4842, term4842.getClass(), "password", "UPUbwyHQKN");
        setField(term4842, term4842.getClass(), "email", "lgQkrXANyI");
        setField(term4842, term4842.getClass(), "role", enum9);
        setField(term4842, term4842.getClass(), "oauth", "MeTmRZXErV");
        setIntField(term4895, term4895.getClass(), "nanos", 186000000);
        setLongField(term4895, term4895.getClass(), "fastTime", 1666065487000L);
        setField(term4895, term4895.getClass(), "cdate", null);
        setField(term4842, term4842.getClass(), "createDate", term4895);
        setField(term4815, term4815.getClass(), "user", term4842);
        setField(term4815, term4815.getClass(), "replys", term4898);
        setIntField(term4915, term4915.getClass(), "year", 2021);
        setShortField(term4915, term4915.getClass(), "month", (short) 3);
        setShortField(term4915, term4915.getClass(), "day", (short) 13);
        setField(term4914, term4914.getClass(), "date", term4915);
        setByteField(term4919, term4919.getClass(), "hour", (byte) 6);
        setByteField(term4919, term4919.getClass(), "minute", (byte) 25);
        setByteField(term4919, term4919.getClass(), "second", (byte) 42);
        setIntField(term4919, term4919.getClass(), "nano", 282924199);
        setField(term4914, term4914.getClass(), "time", term4919);
        setField(term4815, term4815.getClass(), "createDate", term4914);
        setField(term4801, term4801.getClass(), "board", term4815);
        setIntField(term4924, term4924.getClass(), "id", -1870495012);
        setField(term4924, term4924.getClass(), "username", "KSJeYkkvpk");
        setField(term4924, term4924.getClass(), "password", "qUtkFGMNUV");
        setField(term4924, term4924.getClass(), "email", "mGRiYhnMcR");
        setField(term4924, term4924.getClass(), "role", enum9);
        setField(term4924, term4924.getClass(), "oauth", "NFlvfJCVPO");
        setIntField(term4974, term4974.getClass(), "nanos", 698000000);
        setLongField(term4974, term4974.getClass(), "fastTime", 1400680978000L);
        setField(term4974, term4974.getClass(), "cdate", null);
        setField(term4924, term4924.getClass(), "createDate", term4974);
        setField(term4801, term4801.getClass(), "user", term4924);
        setIntField(term4978, term4978.getClass(), "year", 2020);
        setShortField(term4978, term4978.getClass(), "month", (short) 10);
        setShortField(term4978, term4978.getClass(), "day", (short) 25);
        setField(term4977, term4977.getClass(), "date", term4978);
        setByteField(term4982, term4982.getClass(), "hour", (byte) 18);
        setByteField(term4982, term4982.getClass(), "minute", (byte) 22);
        setByteField(term4982, term4982.getClass(), "second", (byte) 30);
        setIntField(term4982, term4982.getClass(), "nano", 948592965);
        setField(term4977, term4977.getClass(), "time", term4982);
        setField(term4801, term4801.getClass(), "createDate", term4977);
        term4987 = new Integer(806595993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4987;
        callMethod(klass, "setId", argTypes, term4801, args);
    }

};


