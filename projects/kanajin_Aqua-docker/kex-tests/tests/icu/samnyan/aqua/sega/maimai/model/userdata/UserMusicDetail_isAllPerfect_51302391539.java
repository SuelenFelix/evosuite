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

public class UserMusicDetail_isAllPerfect_51302391539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188579;

    public UserMusicDetail_isAllPerfect_51302391539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188579 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188579, term188579.getClass(), "id", 0L);
        setField(term188579, term188579.getClass(), "user", null);
        setIntField(term188579, term188579.getClass(), "musicId", 0);
        setIntField(term188579, term188579.getClass(), "level", 0);
        setIntField(term188579, term188579.getClass(), "playCount", 0);
        setIntField(term188579, term188579.getClass(), "scoreMax", 0);
        setIntField(term188579, term188579.getClass(), "syncRateMax", 0);
        setBooleanField(term188579, term188579.getClass(), "isAllPerfect", false);
        setIntField(term188579, term188579.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188579, term188579.getClass(), "fullCombo", 0);
        setIntField(term188579, term188579.getClass(), "maxFever", 0);
        setIntField(term188579, term188579.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllPerfect", argTypes, term188579, args);
    }

};


