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

public class UserCourse_getId_161384082744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196591;

    public UserCourse_getId_161384082744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196591 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        setLongField(term196591, term196591.getClass(), "id", 0L);
        setField(term196591, term196591.getClass(), "user", null);
        setIntField(term196591, term196591.getClass(), "courseId", 0);
        setIntField(term196591, term196591.getClass(), "classId", 0);
        setIntField(term196591, term196591.getClass(), "playCount", 0);
        setIntField(term196591, term196591.getClass(), "scoreMax", 0);
        setBooleanField(term196591, term196591.getClass(), "isFullCombo", false);
        setBooleanField(term196591, term196591.getClass(), "isAllJustice", false);
        setBooleanField(term196591, term196591.getClass(), "isSuccess", false);
        setIntField(term196591, term196591.getClass(), "scoreRank", 0);
        setIntField(term196591, term196591.getClass(), "eventId", 0);
        setField(term196591, term196591.getClass(), "lastPlayDate", null);
        setIntField(term196591, term196591.getClass(), "param1", 0);
        setIntField(term196591, term196591.getClass(), "param2", 0);
        setIntField(term196591, term196591.getClass(), "param3", 0);
        setIntField(term196591, term196591.getClass(), "param4", 0);
        setBooleanField(term196591, term196591.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term196591, args);
    }

};


