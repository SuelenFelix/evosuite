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

public class UserCourse_getClassId_116944710953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141760;

    public UserCourse_getClassId_116944710953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141760 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term141760, term141760.getClass(), "id", 0L);
        setField(term141760, term141760.getClass(), "user", null);
        setIntField(term141760, term141760.getClass(), "courseId", 0);
        setIntField(term141760, term141760.getClass(), "classId", 0);
        setIntField(term141760, term141760.getClass(), "playCount", 0);
        setIntField(term141760, term141760.getClass(), "theoryCount", 0);
        setIntField(term141760, term141760.getClass(), "scoreMax", 0);
        setBooleanField(term141760, term141760.getClass(), "isFullCombo", false);
        setBooleanField(term141760, term141760.getClass(), "isAllJustice", false);
        setBooleanField(term141760, term141760.getClass(), "isSuccess", false);
        setIntField(term141760, term141760.getClass(), "scoreRank", 0);
        setIntField(term141760, term141760.getClass(), "eventId", 0);
        setField(term141760, term141760.getClass(), "lastPlayDate", null);
        setIntField(term141760, term141760.getClass(), "param1", 0);
        setIntField(term141760, term141760.getClass(), "param2", 0);
        setIntField(term141760, term141760.getClass(), "param3", 0);
        setIntField(term141760, term141760.getClass(), "param4", 0);
        setIntField(term141760, term141760.getClass(), "orderId", 0);
        setIntField(term141760, term141760.getClass(), "playerRating", 0);
        setBooleanField(term141760, term141760.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassId", argTypes, term141760, args);
    }

};


