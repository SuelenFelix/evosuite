package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChuniDataExport_getUserGameOptionEx_59501894319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479309;

    public ChuniDataExport_getUserGameOptionEx_59501894319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479309 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term479309, term479309.getClass(), "gameId", null);
        setField(term479309, term479309.getClass(), "userData", null);
        setField(term479309, term479309.getClass(), "userActivityList", null);
        setField(term479309, term479309.getClass(), "userCharacterList", null);
        setField(term479309, term479309.getClass(), "userChargeList", null);
        setField(term479309, term479309.getClass(), "userCourseList", null);
        setField(term479309, term479309.getClass(), "userDataEx", null);
        setField(term479309, term479309.getClass(), "userDuelList", null);
        setField(term479309, term479309.getClass(), "userGameOption", null);
        setField(term479309, term479309.getClass(), "userGameOptionEx", null);
        setField(term479309, term479309.getClass(), "userItemList", null);
        setField(term479309, term479309.getClass(), "userMapList", null);
        setField(term479309, term479309.getClass(), "userMusicDetailList", null);
        setField(term479309, term479309.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserGameOptionEx", argTypes, term479309, args);
    }

};


