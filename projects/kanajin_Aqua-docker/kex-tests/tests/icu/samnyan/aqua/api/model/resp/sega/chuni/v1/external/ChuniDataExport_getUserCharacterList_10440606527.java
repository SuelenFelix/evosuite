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

public class ChuniDataExport_getUserCharacterList_10440606527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469378;

    public ChuniDataExport_getUserCharacterList_10440606527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469378 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term469378, term469378.getClass(), "gameId", null);
        setField(term469378, term469378.getClass(), "userData", null);
        setField(term469378, term469378.getClass(), "userActivityList", null);
        setField(term469378, term469378.getClass(), "userCharacterList", null);
        setField(term469378, term469378.getClass(), "userChargeList", null);
        setField(term469378, term469378.getClass(), "userCourseList", null);
        setField(term469378, term469378.getClass(), "userDataEx", null);
        setField(term469378, term469378.getClass(), "userDuelList", null);
        setField(term469378, term469378.getClass(), "userGameOption", null);
        setField(term469378, term469378.getClass(), "userGameOptionEx", null);
        setField(term469378, term469378.getClass(), "userItemList", null);
        setField(term469378, term469378.getClass(), "userMapList", null);
        setField(term469378, term469378.getClass(), "userMusicDetailList", null);
        setField(term469378, term469378.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCharacterList", argTypes, term469378, args);
    }

};


