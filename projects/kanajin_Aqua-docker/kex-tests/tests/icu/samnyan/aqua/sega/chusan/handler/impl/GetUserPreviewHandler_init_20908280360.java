package icu.samnyan.aqua.sega.chusan.handler.impl;

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
import static icu.samnyan.aqua.sega.chusan.handler.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserPreviewHandler_init_20908280360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public GetUserPreviewHandler_init_20908280360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserPreviewHandler");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.util.jackson.StringMapper");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.general.service.ClientSettingService");
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.chusan.service.UserDataService");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.chusan.service.UserCharacterService");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.chusan.service.UserGameOptionService");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


