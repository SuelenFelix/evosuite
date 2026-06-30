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

public class OngekiDataExport_setUserOption_103890987673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72210;

    public OngekiDataExport_setUserOption_103890987673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72210 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term72210, term72210.getClass(), "gameId", null);
        setField(term72210, term72210.getClass(), "userData", null);
        setField(term72210, term72210.getClass(), "userActivityList", null);
        setField(term72210, term72210.getClass(), "userCardList", null);
        setField(term72210, term72210.getClass(), "userChapterList", null);
        setField(term72210, term72210.getClass(), "userCharacterList", null);
        setField(term72210, term72210.getClass(), "userDeckList", null);
        setField(term72210, term72210.getClass(), "userEventPointList", null);
        setField(term72210, term72210.getClass(), "userGeneralDataList", null);
        setField(term72210, term72210.getClass(), "userItemList", null);
        setField(term72210, term72210.getClass(), "userLoginBonusList", null);
        setField(term72210, term72210.getClass(), "userMissionPointList", null);
        setField(term72210, term72210.getClass(), "userMusicDetailList", null);
        setField(term72210, term72210.getClass(), "userMusicItemList", null);
        setField(term72210, term72210.getClass(), "userOption", null);
        setField(term72210, term72210.getClass(), "userPlaylogList", null);
        setField(term72210, term72210.getClass(), "userStoryList", null);
        setField(term72210, term72210.getClass(), "userTrainingRoomList", null);
        setField(term72210, term72210.getClass(), "userTradeItemList", null);
        setField(term72210, term72210.getClass(), "userEventMusicList", null);
        setField(term72210, term72210.getClass(), "userTechEventList", null);
        setField(term72210, term72210.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserOption", argTypes, term72210, args);
    }

};


