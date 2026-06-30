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

public class ChuniDataExport_setUserActivityList_160239318231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133550;

    public ChuniDataExport_setUserActivityList_160239318231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133550 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term133550, term133550.getClass(), "gameId", null);
        setField(term133550, term133550.getClass(), "userData", null);
        setField(term133550, term133550.getClass(), "userActivityList", null);
        setField(term133550, term133550.getClass(), "userCharacterList", null);
        setField(term133550, term133550.getClass(), "userChargeList", null);
        setField(term133550, term133550.getClass(), "userCourseList", null);
        setField(term133550, term133550.getClass(), "userDataEx", null);
        setField(term133550, term133550.getClass(), "userDuelList", null);
        setField(term133550, term133550.getClass(), "userGameOption", null);
        setField(term133550, term133550.getClass(), "userGameOptionEx", null);
        setField(term133550, term133550.getClass(), "userItemList", null);
        setField(term133550, term133550.getClass(), "userMapList", null);
        setField(term133550, term133550.getClass(), "userMusicDetailList", null);
        setField(term133550, term133550.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserActivityList", argTypes, term133550, args);
    }

};


