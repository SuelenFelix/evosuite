package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;

public class Pv_getBpm_4030927981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;

    public Pv_getBpm_4030927981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term154 = new Integer(597278769);
        Integer term156 = new Integer(-1685132342);
        Integer term230 = new Integer(-1456670397);
        HashMap term232 = new HashMap();
        term153 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term153, term153.getClass(), "pvId", term154);
        setField(term153, term153.getClass(), "bpm", term156);
        setField(term153, term153.getClass(), "songName", "GzFkzHGYFt");
        setField(term153, term153.getClass(), "songNameEng", "tShwQLRGNe");
        setField(term153, term153.getClass(), "songNameReading", "LvtrsXUliU");
        setField(term153, term153.getClass(), "arranger", "xLbjWUgOIL");
        setField(term153, term153.getClass(), "lyrics", "jDtqGUpnZN");
        setField(term153, term153.getClass(), "music", "nGKItKLYNC");
        setField(term153, term153.getClass(), "performerNumber", term230);
        setField(term153, term153.getClass(), "difficulty", term232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBpm", argTypes, term153, args);
    }

};


