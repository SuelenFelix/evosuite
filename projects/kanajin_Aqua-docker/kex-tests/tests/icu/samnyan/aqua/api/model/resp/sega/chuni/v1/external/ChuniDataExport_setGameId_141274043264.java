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

public class ChuniDataExport_setGameId_141274043264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163161;

    public ChuniDataExport_setGameId_141274043264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163161 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term163161, term163161.getClass(), "gameId", null);
        setField(term163161, term163161.getClass(), "userData", null);
        setField(term163161, term163161.getClass(), "userActivityList", null);
        setField(term163161, term163161.getClass(), "userCharacterList", null);
        setField(term163161, term163161.getClass(), "userChargeList", null);
        setField(term163161, term163161.getClass(), "userCourseList", null);
        setField(term163161, term163161.getClass(), "userDataEx", null);
        setField(term163161, term163161.getClass(), "userDuelList", null);
        setField(term163161, term163161.getClass(), "userGameOption", null);
        setField(term163161, term163161.getClass(), "userGameOptionEx", null);
        setField(term163161, term163161.getClass(), "userItemList", null);
        setField(term163161, term163161.getClass(), "userMapList", null);
        setField(term163161, term163161.getClass(), "userMusicDetailList", null);
        setField(term163161, term163161.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGameId", argTypes, term163161, args);
    }

};


