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

public class OngekiDataExport_getUserLoginBonusList_52952668521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21010;

    public OngekiDataExport_getUserLoginBonusList_52952668521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21010 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term21010, term21010.getClass(), "gameId", null);
        setField(term21010, term21010.getClass(), "userData", null);
        setField(term21010, term21010.getClass(), "userActivityList", null);
        setField(term21010, term21010.getClass(), "userCardList", null);
        setField(term21010, term21010.getClass(), "userChapterList", null);
        setField(term21010, term21010.getClass(), "userCharacterList", null);
        setField(term21010, term21010.getClass(), "userDeckList", null);
        setField(term21010, term21010.getClass(), "userEventPointList", null);
        setField(term21010, term21010.getClass(), "userGeneralDataList", null);
        setField(term21010, term21010.getClass(), "userItemList", null);
        setField(term21010, term21010.getClass(), "userLoginBonusList", null);
        setField(term21010, term21010.getClass(), "userMissionPointList", null);
        setField(term21010, term21010.getClass(), "userMusicDetailList", null);
        setField(term21010, term21010.getClass(), "userMusicItemList", null);
        setField(term21010, term21010.getClass(), "userOption", null);
        setField(term21010, term21010.getClass(), "userPlaylogList", null);
        setField(term21010, term21010.getClass(), "userStoryList", null);
        setField(term21010, term21010.getClass(), "userTrainingRoomList", null);
        setField(term21010, term21010.getClass(), "userTradeItemList", null);
        setField(term21010, term21010.getClass(), "userEventMusicList", null);
        setField(term21010, term21010.getClass(), "userTechEventList", null);
        setField(term21010, term21010.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserLoginBonusList", argTypes, term21010, args);
    }

};


