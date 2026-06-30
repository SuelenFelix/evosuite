package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserCourse_setCourseId_115539368452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94135;
     Object term94145;

    public UserCourse_setCourseId_115539368452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94135 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94135, term94135.getClass(), "id", 0L);
        setField(term94135, term94135.getClass(), "user", null);
        setIntField(term94135, term94135.getClass(), "courseId", 0);
        setBooleanField(term94135, term94135.getClass(), "isLastClear", false);
        setIntField(term94135, term94135.getClass(), "totalRestlife", 0);
        setIntField(term94135, term94135.getClass(), "totalAchievement", 0);
        setIntField(term94135, term94135.getClass(), "totalDeluxscore", 0);
        setIntField(term94135, term94135.getClass(), "playCount", 0);
        setField(term94135, term94135.getClass(), "clearDate", null);
        setField(term94135, term94135.getClass(), "lastPlayDate", null);
        setIntField(term94135, term94135.getClass(), "bestAchievement", 0);
        setField(term94135, term94135.getClass(), "bestAchievementDate", null);
        setIntField(term94135, term94135.getClass(), "bestDeluxscore", 0);
        setField(term94135, term94135.getClass(), "bestDeluxscoreDate", null);
        term94145 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term94145;
        callMethod(klass, "setCourseId", argTypes, term94135, args);
    }

};


