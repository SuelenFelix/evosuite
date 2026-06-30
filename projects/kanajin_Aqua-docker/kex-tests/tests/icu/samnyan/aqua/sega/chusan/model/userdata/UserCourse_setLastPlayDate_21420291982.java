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

public class UserCourse_setLastPlayDate_21420291982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142333;

    public UserCourse_setLastPlayDate_21420291982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142333 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term142333, term142333.getClass(), "id", 0L);
        setField(term142333, term142333.getClass(), "user", null);
        setIntField(term142333, term142333.getClass(), "courseId", 0);
        setIntField(term142333, term142333.getClass(), "classId", 0);
        setIntField(term142333, term142333.getClass(), "playCount", 0);
        setIntField(term142333, term142333.getClass(), "theoryCount", 0);
        setIntField(term142333, term142333.getClass(), "scoreMax", 0);
        setBooleanField(term142333, term142333.getClass(), "isFullCombo", false);
        setBooleanField(term142333, term142333.getClass(), "isAllJustice", false);
        setBooleanField(term142333, term142333.getClass(), "isSuccess", false);
        setIntField(term142333, term142333.getClass(), "scoreRank", 0);
        setIntField(term142333, term142333.getClass(), "eventId", 0);
        setField(term142333, term142333.getClass(), "lastPlayDate", null);
        setIntField(term142333, term142333.getClass(), "param1", 0);
        setIntField(term142333, term142333.getClass(), "param2", 0);
        setIntField(term142333, term142333.getClass(), "param3", 0);
        setIntField(term142333, term142333.getClass(), "param4", 0);
        setIntField(term142333, term142333.getClass(), "orderId", 0);
        setIntField(term142333, term142333.getClass(), "playerRating", 0);
        setBooleanField(term142333, term142333.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term142333, args);
    }

};


