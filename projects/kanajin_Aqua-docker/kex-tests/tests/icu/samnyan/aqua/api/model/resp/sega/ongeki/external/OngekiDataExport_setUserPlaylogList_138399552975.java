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

public class OngekiDataExport_setUserPlaylogList_138399552975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74396;

    public OngekiDataExport_setUserPlaylogList_138399552975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74396 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term74396, term74396.getClass(), "gameId", null);
        setField(term74396, term74396.getClass(), "userData", null);
        setField(term74396, term74396.getClass(), "userActivityList", null);
        setField(term74396, term74396.getClass(), "userCardList", null);
        setField(term74396, term74396.getClass(), "userChapterList", null);
        setField(term74396, term74396.getClass(), "userCharacterList", null);
        setField(term74396, term74396.getClass(), "userDeckList", null);
        setField(term74396, term74396.getClass(), "userEventPointList", null);
        setField(term74396, term74396.getClass(), "userGeneralDataList", null);
        setField(term74396, term74396.getClass(), "userItemList", null);
        setField(term74396, term74396.getClass(), "userLoginBonusList", null);
        setField(term74396, term74396.getClass(), "userMissionPointList", null);
        setField(term74396, term74396.getClass(), "userMusicDetailList", null);
        setField(term74396, term74396.getClass(), "userMusicItemList", null);
        setField(term74396, term74396.getClass(), "userOption", null);
        setField(term74396, term74396.getClass(), "userPlaylogList", null);
        setField(term74396, term74396.getClass(), "userStoryList", null);
        setField(term74396, term74396.getClass(), "userTrainingRoomList", null);
        setField(term74396, term74396.getClass(), "userTradeItemList", null);
        setField(term74396, term74396.getClass(), "userEventMusicList", null);
        setField(term74396, term74396.getClass(), "userTechEventList", null);
        setField(term74396, term74396.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserPlaylogList", argTypes, term74396, args);
    }

};


