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

public class ChuniDataExport_equals_83267590653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4645299;

    public ChuniDataExport_equals_83267590653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4645299 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term4645299, term4645299.getClass(), "gameId", null);
        setField(term4645299, term4645299.getClass(), "userData", null);
        setField(term4645299, term4645299.getClass(), "userActivityList", null);
        setField(term4645299, term4645299.getClass(), "userCharacterList", null);
        setField(term4645299, term4645299.getClass(), "userChargeList", null);
        setField(term4645299, term4645299.getClass(), "userCourseList", null);
        setField(term4645299, term4645299.getClass(), "userDataEx", null);
        setField(term4645299, term4645299.getClass(), "userDuelList", null);
        setField(term4645299, term4645299.getClass(), "userGameOption", null);
        setField(term4645299, term4645299.getClass(), "userGameOptionEx", null);
        setField(term4645299, term4645299.getClass(), "userItemList", null);
        setField(term4645299, term4645299.getClass(), "userMapList", null);
        setField(term4645299, term4645299.getClass(), "userMusicDetailList", null);
        setField(term4645299, term4645299.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term4645299, args);
    }

};


