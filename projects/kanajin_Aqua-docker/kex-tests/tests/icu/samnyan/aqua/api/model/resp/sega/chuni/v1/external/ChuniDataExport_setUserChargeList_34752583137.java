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

public class ChuniDataExport_setUserChargeList_34752583137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494872;

    public ChuniDataExport_setUserChargeList_34752583137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494872 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term494872, term494872.getClass(), "gameId", null);
        setField(term494872, term494872.getClass(), "userData", null);
        setField(term494872, term494872.getClass(), "userActivityList", null);
        setField(term494872, term494872.getClass(), "userCharacterList", null);
        setField(term494872, term494872.getClass(), "userChargeList", null);
        setField(term494872, term494872.getClass(), "userCourseList", null);
        setField(term494872, term494872.getClass(), "userDataEx", null);
        setField(term494872, term494872.getClass(), "userDuelList", null);
        setField(term494872, term494872.getClass(), "userGameOption", null);
        setField(term494872, term494872.getClass(), "userGameOptionEx", null);
        setField(term494872, term494872.getClass(), "userItemList", null);
        setField(term494872, term494872.getClass(), "userMapList", null);
        setField(term494872, term494872.getClass(), "userMusicDetailList", null);
        setField(term494872, term494872.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserChargeList", argTypes, term494872, args);
    }

};


