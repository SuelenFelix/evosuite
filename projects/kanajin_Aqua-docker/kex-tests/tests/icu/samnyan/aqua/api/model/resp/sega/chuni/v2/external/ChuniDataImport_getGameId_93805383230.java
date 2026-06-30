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

public class ChuniDataImport_getGameId_93805383230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462674;

    public ChuniDataImport_getGameId_93805383230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462674 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport"));
        setField(term462674, term462674.getClass(), "gameId", null);
        setField(term462674, term462674.getClass(), "userData", null);
        setField(term462674, term462674.getClass(), "userActivityList", null);
        setField(term462674, term462674.getClass(), "userCharacterList", null);
        setField(term462674, term462674.getClass(), "userChargeList", null);
        setField(term462674, term462674.getClass(), "userCourseList", null);
        setField(term462674, term462674.getClass(), "userDuelList", null);
        setField(term462674, term462674.getClass(), "userGameOption", null);
        setField(term462674, term462674.getClass(), "userItemList", null);
        setField(term462674, term462674.getClass(), "userMapList", null);
        setField(term462674, term462674.getClass(), "userMusicDetailList", null);
        setField(term462674, term462674.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameId", argTypes, term462674, args);
    }

};


