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

public class ChuniDataExport_getUserMusicDetailList_56992863924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126119;

    public ChuniDataExport_getUserMusicDetailList_56992863924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126119 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term126119, term126119.getClass(), "gameId", null);
        setField(term126119, term126119.getClass(), "userData", null);
        setField(term126119, term126119.getClass(), "userActivityList", null);
        setField(term126119, term126119.getClass(), "userCharacterList", null);
        setField(term126119, term126119.getClass(), "userChargeList", null);
        setField(term126119, term126119.getClass(), "userCourseList", null);
        setField(term126119, term126119.getClass(), "userDataEx", null);
        setField(term126119, term126119.getClass(), "userDuelList", null);
        setField(term126119, term126119.getClass(), "userGameOption", null);
        setField(term126119, term126119.getClass(), "userGameOptionEx", null);
        setField(term126119, term126119.getClass(), "userItemList", null);
        setField(term126119, term126119.getClass(), "userMapList", null);
        setField(term126119, term126119.getClass(), "userMusicDetailList", null);
        setField(term126119, term126119.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMusicDetailList", argTypes, term126119, args);
    }

};


