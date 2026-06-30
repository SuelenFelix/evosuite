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

public class ChuniDataExport_getUserMapList_89646541619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66095;

    public ChuniDataExport_getUserMapList_89646541619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66095 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term66095, term66095.getClass(), "gameId", null);
        setField(term66095, term66095.getClass(), "userData", null);
        setField(term66095, term66095.getClass(), "userActivityList", null);
        setField(term66095, term66095.getClass(), "userCharacterList", null);
        setField(term66095, term66095.getClass(), "userChargeList", null);
        setField(term66095, term66095.getClass(), "userCourseList", null);
        setField(term66095, term66095.getClass(), "userDuelList", null);
        setField(term66095, term66095.getClass(), "userGameOption", null);
        setField(term66095, term66095.getClass(), "userItemList", null);
        setField(term66095, term66095.getClass(), "userMapList", null);
        setField(term66095, term66095.getClass(), "userMusicDetailList", null);
        setField(term66095, term66095.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMapList", argTypes, term66095, args);
    }

};


