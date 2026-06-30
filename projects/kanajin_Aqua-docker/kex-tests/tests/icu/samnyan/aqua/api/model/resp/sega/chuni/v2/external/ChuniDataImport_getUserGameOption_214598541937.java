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

public class ChuniDataImport_getUserGameOption_214598541937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165966;

    public ChuniDataImport_getUserGameOption_214598541937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165966 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport"));
        setField(term165966, term165966.getClass(), "gameId", null);
        setField(term165966, term165966.getClass(), "userData", null);
        setField(term165966, term165966.getClass(), "userActivityList", null);
        setField(term165966, term165966.getClass(), "userCharacterList", null);
        setField(term165966, term165966.getClass(), "userChargeList", null);
        setField(term165966, term165966.getClass(), "userCourseList", null);
        setField(term165966, term165966.getClass(), "userDuelList", null);
        setField(term165966, term165966.getClass(), "userGameOption", null);
        setField(term165966, term165966.getClass(), "userItemList", null);
        setField(term165966, term165966.getClass(), "userMapList", null);
        setField(term165966, term165966.getClass(), "userMusicDetailList", null);
        setField(term165966, term165966.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserGameOption", argTypes, term165966, args);
    }

};


