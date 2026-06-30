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

public class OngekiDataImport_getUserMissionPointList_130790169661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245613;

    public OngekiDataImport_getUserMissionPointList_130790169661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245613 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport"));
        setField(term245613, term245613.getClass(), "gameId", null);
        setField(term245613, term245613.getClass(), "userData", null);
        setField(term245613, term245613.getClass(), "userActivityList", null);
        setField(term245613, term245613.getClass(), "userCardList", null);
        setField(term245613, term245613.getClass(), "userChapterList", null);
        setField(term245613, term245613.getClass(), "userCharacterList", null);
        setField(term245613, term245613.getClass(), "userDeckList", null);
        setField(term245613, term245613.getClass(), "userEventPointList", null);
        setField(term245613, term245613.getClass(), "userGeneralDataList", null);
        setField(term245613, term245613.getClass(), "userItemList", null);
        setField(term245613, term245613.getClass(), "userLoginBonusList", null);
        setField(term245613, term245613.getClass(), "userMissionPointList", null);
        setField(term245613, term245613.getClass(), "userMusicDetailList", null);
        setField(term245613, term245613.getClass(), "userMusicItemList", null);
        setField(term245613, term245613.getClass(), "userOption", null);
        setField(term245613, term245613.getClass(), "userPlaylogList", null);
        setField(term245613, term245613.getClass(), "userStoryList", null);
        setField(term245613, term245613.getClass(), "userTrainingRoomList", null);
        setField(term245613, term245613.getClass(), "userTradeItemList", null);
        setField(term245613, term245613.getClass(), "userEventMusicList", null);
        setField(term245613, term245613.getClass(), "userTechEventList", null);
        setField(term245613, term245613.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMissionPointList", argTypes, term245613, args);
    }

};


