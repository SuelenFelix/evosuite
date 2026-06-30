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

public class ChuniDataImport_setUserItemList_95598250758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104298;

    public ChuniDataImport_setUserItemList_95598250758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104298 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport"));
        setField(term104298, term104298.getClass(), "gameId", null);
        setField(term104298, term104298.getClass(), "userData", null);
        setField(term104298, term104298.getClass(), "userActivityList", null);
        setField(term104298, term104298.getClass(), "userCharacterList", null);
        setField(term104298, term104298.getClass(), "userChargeList", null);
        setField(term104298, term104298.getClass(), "userCourseList", null);
        setField(term104298, term104298.getClass(), "userDataEx", null);
        setField(term104298, term104298.getClass(), "userDuelList", null);
        setField(term104298, term104298.getClass(), "userGameOption", null);
        setField(term104298, term104298.getClass(), "userGameOptionEx", null);
        setField(term104298, term104298.getClass(), "userItemList", null);
        setField(term104298, term104298.getClass(), "userMapList", null);
        setField(term104298, term104298.getClass(), "userMusicDetailList", null);
        setField(term104298, term104298.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserItemList", argTypes, term104298, args);
    }

};


