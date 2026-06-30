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

public class ChuniDataExport_setUserGameOption_157828941638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88432;

    public ChuniDataExport_setUserGameOption_157828941638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88432 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term88432, term88432.getClass(), "gameId", null);
        setField(term88432, term88432.getClass(), "userData", null);
        setField(term88432, term88432.getClass(), "userActivityList", null);
        setField(term88432, term88432.getClass(), "userCharacterList", null);
        setField(term88432, term88432.getClass(), "userChargeList", null);
        setField(term88432, term88432.getClass(), "userCourseList", null);
        setField(term88432, term88432.getClass(), "userDuelList", null);
        setField(term88432, term88432.getClass(), "userGameOption", null);
        setField(term88432, term88432.getClass(), "userItemList", null);
        setField(term88432, term88432.getClass(), "userMapList", null);
        setField(term88432, term88432.getClass(), "userMusicDetailList", null);
        setField(term88432, term88432.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserGameOption", argTypes, term88432, args);
    }

};


