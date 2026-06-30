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

public class OngekiDataExport_getUserMissionPointList_24802846323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22982;

    public OngekiDataExport_getUserMissionPointList_24802846323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22982 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term22982, term22982.getClass(), "gameId", null);
        setField(term22982, term22982.getClass(), "userData", null);
        setField(term22982, term22982.getClass(), "userActivityList", null);
        setField(term22982, term22982.getClass(), "userCardList", null);
        setField(term22982, term22982.getClass(), "userChapterList", null);
        setField(term22982, term22982.getClass(), "userCharacterList", null);
        setField(term22982, term22982.getClass(), "userDeckList", null);
        setField(term22982, term22982.getClass(), "userEventPointList", null);
        setField(term22982, term22982.getClass(), "userGeneralDataList", null);
        setField(term22982, term22982.getClass(), "userItemList", null);
        setField(term22982, term22982.getClass(), "userLoginBonusList", null);
        setField(term22982, term22982.getClass(), "userMissionPointList", null);
        setField(term22982, term22982.getClass(), "userMusicDetailList", null);
        setField(term22982, term22982.getClass(), "userMusicItemList", null);
        setField(term22982, term22982.getClass(), "userOption", null);
        setField(term22982, term22982.getClass(), "userPlaylogList", null);
        setField(term22982, term22982.getClass(), "userStoryList", null);
        setField(term22982, term22982.getClass(), "userTrainingRoomList", null);
        setField(term22982, term22982.getClass(), "userTradeItemList", null);
        setField(term22982, term22982.getClass(), "userEventMusicList", null);
        setField(term22982, term22982.getClass(), "userTechEventList", null);
        setField(term22982, term22982.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserMissionPointList", argTypes, term22982, args);
    }

};


