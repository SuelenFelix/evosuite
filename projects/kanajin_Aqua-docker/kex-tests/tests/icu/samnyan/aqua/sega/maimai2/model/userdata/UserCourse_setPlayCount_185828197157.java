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

public class UserCourse_setPlayCount_185828197157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94195;
     Object term94205;

    public UserCourse_setPlayCount_185828197157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94195 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        setLongField(term94195, term94195.getClass(), "id", 0L);
        setField(term94195, term94195.getClass(), "user", null);
        setIntField(term94195, term94195.getClass(), "courseId", 0);
        setBooleanField(term94195, term94195.getClass(), "isLastClear", false);
        setIntField(term94195, term94195.getClass(), "totalRestlife", 0);
        setIntField(term94195, term94195.getClass(), "totalAchievement", 0);
        setIntField(term94195, term94195.getClass(), "totalDeluxscore", 0);
        setIntField(term94195, term94195.getClass(), "playCount", 0);
        setField(term94195, term94195.getClass(), "clearDate", null);
        setField(term94195, term94195.getClass(), "lastPlayDate", null);
        setIntField(term94195, term94195.getClass(), "bestAchievement", 0);
        setField(term94195, term94195.getClass(), "bestAchievementDate", null);
        setIntField(term94195, term94195.getClass(), "bestDeluxscore", 0);
        setField(term94195, term94195.getClass(), "bestDeluxscoreDate", null);
        term94205 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term94205;
        callMethod(klass, "setPlayCount", argTypes, term94195, args);
    }

};


