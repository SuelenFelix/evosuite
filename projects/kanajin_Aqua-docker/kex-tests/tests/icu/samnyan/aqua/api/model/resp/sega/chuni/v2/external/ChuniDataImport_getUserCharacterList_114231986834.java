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

public class ChuniDataImport_getUserCharacterList_114231986834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165963;

    public ChuniDataImport_getUserCharacterList_114231986834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165963 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport"));
        setField(term165963, term165963.getClass(), "gameId", null);
        setField(term165963, term165963.getClass(), "userData", null);
        setField(term165963, term165963.getClass(), "userActivityList", null);
        setField(term165963, term165963.getClass(), "userCharacterList", null);
        setField(term165963, term165963.getClass(), "userChargeList", null);
        setField(term165963, term165963.getClass(), "userCourseList", null);
        setField(term165963, term165963.getClass(), "userDuelList", null);
        setField(term165963, term165963.getClass(), "userGameOption", null);
        setField(term165963, term165963.getClass(), "userItemList", null);
        setField(term165963, term165963.getClass(), "userMapList", null);
        setField(term165963, term165963.getClass(), "userMusicDetailList", null);
        setField(term165963, term165963.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCharacterList", argTypes, term165963, args);
    }

};


