package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameChara_setModelId_7444784137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21026;
     Object term21053;

    public GameChara_setModelId_7444784137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21026 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameChara"));
        setLongField(term21026, term21026.getClass(), "id", 6273754186658578034L);
        setField(term21026, term21026.getClass(), "name", "qxhOsmyyjm");
        setField(term21026, term21026.getClass(), "cv", "DuKcNfVVYR");
        setIntField(term21026, term21026.getClass(), "modelId", 371943306);
        term21053 = new Integer(982388293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameChara");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21053;
        callMethod(klass, "setModelId", argTypes, term21026, args);
    }

};


