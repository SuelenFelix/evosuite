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

public class ChuniDataImport_setUserData_207816270643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165972;

    public ChuniDataImport_setUserData_207816270643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165972 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport"));
        setField(term165972, term165972.getClass(), "gameId", null);
        setField(term165972, term165972.getClass(), "userData", null);
        setField(term165972, term165972.getClass(), "userActivityList", null);
        setField(term165972, term165972.getClass(), "userCharacterList", null);
        setField(term165972, term165972.getClass(), "userChargeList", null);
        setField(term165972, term165972.getClass(), "userCourseList", null);
        setField(term165972, term165972.getClass(), "userDuelList", null);
        setField(term165972, term165972.getClass(), "userGameOption", null);
        setField(term165972, term165972.getClass(), "userItemList", null);
        setField(term165972, term165972.getClass(), "userMapList", null);
        setField(term165972, term165972.getClass(), "userMusicDetailList", null);
        setField(term165972, term165972.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserData", argTypes, term165972, args);
    }

};


