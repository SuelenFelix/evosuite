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

public class OngekiDataExport_setUserLoginBonusList_192827760965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64282;

    public OngekiDataExport_setUserLoginBonusList_192827760965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64282 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term64282, term64282.getClass(), "gameId", null);
        setField(term64282, term64282.getClass(), "userData", null);
        setField(term64282, term64282.getClass(), "userActivityList", null);
        setField(term64282, term64282.getClass(), "userCardList", null);
        setField(term64282, term64282.getClass(), "userChapterList", null);
        setField(term64282, term64282.getClass(), "userCharacterList", null);
        setField(term64282, term64282.getClass(), "userDeckList", null);
        setField(term64282, term64282.getClass(), "userEventPointList", null);
        setField(term64282, term64282.getClass(), "userGeneralDataList", null);
        setField(term64282, term64282.getClass(), "userItemList", null);
        setField(term64282, term64282.getClass(), "userLoginBonusList", null);
        setField(term64282, term64282.getClass(), "userMissionPointList", null);
        setField(term64282, term64282.getClass(), "userMusicDetailList", null);
        setField(term64282, term64282.getClass(), "userMusicItemList", null);
        setField(term64282, term64282.getClass(), "userOption", null);
        setField(term64282, term64282.getClass(), "userPlaylogList", null);
        setField(term64282, term64282.getClass(), "userStoryList", null);
        setField(term64282, term64282.getClass(), "userTrainingRoomList", null);
        setField(term64282, term64282.getClass(), "userTradeItemList", null);
        setField(term64282, term64282.getClass(), "userEventMusicList", null);
        setField(term64282, term64282.getClass(), "userTechEventList", null);
        setField(term64282, term64282.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserLoginBonusList", argTypes, term64282, args);
    }

};


