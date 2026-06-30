package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChuniDataExport_getUserActivityList_7124447655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51026;

    public ChuniDataExport_getUserActivityList_7124447655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51026 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term51026, term51026.getClass(), "gameId", null);
        setField(term51026, term51026.getClass(), "userData", null);
        setField(term51026, term51026.getClass(), "userActivityList", null);
        setField(term51026, term51026.getClass(), "userCharacterList", null);
        setField(term51026, term51026.getClass(), "userChargeList", null);
        setField(term51026, term51026.getClass(), "userCourseList", null);
        setField(term51026, term51026.getClass(), "userDuelList", null);
        setField(term51026, term51026.getClass(), "userGameOption", null);
        setField(term51026, term51026.getClass(), "userItemList", null);
        setField(term51026, term51026.getClass(), "userMapList", null);
        setField(term51026, term51026.getClass(), "userMusicDetailList", null);
        setField(term51026, term51026.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserActivityList", argTypes, term51026, args);
    }

};


