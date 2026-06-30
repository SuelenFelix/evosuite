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

public class ChuniDataImport_setUserGameOption_165680464750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4463868;

    public ChuniDataImport_setUserGameOption_165680464750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4463868 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport"));
        setField(term4463868, term4463868.getClass(), "gameId", null);
        setField(term4463868, term4463868.getClass(), "userData", null);
        setField(term4463868, term4463868.getClass(), "userActivityList", null);
        setField(term4463868, term4463868.getClass(), "userCharacterList", null);
        setField(term4463868, term4463868.getClass(), "userChargeList", null);
        setField(term4463868, term4463868.getClass(), "userCourseList", null);
        setField(term4463868, term4463868.getClass(), "userDuelList", null);
        setField(term4463868, term4463868.getClass(), "userGameOption", null);
        setField(term4463868, term4463868.getClass(), "userItemList", null);
        setField(term4463868, term4463868.getClass(), "userMapList", null);
        setField(term4463868, term4463868.getClass(), "userMusicDetailList", null);
        setField(term4463868, term4463868.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserGameOption", argTypes, term4463868, args);
    }

};


