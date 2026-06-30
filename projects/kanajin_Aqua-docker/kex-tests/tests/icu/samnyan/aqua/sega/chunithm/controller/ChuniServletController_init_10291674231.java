package icu.samnyan.aqua.sega.chunithm.controller;

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
import static icu.samnyan.aqua.sega.chunithm.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChuniServletController_init_10291674231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ChuniServletController_init_10291674231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.controller.ChuniServletController");
        Class<?>[] argTypes = new Class<?>[39];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GameLoginHandler");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GameLogoutHandler");
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetGameChargeHandler");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetGameEventHandler");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetGameIdlistHandler");
        argTypes[5] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetGameMessageHandler");
        argTypes[6] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetGameRankingHandler");
        argTypes[7] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetGameSaleHandler");
        argTypes[8] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetGameSettingHandler");
        argTypes[9] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetTeamCourseRuleHandler");
        argTypes[10] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetTeamCourseSettingHandler");
        argTypes[11] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserActivityHandler");
        argTypes[12] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserCharacterHandler");
        argTypes[13] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserChargeHandler");
        argTypes[14] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserCourseHandler");
        argTypes[15] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserDataExHandler");
        argTypes[16] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserDataHandler");
        argTypes[17] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserDuelHandler");
        argTypes[18] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserFavoriteItemHandler");
        argTypes[19] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserFavoriteMusicHandler");
        argTypes[20] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserItemHandler");
        argTypes[21] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserLoginBonusHandler");
        argTypes[22] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserMapHandler");
        argTypes[23] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserMusicHandler");
        argTypes[24] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserOptionExHandler");
        argTypes[25] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserOptionHandler");
        argTypes[26] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserPreviewHandler");
        argTypes[27] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserRecentRatingHandler");
        argTypes[28] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserRegionHandler");
        argTypes[29] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserRivalDataHandler");
        argTypes[30] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserRivalMusicHandler");
        argTypes[31] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.GetUserTeamHandler");
        argTypes[32] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.UpsertClientBookkeepingHandler");
        argTypes[33] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.UpsertClientDevelopHandler");
        argTypes[34] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.UpsertClientErrorHandler");
        argTypes[35] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.UpsertClientSettingHandler");
        argTypes[36] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.UpsertClientTestmodeHandler");
        argTypes[37] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.UpsertUserAllHandler");
        argTypes[38] = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.UpsertUserChargelogHandler");
        Object[] args = new Object[39];
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
        args[31] = null;
        args[32] = null;
        args[33] = null;
        args[34] = null;
        args[35] = null;
        args[36] = null;
        args[37] = null;
        args[38] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


