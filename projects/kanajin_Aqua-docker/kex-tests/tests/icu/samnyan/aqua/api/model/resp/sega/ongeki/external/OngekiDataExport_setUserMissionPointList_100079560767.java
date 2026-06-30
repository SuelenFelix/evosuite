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

public class OngekiDataExport_setUserMissionPointList_100079560767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66525;

    public OngekiDataExport_setUserMissionPointList_100079560767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66525 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term66525, term66525.getClass(), "gameId", null);
        setField(term66525, term66525.getClass(), "userData", null);
        setField(term66525, term66525.getClass(), "userActivityList", null);
        setField(term66525, term66525.getClass(), "userCardList", null);
        setField(term66525, term66525.getClass(), "userChapterList", null);
        setField(term66525, term66525.getClass(), "userCharacterList", null);
        setField(term66525, term66525.getClass(), "userDeckList", null);
        setField(term66525, term66525.getClass(), "userEventPointList", null);
        setField(term66525, term66525.getClass(), "userGeneralDataList", null);
        setField(term66525, term66525.getClass(), "userItemList", null);
        setField(term66525, term66525.getClass(), "userLoginBonusList", null);
        setField(term66525, term66525.getClass(), "userMissionPointList", null);
        setField(term66525, term66525.getClass(), "userMusicDetailList", null);
        setField(term66525, term66525.getClass(), "userMusicItemList", null);
        setField(term66525, term66525.getClass(), "userOption", null);
        setField(term66525, term66525.getClass(), "userPlaylogList", null);
        setField(term66525, term66525.getClass(), "userStoryList", null);
        setField(term66525, term66525.getClass(), "userTrainingRoomList", null);
        setField(term66525, term66525.getClass(), "userTradeItemList", null);
        setField(term66525, term66525.getClass(), "userEventMusicList", null);
        setField(term66525, term66525.getClass(), "userTechEventList", null);
        setField(term66525, term66525.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserMissionPointList", argTypes, term66525, args);
    }

};


