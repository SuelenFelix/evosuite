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

public class UserCourse_isSuccess_98129494359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141874;

    public UserCourse_isSuccess_98129494359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141874 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term141874, term141874.getClass(), "id", 0L);
        setField(term141874, term141874.getClass(), "user", null);
        setIntField(term141874, term141874.getClass(), "courseId", 0);
        setIntField(term141874, term141874.getClass(), "classId", 0);
        setIntField(term141874, term141874.getClass(), "playCount", 0);
        setIntField(term141874, term141874.getClass(), "theoryCount", 0);
        setIntField(term141874, term141874.getClass(), "scoreMax", 0);
        setBooleanField(term141874, term141874.getClass(), "isFullCombo", false);
        setBooleanField(term141874, term141874.getClass(), "isAllJustice", false);
        setBooleanField(term141874, term141874.getClass(), "isSuccess", false);
        setIntField(term141874, term141874.getClass(), "scoreRank", 0);
        setIntField(term141874, term141874.getClass(), "eventId", 0);
        setField(term141874, term141874.getClass(), "lastPlayDate", null);
        setIntField(term141874, term141874.getClass(), "param1", 0);
        setIntField(term141874, term141874.getClass(), "param2", 0);
        setIntField(term141874, term141874.getClass(), "param3", 0);
        setIntField(term141874, term141874.getClass(), "param4", 0);
        setIntField(term141874, term141874.getClass(), "orderId", 0);
        setIntField(term141874, term141874.getClass(), "playerRating", 0);
        setBooleanField(term141874, term141874.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term141874, args);
    }

};


