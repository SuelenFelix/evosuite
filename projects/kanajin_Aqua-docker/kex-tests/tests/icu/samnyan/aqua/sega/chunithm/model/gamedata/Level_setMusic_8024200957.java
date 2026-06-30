package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Level_setMusic_8024200957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4995;
     Object term5095;

    public Level_setMusic_8024200957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5237 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term5236 = ((Class) term5237).getDeclaredField((String) "RESERVE2");
        ((Field) term5236).setAccessible(true);
        Object enum7 = ((Field) term5236).get((Object) null);
        HashMap term5081 = new HashMap();
        term4995 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term4997 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term4995, term4995.getClass(), "id", 5953383087795962419L);
        setIntField(term4997, term4997.getClass(), "musicId", -936895502);
        setField(term4997, term4997.getClass(), "name", "cudZvLMQon");
        setField(term4997, term4997.getClass(), "sortName", "lihXWlGDxk");
        setField(term4997, term4997.getClass(), "copyright", "JmcmxoGhIK");
        setField(term4997, term4997.getClass(), "artistName", "jXzmYyrnnT");
        setField(term4997, term4997.getClass(), "genre", enum7);
        setField(term4997, term4997.getClass(), "releaseVersion", "igCAtimmYB");
        setField(term4997, term4997.getClass(), "levels", term5081);
        setField(term4995, term4995.getClass(), "music", term4997);
        setBooleanField(term4995, term4995.getClass(), "enable", false);
        setIntField(term4995, term4995.getClass(), "level", -916335264);
        setIntField(term4995, term4995.getClass(), "levelDecimal", -919416536);
        setIntField(term4995, term4995.getClass(), "diff", -43417861);
        Class<? extends Object> term5573 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term5572 = ((Class) term5573).getDeclaredField((String) "GEKICHUMA");
        ((Field) term5572).setAccessible(true);
        Object enum8 = ((Field) term5572).get((Object) null);
        HashMap term5180 = new HashMap();
        term5095 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term5095, term5095.getClass(), "musicId", -1533843432);
        setField(term5095, term5095.getClass(), "name", "iikZEapDlu");
        setField(term5095, term5095.getClass(), "sortName", "nhoHrZfnIN");
        setField(term5095, term5095.getClass(), "copyright", "ZkMALXpEAZ");
        setField(term5095, term5095.getClass(), "artistName", "tXfQjSqDzN");
        setField(term5095, term5095.getClass(), "genre", enum8);
        setField(term5095, term5095.getClass(), "releaseVersion", "BjugTaMcxJ");
        setField(term5095, term5095.getClass(), "levels", term5180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Object[] args = new Object[1];
        args[0] = term5095;
        callMethod(klass, "setMusic", argTypes, term4995, args);
    }

};


