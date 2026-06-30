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
import java.lang.Boolean;

public class UserCourse_setAllJustice_192726633878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142249;
     Object term142268;

    public UserCourse_setAllJustice_192726633878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142249 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term142249, term142249.getClass(), "id", 0L);
        setField(term142249, term142249.getClass(), "user", null);
        setIntField(term142249, term142249.getClass(), "courseId", 0);
        setIntField(term142249, term142249.getClass(), "classId", 0);
        setIntField(term142249, term142249.getClass(), "playCount", 0);
        setIntField(term142249, term142249.getClass(), "theoryCount", 0);
        setIntField(term142249, term142249.getClass(), "scoreMax", 0);
        setBooleanField(term142249, term142249.getClass(), "isFullCombo", false);
        setBooleanField(term142249, term142249.getClass(), "isAllJustice", false);
        setBooleanField(term142249, term142249.getClass(), "isSuccess", false);
        setIntField(term142249, term142249.getClass(), "scoreRank", 0);
        setIntField(term142249, term142249.getClass(), "eventId", 0);
        setField(term142249, term142249.getClass(), "lastPlayDate", null);
        setIntField(term142249, term142249.getClass(), "param1", 0);
        setIntField(term142249, term142249.getClass(), "param2", 0);
        setIntField(term142249, term142249.getClass(), "param3", 0);
        setIntField(term142249, term142249.getClass(), "param4", 0);
        setIntField(term142249, term142249.getClass(), "orderId", 0);
        setIntField(term142249, term142249.getClass(), "playerRating", 0);
        setBooleanField(term142249, term142249.getClass(), "isClear", false);
        term142268 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term142268;
        callMethod(klass, "setAllJustice", argTypes, term142249, args);
    }

};


