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

public class ChuniDataImport_getUserMapList_16340781740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4463858;

    public ChuniDataImport_getUserMapList_16340781740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4463858 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport"));
        setField(term4463858, term4463858.getClass(), "gameId", null);
        setField(term4463858, term4463858.getClass(), "userData", null);
        setField(term4463858, term4463858.getClass(), "userActivityList", null);
        setField(term4463858, term4463858.getClass(), "userCharacterList", null);
        setField(term4463858, term4463858.getClass(), "userChargeList", null);
        setField(term4463858, term4463858.getClass(), "userCourseList", null);
        setField(term4463858, term4463858.getClass(), "userDuelList", null);
        setField(term4463858, term4463858.getClass(), "userGameOption", null);
        setField(term4463858, term4463858.getClass(), "userItemList", null);
        setField(term4463858, term4463858.getClass(), "userMapList", null);
        setField(term4463858, term4463858.getClass(), "userMusicDetailList", null);
        setField(term4463858, term4463858.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMapList", argTypes, term4463858, args);
    }

};


