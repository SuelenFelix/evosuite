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

public class ChuniDataExport_getUserItemList_63851113620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122673;

    public ChuniDataExport_getUserItemList_63851113620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122673 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term122673, term122673.getClass(), "gameId", null);
        setField(term122673, term122673.getClass(), "userData", null);
        setField(term122673, term122673.getClass(), "userActivityList", null);
        setField(term122673, term122673.getClass(), "userCharacterList", null);
        setField(term122673, term122673.getClass(), "userChargeList", null);
        setField(term122673, term122673.getClass(), "userCourseList", null);
        setField(term122673, term122673.getClass(), "userDataEx", null);
        setField(term122673, term122673.getClass(), "userDuelList", null);
        setField(term122673, term122673.getClass(), "userGameOption", null);
        setField(term122673, term122673.getClass(), "userGameOptionEx", null);
        setField(term122673, term122673.getClass(), "userItemList", null);
        setField(term122673, term122673.getClass(), "userMapList", null);
        setField(term122673, term122673.getClass(), "userMusicDetailList", null);
        setField(term122673, term122673.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserItemList", argTypes, term122673, args);
    }

};


