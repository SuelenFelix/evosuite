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

public class OngekiDataImport_setUserOption_209878310986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245638;

    public OngekiDataImport_setUserOption_209878310986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245638 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport"));
        setField(term245638, term245638.getClass(), "gameId", null);
        setField(term245638, term245638.getClass(), "userData", null);
        setField(term245638, term245638.getClass(), "userActivityList", null);
        setField(term245638, term245638.getClass(), "userCardList", null);
        setField(term245638, term245638.getClass(), "userChapterList", null);
        setField(term245638, term245638.getClass(), "userCharacterList", null);
        setField(term245638, term245638.getClass(), "userDeckList", null);
        setField(term245638, term245638.getClass(), "userEventPointList", null);
        setField(term245638, term245638.getClass(), "userGeneralDataList", null);
        setField(term245638, term245638.getClass(), "userItemList", null);
        setField(term245638, term245638.getClass(), "userLoginBonusList", null);
        setField(term245638, term245638.getClass(), "userMissionPointList", null);
        setField(term245638, term245638.getClass(), "userMusicDetailList", null);
        setField(term245638, term245638.getClass(), "userMusicItemList", null);
        setField(term245638, term245638.getClass(), "userOption", null);
        setField(term245638, term245638.getClass(), "userPlaylogList", null);
        setField(term245638, term245638.getClass(), "userStoryList", null);
        setField(term245638, term245638.getClass(), "userTrainingRoomList", null);
        setField(term245638, term245638.getClass(), "userTradeItemList", null);
        setField(term245638, term245638.getClass(), "userEventMusicList", null);
        setField(term245638, term245638.getClass(), "userTechEventList", null);
        setField(term245638, term245638.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataImport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserOption", argTypes, term245638, args);
    }

};


