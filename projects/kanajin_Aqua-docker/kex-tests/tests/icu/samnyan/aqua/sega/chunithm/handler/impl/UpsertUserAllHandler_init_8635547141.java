package icu.samnyan.aqua.sega.chunithm.handler.impl;

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
import static icu.samnyan.aqua.sega.chunithm.handler.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpsertUserAllHandler_init_8635547141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public UpsertUserAllHandler_init_8635547141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.handler.impl.UpsertUserAllHandler");
        Class<?>[] argTypes = new Class<?>[16];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.util.jackson.StringMapper");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.general.service.CardService");
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserDataService");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserCharacterService");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserGameOptionService");
        argTypes[5] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserGameOptionExService");
        argTypes[6] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserMapService");
        argTypes[7] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserItemService");
        argTypes[8] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserMusicDetailService");
        argTypes[9] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserActivityService");
        argTypes[10] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserPlaylogService");
        argTypes[11] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserChargeService");
        argTypes[12] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserDataExService");
        argTypes[13] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserCourseService");
        argTypes[14] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserDuelService");
        argTypes[15] = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserGeneralDataService");
        Object[] args = new Object[16];
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
        Object instance = callConstructor(klass, argTypes, args);
    }

};


