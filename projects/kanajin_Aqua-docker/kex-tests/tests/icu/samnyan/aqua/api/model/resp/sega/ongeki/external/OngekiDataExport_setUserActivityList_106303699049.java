package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OngekiDataExport_setUserActivityList_106303699049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47963;

    public OngekiDataExport_setUserActivityList_106303699049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47963 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term47963, term47963.getClass(), "gameId", null);
        setField(term47963, term47963.getClass(), "userData", null);
        setField(term47963, term47963.getClass(), "userActivityList", null);
        setField(term47963, term47963.getClass(), "userCardList", null);
        setField(term47963, term47963.getClass(), "userChapterList", null);
        setField(term47963, term47963.getClass(), "userCharacterList", null);
        setField(term47963, term47963.getClass(), "userDeckList", null);
        setField(term47963, term47963.getClass(), "userEventPointList", null);
        setField(term47963, term47963.getClass(), "userGeneralDataList", null);
        setField(term47963, term47963.getClass(), "userItemList", null);
        setField(term47963, term47963.getClass(), "userLoginBonusList", null);
        setField(term47963, term47963.getClass(), "userMissionPointList", null);
        setField(term47963, term47963.getClass(), "userMusicDetailList", null);
        setField(term47963, term47963.getClass(), "userMusicItemList", null);
        setField(term47963, term47963.getClass(), "userOption", null);
        setField(term47963, term47963.getClass(), "userPlaylogList", null);
        setField(term47963, term47963.getClass(), "userStoryList", null);
        setField(term47963, term47963.getClass(), "userTrainingRoomList", null);
        setField(term47963, term47963.getClass(), "userTradeItemList", null);
        setField(term47963, term47963.getClass(), "userEventMusicList", null);
        setField(term47963, term47963.getClass(), "userTechEventList", null);
        setField(term47963, term47963.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserActivityList", argTypes, term47963, args);
    }

};


