package icu.samnyan.aqua.api.model.resp.sega.diva;

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
import static icu.samnyan.aqua.api.model.resp.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlayerInfo_equals_40650787718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731;

    public PlayerInfo_equals_40650787718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term731 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.diva.PlayerInfo"));
        setIntField(term731, term731.getClass(), "pdId", 0);
        setField(term731, term731.getClass(), "playerName", null);
        setIntField(term731, term731.getClass(), "vocaloidPoints", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.diva.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term731, args);
    }

};


