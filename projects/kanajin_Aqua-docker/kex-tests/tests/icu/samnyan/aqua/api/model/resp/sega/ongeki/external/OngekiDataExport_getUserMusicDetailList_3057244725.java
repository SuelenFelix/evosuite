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

public class OngekiDataExport_getUserMusicDetailList_3057244725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24662;

    public OngekiDataExport_getUserMusicDetailList_3057244725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24662 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term24662, term24662.getClass(), "gameId", null);
        setField(term24662, term24662.getClass(), "userData", null);
        setField(term24662, term24662.getClass(), "userActivityList", null);
        setField(term24662, term24662.getClass(), "userCardList", null);
        setField(term24662, term24662.getClass(), "userChapterList", null);
        setField(term24662, term24662.getClass(), "userCharacterList", null);
        setField(term24662, term24662.getClass(), "userDeckList", null);
        setField(term24662, term24662.getClass(), "userEventPointList", null);
        setField(term24662, term24662.getClass(), "userGeneralDataList", null);
        setField(term24662, term24662.getClass(), "userItemList", null);
        setField(term24662, term24662.getClass(), "userLoginBonusList", null);
        setField(term24662, term24662.getClass(), "userMissionPointList", null);
        setField(term24662, term24662.getClass(), "userMusicDetailList", null);
        setField(term24662, term24662.getClass(), "userMusicItemList", null);
        setField(term24662, term24662.getClass(), "userOption", null);
        setField(term24662, term24662.getClass(), "userPlaylogList", null);
        setField(term24662, term24662.getClass(), "userStoryList", null);
        setField(term24662, term24662.getClass(), "userTrainingRoomList", null);
        setField(term24662, term24662.getClass(), "userTradeItemList", null);
        setField(term24662, term24662.getClass(), "userEventMusicList", null);
        setField(term24662, term24662.getClass(), "userTechEventList", null);
        setField(term24662, term24662.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMusicDetailList", argTypes, term24662, args);
    }

};


