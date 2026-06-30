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

public class OngekiDataExport_setUserTrainingRoomList_14197415279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78426;

    public OngekiDataExport_setUserTrainingRoomList_14197415279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78426 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term78426, term78426.getClass(), "gameId", null);
        setField(term78426, term78426.getClass(), "userData", null);
        setField(term78426, term78426.getClass(), "userActivityList", null);
        setField(term78426, term78426.getClass(), "userCardList", null);
        setField(term78426, term78426.getClass(), "userChapterList", null);
        setField(term78426, term78426.getClass(), "userCharacterList", null);
        setField(term78426, term78426.getClass(), "userDeckList", null);
        setField(term78426, term78426.getClass(), "userEventPointList", null);
        setField(term78426, term78426.getClass(), "userGeneralDataList", null);
        setField(term78426, term78426.getClass(), "userItemList", null);
        setField(term78426, term78426.getClass(), "userLoginBonusList", null);
        setField(term78426, term78426.getClass(), "userMissionPointList", null);
        setField(term78426, term78426.getClass(), "userMusicDetailList", null);
        setField(term78426, term78426.getClass(), "userMusicItemList", null);
        setField(term78426, term78426.getClass(), "userOption", null);
        setField(term78426, term78426.getClass(), "userPlaylogList", null);
        setField(term78426, term78426.getClass(), "userStoryList", null);
        setField(term78426, term78426.getClass(), "userTrainingRoomList", null);
        setField(term78426, term78426.getClass(), "userTradeItemList", null);
        setField(term78426, term78426.getClass(), "userEventMusicList", null);
        setField(term78426, term78426.getClass(), "userTechEventList", null);
        setField(term78426, term78426.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserTrainingRoomList", argTypes, term78426, args);
    }

};


