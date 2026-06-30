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

public class OngekiDataExport_setUserStoryList_23387518277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76330;

    public OngekiDataExport_setUserStoryList_23387518277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76330 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term76330, term76330.getClass(), "gameId", null);
        setField(term76330, term76330.getClass(), "userData", null);
        setField(term76330, term76330.getClass(), "userActivityList", null);
        setField(term76330, term76330.getClass(), "userCardList", null);
        setField(term76330, term76330.getClass(), "userChapterList", null);
        setField(term76330, term76330.getClass(), "userCharacterList", null);
        setField(term76330, term76330.getClass(), "userDeckList", null);
        setField(term76330, term76330.getClass(), "userEventPointList", null);
        setField(term76330, term76330.getClass(), "userGeneralDataList", null);
        setField(term76330, term76330.getClass(), "userItemList", null);
        setField(term76330, term76330.getClass(), "userLoginBonusList", null);
        setField(term76330, term76330.getClass(), "userMissionPointList", null);
        setField(term76330, term76330.getClass(), "userMusicDetailList", null);
        setField(term76330, term76330.getClass(), "userMusicItemList", null);
        setField(term76330, term76330.getClass(), "userOption", null);
        setField(term76330, term76330.getClass(), "userPlaylogList", null);
        setField(term76330, term76330.getClass(), "userStoryList", null);
        setField(term76330, term76330.getClass(), "userTrainingRoomList", null);
        setField(term76330, term76330.getClass(), "userTradeItemList", null);
        setField(term76330, term76330.getClass(), "userEventMusicList", null);
        setField(term76330, term76330.getClass(), "userTechEventList", null);
        setField(term76330, term76330.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserStoryList", argTypes, term76330, args);
    }

};


