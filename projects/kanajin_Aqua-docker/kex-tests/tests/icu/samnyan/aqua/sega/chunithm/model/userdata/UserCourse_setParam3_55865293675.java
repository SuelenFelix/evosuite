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

public class UserCourse_setParam3_55865293675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197111;
     Object term197127;

    public UserCourse_setParam3_55865293675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197111 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term197111, term197111.getClass(), "id", 0L);
        setField(term197111, term197111.getClass(), "user", null);
        setIntField(term197111, term197111.getClass(), "courseId", 0);
        setIntField(term197111, term197111.getClass(), "classId", 0);
        setIntField(term197111, term197111.getClass(), "playCount", 0);
        setIntField(term197111, term197111.getClass(), "scoreMax", 0);
        setBooleanField(term197111, term197111.getClass(), "isFullCombo", false);
        setBooleanField(term197111, term197111.getClass(), "isAllJustice", false);
        setBooleanField(term197111, term197111.getClass(), "isSuccess", false);
        setIntField(term197111, term197111.getClass(), "scoreRank", 0);
        setIntField(term197111, term197111.getClass(), "eventId", 0);
        setField(term197111, term197111.getClass(), "lastPlayDate", null);
        setIntField(term197111, term197111.getClass(), "param1", 0);
        setIntField(term197111, term197111.getClass(), "param2", 0);
        setIntField(term197111, term197111.getClass(), "param3", 0);
        setIntField(term197111, term197111.getClass(), "param4", 0);
        setBooleanField(term197111, term197111.getClass(), "isClear", false);
        term197127 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term197127;
        callMethod(klass, "setParam3", argTypes, term197111, args);
    }

};


