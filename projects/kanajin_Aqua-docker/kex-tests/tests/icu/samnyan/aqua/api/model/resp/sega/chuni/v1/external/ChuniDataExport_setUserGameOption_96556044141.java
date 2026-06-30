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

public class ChuniDataExport_setUserGameOption_96556044141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4634983;

    public ChuniDataExport_setUserGameOption_96556044141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4634983 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term4634983, term4634983.getClass(), "gameId", null);
        setField(term4634983, term4634983.getClass(), "userData", null);
        setField(term4634983, term4634983.getClass(), "userActivityList", null);
        setField(term4634983, term4634983.getClass(), "userCharacterList", null);
        setField(term4634983, term4634983.getClass(), "userChargeList", null);
        setField(term4634983, term4634983.getClass(), "userCourseList", null);
        setField(term4634983, term4634983.getClass(), "userDataEx", null);
        setField(term4634983, term4634983.getClass(), "userDuelList", null);
        setField(term4634983, term4634983.getClass(), "userGameOption", null);
        setField(term4634983, term4634983.getClass(), "userGameOptionEx", null);
        setField(term4634983, term4634983.getClass(), "userItemList", null);
        setField(term4634983, term4634983.getClass(), "userMapList", null);
        setField(term4634983, term4634983.getClass(), "userMusicDetailList", null);
        setField(term4634983, term4634983.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserGameOption", argTypes, term4634983, args);
    }

};


