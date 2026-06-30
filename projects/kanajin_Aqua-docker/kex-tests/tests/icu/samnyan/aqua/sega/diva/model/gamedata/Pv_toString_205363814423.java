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

public class Pv_toString_205363814423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3742;

    public Pv_toString_205363814423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3743 = new Integer(1707220033);
        Integer term3745 = new Integer(-1792504217);
        Integer term3819 = new Integer(1824538861);
        HashMap term3821 = new HashMap();
        term3742 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term3742, term3742.getClass(), "pvId", term3743);
        setField(term3742, term3742.getClass(), "bpm", term3745);
        setField(term3742, term3742.getClass(), "songName", "zHcDSJHKAb");
        setField(term3742, term3742.getClass(), "songNameEng", "WRIQkTdeMl");
        setField(term3742, term3742.getClass(), "songNameReading", "rLSEheWsHd");
        setField(term3742, term3742.getClass(), "arranger", "DoUKDhlGCY");
        setField(term3742, term3742.getClass(), "lyrics", "IeoToWsQWU");
        setField(term3742, term3742.getClass(), "music", "QxiiHtQAzN");
        setField(term3742, term3742.getClass(), "performerNumber", term3819);
        setField(term3742, term3742.getClass(), "difficulty", term3821);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3742, args);
    }

};


