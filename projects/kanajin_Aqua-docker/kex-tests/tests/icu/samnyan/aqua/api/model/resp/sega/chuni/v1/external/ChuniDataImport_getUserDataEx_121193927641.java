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

public class ChuniDataImport_getUserDataEx_121193927641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104281;

    public ChuniDataImport_getUserDataEx_121193927641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104281 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport"));
        setField(term104281, term104281.getClass(), "gameId", null);
        setField(term104281, term104281.getClass(), "userData", null);
        setField(term104281, term104281.getClass(), "userActivityList", null);
        setField(term104281, term104281.getClass(), "userCharacterList", null);
        setField(term104281, term104281.getClass(), "userChargeList", null);
        setField(term104281, term104281.getClass(), "userCourseList", null);
        setField(term104281, term104281.getClass(), "userDataEx", null);
        setField(term104281, term104281.getClass(), "userDuelList", null);
        setField(term104281, term104281.getClass(), "userGameOption", null);
        setField(term104281, term104281.getClass(), "userGameOptionEx", null);
        setField(term104281, term104281.getClass(), "userItemList", null);
        setField(term104281, term104281.getClass(), "userMapList", null);
        setField(term104281, term104281.getClass(), "userMusicDetailList", null);
        setField(term104281, term104281.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserDataEx", argTypes, term104281, args);
    }

};


