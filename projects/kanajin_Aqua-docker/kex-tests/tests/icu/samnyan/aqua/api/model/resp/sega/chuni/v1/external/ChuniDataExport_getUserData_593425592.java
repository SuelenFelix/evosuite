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

public class ChuniDataExport_getUserData_593425592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107355;

    public ChuniDataExport_getUserData_593425592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107355 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term107355, term107355.getClass(), "gameId", null);
        setField(term107355, term107355.getClass(), "userData", null);
        setField(term107355, term107355.getClass(), "userActivityList", null);
        setField(term107355, term107355.getClass(), "userCharacterList", null);
        setField(term107355, term107355.getClass(), "userChargeList", null);
        setField(term107355, term107355.getClass(), "userCourseList", null);
        setField(term107355, term107355.getClass(), "userDataEx", null);
        setField(term107355, term107355.getClass(), "userDuelList", null);
        setField(term107355, term107355.getClass(), "userGameOption", null);
        setField(term107355, term107355.getClass(), "userGameOptionEx", null);
        setField(term107355, term107355.getClass(), "userItemList", null);
        setField(term107355, term107355.getClass(), "userMapList", null);
        setField(term107355, term107355.getClass(), "userMusicDetailList", null);
        setField(term107355, term107355.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserData", argTypes, term107355, args);
    }

};


