package icu.samnyan.aqua.sega.chusan.controller;

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
import static icu.samnyan.aqua.sega.chusan.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChusanServletController_init_17842898251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ChusanServletController_init_17842898251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.controller.ChusanServletController");
        Class<?>[] argTypes = new Class<?>[31];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GameLoginHandler");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GameLogoutHandler");
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetGameChargeHandler");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetGameEventHandler");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetGameIdlistHandler");
        argTypes[5] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetGameRankingHandler");
        argTypes[6] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetGameSettingHandler");
        argTypes[7] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetTeamCourseRuleHandler");
        argTypes[8] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetTeamCourseSettingHandler");
        argTypes[9] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserActivityHandler");
        argTypes[10] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserCharacterHandler");
        argTypes[11] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserChargeHandler");
        argTypes[12] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserCourseHandler");
        argTypes[13] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserDataHandler");
        argTypes[14] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserDuelHandler");
        argTypes[15] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserFavoriteItemHandler");
        argTypes[16] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserItemHandler");
        argTypes[17] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserLoginBonusHandler");
        argTypes[18] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserMapAreaHandler");
        argTypes[19] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserMusicHandler");
        argTypes[20] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserOptionHandler");
        argTypes[21] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserPreviewHandler");
        argTypes[22] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserRecentRatingHandler");
        argTypes[23] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserRegionHandler");
        argTypes[24] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserRivalDataHandler");
        argTypes[25] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserRivalMusicHandler");
        argTypes[26] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserTeamHandler");
        argTypes[27] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.UpsertUserAllHandler");
        argTypes[28] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.UpsertUserChargelogHandler");
        argTypes[29] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserSymbolChatSettingHandler");
        argTypes[30] = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserNetBattleDataHandler");
        Object[] args = new Object[31];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = null;
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
        args[25] = null;
        args[26] = null;
        args[27] = null;
        args[28] = null;
        args[29] = null;
        args[30] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


