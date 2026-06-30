package icu.samnyan.aqua.sega.maimai2.controller;

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
import static icu.samnyan.aqua.sega.maimai2.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Maimai2ServletController_init_7383916181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Maimai2ServletController_init_7383916181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.controller.Maimai2ServletController");
        Class<?>[] argTypes = new Class<?>[30];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetGameSettingHandler");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetGameEventHandler");
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetGameRankingHandler");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetGameTournamentInfoHandler");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetTransferFriendHandler");
        argTypes[5] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserActivityHandler");
        argTypes[6] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.UserLoginHandler");
        argTypes[7] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.UserLogoutHandler");
        argTypes[8] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserDataHandler");
        argTypes[9] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.UpsertUserAllHandler");
        argTypes[10] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserPreviewHandler");
        argTypes[11] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserCharacterHandler");
        argTypes[12] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserOptionHandler");
        argTypes[13] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserItemHandler");
        argTypes[14] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserExtendHandler");
        argTypes[15] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserGhostHandler");
        argTypes[16] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserLoginBonusHandler");
        argTypes[17] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserMapHandler");
        argTypes[18] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserFavoriteHandler");
        argTypes[19] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserCardHandler");
        argTypes[20] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserMusicHandler");
        argTypes[21] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserRatingHandler");
        argTypes[22] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserRegionHandler");
        argTypes[23] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetGameChargeHandler");
        argTypes[24] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserChargeHandler");
        argTypes[25] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserCourseHandler");
        argTypes[26] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.UploadUserPhotoHandler");
        argTypes[27] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.UploadUserPlaylogHandler");
        argTypes[28] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetGameNgMusicIdHandler");
        argTypes[29] = Class.forName("icu.samnyan.aqua.sega.maimai2.handler.impl.GetUserFriendSeasonRankingHandler");
        Object[] args = new Object[30];
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
        Object instance = callConstructor(klass, argTypes, args);
    }

};


