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

public class ChuniDataExport_getUserData_593425593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4600306;

    public ChuniDataExport_getUserData_593425593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4600306 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term4600306, term4600306.getClass(), "gameId", null);
        setField(term4600306, term4600306.getClass(), "userData", null);
        setField(term4600306, term4600306.getClass(), "userActivityList", null);
        setField(term4600306, term4600306.getClass(), "userCharacterList", null);
        setField(term4600306, term4600306.getClass(), "userChargeList", null);
        setField(term4600306, term4600306.getClass(), "userCourseList", null);
        setField(term4600306, term4600306.getClass(), "userDataEx", null);
        setField(term4600306, term4600306.getClass(), "userDuelList", null);
        setField(term4600306, term4600306.getClass(), "userGameOption", null);
        setField(term4600306, term4600306.getClass(), "userGameOptionEx", null);
        setField(term4600306, term4600306.getClass(), "userItemList", null);
        setField(term4600306, term4600306.getClass(), "userMapList", null);
        setField(term4600306, term4600306.getClass(), "userMusicDetailList", null);
        setField(term4600306, term4600306.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserData", argTypes, term4600306, args);
    }

};


