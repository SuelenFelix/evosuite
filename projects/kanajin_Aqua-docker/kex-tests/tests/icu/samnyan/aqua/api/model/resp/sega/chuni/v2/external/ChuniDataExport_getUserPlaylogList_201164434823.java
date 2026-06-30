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

public class ChuniDataExport_getUserPlaylogList_201164434823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70046;

    public ChuniDataExport_getUserPlaylogList_201164434823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70046 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term70046, term70046.getClass(), "gameId", null);
        setField(term70046, term70046.getClass(), "userData", null);
        setField(term70046, term70046.getClass(), "userActivityList", null);
        setField(term70046, term70046.getClass(), "userCharacterList", null);
        setField(term70046, term70046.getClass(), "userChargeList", null);
        setField(term70046, term70046.getClass(), "userCourseList", null);
        setField(term70046, term70046.getClass(), "userDuelList", null);
        setField(term70046, term70046.getClass(), "userGameOption", null);
        setField(term70046, term70046.getClass(), "userItemList", null);
        setField(term70046, term70046.getClass(), "userMapList", null);
        setField(term70046, term70046.getClass(), "userMusicDetailList", null);
        setField(term70046, term70046.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlaylogList", argTypes, term70046, args);
    }

};


