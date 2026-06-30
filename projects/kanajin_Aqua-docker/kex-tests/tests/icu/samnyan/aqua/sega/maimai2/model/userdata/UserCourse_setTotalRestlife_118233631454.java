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

public class UserCourse_setTotalRestlife_118233631454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94159;
     Object term94169;

    public UserCourse_setTotalRestlife_118233631454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94159 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94159, term94159.getClass(), "id", 0L);
        setField(term94159, term94159.getClass(), "user", null);
        setIntField(term94159, term94159.getClass(), "courseId", 0);
        setBooleanField(term94159, term94159.getClass(), "isLastClear", false);
        setIntField(term94159, term94159.getClass(), "totalRestlife", 0);
        setIntField(term94159, term94159.getClass(), "totalAchievement", 0);
        setIntField(term94159, term94159.getClass(), "totalDeluxscore", 0);
        setIntField(term94159, term94159.getClass(), "playCount", 0);
        setField(term94159, term94159.getClass(), "clearDate", null);
        setField(term94159, term94159.getClass(), "lastPlayDate", null);
        setIntField(term94159, term94159.getClass(), "bestAchievement", 0);
        setField(term94159, term94159.getClass(), "bestAchievementDate", null);
        setIntField(term94159, term94159.getClass(), "bestDeluxscore", 0);
        setField(term94159, term94159.getClass(), "bestDeluxscoreDate", null);
        term94169 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term94169;
        callMethod(klass, "setTotalRestlife", argTypes, term94159, args);
    }

};


