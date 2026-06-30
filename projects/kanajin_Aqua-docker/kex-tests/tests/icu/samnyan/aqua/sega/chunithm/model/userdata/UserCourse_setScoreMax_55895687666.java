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

public class UserCourse_setScoreMax_55895687666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196951;
     Object term196967;

    public UserCourse_setScoreMax_55895687666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196951 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196951, term196951.getClass(), "id", 0L);
        setField(term196951, term196951.getClass(), "user", null);
        setIntField(term196951, term196951.getClass(), "courseId", 0);
        setIntField(term196951, term196951.getClass(), "classId", 0);
        setIntField(term196951, term196951.getClass(), "playCount", 0);
        setIntField(term196951, term196951.getClass(), "scoreMax", 0);
        setBooleanField(term196951, term196951.getClass(), "isFullCombo", false);
        setBooleanField(term196951, term196951.getClass(), "isAllJustice", false);
        setBooleanField(term196951, term196951.getClass(), "isSuccess", false);
        setIntField(term196951, term196951.getClass(), "scoreRank", 0);
        setIntField(term196951, term196951.getClass(), "eventId", 0);
        setField(term196951, term196951.getClass(), "lastPlayDate", null);
        setIntField(term196951, term196951.getClass(), "param1", 0);
        setIntField(term196951, term196951.getClass(), "param2", 0);
        setIntField(term196951, term196951.getClass(), "param3", 0);
        setIntField(term196951, term196951.getClass(), "param4", 0);
        setBooleanField(term196951, term196951.getClass(), "isClear", false);
        term196967 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term196967;
        callMethod(klass, "setScoreMax", argTypes, term196951, args);
    }

};


