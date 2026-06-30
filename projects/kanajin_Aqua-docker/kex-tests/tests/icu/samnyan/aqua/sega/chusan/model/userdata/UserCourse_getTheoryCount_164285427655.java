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

public class UserCourse_getTheoryCount_164285427655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141798;

    public UserCourse_getTheoryCount_164285427655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141798 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term141798, term141798.getClass(), "id", 0L);
        setField(term141798, term141798.getClass(), "user", null);
        setIntField(term141798, term141798.getClass(), "courseId", 0);
        setIntField(term141798, term141798.getClass(), "classId", 0);
        setIntField(term141798, term141798.getClass(), "playCount", 0);
        setIntField(term141798, term141798.getClass(), "theoryCount", 0);
        setIntField(term141798, term141798.getClass(), "scoreMax", 0);
        setBooleanField(term141798, term141798.getClass(), "isFullCombo", false);
        setBooleanField(term141798, term141798.getClass(), "isAllJustice", false);
        setBooleanField(term141798, term141798.getClass(), "isSuccess", false);
        setIntField(term141798, term141798.getClass(), "scoreRank", 0);
        setIntField(term141798, term141798.getClass(), "eventId", 0);
        setField(term141798, term141798.getClass(), "lastPlayDate", null);
        setIntField(term141798, term141798.getClass(), "param1", 0);
        setIntField(term141798, term141798.getClass(), "param2", 0);
        setIntField(term141798, term141798.getClass(), "param3", 0);
        setIntField(term141798, term141798.getClass(), "param4", 0);
        setIntField(term141798, term141798.getClass(), "orderId", 0);
        setIntField(term141798, term141798.getClass(), "playerRating", 0);
        setBooleanField(term141798, term141798.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTheoryCount", argTypes, term141798, args);
    }

};


