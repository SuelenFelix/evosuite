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

public class OngekiDataExport_getUserTechEventList_4839924941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39498;

    public OngekiDataExport_getUserTechEventList_4839924941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39498 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term39498, term39498.getClass(), "gameId", null);
        setField(term39498, term39498.getClass(), "userData", null);
        setField(term39498, term39498.getClass(), "userActivityList", null);
        setField(term39498, term39498.getClass(), "userCardList", null);
        setField(term39498, term39498.getClass(), "userChapterList", null);
        setField(term39498, term39498.getClass(), "userCharacterList", null);
        setField(term39498, term39498.getClass(), "userDeckList", null);
        setField(term39498, term39498.getClass(), "userEventPointList", null);
        setField(term39498, term39498.getClass(), "userGeneralDataList", null);
        setField(term39498, term39498.getClass(), "userItemList", null);
        setField(term39498, term39498.getClass(), "userLoginBonusList", null);
        setField(term39498, term39498.getClass(), "userMissionPointList", null);
        setField(term39498, term39498.getClass(), "userMusicDetailList", null);
        setField(term39498, term39498.getClass(), "userMusicItemList", null);
        setField(term39498, term39498.getClass(), "userOption", null);
        setField(term39498, term39498.getClass(), "userPlaylogList", null);
        setField(term39498, term39498.getClass(), "userStoryList", null);
        setField(term39498, term39498.getClass(), "userTrainingRoomList", null);
        setField(term39498, term39498.getClass(), "userTradeItemList", null);
        setField(term39498, term39498.getClass(), "userEventMusicList", null);
        setField(term39498, term39498.getClass(), "userTechEventList", null);
        setField(term39498, term39498.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserTechEventList", argTypes, term39498, args);
    }

};


