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

public class ChuniDataImport_getUserDuelList_117213869936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165965;

    public ChuniDataImport_getUserDuelList_117213869936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165965 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport"));
        setField(term165965, term165965.getClass(), "gameId", null);
        setField(term165965, term165965.getClass(), "userData", null);
        setField(term165965, term165965.getClass(), "userActivityList", null);
        setField(term165965, term165965.getClass(), "userCharacterList", null);
        setField(term165965, term165965.getClass(), "userChargeList", null);
        setField(term165965, term165965.getClass(), "userCourseList", null);
        setField(term165965, term165965.getClass(), "userDuelList", null);
        setField(term165965, term165965.getClass(), "userGameOption", null);
        setField(term165965, term165965.getClass(), "userItemList", null);
        setField(term165965, term165965.getClass(), "userMapList", null);
        setField(term165965, term165965.getClass(), "userMusicDetailList", null);
        setField(term165965, term165965.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserDuelList", argTypes, term165965, args);
    }

};


