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

public class PlayerInfo_getPlayerName_11144322262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456;

    public PlayerInfo_getPlayerName_11144322262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.diva.PlayerInfo"));
        setIntField(term456, term456.getClass(), "pdId", -203030934);
        setField(term456, term456.getClass(), "playerName", "aJlieCFVtF");
        setIntField(term456, term456.getClass(), "vocaloidPoints", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.diva.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerName", argTypes, term456, args);
    }

};


