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

public class UserCourse_getEventId_171077328954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196751;

    public UserCourse_getEventId_171077328954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196751 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196751, term196751.getClass(), "id", 0L);
        setField(term196751, term196751.getClass(), "user", null);
        setIntField(term196751, term196751.getClass(), "courseId", 0);
        setIntField(term196751, term196751.getClass(), "classId", 0);
        setIntField(term196751, term196751.getClass(), "playCount", 0);
        setIntField(term196751, term196751.getClass(), "scoreMax", 0);
        setBooleanField(term196751, term196751.getClass(), "isFullCombo", false);
        setBooleanField(term196751, term196751.getClass(), "isAllJustice", false);
        setBooleanField(term196751, term196751.getClass(), "isSuccess", false);
        setIntField(term196751, term196751.getClass(), "scoreRank", 0);
        setIntField(term196751, term196751.getClass(), "eventId", 0);
        setField(term196751, term196751.getClass(), "lastPlayDate", null);
        setIntField(term196751, term196751.getClass(), "param1", 0);
        setIntField(term196751, term196751.getClass(), "param2", 0);
        setIntField(term196751, term196751.getClass(), "param3", 0);
        setIntField(term196751, term196751.getClass(), "param4", 0);
        setBooleanField(term196751, term196751.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term196751, args);
    }

};


