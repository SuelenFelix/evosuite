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

public class ChuniDataExport_setUserMusicDetailList_686324844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95067;

    public ChuniDataExport_setUserMusicDetailList_686324844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95067 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term95067, term95067.getClass(), "gameId", null);
        setField(term95067, term95067.getClass(), "userData", null);
        setField(term95067, term95067.getClass(), "userActivityList", null);
        setField(term95067, term95067.getClass(), "userCharacterList", null);
        setField(term95067, term95067.getClass(), "userChargeList", null);
        setField(term95067, term95067.getClass(), "userCourseList", null);
        setField(term95067, term95067.getClass(), "userDuelList", null);
        setField(term95067, term95067.getClass(), "userGameOption", null);
        setField(term95067, term95067.getClass(), "userItemList", null);
        setField(term95067, term95067.getClass(), "userMapList", null);
        setField(term95067, term95067.getClass(), "userMusicDetailList", null);
        setField(term95067, term95067.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserMusicDetailList", argTypes, term95067, args);
    }

};


