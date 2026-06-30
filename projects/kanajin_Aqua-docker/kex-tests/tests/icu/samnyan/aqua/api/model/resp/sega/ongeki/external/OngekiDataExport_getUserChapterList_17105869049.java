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

public class OngekiDataExport_getUserChapterList_17105869049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9339;

    public OngekiDataExport_getUserChapterList_17105869049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9339 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term9339, term9339.getClass(), "gameId", null);
        setField(term9339, term9339.getClass(), "userData", null);
        setField(term9339, term9339.getClass(), "userActivityList", null);
        setField(term9339, term9339.getClass(), "userCardList", null);
        setField(term9339, term9339.getClass(), "userChapterList", null);
        setField(term9339, term9339.getClass(), "userCharacterList", null);
        setField(term9339, term9339.getClass(), "userDeckList", null);
        setField(term9339, term9339.getClass(), "userEventPointList", null);
        setField(term9339, term9339.getClass(), "userGeneralDataList", null);
        setField(term9339, term9339.getClass(), "userItemList", null);
        setField(term9339, term9339.getClass(), "userLoginBonusList", null);
        setField(term9339, term9339.getClass(), "userMissionPointList", null);
        setField(term9339, term9339.getClass(), "userMusicDetailList", null);
        setField(term9339, term9339.getClass(), "userMusicItemList", null);
        setField(term9339, term9339.getClass(), "userOption", null);
        setField(term9339, term9339.getClass(), "userPlaylogList", null);
        setField(term9339, term9339.getClass(), "userStoryList", null);
        setField(term9339, term9339.getClass(), "userTrainingRoomList", null);
        setField(term9339, term9339.getClass(), "userTradeItemList", null);
        setField(term9339, term9339.getClass(), "userEventMusicList", null);
        setField(term9339, term9339.getClass(), "userTechEventList", null);
        setField(term9339, term9339.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserChapterList", argTypes, term9339, args);
    }

};


