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

public class ChuniDataExport_setUserGameOptionEx_34124970345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146713;

    public ChuniDataExport_setUserGameOptionEx_34124970345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146713 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term146713, term146713.getClass(), "gameId", null);
        setField(term146713, term146713.getClass(), "userData", null);
        setField(term146713, term146713.getClass(), "userActivityList", null);
        setField(term146713, term146713.getClass(), "userCharacterList", null);
        setField(term146713, term146713.getClass(), "userChargeList", null);
        setField(term146713, term146713.getClass(), "userCourseList", null);
        setField(term146713, term146713.getClass(), "userDataEx", null);
        setField(term146713, term146713.getClass(), "userDuelList", null);
        setField(term146713, term146713.getClass(), "userGameOption", null);
        setField(term146713, term146713.getClass(), "userGameOptionEx", null);
        setField(term146713, term146713.getClass(), "userItemList", null);
        setField(term146713, term146713.getClass(), "userMapList", null);
        setField(term146713, term146713.getClass(), "userMusicDetailList", null);
        setField(term146713, term146713.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserGameOptionEx", argTypes, term146713, args);
    }

};


