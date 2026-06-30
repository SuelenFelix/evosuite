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

public class ChuniDataExport_getUserChargeList_18476319989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55329;

    public ChuniDataExport_getUserChargeList_18476319989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55329 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term55329, term55329.getClass(), "gameId", null);
        setField(term55329, term55329.getClass(), "userData", null);
        setField(term55329, term55329.getClass(), "userActivityList", null);
        setField(term55329, term55329.getClass(), "userCharacterList", null);
        setField(term55329, term55329.getClass(), "userChargeList", null);
        setField(term55329, term55329.getClass(), "userCourseList", null);
        setField(term55329, term55329.getClass(), "userDuelList", null);
        setField(term55329, term55329.getClass(), "userGameOption", null);
        setField(term55329, term55329.getClass(), "userItemList", null);
        setField(term55329, term55329.getClass(), "userMapList", null);
        setField(term55329, term55329.getClass(), "userMusicDetailList", null);
        setField(term55329, term55329.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserChargeList", argTypes, term55329, args);
    }

};


