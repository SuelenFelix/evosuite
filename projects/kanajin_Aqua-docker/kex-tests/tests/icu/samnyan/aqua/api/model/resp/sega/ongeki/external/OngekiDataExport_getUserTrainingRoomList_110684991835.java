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

public class OngekiDataExport_getUserTrainingRoomList_110684991835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33775;

    public OngekiDataExport_getUserTrainingRoomList_110684991835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33775 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term33775, term33775.getClass(), "gameId", null);
        setField(term33775, term33775.getClass(), "userData", null);
        setField(term33775, term33775.getClass(), "userActivityList", null);
        setField(term33775, term33775.getClass(), "userCardList", null);
        setField(term33775, term33775.getClass(), "userChapterList", null);
        setField(term33775, term33775.getClass(), "userCharacterList", null);
        setField(term33775, term33775.getClass(), "userDeckList", null);
        setField(term33775, term33775.getClass(), "userEventPointList", null);
        setField(term33775, term33775.getClass(), "userGeneralDataList", null);
        setField(term33775, term33775.getClass(), "userItemList", null);
        setField(term33775, term33775.getClass(), "userLoginBonusList", null);
        setField(term33775, term33775.getClass(), "userMissionPointList", null);
        setField(term33775, term33775.getClass(), "userMusicDetailList", null);
        setField(term33775, term33775.getClass(), "userMusicItemList", null);
        setField(term33775, term33775.getClass(), "userOption", null);
        setField(term33775, term33775.getClass(), "userPlaylogList", null);
        setField(term33775, term33775.getClass(), "userStoryList", null);
        setField(term33775, term33775.getClass(), "userTrainingRoomList", null);
        setField(term33775, term33775.getClass(), "userTradeItemList", null);
        setField(term33775, term33775.getClass(), "userEventMusicList", null);
        setField(term33775, term33775.getClass(), "userTechEventList", null);
        setField(term33775, term33775.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserTrainingRoomList", argTypes, term33775, args);
    }

};


