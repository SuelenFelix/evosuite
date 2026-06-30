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

public class OngekiDataExport_getUserGeneralDataList_10730732517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16941;

    public OngekiDataExport_getUserGeneralDataList_10730732517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16941 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term16941, term16941.getClass(), "gameId", null);
        setField(term16941, term16941.getClass(), "userData", null);
        setField(term16941, term16941.getClass(), "userActivityList", null);
        setField(term16941, term16941.getClass(), "userCardList", null);
        setField(term16941, term16941.getClass(), "userChapterList", null);
        setField(term16941, term16941.getClass(), "userCharacterList", null);
        setField(term16941, term16941.getClass(), "userDeckList", null);
        setField(term16941, term16941.getClass(), "userEventPointList", null);
        setField(term16941, term16941.getClass(), "userGeneralDataList", null);
        setField(term16941, term16941.getClass(), "userItemList", null);
        setField(term16941, term16941.getClass(), "userLoginBonusList", null);
        setField(term16941, term16941.getClass(), "userMissionPointList", null);
        setField(term16941, term16941.getClass(), "userMusicDetailList", null);
        setField(term16941, term16941.getClass(), "userMusicItemList", null);
        setField(term16941, term16941.getClass(), "userOption", null);
        setField(term16941, term16941.getClass(), "userPlaylogList", null);
        setField(term16941, term16941.getClass(), "userStoryList", null);
        setField(term16941, term16941.getClass(), "userTrainingRoomList", null);
        setField(term16941, term16941.getClass(), "userTradeItemList", null);
        setField(term16941, term16941.getClass(), "userEventMusicList", null);
        setField(term16941, term16941.getClass(), "userTechEventList", null);
        setField(term16941, term16941.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserGeneralDataList", argTypes, term16941, args);
    }

};


