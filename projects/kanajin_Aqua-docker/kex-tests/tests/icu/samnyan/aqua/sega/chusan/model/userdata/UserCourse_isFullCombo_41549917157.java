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

public class UserCourse_isFullCombo_41549917157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141836;

    public UserCourse_isFullCombo_41549917157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141836 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term141836, term141836.getClass(), "id", 0L);
        setField(term141836, term141836.getClass(), "user", null);
        setIntField(term141836, term141836.getClass(), "courseId", 0);
        setIntField(term141836, term141836.getClass(), "classId", 0);
        setIntField(term141836, term141836.getClass(), "playCount", 0);
        setIntField(term141836, term141836.getClass(), "theoryCount", 0);
        setIntField(term141836, term141836.getClass(), "scoreMax", 0);
        setBooleanField(term141836, term141836.getClass(), "isFullCombo", false);
        setBooleanField(term141836, term141836.getClass(), "isAllJustice", false);
        setBooleanField(term141836, term141836.getClass(), "isSuccess", false);
        setIntField(term141836, term141836.getClass(), "scoreRank", 0);
        setIntField(term141836, term141836.getClass(), "eventId", 0);
        setField(term141836, term141836.getClass(), "lastPlayDate", null);
        setIntField(term141836, term141836.getClass(), "param1", 0);
        setIntField(term141836, term141836.getClass(), "param2", 0);
        setIntField(term141836, term141836.getClass(), "param3", 0);
        setIntField(term141836, term141836.getClass(), "param4", 0);
        setIntField(term141836, term141836.getClass(), "orderId", 0);
        setIntField(term141836, term141836.getClass(), "playerRating", 0);
        setBooleanField(term141836, term141836.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullCombo", argTypes, term141836, args);
    }

};


