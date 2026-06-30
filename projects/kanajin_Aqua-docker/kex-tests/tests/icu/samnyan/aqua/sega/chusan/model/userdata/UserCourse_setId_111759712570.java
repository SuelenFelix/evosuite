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
import java.lang.Long;

public class UserCourse_setId_111759712570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142083;
     Object term142102;

    public UserCourse_setId_111759712570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142083 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse"));
        setLongField(term142083, term142083.getClass(), "id", 0L);
        setField(term142083, term142083.getClass(), "user", null);
        setIntField(term142083, term142083.getClass(), "courseId", 0);
        setIntField(term142083, term142083.getClass(), "classId", 0);
        setIntField(term142083, term142083.getClass(), "playCount", 0);
        setIntField(term142083, term142083.getClass(), "theoryCount", 0);
        setIntField(term142083, term142083.getClass(), "scoreMax", 0);
        setBooleanField(term142083, term142083.getClass(), "isFullCombo", false);
        setBooleanField(term142083, term142083.getClass(), "isAllJustice", false);
        setBooleanField(term142083, term142083.getClass(), "isSuccess", false);
        setIntField(term142083, term142083.getClass(), "scoreRank", 0);
        setIntField(term142083, term142083.getClass(), "eventId", 0);
        setField(term142083, term142083.getClass(), "lastPlayDate", null);
        setIntField(term142083, term142083.getClass(), "param1", 0);
        setIntField(term142083, term142083.getClass(), "param2", 0);
        setIntField(term142083, term142083.getClass(), "param3", 0);
        setIntField(term142083, term142083.getClass(), "param4", 0);
        setIntField(term142083, term142083.getClass(), "orderId", 0);
        setIntField(term142083, term142083.getClass(), "playerRating", 0);
        setBooleanField(term142083, term142083.getClass(), "isClear", false);
        term142102 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term142102;
        callMethod(klass, "setId", argTypes, term142083, args);
    }

};


