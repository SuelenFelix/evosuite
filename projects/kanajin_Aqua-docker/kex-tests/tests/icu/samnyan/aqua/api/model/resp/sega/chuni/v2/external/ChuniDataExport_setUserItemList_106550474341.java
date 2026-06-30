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

public class ChuniDataExport_setUserItemList_106550474341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314085;

    public ChuniDataExport_setUserItemList_106550474341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314085 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term314085, term314085.getClass(), "gameId", null);
        setField(term314085, term314085.getClass(), "userData", null);
        setField(term314085, term314085.getClass(), "userActivityList", null);
        setField(term314085, term314085.getClass(), "userCharacterList", null);
        setField(term314085, term314085.getClass(), "userChargeList", null);
        setField(term314085, term314085.getClass(), "userCourseList", null);
        setField(term314085, term314085.getClass(), "userDuelList", null);
        setField(term314085, term314085.getClass(), "userGameOption", null);
        setField(term314085, term314085.getClass(), "userItemList", null);
        setField(term314085, term314085.getClass(), "userMapList", null);
        setField(term314085, term314085.getClass(), "userMusicDetailList", null);
        setField(term314085, term314085.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserItemList", argTypes, term314085, args);
    }

};


