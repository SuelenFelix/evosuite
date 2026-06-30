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

public class OngekiDataExport_getUserItemList_117786732819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18845;

    public OngekiDataExport_getUserItemList_117786732819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18845 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term18845, term18845.getClass(), "gameId", null);
        setField(term18845, term18845.getClass(), "userData", null);
        setField(term18845, term18845.getClass(), "userActivityList", null);
        setField(term18845, term18845.getClass(), "userCardList", null);
        setField(term18845, term18845.getClass(), "userChapterList", null);
        setField(term18845, term18845.getClass(), "userCharacterList", null);
        setField(term18845, term18845.getClass(), "userDeckList", null);
        setField(term18845, term18845.getClass(), "userEventPointList", null);
        setField(term18845, term18845.getClass(), "userGeneralDataList", null);
        setField(term18845, term18845.getClass(), "userItemList", null);
        setField(term18845, term18845.getClass(), "userLoginBonusList", null);
        setField(term18845, term18845.getClass(), "userMissionPointList", null);
        setField(term18845, term18845.getClass(), "userMusicDetailList", null);
        setField(term18845, term18845.getClass(), "userMusicItemList", null);
        setField(term18845, term18845.getClass(), "userOption", null);
        setField(term18845, term18845.getClass(), "userPlaylogList", null);
        setField(term18845, term18845.getClass(), "userStoryList", null);
        setField(term18845, term18845.getClass(), "userTrainingRoomList", null);
        setField(term18845, term18845.getClass(), "userTradeItemList", null);
        setField(term18845, term18845.getClass(), "userEventMusicList", null);
        setField(term18845, term18845.getClass(), "userTechEventList", null);
        setField(term18845, term18845.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserItemList", argTypes, term18845, args);
    }

};


