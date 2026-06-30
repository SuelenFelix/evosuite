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

public class ChuniDataExport_getUserGameOption_108910864415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61802;

    public ChuniDataExport_getUserGameOption_108910864415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61802 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term61802, term61802.getClass(), "gameId", null);
        setField(term61802, term61802.getClass(), "userData", null);
        setField(term61802, term61802.getClass(), "userActivityList", null);
        setField(term61802, term61802.getClass(), "userCharacterList", null);
        setField(term61802, term61802.getClass(), "userChargeList", null);
        setField(term61802, term61802.getClass(), "userCourseList", null);
        setField(term61802, term61802.getClass(), "userDuelList", null);
        setField(term61802, term61802.getClass(), "userGameOption", null);
        setField(term61802, term61802.getClass(), "userItemList", null);
        setField(term61802, term61802.getClass(), "userMapList", null);
        setField(term61802, term61802.getClass(), "userMusicDetailList", null);
        setField(term61802, term61802.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserGameOption", argTypes, term61802, args);
    }

};


