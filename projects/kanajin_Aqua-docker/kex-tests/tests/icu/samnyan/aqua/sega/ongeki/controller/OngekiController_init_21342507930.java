package icu.samnyan.aqua.sega.ongeki.controller;

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
import static icu.samnyan.aqua.sega.ongeki.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OngekiController_init_21342507930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term3;
     Object term4;
     Object term5;
     Object term6;
     Object term7;

    public OngekiController_init_21342507930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGameMessageHandler"));
        setField(term1, term1.getClass(), "mapper", null);
        term2 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserBpBaseHandler"));
        setField(term2, term2.getClass(), "mapper", null);
        term3 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserRatinglogListHandler"));
        setField(term3, term3.getClass(), "mapper", null);
        term4 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserRegionHandler"));
        setField(term4, term4.getClass(), "mapper", null);
        term5 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserRivalHandler"));
        setField(term5, term5.getClass(), "mapper", null);
        term6 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserRivalMusicHandler"));
        setField(term6, term6.getClass(), "mapper", null);
        term7 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGameTechMusicHandler"));
        setField(term7, term7.getClass(), "mapper", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.controller.OngekiController");
        Class<?>[] argTypes = new Class<?>[45];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGameEventHandler");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGameIdlistHandler");
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGameMessageHandler");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGamePointHandler");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGamePresentHandler");
        argTypes[5] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGameRankingHandler");
        argTypes[6] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGameRewardHandler");
        argTypes[7] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGameSettingHandler");
        argTypes[8] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserActivityHandler");
        argTypes[9] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserBossHandler");
        argTypes[10] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserBpBaseHandler");
        argTypes[11] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserCardHandler");
        argTypes[12] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserChapterHandler");
        argTypes[13] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserCharacterHandler");
        argTypes[14] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserDataHandler");
        argTypes[15] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserDeckByKeyHandler");
        argTypes[16] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserEventPointHandler");
        argTypes[17] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserEventRankingHandler");
        argTypes[18] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserItemHandler");
        argTypes[19] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserLoginBonusHandler");
        argTypes[20] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserMissionPointHandler");
        argTypes[21] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserMusicHandler");
        argTypes[22] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserMusicItemHandler");
        argTypes[23] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserOptionHandler");
        argTypes[24] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserPreviewHandler");
        argTypes[25] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserRatinglogListHandler");
        argTypes[26] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserRecentRatingHandler");
        argTypes[27] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserRegionHandler");
        argTypes[28] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserRivalHandler");
        argTypes[29] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserRivalMusicHandler");
        argTypes[30] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserScenarioHandler");
        argTypes[31] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserStoryHandler");
        argTypes[32] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserTechCountHandler");
        argTypes[33] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserTrainingRoomByKeyHandler");
        argTypes[34] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.UpsertUserAllHandler");
        argTypes[35] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGameTechMusicHandler");
        argTypes[36] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserTechEventHandler");
        argTypes[37] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserTechEventRankingHandler");
        argTypes[38] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserEventMusicHandler");
        argTypes[39] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserTradeItemHandler");
        argTypes[40] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserKopHandler");
        argTypes[41] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetClientBookkeepingHandler");
        argTypes[42] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetClientTestmodeHandler");
        argTypes[43] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetGameMusicReleaseStateHandler");
        argTypes[44] = Class.forName("icu.samnyan.aqua.sega.ongeki.handler.impl.GetUserMemoryChapterHandler");
        Object[] args = new Object[45];
        args[0] = null;
        args[1] = null;
        args[2] = term1;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = term2;
        args[11] = null;
        args[12] = null;
        args[13] = null;
        args[14] = null;
        args[15] = null;
        args[16] = null;
        args[17] = null;
        args[18] = null;
        args[19] = null;
        args[20] = null;
        args[21] = null;
        args[22] = null;
        args[23] = null;
        args[24] = null;
        args[25] = term3;
        args[26] = null;
        args[27] = term4;
        args[28] = term5;
        args[29] = term6;
        args[30] = null;
        args[31] = null;
        args[32] = null;
        args[33] = null;
        args[34] = null;
        args[35] = term7;
        args[36] = null;
        args[37] = null;
        args[38] = null;
        args[39] = null;
        args[40] = null;
        args[41] = null;
        args[42] = null;
        args[43] = null;
        args[44] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


