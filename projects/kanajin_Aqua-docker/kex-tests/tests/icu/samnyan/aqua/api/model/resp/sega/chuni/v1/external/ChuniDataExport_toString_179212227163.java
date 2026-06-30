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

public class ChuniDataExport_toString_179212227163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518419;

    public ChuniDataExport_toString_179212227163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term518419 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term518419, term518419.getClass(), "gameId", null);
        setField(term518419, term518419.getClass(), "userData", null);
        setField(term518419, term518419.getClass(), "userActivityList", null);
        setField(term518419, term518419.getClass(), "userCharacterList", null);
        setField(term518419, term518419.getClass(), "userChargeList", null);
        setField(term518419, term518419.getClass(), "userCourseList", null);
        setField(term518419, term518419.getClass(), "userDataEx", null);
        setField(term518419, term518419.getClass(), "userDuelList", null);
        setField(term518419, term518419.getClass(), "userGameOption", null);
        setField(term518419, term518419.getClass(), "userGameOptionEx", null);
        setField(term518419, term518419.getClass(), "userItemList", null);
        setField(term518419, term518419.getClass(), "userMapList", null);
        setField(term518419, term518419.getClass(), "userMusicDetailList", null);
        setField(term518419, term518419.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term518419, args);
    }

};


