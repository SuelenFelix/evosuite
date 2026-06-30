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

public class ChuniDataImport_getUserGameOptionEx_46485429043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3888827;

    public ChuniDataImport_getUserGameOptionEx_46485429043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3888827 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport"));
        setField(term3888827, term3888827.getClass(), "gameId", null);
        setField(term3888827, term3888827.getClass(), "userData", null);
        setField(term3888827, term3888827.getClass(), "userActivityList", null);
        setField(term3888827, term3888827.getClass(), "userCharacterList", null);
        setField(term3888827, term3888827.getClass(), "userChargeList", null);
        setField(term3888827, term3888827.getClass(), "userCourseList", null);
        setField(term3888827, term3888827.getClass(), "userDataEx", null);
        setField(term3888827, term3888827.getClass(), "userDuelList", null);
        setField(term3888827, term3888827.getClass(), "userGameOption", null);
        setField(term3888827, term3888827.getClass(), "userGameOptionEx", null);
        setField(term3888827, term3888827.getClass(), "userItemList", null);
        setField(term3888827, term3888827.getClass(), "userMapList", null);
        setField(term3888827, term3888827.getClass(), "userMusicDetailList", null);
        setField(term3888827, term3888827.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserGameOptionEx", argTypes, term3888827, args);
    }

};


