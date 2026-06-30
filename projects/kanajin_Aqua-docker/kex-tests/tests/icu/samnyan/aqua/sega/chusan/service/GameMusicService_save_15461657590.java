package icu.samnyan.aqua.sega.chusan.service;

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
import static icu.samnyan.aqua.sega.chusan.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class GameMusicService_save_15461657590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10592;

    public GameMusicService_save_15461657590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10958 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term10957 = ((Class) term10958).getDeclaredField((String) "IRODORI");
        ((Field) term10957).setAccessible(true);
        Object enum0 = ((Field) term10957).get((Object) null);
        HashMap term10669 = new HashMap();
        term10592 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term10592, term10592.getClass(), "musicId", 2105146188);
        setField(term10592, term10592.getClass(), "name", "UqKUbMyPMJ");
        setField(term10592, term10592.getClass(), "sortName", "QpYltHAdyY");
        setField(term10592, term10592.getClass(), "artistName", "lbmSGBwIiV");
        setField(term10592, term10592.getClass(), "genre", enum0);
        setField(term10592, term10592.getClass(), "releaseVersion", "DAxyHoTLzZ");
        setField(term10592, term10592.getClass(), "levels", term10669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.service.GameMusicService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Object[] args = new Object[1];
        args[0] = term10592;
        callMethod(klass, "save", argTypes, null, args);
    }

};


