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
import java.lang.Integer;

public class UserCourse_setCourseId_36484066463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196897;
     Object term196913;

    public UserCourse_setCourseId_36484066463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196897 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196897, term196897.getClass(), "id", 0L);
        setField(term196897, term196897.getClass(), "user", null);
        setIntField(term196897, term196897.getClass(), "courseId", 0);
        setIntField(term196897, term196897.getClass(), "classId", 0);
        setIntField(term196897, term196897.getClass(), "playCount", 0);
        setIntField(term196897, term196897.getClass(), "scoreMax", 0);
        setBooleanField(term196897, term196897.getClass(), "isFullCombo", false);
        setBooleanField(term196897, term196897.getClass(), "isAllJustice", false);
        setBooleanField(term196897, term196897.getClass(), "isSuccess", false);
        setIntField(term196897, term196897.getClass(), "scoreRank", 0);
        setIntField(term196897, term196897.getClass(), "eventId", 0);
        setField(term196897, term196897.getClass(), "lastPlayDate", null);
        setIntField(term196897, term196897.getClass(), "param1", 0);
        setIntField(term196897, term196897.getClass(), "param2", 0);
        setIntField(term196897, term196897.getClass(), "param3", 0);
        setIntField(term196897, term196897.getClass(), "param4", 0);
        setBooleanField(term196897, term196897.getClass(), "isClear", false);
        term196913 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term196913;
        callMethod(klass, "setCourseId", argTypes, term196897, args);
    }

};


