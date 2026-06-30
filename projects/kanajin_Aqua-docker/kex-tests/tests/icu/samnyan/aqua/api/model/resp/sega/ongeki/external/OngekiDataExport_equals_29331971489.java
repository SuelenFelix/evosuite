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

public class OngekiDataExport_equals_29331971489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88834;

    public OngekiDataExport_equals_29331971489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88834 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport"));
        setField(term88834, term88834.getClass(), "gameId", null);
        setField(term88834, term88834.getClass(), "userData", null);
        setField(term88834, term88834.getClass(), "userActivityList", null);
        setField(term88834, term88834.getClass(), "userCardList", null);
        setField(term88834, term88834.getClass(), "userChapterList", null);
        setField(term88834, term88834.getClass(), "userCharacterList", null);
        setField(term88834, term88834.getClass(), "userDeckList", null);
        setField(term88834, term88834.getClass(), "userEventPointList", null);
        setField(term88834, term88834.getClass(), "userGeneralDataList", null);
        setField(term88834, term88834.getClass(), "userItemList", null);
        setField(term88834, term88834.getClass(), "userLoginBonusList", null);
        setField(term88834, term88834.getClass(), "userMissionPointList", null);
        setField(term88834, term88834.getClass(), "userMusicDetailList", null);
        setField(term88834, term88834.getClass(), "userMusicItemList", null);
        setField(term88834, term88834.getClass(), "userOption", null);
        setField(term88834, term88834.getClass(), "userPlaylogList", null);
        setField(term88834, term88834.getClass(), "userStoryList", null);
        setField(term88834, term88834.getClass(), "userTrainingRoomList", null);
        setField(term88834, term88834.getClass(), "userTradeItemList", null);
        setField(term88834, term88834.getClass(), "userEventMusicList", null);
        setField(term88834, term88834.getClass(), "userTechEventList", null);
        setField(term88834, term88834.getClass(), "userKopList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term88834, args);
    }

};


