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

public class ChuniDataExport_setUserItemList_10389072649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506798;

    public ChuniDataExport_setUserItemList_10389072649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term506798 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term506798, term506798.getClass(), "gameId", null);
        setField(term506798, term506798.getClass(), "userData", null);
        setField(term506798, term506798.getClass(), "userActivityList", null);
        setField(term506798, term506798.getClass(), "userCharacterList", null);
        setField(term506798, term506798.getClass(), "userChargeList", null);
        setField(term506798, term506798.getClass(), "userCourseList", null);
        setField(term506798, term506798.getClass(), "userDataEx", null);
        setField(term506798, term506798.getClass(), "userDuelList", null);
        setField(term506798, term506798.getClass(), "userGameOption", null);
        setField(term506798, term506798.getClass(), "userGameOptionEx", null);
        setField(term506798, term506798.getClass(), "userItemList", null);
        setField(term506798, term506798.getClass(), "userMapList", null);
        setField(term506798, term506798.getClass(), "userMusicDetailList", null);
        setField(term506798, term506798.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserItemList", argTypes, term506798, args);
    }

};


