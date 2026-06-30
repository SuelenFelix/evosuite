package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMusicDetail_getLevel_81529027535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188531;

    public UserMusicDetail_getLevel_81529027535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188531 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188531, term188531.getClass(), "id", 0L);
        setField(term188531, term188531.getClass(), "user", null);
        setIntField(term188531, term188531.getClass(), "musicId", 0);
        setIntField(term188531, term188531.getClass(), "level", 0);
        setIntField(term188531, term188531.getClass(), "playCount", 0);
        setIntField(term188531, term188531.getClass(), "scoreMax", 0);
        setIntField(term188531, term188531.getClass(), "syncRateMax", 0);
        setBooleanField(term188531, term188531.getClass(), "isAllPerfect", false);
        setIntField(term188531, term188531.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188531, term188531.getClass(), "fullCombo", 0);
        setIntField(term188531, term188531.getClass(), "maxFever", 0);
        setIntField(term188531, term188531.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term188531, args);
    }

};


