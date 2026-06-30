package icu.samnyan.aqua.sega.maimai.controller;

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
import static icu.samnyan.aqua.sega.maimai.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MaimaiServletController_init_11041501780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term3;
     Object term4;
     Object term5;
     Object term6;

    public MaimaiServletController_init_11041501780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetTransferFriendHandler"));
        setField(term1, term1.getClass(), "mapper", null);
        term2 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserCourseHandler"));
        setField(term2, term2.getClass(), "mapper", null);
        term3 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserPresentHandler"));
        setField(term3, term3.getClass(), "mapper", null);
        term4 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.UpsertTransferHandler"));
        setField(term4, term4.getClass(), "mapper", null);
        term5 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.UserLoginHandler"));
        setField(term5, term5.getClass(), "mapper", null);
        term6 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.UserLogoutHandler"));
        setField(term6, term6.getClass(), "mapper", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.controller.MaimaiServletController");
        Class<?>[] argTypes = new Class<?>[23];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetGameEventHandler");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetGameRankingHandler");
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetGameSettingHandler");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetTransferFriendHandler");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserActivityHandler");
        argTypes[5] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserBossHandler");
        argTypes[6] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserCharacterHandler");
        argTypes[7] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserCourseHandler");
        argTypes[8] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserDataHandler");
        argTypes[9] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserGradeHandler");
        argTypes[10] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserItemHandler");
        argTypes[11] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserMusicHandler");
        argTypes[12] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserOptionHandler");
        argTypes[13] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserPresentEventHandler");
        argTypes[14] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserPresentHandler");
        argTypes[15] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserPreviewHandler");
        argTypes[16] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserRecentRatingHandler");
        argTypes[17] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserSurvivalHandler");
        argTypes[18] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.GetUserWebOptionHandler");
        argTypes[19] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.UpsertTransferHandler");
        argTypes[20] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.UpsertUserAllHandler");
        argTypes[21] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.UserLoginHandler");
        argTypes[22] = Class.forName("icu.samnyan.aqua.sega.maimai.handler.impl.UserLogoutHandler");
        Object[] args = new Object[23];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term1;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = term2;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        args[11] = null;
        args[12] = null;
        args[13] = null;
        args[14] = term3;
        args[15] = null;
        args[16] = null;
        args[17] = null;
        args[18] = null;
        args[19] = term4;
        args[20] = null;
        args[21] = term5;
        args[22] = term6;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


