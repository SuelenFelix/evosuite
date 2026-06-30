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
import java.lang.Long;

public class UserCourse_setId_61738867561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196863;
     Object term196879;

    public UserCourse_setId_61738867561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196863 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196863, term196863.getClass(), "id", 0L);
        setField(term196863, term196863.getClass(), "user", null);
        setIntField(term196863, term196863.getClass(), "courseId", 0);
        setIntField(term196863, term196863.getClass(), "classId", 0);
        setIntField(term196863, term196863.getClass(), "playCount", 0);
        setIntField(term196863, term196863.getClass(), "scoreMax", 0);
        setBooleanField(term196863, term196863.getClass(), "isFullCombo", false);
        setBooleanField(term196863, term196863.getClass(), "isAllJustice", false);
        setBooleanField(term196863, term196863.getClass(), "isSuccess", false);
        setIntField(term196863, term196863.getClass(), "scoreRank", 0);
        setIntField(term196863, term196863.getClass(), "eventId", 0);
        setField(term196863, term196863.getClass(), "lastPlayDate", null);
        setIntField(term196863, term196863.getClass(), "param1", 0);
        setIntField(term196863, term196863.getClass(), "param2", 0);
        setIntField(term196863, term196863.getClass(), "param3", 0);
        setIntField(term196863, term196863.getClass(), "param4", 0);
        setBooleanField(term196863, term196863.getClass(), "isClear", false);
        term196879 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term196879;
        callMethod(klass, "setId", argTypes, term196863, args);
    }

};


