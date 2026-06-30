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

public class UserCourse_setClassId_107269185564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196915;
     Object term196931;

    public UserCourse_setClassId_107269185564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196915 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196915, term196915.getClass(), "id", 0L);
        setField(term196915, term196915.getClass(), "user", null);
        setIntField(term196915, term196915.getClass(), "courseId", 0);
        setIntField(term196915, term196915.getClass(), "classId", 0);
        setIntField(term196915, term196915.getClass(), "playCount", 0);
        setIntField(term196915, term196915.getClass(), "scoreMax", 0);
        setBooleanField(term196915, term196915.getClass(), "isFullCombo", false);
        setBooleanField(term196915, term196915.getClass(), "isAllJustice", false);
        setBooleanField(term196915, term196915.getClass(), "isSuccess", false);
        setIntField(term196915, term196915.getClass(), "scoreRank", 0);
        setIntField(term196915, term196915.getClass(), "eventId", 0);
        setField(term196915, term196915.getClass(), "lastPlayDate", null);
        setIntField(term196915, term196915.getClass(), "param1", 0);
        setIntField(term196915, term196915.getClass(), "param2", 0);
        setIntField(term196915, term196915.getClass(), "param3", 0);
        setIntField(term196915, term196915.getClass(), "param4", 0);
        setBooleanField(term196915, term196915.getClass(), "isClear", false);
        term196931 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term196931;
        callMethod(klass, "setClassId", argTypes, term196915, args);
    }

};


