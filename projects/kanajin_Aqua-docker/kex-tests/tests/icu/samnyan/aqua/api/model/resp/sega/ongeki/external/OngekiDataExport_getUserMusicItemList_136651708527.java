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

public class OngekiDataExport_getUserMusicItemList_136651708527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26780;

    public OngekiDataExport_getUserMusicItemList_136651708527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26780 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term26780, term26780.getClass(), "gameId", null);
        setField(term26780, term26780.getClass(), "userData", null);
        setField(term26780, term26780.getClass(), "userActivityList", null);
        setField(term26780, term26780.getClass(), "userCardList", null);
        setField(term26780, term26780.getClass(), "userChapterList", null);
        setField(term26780, term26780.getClass(), "userCharacterList", null);
        setField(term26780, term26780.getClass(), "userDeckList", null);
        setField(term26780, term26780.getClass(), "userEventPointList", null);
        setField(term26780, term26780.getClass(), "userGeneralDataList", null);
        setField(term26780, term26780.getClass(), "userItemList", null);
        setField(term26780, term26780.getClass(), "userLoginBonusList", null);
        setField(term26780, term26780.getClass(), "userMissionPointList", null);
        setField(term26780, term26780.getClass(), "userMusicDetailList", null);
        setField(term26780, term26780.getClass(), "userMusicItemList", null);
        setField(term26780, term26780.getClass(), "userOption", null);
        setField(term26780, term26780.getClass(), "userPlaylogList", null);
        setField(term26780, term26780.getClass(), "userStoryList", null);
        setField(term26780, term26780.getClass(), "userTrainingRoomList", null);
        setField(term26780, term26780.getClass(), "userTradeItemList", null);
        setField(term26780, term26780.getClass(), "userEventMusicList", null);
        setField(term26780, term26780.getClass(), "userTechEventList", null);
        setField(term26780, term26780.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMusicItemList", argTypes, term26780, args);
    }

};


