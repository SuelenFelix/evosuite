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

public class Reply_getCreateDate_1377630759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4452;

    public Reply_getCreateDate_1377630759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4638 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term4637 = ((Class) term4638).getDeclaredField((String) "USER");
        ((Field) term4637).setAccessible(true);
        Object enum8 = ((Field) term4637).get((Object) null);
        Object term4551 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4551, term4551.getClass(), "id", 1283079251);
        setField(term4551, term4551.getClass(), "content", null);
        setField(term4551, term4551.getClass(), "board", null);
        setField(term4551, term4551.getClass(), "user", null);
        setField(term4551, term4551.getClass(), "createDate", null);
        ArrayList term4549 = new ArrayList();
        ((ArrayList) term4549).add(term4551);
        term4452 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term4466 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term4493 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term4546 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4555 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4560 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4565 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term4567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4572 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4452, term4452.getClass(), "id", 1830648570);
        setField(term4452, term4452.getClass(), "content", "dJGPlmSRnz");
        setIntField(term4466, term4466.getClass(), "id", -227365013);
        setField(term4466, term4466.getClass(), "title", "DPskuFUobI");
        setField(term4466, term4466.getClass(), "content", "wBGfLpNNiZ");
        setIntField(term4466, term4466.getClass(), "count", 11724947);
        setIntField(term4493, term4493.getClass(), "id", 1953277050);
        setField(term4493, term4493.getClass(), "username", "yUGCjlqgJE");
        setField(term4493, term4493.getClass(), "password", "PXdVZyoJyC");
        setField(term4493, term4493.getClass(), "email", "vLerpqavFM");
        setField(term4493, term4493.getClass(), "role", enum8);
        setField(term4493, term4493.getClass(), "oauth", "qnvxzwuGKX");
        setIntField(term4546, term4546.getClass(), "nanos", 366000000);
        setLongField(term4546, term4546.getClass(), "fastTime", 1304521299000L);
        setField(term4546, term4546.getClass(), "cdate", null);
        setField(term4493, term4493.getClass(), "createDate", term4546);
        setField(term4466, term4466.getClass(), "user", term4493);
        setField(term4466, term4466.getClass(), "replys", term4549);
        setIntField(term4556, term4556.getClass(), "year", 2022);
        setShortField(term4556, term4556.getClass(), "month", (short) 4);
        setShortField(term4556, term4556.getClass(), "day", (short) 15);
        setField(term4555, term4555.getClass(), "date", term4556);
        setByteField(term4560, term4560.getClass(), "hour", (byte) 20);
        setByteField(term4560, term4560.getClass(), "minute", (byte) 58);
        setByteField(term4560, term4560.getClass(), "second", (byte) 46);
        setIntField(term4560, term4560.getClass(), "nano", 435562727);
        setField(term4555, term4555.getClass(), "time", term4560);
        setField(term4466, term4466.getClass(), "createDate", term4555);
        setField(term4452, term4452.getClass(), "board", term4466);
        setIntField(term4565, term4565.getClass(), "id", 0);
        setField(term4565, term4565.getClass(), "username", null);
        setField(term4565, term4565.getClass(), "password", null);
        setField(term4565, term4565.getClass(), "email", null);
        setField(term4565, term4565.getClass(), "role", null);
        setField(term4565, term4565.getClass(), "oauth", null);
        setField(term4565, term4565.getClass(), "createDate", null);
        setField(term4452, term4452.getClass(), "user", term4565);
        setIntField(term4568, term4568.getClass(), "year", 2026);
        setShortField(term4568, term4568.getClass(), "month", (short) 10);
        setShortField(term4568, term4568.getClass(), "day", (short) 31);
        setField(term4567, term4567.getClass(), "date", term4568);
        setByteField(term4572, term4572.getClass(), "hour", (byte) 17);
        setByteField(term4572, term4572.getClass(), "minute", (byte) 6);
        setByteField(term4572, term4572.getClass(), "second", (byte) 30);
        setIntField(term4572, term4572.getClass(), "nano", 785931660);
        setField(term4567, term4567.getClass(), "time", term4572);
        setField(term4452, term4452.getClass(), "createDate", term4567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term4452, args);
    }

};


