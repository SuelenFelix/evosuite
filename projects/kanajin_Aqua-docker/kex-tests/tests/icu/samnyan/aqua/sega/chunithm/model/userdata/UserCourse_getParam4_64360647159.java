package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserCourse_getParam4_64360647159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196831;

    public UserCourse_getParam4_64360647159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196831 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196831, term196831.getClass(), "id", 0L);
        setField(term196831, term196831.getClass(), "user", null);
        setIntField(term196831, term196831.getClass(), "courseId", 0);
        setIntField(term196831, term196831.getClass(), "classId", 0);
        setIntField(term196831, term196831.getClass(), "playCount", 0);
        setIntField(term196831, term196831.getClass(), "scoreMax", 0);
        setBooleanField(term196831, term196831.getClass(), "isFullCombo", false);
        setBooleanField(term196831, term196831.getClass(), "isAllJustice", false);
        setBooleanField(term196831, term196831.getClass(), "isSuccess", false);
        setIntField(term196831, term196831.getClass(), "scoreRank", 0);
        setIntField(term196831, term196831.getClass(), "eventId", 0);
        setField(term196831, term196831.getClass(), "lastPlayDate", null);
        setIntField(term196831, term196831.getClass(), "param1", 0);
        setIntField(term196831, term196831.getClass(), "param2", 0);
        setIntField(term196831, term196831.getClass(), "param3", 0);
        setIntField(term196831, term196831.getClass(), "param4", 0);
        setBooleanField(term196831, term196831.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam4", argTypes, term196831, args);
    }

};


