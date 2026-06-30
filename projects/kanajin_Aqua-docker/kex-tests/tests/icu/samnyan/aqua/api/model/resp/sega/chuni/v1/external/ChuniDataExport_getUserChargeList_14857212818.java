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

public class ChuniDataExport_getUserChargeList_14857212818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112223;

    public ChuniDataExport_getUserChargeList_14857212818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112223 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term112223, term112223.getClass(), "gameId", null);
        setField(term112223, term112223.getClass(), "userData", null);
        setField(term112223, term112223.getClass(), "userActivityList", null);
        setField(term112223, term112223.getClass(), "userCharacterList", null);
        setField(term112223, term112223.getClass(), "userChargeList", null);
        setField(term112223, term112223.getClass(), "userCourseList", null);
        setField(term112223, term112223.getClass(), "userDataEx", null);
        setField(term112223, term112223.getClass(), "userDuelList", null);
        setField(term112223, term112223.getClass(), "userGameOption", null);
        setField(term112223, term112223.getClass(), "userGameOptionEx", null);
        setField(term112223, term112223.getClass(), "userItemList", null);
        setField(term112223, term112223.getClass(), "userMapList", null);
        setField(term112223, term112223.getClass(), "userMusicDetailList", null);
        setField(term112223, term112223.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserChargeList", argTypes, term112223, args);
    }

};


