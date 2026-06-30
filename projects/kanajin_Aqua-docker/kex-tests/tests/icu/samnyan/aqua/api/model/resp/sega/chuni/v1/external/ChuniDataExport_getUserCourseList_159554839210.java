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

public class ChuniDataExport_getUserCourseList_159554839210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113956;

    public ChuniDataExport_getUserCourseList_159554839210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113956 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term113956, term113956.getClass(), "gameId", null);
        setField(term113956, term113956.getClass(), "userData", null);
        setField(term113956, term113956.getClass(), "userActivityList", null);
        setField(term113956, term113956.getClass(), "userCharacterList", null);
        setField(term113956, term113956.getClass(), "userChargeList", null);
        setField(term113956, term113956.getClass(), "userCourseList", null);
        setField(term113956, term113956.getClass(), "userDataEx", null);
        setField(term113956, term113956.getClass(), "userDuelList", null);
        setField(term113956, term113956.getClass(), "userGameOption", null);
        setField(term113956, term113956.getClass(), "userGameOptionEx", null);
        setField(term113956, term113956.getClass(), "userItemList", null);
        setField(term113956, term113956.getClass(), "userMapList", null);
        setField(term113956, term113956.getClass(), "userMusicDetailList", null);
        setField(term113956, term113956.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCourseList", argTypes, term113956, args);
    }

};


