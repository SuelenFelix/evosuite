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

public class ChuniDataExport_getUserMusicDetailList_39168537821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68183;

    public ChuniDataExport_getUserMusicDetailList_39168537821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68183 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term68183, term68183.getClass(), "gameId", null);
        setField(term68183, term68183.getClass(), "userData", null);
        setField(term68183, term68183.getClass(), "userActivityList", null);
        setField(term68183, term68183.getClass(), "userCharacterList", null);
        setField(term68183, term68183.getClass(), "userChargeList", null);
        setField(term68183, term68183.getClass(), "userCourseList", null);
        setField(term68183, term68183.getClass(), "userDuelList", null);
        setField(term68183, term68183.getClass(), "userGameOption", null);
        setField(term68183, term68183.getClass(), "userItemList", null);
        setField(term68183, term68183.getClass(), "userMapList", null);
        setField(term68183, term68183.getClass(), "userMusicDetailList", null);
        setField(term68183, term68183.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMusicDetailList", argTypes, term68183, args);
    }

};


