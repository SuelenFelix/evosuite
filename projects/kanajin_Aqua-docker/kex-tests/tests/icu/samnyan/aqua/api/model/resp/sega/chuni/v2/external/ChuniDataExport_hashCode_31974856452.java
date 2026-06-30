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

public class ChuniDataExport_hashCode_31974856452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102642;

    public ChuniDataExport_hashCode_31974856452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102642 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term102642, term102642.getClass(), "gameId", null);
        setField(term102642, term102642.getClass(), "userData", null);
        setField(term102642, term102642.getClass(), "userActivityList", null);
        setField(term102642, term102642.getClass(), "userCharacterList", null);
        setField(term102642, term102642.getClass(), "userChargeList", null);
        setField(term102642, term102642.getClass(), "userCourseList", null);
        setField(term102642, term102642.getClass(), "userDuelList", null);
        setField(term102642, term102642.getClass(), "userGameOption", null);
        setField(term102642, term102642.getClass(), "userItemList", null);
        setField(term102642, term102642.getClass(), "userMapList", null);
        setField(term102642, term102642.getClass(), "userMusicDetailList", null);
        setField(term102642, term102642.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term102642, args);
    }

};


