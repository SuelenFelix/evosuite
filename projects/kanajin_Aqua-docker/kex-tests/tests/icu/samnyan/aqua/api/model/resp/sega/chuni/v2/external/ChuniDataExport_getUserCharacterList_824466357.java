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

public class ChuniDataExport_getUserCharacterList_824466357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53098;

    public ChuniDataExport_getUserCharacterList_824466357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53098 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term53098, term53098.getClass(), "gameId", null);
        setField(term53098, term53098.getClass(), "userData", null);
        setField(term53098, term53098.getClass(), "userActivityList", null);
        setField(term53098, term53098.getClass(), "userCharacterList", null);
        setField(term53098, term53098.getClass(), "userChargeList", null);
        setField(term53098, term53098.getClass(), "userCourseList", null);
        setField(term53098, term53098.getClass(), "userDuelList", null);
        setField(term53098, term53098.getClass(), "userGameOption", null);
        setField(term53098, term53098.getClass(), "userItemList", null);
        setField(term53098, term53098.getClass(), "userMapList", null);
        setField(term53098, term53098.getClass(), "userMusicDetailList", null);
        setField(term53098, term53098.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCharacterList", argTypes, term53098, args);
    }

};


