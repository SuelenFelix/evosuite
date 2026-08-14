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

public class Board_setUser_192541255915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17772;
     Object term17893;

    public Board_setUser_192541255915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17997 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term17996 = ((Class) term17997).getDeclaredField((String) "ADMIN");
        ((Field) term17996).setAccessible(true);
        Object enum42 = ((Field) term17996).get((Object) null);
        Object term17863 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term17866 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term17869 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term17871 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term17863, term17863.getClass(), "id", 1010721666);
        setField(term17863, term17863.getClass(), "content", "");
        setIntField(term17866, term17866.getClass(), "id", 27043781);
        setField(term17866, term17866.getClass(), "title", null);
        setField(term17866, term17866.getClass(), "content", null);
        setIntField(term17866, term17866.getClass(), "count", -1367122405);
        setField(term17866, term17866.getClass(), "user", null);
        setField(term17866, term17866.getClass(), "replys", null);
        setField(term17866, term17866.getClass(), "createDate", null);
        setField(term17863, term17863.getClass(), "board", term17866);
        setIntField(term17869, term17869.getClass(), "id", 0);
        setField(term17869, term17869.getClass(), "username", null);
        setField(term17869, term17869.getClass(), "password", null);
        setField(term17869, term17869.getClass(), "email", null);
        setField(term17869, term17869.getClass(), "role", null);
        setField(term17869, term17869.getClass(), "oauth", null);
        setField(term17869, term17869.getClass(), "createDate", null);
        setField(term17863, term17863.getClass(), "user", term17869);
        setField(term17871, term17871.getClass(), "date", null);
        setField(term17871, term17871.getClass(), "time", null);
        setField(term17863, term17863.getClass(), "createDate", term17871);
        Object term17872 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term17875 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term17878 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term17880 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term17872, term17872.getClass(), "id", 626179200);
        setField(term17872, term17872.getClass(), "content", "");
        setIntField(term17875, term17875.getClass(), "id", 0);
        setField(term17875, term17875.getClass(), "title", null);
        setField(term17875, term17875.getClass(), "content", null);
        setIntField(term17875, term17875.getClass(), "count", 0);
        setField(term17875, term17875.getClass(), "user", null);
        setField(term17875, term17875.getClass(), "replys", null);
        setField(term17875, term17875.getClass(), "createDate", null);
        setField(term17872, term17872.getClass(), "board", term17875);
        setIntField(term17878, term17878.getClass(), "id", 0);
        setField(term17878, term17878.getClass(), "username", null);
        setField(term17878, term17878.getClass(), "password", null);
        setField(term17878, term17878.getClass(), "email", null);
        setField(term17878, term17878.getClass(), "role", null);
        setField(term17878, term17878.getClass(), "oauth", null);
        setField(term17878, term17878.getClass(), "createDate", null);
        setField(term17872, term17872.getClass(), "user", term17878);
        setField(term17880, term17880.getClass(), "date", null);
        setField(term17880, term17880.getClass(), "time", null);
        setField(term17872, term17872.getClass(), "createDate", term17880);
        ArrayList term17861 = new ArrayList();
        ((ArrayList) term17861).add(term17863);
        ((ArrayList) term17861).add(term17872);
        term17772 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term17799 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term17858 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term17883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17888 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17772, term17772.getClass(), "id", 993627098);
        setField(term17772, term17772.getClass(), "title", "CGeclMyIOP");
        setField(term17772, term17772.getClass(), "content", "yyWOYvIBsp");
        setIntField(term17772, term17772.getClass(), "count", 872295704);
        setIntField(term17799, term17799.getClass(), "id", 86041387);
        setField(term17799, term17799.getClass(), "username", "mmpgARMYFV");
        setField(term17799, term17799.getClass(), "password", "NUqhsZprdZ");
        setField(term17799, term17799.getClass(), "email", "jkzgCqWJrA");
        setField(term17799, term17799.getClass(), "role", enum42);
        setField(term17799, term17799.getClass(), "oauth", "rawiXxuyRn");
        setIntField(term17858, term17858.getClass(), "nanos", 165000000);
        setLongField(term17858, term17858.getClass(), "fastTime", 1890779014000L);
        setField(term17858, term17858.getClass(), "cdate", null);
        setField(term17799, term17799.getClass(), "createDate", term17858);
        setField(term17772, term17772.getClass(), "user", term17799);
        setField(term17772, term17772.getClass(), "replys", term17861);
        setIntField(term17884, term17884.getClass(), "year", 2017);
        setShortField(term17884, term17884.getClass(), "month", (short) 5);
        setShortField(term17884, term17884.getClass(), "day", (short) 17);
        setField(term17883, term17883.getClass(), "date", term17884);
        setByteField(term17888, term17888.getClass(), "hour", (byte) 22);
        setByteField(term17888, term17888.getClass(), "minute", (byte) 56);
        setByteField(term17888, term17888.getClass(), "second", (byte) 28);
        setIntField(term17888, term17888.getClass(), "nano", 581659115);
        setField(term17883, term17883.getClass(), "time", term17888);
        setField(term17772, term17772.getClass(), "createDate", term17883);
        term17893 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term17943 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term17893, term17893.getClass(), "id", -511077684);
        setField(term17893, term17893.getClass(), "username", "rLldJrTAay");
        setField(term17893, term17893.getClass(), "password", "HvSKssbEES");
        setField(term17893, term17893.getClass(), "email", "UjIAQAHhul");
        setField(term17893, term17893.getClass(), "role", enum42);
        setField(term17893, term17893.getClass(), "oauth", "oWBXOvjPUT");
        setIntField(term17943, term17943.getClass(), "nanos", 189000000);
        setLongField(term17943, term17943.getClass(), "fastTime", 1619387974000L);
        setField(term17943, term17943.getClass(), "cdate", null);
        setField(term17893, term17893.getClass(), "createDate", term17943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.User");
        Object[] args = new Object[1];
        args[0] = term17893;
        callMethod(klass, "setUser", argTypes, term17772, args);
    }

};


