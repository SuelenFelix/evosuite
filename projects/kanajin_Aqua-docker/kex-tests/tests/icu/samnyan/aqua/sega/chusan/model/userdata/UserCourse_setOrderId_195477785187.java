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
import java.lang.Integer;

public class UserCourse_setOrderId_195477785187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142436;
     Object term142455;

    public UserCourse_setOrderId_195477785187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142436 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term142436, term142436.getClass(), "id", 0L);
        setField(term142436, term142436.getClass(), "user", null);
        setIntField(term142436, term142436.getClass(), "courseId", 0);
        setIntField(term142436, term142436.getClass(), "classId", 0);
        setIntField(term142436, term142436.getClass(), "playCount", 0);
        setIntField(term142436, term142436.getClass(), "theoryCount", 0);
        setIntField(term142436, term142436.getClass(), "scoreMax", 0);
        setBooleanField(term142436, term142436.getClass(), "isFullCombo", false);
        setBooleanField(term142436, term142436.getClass(), "isAllJustice", false);
        setBooleanField(term142436, term142436.getClass(), "isSuccess", false);
        setIntField(term142436, term142436.getClass(), "scoreRank", 0);
        setIntField(term142436, term142436.getClass(), "eventId", 0);
        setField(term142436, term142436.getClass(), "lastPlayDate", null);
        setIntField(term142436, term142436.getClass(), "param1", 0);
        setIntField(term142436, term142436.getClass(), "param2", 0);
        setIntField(term142436, term142436.getClass(), "param3", 0);
        setIntField(term142436, term142436.getClass(), "param4", 0);
        setIntField(term142436, term142436.getClass(), "orderId", 0);
        setIntField(term142436, term142436.getClass(), "playerRating", 0);
        setBooleanField(term142436, term142436.getClass(), "isClear", false);
        term142455 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term142455;
        callMethod(klass, "setOrderId", argTypes, term142436, args);
    }

};


