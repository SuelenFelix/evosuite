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

public class UserCourse_setParam2_55865197574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197093;
     Object term197109;

    public UserCourse_setParam2_55865197574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197093 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term197093, term197093.getClass(), "id", 0L);
        setField(term197093, term197093.getClass(), "user", null);
        setIntField(term197093, term197093.getClass(), "courseId", 0);
        setIntField(term197093, term197093.getClass(), "classId", 0);
        setIntField(term197093, term197093.getClass(), "playCount", 0);
        setIntField(term197093, term197093.getClass(), "scoreMax", 0);
        setBooleanField(term197093, term197093.getClass(), "isFullCombo", false);
        setBooleanField(term197093, term197093.getClass(), "isAllJustice", false);
        setBooleanField(term197093, term197093.getClass(), "isSuccess", false);
        setIntField(term197093, term197093.getClass(), "scoreRank", 0);
        setIntField(term197093, term197093.getClass(), "eventId", 0);
        setField(term197093, term197093.getClass(), "lastPlayDate", null);
        setIntField(term197093, term197093.getClass(), "param1", 0);
        setIntField(term197093, term197093.getClass(), "param2", 0);
        setIntField(term197093, term197093.getClass(), "param3", 0);
        setIntField(term197093, term197093.getClass(), "param4", 0);
        setBooleanField(term197093, term197093.getClass(), "isClear", false);
        term197109 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term197109;
        callMethod(klass, "setParam2", argTypes, term197093, args);
    }

};


