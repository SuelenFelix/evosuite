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

public class ChuniDataExport_hashCode_31974856453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327364;

    public ChuniDataExport_hashCode_31974856453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327364 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term327364, term327364.getClass(), "gameId", null);
        setField(term327364, term327364.getClass(), "userData", null);
        setField(term327364, term327364.getClass(), "userActivityList", null);
        setField(term327364, term327364.getClass(), "userCharacterList", null);
        setField(term327364, term327364.getClass(), "userChargeList", null);
        setField(term327364, term327364.getClass(), "userCourseList", null);
        setField(term327364, term327364.getClass(), "userDuelList", null);
        setField(term327364, term327364.getClass(), "userGameOption", null);
        setField(term327364, term327364.getClass(), "userItemList", null);
        setField(term327364, term327364.getClass(), "userMapList", null);
        setField(term327364, term327364.getClass(), "userMusicDetailList", null);
        setField(term327364, term327364.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term327364, args);
    }

};


