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

public class UserCourse_hashCode_139166640392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142537;

    public UserCourse_hashCode_139166640392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142537 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term142537, term142537.getClass(), "id", 0L);
        setField(term142537, term142537.getClass(), "user", null);
        setIntField(term142537, term142537.getClass(), "courseId", 0);
        setIntField(term142537, term142537.getClass(), "classId", 0);
        setIntField(term142537, term142537.getClass(), "playCount", 0);
        setIntField(term142537, term142537.getClass(), "theoryCount", 0);
        setIntField(term142537, term142537.getClass(), "scoreMax", 0);
        setBooleanField(term142537, term142537.getClass(), "isFullCombo", false);
        setBooleanField(term142537, term142537.getClass(), "isAllJustice", false);
        setBooleanField(term142537, term142537.getClass(), "isSuccess", false);
        setIntField(term142537, term142537.getClass(), "scoreRank", 0);
        setIntField(term142537, term142537.getClass(), "eventId", 0);
        setField(term142537, term142537.getClass(), "lastPlayDate", null);
        setIntField(term142537, term142537.getClass(), "param1", 0);
        setIntField(term142537, term142537.getClass(), "param2", 0);
        setIntField(term142537, term142537.getClass(), "param3", 0);
        setIntField(term142537, term142537.getClass(), "param4", 0);
        setIntField(term142537, term142537.getClass(), "orderId", 0);
        setIntField(term142537, term142537.getClass(), "playerRating", 0);
        setBooleanField(term142537, term142537.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term142537, args);
    }

};


