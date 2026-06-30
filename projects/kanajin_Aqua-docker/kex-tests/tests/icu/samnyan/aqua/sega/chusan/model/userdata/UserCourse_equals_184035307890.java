package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserCourse_equals_184035307890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142499;

    public UserCourse_equals_184035307890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142499 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term142499, term142499.getClass(), "id", 0L);
        setField(term142499, term142499.getClass(), "user", null);
        setIntField(term142499, term142499.getClass(), "courseId", 0);
        setIntField(term142499, term142499.getClass(), "classId", 0);
        setIntField(term142499, term142499.getClass(), "playCount", 0);
        setIntField(term142499, term142499.getClass(), "theoryCount", 0);
        setIntField(term142499, term142499.getClass(), "scoreMax", 0);
        setBooleanField(term142499, term142499.getClass(), "isFullCombo", false);
        setBooleanField(term142499, term142499.getClass(), "isAllJustice", false);
        setBooleanField(term142499, term142499.getClass(), "isSuccess", false);
        setIntField(term142499, term142499.getClass(), "scoreRank", 0);
        setIntField(term142499, term142499.getClass(), "eventId", 0);
        setField(term142499, term142499.getClass(), "lastPlayDate", null);
        setIntField(term142499, term142499.getClass(), "param1", 0);
        setIntField(term142499, term142499.getClass(), "param2", 0);
        setIntField(term142499, term142499.getClass(), "param3", 0);
        setIntField(term142499, term142499.getClass(), "param4", 0);
        setIntField(term142499, term142499.getClass(), "orderId", 0);
        setIntField(term142499, term142499.getClass(), "playerRating", 0);
        setBooleanField(term142499, term142499.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term142499, args);
    }

};


