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

public class ChuniDataImport_setUserDuelList_170675910948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165977;

    public ChuniDataImport_setUserDuelList_170675910948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165977 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport"));
        setField(term165977, term165977.getClass(), "gameId", null);
        setField(term165977, term165977.getClass(), "userData", null);
        setField(term165977, term165977.getClass(), "userActivityList", null);
        setField(term165977, term165977.getClass(), "userCharacterList", null);
        setField(term165977, term165977.getClass(), "userChargeList", null);
        setField(term165977, term165977.getClass(), "userCourseList", null);
        setField(term165977, term165977.getClass(), "userDuelList", null);
        setField(term165977, term165977.getClass(), "userGameOption", null);
        setField(term165977, term165977.getClass(), "userItemList", null);
        setField(term165977, term165977.getClass(), "userMapList", null);
        setField(term165977, term165977.getClass(), "userMusicDetailList", null);
        setField(term165977, term165977.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserDuelList", argTypes, term165977, args);
    }

};


