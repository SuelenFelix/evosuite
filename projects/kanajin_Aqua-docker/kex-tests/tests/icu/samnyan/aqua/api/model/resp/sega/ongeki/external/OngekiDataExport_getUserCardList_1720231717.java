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

public class OngekiDataExport_getUserCardList_1720231717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7436;

    public OngekiDataExport_getUserCardList_1720231717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7436 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term7436, term7436.getClass(), "gameId", null);
        setField(term7436, term7436.getClass(), "userData", null);
        setField(term7436, term7436.getClass(), "userActivityList", null);
        setField(term7436, term7436.getClass(), "userCardList", null);
        setField(term7436, term7436.getClass(), "userChapterList", null);
        setField(term7436, term7436.getClass(), "userCharacterList", null);
        setField(term7436, term7436.getClass(), "userDeckList", null);
        setField(term7436, term7436.getClass(), "userEventPointList", null);
        setField(term7436, term7436.getClass(), "userGeneralDataList", null);
        setField(term7436, term7436.getClass(), "userItemList", null);
        setField(term7436, term7436.getClass(), "userLoginBonusList", null);
        setField(term7436, term7436.getClass(), "userMissionPointList", null);
        setField(term7436, term7436.getClass(), "userMusicDetailList", null);
        setField(term7436, term7436.getClass(), "userMusicItemList", null);
        setField(term7436, term7436.getClass(), "userOption", null);
        setField(term7436, term7436.getClass(), "userPlaylogList", null);
        setField(term7436, term7436.getClass(), "userStoryList", null);
        setField(term7436, term7436.getClass(), "userTrainingRoomList", null);
        setField(term7436, term7436.getClass(), "userTradeItemList", null);
        setField(term7436, term7436.getClass(), "userEventMusicList", null);
        setField(term7436, term7436.getClass(), "userTechEventList", null);
        setField(term7436, term7436.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserCardList", argTypes, term7436, args);
    }

};


