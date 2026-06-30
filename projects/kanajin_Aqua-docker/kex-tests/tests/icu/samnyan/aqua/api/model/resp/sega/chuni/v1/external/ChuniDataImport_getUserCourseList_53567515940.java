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

public class ChuniDataImport_getUserCourseList_53567515940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104280;

    public ChuniDataImport_getUserCourseList_53567515940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104280 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport"));
        setField(term104280, term104280.getClass(), "gameId", null);
        setField(term104280, term104280.getClass(), "userData", null);
        setField(term104280, term104280.getClass(), "userActivityList", null);
        setField(term104280, term104280.getClass(), "userCharacterList", null);
        setField(term104280, term104280.getClass(), "userChargeList", null);
        setField(term104280, term104280.getClass(), "userCourseList", null);
        setField(term104280, term104280.getClass(), "userDataEx", null);
        setField(term104280, term104280.getClass(), "userDuelList", null);
        setField(term104280, term104280.getClass(), "userGameOption", null);
        setField(term104280, term104280.getClass(), "userGameOptionEx", null);
        setField(term104280, term104280.getClass(), "userItemList", null);
        setField(term104280, term104280.getClass(), "userMapList", null);
        setField(term104280, term104280.getClass(), "userMusicDetailList", null);
        setField(term104280, term104280.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCourseList", argTypes, term104280, args);
    }

};


