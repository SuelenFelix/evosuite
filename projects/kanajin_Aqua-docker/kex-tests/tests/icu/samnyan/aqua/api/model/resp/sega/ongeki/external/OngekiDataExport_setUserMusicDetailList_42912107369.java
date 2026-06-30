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

public class OngekiDataExport_setUserMusicDetailList_42912107369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68522;

    public OngekiDataExport_setUserMusicDetailList_42912107369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68522 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term68522, term68522.getClass(), "gameId", null);
        setField(term68522, term68522.getClass(), "userData", null);
        setField(term68522, term68522.getClass(), "userActivityList", null);
        setField(term68522, term68522.getClass(), "userCardList", null);
        setField(term68522, term68522.getClass(), "userChapterList", null);
        setField(term68522, term68522.getClass(), "userCharacterList", null);
        setField(term68522, term68522.getClass(), "userDeckList", null);
        setField(term68522, term68522.getClass(), "userEventPointList", null);
        setField(term68522, term68522.getClass(), "userGeneralDataList", null);
        setField(term68522, term68522.getClass(), "userItemList", null);
        setField(term68522, term68522.getClass(), "userLoginBonusList", null);
        setField(term68522, term68522.getClass(), "userMissionPointList", null);
        setField(term68522, term68522.getClass(), "userMusicDetailList", null);
        setField(term68522, term68522.getClass(), "userMusicItemList", null);
        setField(term68522, term68522.getClass(), "userOption", null);
        setField(term68522, term68522.getClass(), "userPlaylogList", null);
        setField(term68522, term68522.getClass(), "userStoryList", null);
        setField(term68522, term68522.getClass(), "userTrainingRoomList", null);
        setField(term68522, term68522.getClass(), "userTradeItemList", null);
        setField(term68522, term68522.getClass(), "userEventMusicList", null);
        setField(term68522, term68522.getClass(), "userTechEventList", null);
        setField(term68522, term68522.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserMusicDetailList", argTypes, term68522, args);
    }

};


