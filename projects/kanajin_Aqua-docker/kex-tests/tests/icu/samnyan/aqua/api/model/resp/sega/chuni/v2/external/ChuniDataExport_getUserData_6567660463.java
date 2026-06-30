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

public class ChuniDataExport_getUserData_6567660463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48931;

    public ChuniDataExport_getUserData_6567660463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48931 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport"));
        setField(term48931, term48931.getClass(), "gameId", null);
        setField(term48931, term48931.getClass(), "userData", null);
        setField(term48931, term48931.getClass(), "userActivityList", null);
        setField(term48931, term48931.getClass(), "userCharacterList", null);
        setField(term48931, term48931.getClass(), "userChargeList", null);
        setField(term48931, term48931.getClass(), "userCourseList", null);
        setField(term48931, term48931.getClass(), "userDuelList", null);
        setField(term48931, term48931.getClass(), "userGameOption", null);
        setField(term48931, term48931.getClass(), "userItemList", null);
        setField(term48931, term48931.getClass(), "userMapList", null);
        setField(term48931, term48931.getClass(), "userMusicDetailList", null);
        setField(term48931, term48931.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserData", argTypes, term48931, args);
    }

};


