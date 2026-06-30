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

public class OngekiDataExport_getUserTradeItemList_113994262237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35732;

    public OngekiDataExport_getUserTradeItemList_113994262237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35732 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term35732, term35732.getClass(), "gameId", null);
        setField(term35732, term35732.getClass(), "userData", null);
        setField(term35732, term35732.getClass(), "userActivityList", null);
        setField(term35732, term35732.getClass(), "userCardList", null);
        setField(term35732, term35732.getClass(), "userChapterList", null);
        setField(term35732, term35732.getClass(), "userCharacterList", null);
        setField(term35732, term35732.getClass(), "userDeckList", null);
        setField(term35732, term35732.getClass(), "userEventPointList", null);
        setField(term35732, term35732.getClass(), "userGeneralDataList", null);
        setField(term35732, term35732.getClass(), "userItemList", null);
        setField(term35732, term35732.getClass(), "userLoginBonusList", null);
        setField(term35732, term35732.getClass(), "userMissionPointList", null);
        setField(term35732, term35732.getClass(), "userMusicDetailList", null);
        setField(term35732, term35732.getClass(), "userMusicItemList", null);
        setField(term35732, term35732.getClass(), "userOption", null);
        setField(term35732, term35732.getClass(), "userPlaylogList", null);
        setField(term35732, term35732.getClass(), "userStoryList", null);
        setField(term35732, term35732.getClass(), "userTrainingRoomList", null);
        setField(term35732, term35732.getClass(), "userTradeItemList", null);
        setField(term35732, term35732.getClass(), "userEventMusicList", null);
        setField(term35732, term35732.getClass(), "userTechEventList", null);
        setField(term35732, term35732.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserTradeItemList", argTypes, term35732, args);
    }

};


