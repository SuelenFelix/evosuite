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

public class UserCourse_setPlayCount_33804762365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196933;
     Object term196949;

    public UserCourse_setPlayCount_33804762365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196933 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196933, term196933.getClass(), "id", 0L);
        setField(term196933, term196933.getClass(), "user", null);
        setIntField(term196933, term196933.getClass(), "courseId", 0);
        setIntField(term196933, term196933.getClass(), "classId", 0);
        setIntField(term196933, term196933.getClass(), "playCount", 0);
        setIntField(term196933, term196933.getClass(), "scoreMax", 0);
        setBooleanField(term196933, term196933.getClass(), "isFullCombo", false);
        setBooleanField(term196933, term196933.getClass(), "isAllJustice", false);
        setBooleanField(term196933, term196933.getClass(), "isSuccess", false);
        setIntField(term196933, term196933.getClass(), "scoreRank", 0);
        setIntField(term196933, term196933.getClass(), "eventId", 0);
        setField(term196933, term196933.getClass(), "lastPlayDate", null);
        setIntField(term196933, term196933.getClass(), "param1", 0);
        setIntField(term196933, term196933.getClass(), "param2", 0);
        setIntField(term196933, term196933.getClass(), "param3", 0);
        setIntField(term196933, term196933.getClass(), "param4", 0);
        setBooleanField(term196933, term196933.getClass(), "isClear", false);
        term196949 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term196949;
        callMethod(klass, "setPlayCount", argTypes, term196933, args);
    }

};


