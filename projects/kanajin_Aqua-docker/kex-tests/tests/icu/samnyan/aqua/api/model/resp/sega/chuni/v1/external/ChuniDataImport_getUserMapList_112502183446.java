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

public class ChuniDataImport_getUserMapList_112502183446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104286;

    public ChuniDataImport_getUserMapList_112502183446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104286 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport"));
        setField(term104286, term104286.getClass(), "gameId", null);
        setField(term104286, term104286.getClass(), "userData", null);
        setField(term104286, term104286.getClass(), "userActivityList", null);
        setField(term104286, term104286.getClass(), "userCharacterList", null);
        setField(term104286, term104286.getClass(), "userChargeList", null);
        setField(term104286, term104286.getClass(), "userCourseList", null);
        setField(term104286, term104286.getClass(), "userDataEx", null);
        setField(term104286, term104286.getClass(), "userDuelList", null);
        setField(term104286, term104286.getClass(), "userGameOption", null);
        setField(term104286, term104286.getClass(), "userGameOptionEx", null);
        setField(term104286, term104286.getClass(), "userItemList", null);
        setField(term104286, term104286.getClass(), "userMapList", null);
        setField(term104286, term104286.getClass(), "userMusicDetailList", null);
        setField(term104286, term104286.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMapList", argTypes, term104286, args);
    }

};


