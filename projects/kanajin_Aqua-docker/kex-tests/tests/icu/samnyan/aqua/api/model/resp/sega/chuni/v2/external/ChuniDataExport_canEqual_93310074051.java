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

public class ChuniDataExport_canEqual_93310074051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325265;

    public ChuniDataExport_canEqual_93310074051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325265 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term325265, term325265.getClass(), "gameId", null);
        setField(term325265, term325265.getClass(), "userData", null);
        setField(term325265, term325265.getClass(), "userActivityList", null);
        setField(term325265, term325265.getClass(), "userCharacterList", null);
        setField(term325265, term325265.getClass(), "userChargeList", null);
        setField(term325265, term325265.getClass(), "userCourseList", null);
        setField(term325265, term325265.getClass(), "userDuelList", null);
        setField(term325265, term325265.getClass(), "userGameOption", null);
        setField(term325265, term325265.getClass(), "userItemList", null);
        setField(term325265, term325265.getClass(), "userMapList", null);
        setField(term325265, term325265.getClass(), "userMusicDetailList", null);
        setField(term325265, term325265.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term325265, args);
    }

};


