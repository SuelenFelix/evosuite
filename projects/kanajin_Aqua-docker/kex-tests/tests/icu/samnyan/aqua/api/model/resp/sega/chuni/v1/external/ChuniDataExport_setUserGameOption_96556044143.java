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

public class ChuniDataExport_setUserGameOption_96556044143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144418;

    public ChuniDataExport_setUserGameOption_96556044143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144418 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term144418, term144418.getClass(), "gameId", null);
        setField(term144418, term144418.getClass(), "userData", null);
        setField(term144418, term144418.getClass(), "userActivityList", null);
        setField(term144418, term144418.getClass(), "userCharacterList", null);
        setField(term144418, term144418.getClass(), "userChargeList", null);
        setField(term144418, term144418.getClass(), "userCourseList", null);
        setField(term144418, term144418.getClass(), "userDataEx", null);
        setField(term144418, term144418.getClass(), "userDuelList", null);
        setField(term144418, term144418.getClass(), "userGameOption", null);
        setField(term144418, term144418.getClass(), "userGameOptionEx", null);
        setField(term144418, term144418.getClass(), "userItemList", null);
        setField(term144418, term144418.getClass(), "userMapList", null);
        setField(term144418, term144418.getClass(), "userMusicDetailList", null);
        setField(term144418, term144418.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserGameOption", argTypes, term144418, args);
    }

};


