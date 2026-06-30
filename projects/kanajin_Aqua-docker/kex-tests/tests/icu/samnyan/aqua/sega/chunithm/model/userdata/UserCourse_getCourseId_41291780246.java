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

public class UserCourse_getCourseId_41291780246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196623;

    public UserCourse_getCourseId_41291780246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196623 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196623, term196623.getClass(), "id", 0L);
        setField(term196623, term196623.getClass(), "user", null);
        setIntField(term196623, term196623.getClass(), "courseId", 0);
        setIntField(term196623, term196623.getClass(), "classId", 0);
        setIntField(term196623, term196623.getClass(), "playCount", 0);
        setIntField(term196623, term196623.getClass(), "scoreMax", 0);
        setBooleanField(term196623, term196623.getClass(), "isFullCombo", false);
        setBooleanField(term196623, term196623.getClass(), "isAllJustice", false);
        setBooleanField(term196623, term196623.getClass(), "isSuccess", false);
        setIntField(term196623, term196623.getClass(), "scoreRank", 0);
        setIntField(term196623, term196623.getClass(), "eventId", 0);
        setField(term196623, term196623.getClass(), "lastPlayDate", null);
        setIntField(term196623, term196623.getClass(), "param1", 0);
        setIntField(term196623, term196623.getClass(), "param2", 0);
        setIntField(term196623, term196623.getClass(), "param3", 0);
        setIntField(term196623, term196623.getClass(), "param4", 0);
        setBooleanField(term196623, term196623.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseId", argTypes, term196623, args);
    }

};


