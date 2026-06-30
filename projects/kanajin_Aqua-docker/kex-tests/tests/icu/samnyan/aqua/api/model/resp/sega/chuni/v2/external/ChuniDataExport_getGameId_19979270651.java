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

public class ChuniDataExport_getGameId_19979270651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47172;

    public ChuniDataExport_getGameId_19979270651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47172 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term47172, term47172.getClass(), "gameId", null);
        setField(term47172, term47172.getClass(), "userData", null);
        setField(term47172, term47172.getClass(), "userActivityList", null);
        setField(term47172, term47172.getClass(), "userCharacterList", null);
        setField(term47172, term47172.getClass(), "userChargeList", null);
        setField(term47172, term47172.getClass(), "userCourseList", null);
        setField(term47172, term47172.getClass(), "userDuelList", null);
        setField(term47172, term47172.getClass(), "userGameOption", null);
        setField(term47172, term47172.getClass(), "userItemList", null);
        setField(term47172, term47172.getClass(), "userMapList", null);
        setField(term47172, term47172.getClass(), "userMusicDetailList", null);
        setField(term47172, term47172.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameId", argTypes, term47172, args);
    }

};


