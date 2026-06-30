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

public class UserCourse_getScoreRank_177987073453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196735;

    public UserCourse_getScoreRank_177987073453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196735 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196735, term196735.getClass(), "id", 0L);
        setField(term196735, term196735.getClass(), "user", null);
        setIntField(term196735, term196735.getClass(), "courseId", 0);
        setIntField(term196735, term196735.getClass(), "classId", 0);
        setIntField(term196735, term196735.getClass(), "playCount", 0);
        setIntField(term196735, term196735.getClass(), "scoreMax", 0);
        setBooleanField(term196735, term196735.getClass(), "isFullCombo", false);
        setBooleanField(term196735, term196735.getClass(), "isAllJustice", false);
        setBooleanField(term196735, term196735.getClass(), "isSuccess", false);
        setIntField(term196735, term196735.getClass(), "scoreRank", 0);
        setIntField(term196735, term196735.getClass(), "eventId", 0);
        setField(term196735, term196735.getClass(), "lastPlayDate", null);
        setIntField(term196735, term196735.getClass(), "param1", 0);
        setIntField(term196735, term196735.getClass(), "param2", 0);
        setIntField(term196735, term196735.getClass(), "param3", 0);
        setIntField(term196735, term196735.getClass(), "param4", 0);
        setBooleanField(term196735, term196735.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreRank", argTypes, term196735, args);
    }

};


