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
import java.lang.Boolean;

public class UserCourse_setClear_72818916189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142478;
     Object term142497;

    public UserCourse_setClear_72818916189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142478 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term142478, term142478.getClass(), "id", 0L);
        setField(term142478, term142478.getClass(), "user", null);
        setIntField(term142478, term142478.getClass(), "courseId", 0);
        setIntField(term142478, term142478.getClass(), "classId", 0);
        setIntField(term142478, term142478.getClass(), "playCount", 0);
        setIntField(term142478, term142478.getClass(), "theoryCount", 0);
        setIntField(term142478, term142478.getClass(), "scoreMax", 0);
        setBooleanField(term142478, term142478.getClass(), "isFullCombo", false);
        setBooleanField(term142478, term142478.getClass(), "isAllJustice", false);
        setBooleanField(term142478, term142478.getClass(), "isSuccess", false);
        setIntField(term142478, term142478.getClass(), "scoreRank", 0);
        setIntField(term142478, term142478.getClass(), "eventId", 0);
        setField(term142478, term142478.getClass(), "lastPlayDate", null);
        setIntField(term142478, term142478.getClass(), "param1", 0);
        setIntField(term142478, term142478.getClass(), "param2", 0);
        setIntField(term142478, term142478.getClass(), "param3", 0);
        setIntField(term142478, term142478.getClass(), "param4", 0);
        setIntField(term142478, term142478.getClass(), "orderId", 0);
        setIntField(term142478, term142478.getClass(), "playerRating", 0);
        setBooleanField(term142478, term142478.getClass(), "isClear", false);
        term142497 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term142497;
        callMethod(klass, "setClear", argTypes, term142478, args);
    }

};


