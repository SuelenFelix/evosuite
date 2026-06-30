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

public class OngekiDataExport_getUserKopList_157630986543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41497;

    public OngekiDataExport_getUserKopList_157630986543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41497 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term41497, term41497.getClass(), "gameId", null);
        setField(term41497, term41497.getClass(), "userData", null);
        setField(term41497, term41497.getClass(), "userActivityList", null);
        setField(term41497, term41497.getClass(), "userCardList", null);
        setField(term41497, term41497.getClass(), "userChapterList", null);
        setField(term41497, term41497.getClass(), "userCharacterList", null);
        setField(term41497, term41497.getClass(), "userDeckList", null);
        setField(term41497, term41497.getClass(), "userEventPointList", null);
        setField(term41497, term41497.getClass(), "userGeneralDataList", null);
        setField(term41497, term41497.getClass(), "userItemList", null);
        setField(term41497, term41497.getClass(), "userLoginBonusList", null);
        setField(term41497, term41497.getClass(), "userMissionPointList", null);
        setField(term41497, term41497.getClass(), "userMusicDetailList", null);
        setField(term41497, term41497.getClass(), "userMusicItemList", null);
        setField(term41497, term41497.getClass(), "userOption", null);
        setField(term41497, term41497.getClass(), "userPlaylogList", null);
        setField(term41497, term41497.getClass(), "userStoryList", null);
        setField(term41497, term41497.getClass(), "userTrainingRoomList", null);
        setField(term41497, term41497.getClass(), "userTradeItemList", null);
        setField(term41497, term41497.getClass(), "userEventMusicList", null);
        setField(term41497, term41497.getClass(), "userTechEventList", null);
        setField(term41497, term41497.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserKopList", argTypes, term41497, args);
    }

};


