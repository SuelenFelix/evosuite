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

public class Pv_getArranger_13518025445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761;

    public Pv_getArranger_13518025445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term762 = new Integer(1551099402);
        Integer term764 = new Integer(-2027534003);
        Integer term838 = new Integer(1063420942);
        HashMap term840 = new HashMap();
        term761 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term761, term761.getClass(), "pvId", term762);
        setField(term761, term761.getClass(), "bpm", term764);
        setField(term761, term761.getClass(), "songName", "qCpEbQDHdF");
        setField(term761, term761.getClass(), "songNameEng", "AHbZyFOmlo");
        setField(term761, term761.getClass(), "songNameReading", "TwfWVQGiIj");
        setField(term761, term761.getClass(), "arranger", "gUvcueTURF");
        setField(term761, term761.getClass(), "lyrics", "EwQBhZjCIT");
        setField(term761, term761.getClass(), "music", "aSkmSwTnEw");
        setField(term761, term761.getClass(), "performerNumber", term838);
        setField(term761, term761.getClass(), "difficulty", term840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArranger", argTypes, term761, args);
    }

};


