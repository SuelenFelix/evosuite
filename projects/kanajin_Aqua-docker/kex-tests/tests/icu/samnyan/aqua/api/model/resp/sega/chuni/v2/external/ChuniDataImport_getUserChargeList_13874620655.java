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

public class ChuniDataImport_getUserChargeList_13874620655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116186;

    public ChuniDataImport_getUserChargeList_13874620655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116186 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport"));
        setField(term116186, term116186.getClass(), "gameId", null);
        setField(term116186, term116186.getClass(), "userData", null);
        setField(term116186, term116186.getClass(), "userActivityList", null);
        setField(term116186, term116186.getClass(), "userCharacterList", null);
        setField(term116186, term116186.getClass(), "userChargeList", null);
        setField(term116186, term116186.getClass(), "userCourseList", null);
        setField(term116186, term116186.getClass(), "userDuelList", null);
        setField(term116186, term116186.getClass(), "userGameOption", null);
        setField(term116186, term116186.getClass(), "userItemList", null);
        setField(term116186, term116186.getClass(), "userMapList", null);
        setField(term116186, term116186.getClass(), "userMusicDetailList", null);
        setField(term116186, term116186.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserChargeList", argTypes, term116186, args);
    }

};


