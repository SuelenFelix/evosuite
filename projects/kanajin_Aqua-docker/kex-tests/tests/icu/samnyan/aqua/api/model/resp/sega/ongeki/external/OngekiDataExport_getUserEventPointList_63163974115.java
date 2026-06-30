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

public class OngekiDataExport_getUserEventPointList_63163974115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15067;

    public OngekiDataExport_getUserEventPointList_63163974115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15067 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term15067, term15067.getClass(), "gameId", null);
        setField(term15067, term15067.getClass(), "userData", null);
        setField(term15067, term15067.getClass(), "userActivityList", null);
        setField(term15067, term15067.getClass(), "userCardList", null);
        setField(term15067, term15067.getClass(), "userChapterList", null);
        setField(term15067, term15067.getClass(), "userCharacterList", null);
        setField(term15067, term15067.getClass(), "userDeckList", null);
        setField(term15067, term15067.getClass(), "userEventPointList", null);
        setField(term15067, term15067.getClass(), "userGeneralDataList", null);
        setField(term15067, term15067.getClass(), "userItemList", null);
        setField(term15067, term15067.getClass(), "userLoginBonusList", null);
        setField(term15067, term15067.getClass(), "userMissionPointList", null);
        setField(term15067, term15067.getClass(), "userMusicDetailList", null);
        setField(term15067, term15067.getClass(), "userMusicItemList", null);
        setField(term15067, term15067.getClass(), "userOption", null);
        setField(term15067, term15067.getClass(), "userPlaylogList", null);
        setField(term15067, term15067.getClass(), "userStoryList", null);
        setField(term15067, term15067.getClass(), "userTrainingRoomList", null);
        setField(term15067, term15067.getClass(), "userTradeItemList", null);
        setField(term15067, term15067.getClass(), "userEventMusicList", null);
        setField(term15067, term15067.getClass(), "userTechEventList", null);
        setField(term15067, term15067.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserEventPointList", argTypes, term15067, args);
    }

};


