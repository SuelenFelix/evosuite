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

public class ChuniDataExport_getUserActivityList_24916925262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4652756;

    public ChuniDataExport_getUserActivityList_24916925262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4652756 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term4652756, term4652756.getClass(), "gameId", null);
        setField(term4652756, term4652756.getClass(), "userData", null);
        setField(term4652756, term4652756.getClass(), "userActivityList", null);
        setField(term4652756, term4652756.getClass(), "userCharacterList", null);
        setField(term4652756, term4652756.getClass(), "userChargeList", null);
        setField(term4652756, term4652756.getClass(), "userCourseList", null);
        setField(term4652756, term4652756.getClass(), "userDataEx", null);
        setField(term4652756, term4652756.getClass(), "userDuelList", null);
        setField(term4652756, term4652756.getClass(), "userGameOption", null);
        setField(term4652756, term4652756.getClass(), "userGameOptionEx", null);
        setField(term4652756, term4652756.getClass(), "userItemList", null);
        setField(term4652756, term4652756.getClass(), "userMapList", null);
        setField(term4652756, term4652756.getClass(), "userMusicDetailList", null);
        setField(term4652756, term4652756.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserActivityList", argTypes, term4652756, args);
    }

};


