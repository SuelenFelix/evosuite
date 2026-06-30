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

public class UserCourse_getClassId_166965555947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196639;

    public UserCourse_getClassId_166965555947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196639 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196639, term196639.getClass(), "id", 0L);
        setField(term196639, term196639.getClass(), "user", null);
        setIntField(term196639, term196639.getClass(), "courseId", 0);
        setIntField(term196639, term196639.getClass(), "classId", 0);
        setIntField(term196639, term196639.getClass(), "playCount", 0);
        setIntField(term196639, term196639.getClass(), "scoreMax", 0);
        setBooleanField(term196639, term196639.getClass(), "isFullCombo", false);
        setBooleanField(term196639, term196639.getClass(), "isAllJustice", false);
        setBooleanField(term196639, term196639.getClass(), "isSuccess", false);
        setIntField(term196639, term196639.getClass(), "scoreRank", 0);
        setIntField(term196639, term196639.getClass(), "eventId", 0);
        setField(term196639, term196639.getClass(), "lastPlayDate", null);
        setIntField(term196639, term196639.getClass(), "param1", 0);
        setIntField(term196639, term196639.getClass(), "param2", 0);
        setIntField(term196639, term196639.getClass(), "param3", 0);
        setIntField(term196639, term196639.getClass(), "param4", 0);
        setBooleanField(term196639, term196639.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassId", argTypes, term196639, args);
    }

};


