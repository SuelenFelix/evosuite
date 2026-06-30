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

public class OngekiDataExport_setUserTechEventList_167026146985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85188;

    public OngekiDataExport_setUserTechEventList_167026146985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85188 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term85188, term85188.getClass(), "gameId", null);
        setField(term85188, term85188.getClass(), "userData", null);
        setField(term85188, term85188.getClass(), "userActivityList", null);
        setField(term85188, term85188.getClass(), "userCardList", null);
        setField(term85188, term85188.getClass(), "userChapterList", null);
        setField(term85188, term85188.getClass(), "userCharacterList", null);
        setField(term85188, term85188.getClass(), "userDeckList", null);
        setField(term85188, term85188.getClass(), "userEventPointList", null);
        setField(term85188, term85188.getClass(), "userGeneralDataList", null);
        setField(term85188, term85188.getClass(), "userItemList", null);
        setField(term85188, term85188.getClass(), "userLoginBonusList", null);
        setField(term85188, term85188.getClass(), "userMissionPointList", null);
        setField(term85188, term85188.getClass(), "userMusicDetailList", null);
        setField(term85188, term85188.getClass(), "userMusicItemList", null);
        setField(term85188, term85188.getClass(), "userOption", null);
        setField(term85188, term85188.getClass(), "userPlaylogList", null);
        setField(term85188, term85188.getClass(), "userStoryList", null);
        setField(term85188, term85188.getClass(), "userTrainingRoomList", null);
        setField(term85188, term85188.getClass(), "userTradeItemList", null);
        setField(term85188, term85188.getClass(), "userEventMusicList", null);
        setField(term85188, term85188.getClass(), "userTechEventList", null);
        setField(term85188, term85188.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserTechEventList", argTypes, term85188, args);
    }

};


