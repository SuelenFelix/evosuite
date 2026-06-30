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
import java.lang.Boolean;

public class UserCourse_setFullCombo_91363670767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196969;
     Object term196985;

    public UserCourse_setFullCombo_91363670767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196969 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196969, term196969.getClass(), "id", 0L);
        setField(term196969, term196969.getClass(), "user", null);
        setIntField(term196969, term196969.getClass(), "courseId", 0);
        setIntField(term196969, term196969.getClass(), "classId", 0);
        setIntField(term196969, term196969.getClass(), "playCount", 0);
        setIntField(term196969, term196969.getClass(), "scoreMax", 0);
        setBooleanField(term196969, term196969.getClass(), "isFullCombo", false);
        setBooleanField(term196969, term196969.getClass(), "isAllJustice", false);
        setBooleanField(term196969, term196969.getClass(), "isSuccess", false);
        setIntField(term196969, term196969.getClass(), "scoreRank", 0);
        setIntField(term196969, term196969.getClass(), "eventId", 0);
        setField(term196969, term196969.getClass(), "lastPlayDate", null);
        setIntField(term196969, term196969.getClass(), "param1", 0);
        setIntField(term196969, term196969.getClass(), "param2", 0);
        setIntField(term196969, term196969.getClass(), "param3", 0);
        setIntField(term196969, term196969.getClass(), "param4", 0);
        setBooleanField(term196969, term196969.getClass(), "isClear", false);
        term196985 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term196985;
        callMethod(klass, "setFullCombo", argTypes, term196969, args);
    }

};


