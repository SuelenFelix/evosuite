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

public class ChuniDataExport_setUserChargeList_34752583135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136743;

    public ChuniDataExport_setUserChargeList_34752583135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136743 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term136743, term136743.getClass(), "gameId", null);
        setField(term136743, term136743.getClass(), "userData", null);
        setField(term136743, term136743.getClass(), "userActivityList", null);
        setField(term136743, term136743.getClass(), "userCharacterList", null);
        setField(term136743, term136743.getClass(), "userChargeList", null);
        setField(term136743, term136743.getClass(), "userCourseList", null);
        setField(term136743, term136743.getClass(), "userDataEx", null);
        setField(term136743, term136743.getClass(), "userDuelList", null);
        setField(term136743, term136743.getClass(), "userGameOption", null);
        setField(term136743, term136743.getClass(), "userGameOptionEx", null);
        setField(term136743, term136743.getClass(), "userItemList", null);
        setField(term136743, term136743.getClass(), "userMapList", null);
        setField(term136743, term136743.getClass(), "userMusicDetailList", null);
        setField(term136743, term136743.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserChargeList", argTypes, term136743, args);
    }

};


