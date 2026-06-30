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

public class UserCourse_getScoreMax_133671534249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196671;

    public UserCourse_getScoreMax_133671534249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196671 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196671, term196671.getClass(), "id", 0L);
        setField(term196671, term196671.getClass(), "user", null);
        setIntField(term196671, term196671.getClass(), "courseId", 0);
        setIntField(term196671, term196671.getClass(), "classId", 0);
        setIntField(term196671, term196671.getClass(), "playCount", 0);
        setIntField(term196671, term196671.getClass(), "scoreMax", 0);
        setBooleanField(term196671, term196671.getClass(), "isFullCombo", false);
        setBooleanField(term196671, term196671.getClass(), "isAllJustice", false);
        setBooleanField(term196671, term196671.getClass(), "isSuccess", false);
        setIntField(term196671, term196671.getClass(), "scoreRank", 0);
        setIntField(term196671, term196671.getClass(), "eventId", 0);
        setField(term196671, term196671.getClass(), "lastPlayDate", null);
        setIntField(term196671, term196671.getClass(), "param1", 0);
        setIntField(term196671, term196671.getClass(), "param2", 0);
        setIntField(term196671, term196671.getClass(), "param3", 0);
        setIntField(term196671, term196671.getClass(), "param4", 0);
        setBooleanField(term196671, term196671.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreMax", argTypes, term196671, args);
    }

};


