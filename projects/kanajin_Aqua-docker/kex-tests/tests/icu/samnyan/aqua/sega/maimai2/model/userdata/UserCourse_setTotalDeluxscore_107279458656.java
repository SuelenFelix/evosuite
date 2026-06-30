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

public class UserCourse_setTotalDeluxscore_107279458656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94183;
     Object term94193;

    public UserCourse_setTotalDeluxscore_107279458656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94183 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94183, term94183.getClass(), "id", 0L);
        setField(term94183, term94183.getClass(), "user", null);
        setIntField(term94183, term94183.getClass(), "courseId", 0);
        setBooleanField(term94183, term94183.getClass(), "isLastClear", false);
        setIntField(term94183, term94183.getClass(), "totalRestlife", 0);
        setIntField(term94183, term94183.getClass(), "totalAchievement", 0);
        setIntField(term94183, term94183.getClass(), "totalDeluxscore", 0);
        setIntField(term94183, term94183.getClass(), "playCount", 0);
        setField(term94183, term94183.getClass(), "clearDate", null);
        setField(term94183, term94183.getClass(), "lastPlayDate", null);
        setIntField(term94183, term94183.getClass(), "bestAchievement", 0);
        setField(term94183, term94183.getClass(), "bestAchievementDate", null);
        setIntField(term94183, term94183.getClass(), "bestDeluxscore", 0);
        setField(term94183, term94183.getClass(), "bestDeluxscoreDate", null);
        term94193 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term94193;
        callMethod(klass, "setTotalDeluxscore", argTypes, term94183, args);
    }

};


