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

public class ChuniDataExport_getUserCharacterList_10440606526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110283;

    public ChuniDataExport_getUserCharacterList_10440606526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110283 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term110283, term110283.getClass(), "gameId", null);
        setField(term110283, term110283.getClass(), "userData", null);
        setField(term110283, term110283.getClass(), "userActivityList", null);
        setField(term110283, term110283.getClass(), "userCharacterList", null);
        setField(term110283, term110283.getClass(), "userChargeList", null);
        setField(term110283, term110283.getClass(), "userCourseList", null);
        setField(term110283, term110283.getClass(), "userDataEx", null);
        setField(term110283, term110283.getClass(), "userDuelList", null);
        setField(term110283, term110283.getClass(), "userGameOption", null);
        setField(term110283, term110283.getClass(), "userGameOptionEx", null);
        setField(term110283, term110283.getClass(), "userItemList", null);
        setField(term110283, term110283.getClass(), "userMapList", null);
        setField(term110283, term110283.getClass(), "userMusicDetailList", null);
        setField(term110283, term110283.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCharacterList", argTypes, term110283, args);
    }

};


