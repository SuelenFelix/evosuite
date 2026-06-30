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
import java.lang.Integer;

public class UserCourse_setScoreMax_105916532676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142207;
     Object term142226;

    public UserCourse_setScoreMax_105916532676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142207 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term142207, term142207.getClass(), "id", 0L);
        setField(term142207, term142207.getClass(), "user", null);
        setIntField(term142207, term142207.getClass(), "courseId", 0);
        setIntField(term142207, term142207.getClass(), "classId", 0);
        setIntField(term142207, term142207.getClass(), "playCount", 0);
        setIntField(term142207, term142207.getClass(), "theoryCount", 0);
        setIntField(term142207, term142207.getClass(), "scoreMax", 0);
        setBooleanField(term142207, term142207.getClass(), "isFullCombo", false);
        setBooleanField(term142207, term142207.getClass(), "isAllJustice", false);
        setBooleanField(term142207, term142207.getClass(), "isSuccess", false);
        setIntField(term142207, term142207.getClass(), "scoreRank", 0);
        setIntField(term142207, term142207.getClass(), "eventId", 0);
        setField(term142207, term142207.getClass(), "lastPlayDate", null);
        setIntField(term142207, term142207.getClass(), "param1", 0);
        setIntField(term142207, term142207.getClass(), "param2", 0);
        setIntField(term142207, term142207.getClass(), "param3", 0);
        setIntField(term142207, term142207.getClass(), "param4", 0);
        setIntField(term142207, term142207.getClass(), "orderId", 0);
        setIntField(term142207, term142207.getClass(), "playerRating", 0);
        setBooleanField(term142207, term142207.getClass(), "isClear", false);
        term142226 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term142226;
        callMethod(klass, "setScoreMax", argTypes, term142207, args);
    }

};


