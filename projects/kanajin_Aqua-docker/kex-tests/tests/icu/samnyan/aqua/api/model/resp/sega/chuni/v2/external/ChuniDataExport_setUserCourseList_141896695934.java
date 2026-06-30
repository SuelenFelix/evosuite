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

public class ChuniDataExport_setUserCourseList_141896695934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84074;

    public ChuniDataExport_setUserCourseList_141896695934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84074 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term84074, term84074.getClass(), "gameId", null);
        setField(term84074, term84074.getClass(), "userData", null);
        setField(term84074, term84074.getClass(), "userActivityList", null);
        setField(term84074, term84074.getClass(), "userCharacterList", null);
        setField(term84074, term84074.getClass(), "userChargeList", null);
        setField(term84074, term84074.getClass(), "userCourseList", null);
        setField(term84074, term84074.getClass(), "userDuelList", null);
        setField(term84074, term84074.getClass(), "userGameOption", null);
        setField(term84074, term84074.getClass(), "userItemList", null);
        setField(term84074, term84074.getClass(), "userMapList", null);
        setField(term84074, term84074.getClass(), "userMusicDetailList", null);
        setField(term84074, term84074.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserCourseList", argTypes, term84074, args);
    }

};


