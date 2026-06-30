package icu.samnyan.aqua.sega.maimai2.model.gamedata;

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
import static icu.samnyan.aqua.sega.maimai2.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameEvent_setId_14969058545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1227;
     Object term1255;

    public GameEvent_setId_14969058545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1227 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameEvent"));
        setIntField(term1227, term1227.getClass(), "id", 1225272962);
        setIntField(term1227, term1227.getClass(), "type", 1324040357);
        setField(term1227, term1227.getClass(), "startDate", "tShwQLRGNe");
        setField(term1227, term1227.getClass(), "endDate", "LvtrsXUliU");
        setBooleanField(term1227, term1227.getClass(), "enable", true);
        term1255 = new Integer(-1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1255;
        callMethod(klass, "setId", argTypes, term1227, args);
    }

};


