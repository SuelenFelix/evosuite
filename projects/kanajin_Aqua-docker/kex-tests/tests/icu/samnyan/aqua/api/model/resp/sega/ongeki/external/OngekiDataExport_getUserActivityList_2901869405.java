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

public class OngekiDataExport_getUserActivityList_2901869405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5675;

    public OngekiDataExport_getUserActivityList_2901869405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5675 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term5675, term5675.getClass(), "gameId", null);
        setField(term5675, term5675.getClass(), "userData", null);
        setField(term5675, term5675.getClass(), "userActivityList", null);
        setField(term5675, term5675.getClass(), "userCardList", null);
        setField(term5675, term5675.getClass(), "userChapterList", null);
        setField(term5675, term5675.getClass(), "userCharacterList", null);
        setField(term5675, term5675.getClass(), "userDeckList", null);
        setField(term5675, term5675.getClass(), "userEventPointList", null);
        setField(term5675, term5675.getClass(), "userGeneralDataList", null);
        setField(term5675, term5675.getClass(), "userItemList", null);
        setField(term5675, term5675.getClass(), "userLoginBonusList", null);
        setField(term5675, term5675.getClass(), "userMissionPointList", null);
        setField(term5675, term5675.getClass(), "userMusicDetailList", null);
        setField(term5675, term5675.getClass(), "userMusicItemList", null);
        setField(term5675, term5675.getClass(), "userOption", null);
        setField(term5675, term5675.getClass(), "userPlaylogList", null);
        setField(term5675, term5675.getClass(), "userStoryList", null);
        setField(term5675, term5675.getClass(), "userTrainingRoomList", null);
        setField(term5675, term5675.getClass(), "userTradeItemList", null);
        setField(term5675, term5675.getClass(), "userEventMusicList", null);
        setField(term5675, term5675.getClass(), "userTechEventList", null);
        setField(term5675, term5675.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserActivityList", argTypes, term5675, args);
    }

};


