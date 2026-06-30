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

public class ChuniDataImport_setUserMapList_174403504459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104299;

    public ChuniDataImport_setUserMapList_174403504459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104299 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport"));
        setField(term104299, term104299.getClass(), "gameId", null);
        setField(term104299, term104299.getClass(), "userData", null);
        setField(term104299, term104299.getClass(), "userActivityList", null);
        setField(term104299, term104299.getClass(), "userCharacterList", null);
        setField(term104299, term104299.getClass(), "userChargeList", null);
        setField(term104299, term104299.getClass(), "userCourseList", null);
        setField(term104299, term104299.getClass(), "userDataEx", null);
        setField(term104299, term104299.getClass(), "userDuelList", null);
        setField(term104299, term104299.getClass(), "userGameOption", null);
        setField(term104299, term104299.getClass(), "userGameOptionEx", null);
        setField(term104299, term104299.getClass(), "userItemList", null);
        setField(term104299, term104299.getClass(), "userMapList", null);
        setField(term104299, term104299.getClass(), "userMusicDetailList", null);
        setField(term104299, term104299.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserMapList", argTypes, term104299, args);
    }

};


