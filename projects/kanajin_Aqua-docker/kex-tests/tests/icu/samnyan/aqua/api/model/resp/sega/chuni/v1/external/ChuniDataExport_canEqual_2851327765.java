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

public class ChuniDataExport_canEqual_2851327765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163162;

    public ChuniDataExport_canEqual_2851327765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163162 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term163162, term163162.getClass(), "gameId", null);
        setField(term163162, term163162.getClass(), "userData", null);
        setField(term163162, term163162.getClass(), "userActivityList", null);
        setField(term163162, term163162.getClass(), "userCharacterList", null);
        setField(term163162, term163162.getClass(), "userChargeList", null);
        setField(term163162, term163162.getClass(), "userCourseList", null);
        setField(term163162, term163162.getClass(), "userDataEx", null);
        setField(term163162, term163162.getClass(), "userDuelList", null);
        setField(term163162, term163162.getClass(), "userGameOption", null);
        setField(term163162, term163162.getClass(), "userGameOptionEx", null);
        setField(term163162, term163162.getClass(), "userItemList", null);
        setField(term163162, term163162.getClass(), "userMapList", null);
        setField(term163162, term163162.getClass(), "userMusicDetailList", null);
        setField(term163162, term163162.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term163162, args);
    }

};


