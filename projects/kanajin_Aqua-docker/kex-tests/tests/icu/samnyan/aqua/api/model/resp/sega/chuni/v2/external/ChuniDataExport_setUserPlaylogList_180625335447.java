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

public class ChuniDataExport_setUserPlaylogList_180625335447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320856;

    public ChuniDataExport_setUserPlaylogList_180625335447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320856 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term320856, term320856.getClass(), "gameId", null);
        setField(term320856, term320856.getClass(), "userData", null);
        setField(term320856, term320856.getClass(), "userActivityList", null);
        setField(term320856, term320856.getClass(), "userCharacterList", null);
        setField(term320856, term320856.getClass(), "userChargeList", null);
        setField(term320856, term320856.getClass(), "userCourseList", null);
        setField(term320856, term320856.getClass(), "userDuelList", null);
        setField(term320856, term320856.getClass(), "userGameOption", null);
        setField(term320856, term320856.getClass(), "userItemList", null);
        setField(term320856, term320856.getClass(), "userMapList", null);
        setField(term320856, term320856.getClass(), "userMusicDetailList", null);
        setField(term320856, term320856.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserPlaylogList", argTypes, term320856, args);
    }

};


