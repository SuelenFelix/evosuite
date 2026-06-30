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

public class OngekiDataImport_getUserGeneralDataList_95256590858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245610;

    public OngekiDataImport_getUserGeneralDataList_95256590858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245610 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport"));
        setField(term245610, term245610.getClass(), "gameId", null);
        setField(term245610, term245610.getClass(), "userData", null);
        setField(term245610, term245610.getClass(), "userActivityList", null);
        setField(term245610, term245610.getClass(), "userCardList", null);
        setField(term245610, term245610.getClass(), "userChapterList", null);
        setField(term245610, term245610.getClass(), "userCharacterList", null);
        setField(term245610, term245610.getClass(), "userDeckList", null);
        setField(term245610, term245610.getClass(), "userEventPointList", null);
        setField(term245610, term245610.getClass(), "userGeneralDataList", null);
        setField(term245610, term245610.getClass(), "userItemList", null);
        setField(term245610, term245610.getClass(), "userLoginBonusList", null);
        setField(term245610, term245610.getClass(), "userMissionPointList", null);
        setField(term245610, term245610.getClass(), "userMusicDetailList", null);
        setField(term245610, term245610.getClass(), "userMusicItemList", null);
        setField(term245610, term245610.getClass(), "userOption", null);
        setField(term245610, term245610.getClass(), "userPlaylogList", null);
        setField(term245610, term245610.getClass(), "userStoryList", null);
        setField(term245610, term245610.getClass(), "userTrainingRoomList", null);
        setField(term245610, term245610.getClass(), "userTradeItemList", null);
        setField(term245610, term245610.getClass(), "userEventMusicList", null);
        setField(term245610, term245610.getClass(), "userTechEventList", null);
        setField(term245610, term245610.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserGeneralDataList", argTypes, term245610, args);
    }

};


