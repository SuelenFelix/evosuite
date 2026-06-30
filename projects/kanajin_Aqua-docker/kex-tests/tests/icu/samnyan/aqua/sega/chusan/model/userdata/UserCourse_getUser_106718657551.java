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

public class UserCourse_getUser_106718657551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141722;

    public UserCourse_getUser_106718657551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141722 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term141722, term141722.getClass(), "id", 0L);
        setField(term141722, term141722.getClass(), "user", null);
        setIntField(term141722, term141722.getClass(), "courseId", 0);
        setIntField(term141722, term141722.getClass(), "classId", 0);
        setIntField(term141722, term141722.getClass(), "playCount", 0);
        setIntField(term141722, term141722.getClass(), "theoryCount", 0);
        setIntField(term141722, term141722.getClass(), "scoreMax", 0);
        setBooleanField(term141722, term141722.getClass(), "isFullCombo", false);
        setBooleanField(term141722, term141722.getClass(), "isAllJustice", false);
        setBooleanField(term141722, term141722.getClass(), "isSuccess", false);
        setIntField(term141722, term141722.getClass(), "scoreRank", 0);
        setIntField(term141722, term141722.getClass(), "eventId", 0);
        setField(term141722, term141722.getClass(), "lastPlayDate", null);
        setIntField(term141722, term141722.getClass(), "param1", 0);
        setIntField(term141722, term141722.getClass(), "param2", 0);
        setIntField(term141722, term141722.getClass(), "param3", 0);
        setIntField(term141722, term141722.getClass(), "param4", 0);
        setIntField(term141722, term141722.getClass(), "orderId", 0);
        setIntField(term141722, term141722.getClass(), "playerRating", 0);
        setBooleanField(term141722, term141722.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term141722, args);
    }

};


