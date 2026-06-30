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

public class ChuniDataExport_hashCode_128136258158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158146;

    public ChuniDataExport_hashCode_128136258158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158146 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport"));
        setField(term158146, term158146.getClass(), "gameId", null);
        setField(term158146, term158146.getClass(), "userData", null);
        setField(term158146, term158146.getClass(), "userActivityList", null);
        setField(term158146, term158146.getClass(), "userCharacterList", null);
        setField(term158146, term158146.getClass(), "userChargeList", null);
        setField(term158146, term158146.getClass(), "userCourseList", null);
        setField(term158146, term158146.getClass(), "userDataEx", null);
        setField(term158146, term158146.getClass(), "userDuelList", null);
        setField(term158146, term158146.getClass(), "userGameOption", null);
        setField(term158146, term158146.getClass(), "userGameOptionEx", null);
        setField(term158146, term158146.getClass(), "userItemList", null);
        setField(term158146, term158146.getClass(), "userMapList", null);
        setField(term158146, term158146.getClass(), "userMusicDetailList", null);
        setField(term158146, term158146.getClass(), "userPlaylogList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term158146, args);
    }

};


