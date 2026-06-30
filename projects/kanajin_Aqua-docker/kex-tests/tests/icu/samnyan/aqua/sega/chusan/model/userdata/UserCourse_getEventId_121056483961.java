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

public class UserCourse_getEventId_121056483961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141912;

    public UserCourse_getEventId_121056483961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141912 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term141912, term141912.getClass(), "id", 0L);
        setField(term141912, term141912.getClass(), "user", null);
        setIntField(term141912, term141912.getClass(), "courseId", 0);
        setIntField(term141912, term141912.getClass(), "classId", 0);
        setIntField(term141912, term141912.getClass(), "playCount", 0);
        setIntField(term141912, term141912.getClass(), "theoryCount", 0);
        setIntField(term141912, term141912.getClass(), "scoreMax", 0);
        setBooleanField(term141912, term141912.getClass(), "isFullCombo", false);
        setBooleanField(term141912, term141912.getClass(), "isAllJustice", false);
        setBooleanField(term141912, term141912.getClass(), "isSuccess", false);
        setIntField(term141912, term141912.getClass(), "scoreRank", 0);
        setIntField(term141912, term141912.getClass(), "eventId", 0);
        setField(term141912, term141912.getClass(), "lastPlayDate", null);
        setIntField(term141912, term141912.getClass(), "param1", 0);
        setIntField(term141912, term141912.getClass(), "param2", 0);
        setIntField(term141912, term141912.getClass(), "param3", 0);
        setIntField(term141912, term141912.getClass(), "param4", 0);
        setIntField(term141912, term141912.getClass(), "orderId", 0);
        setIntField(term141912, term141912.getClass(), "playerRating", 0);
        setBooleanField(term141912, term141912.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term141912, args);
    }

};


