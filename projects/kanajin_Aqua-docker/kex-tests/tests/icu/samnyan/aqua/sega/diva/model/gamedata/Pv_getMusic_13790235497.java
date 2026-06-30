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

public class Pv_getMusic_13790235497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065;

    public Pv_getMusic_13790235497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1066 = new Integer(-1210583429);
        Integer term1068 = new Integer(-663691365);
        Integer term1142 = new Integer(339854490);
        HashMap term1144 = new HashMap();
        term1065 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term1065, term1065.getClass(), "pvId", term1066);
        setField(term1065, term1065.getClass(), "bpm", term1068);
        setField(term1065, term1065.getClass(), "songName", "zNFLXMifnS");
        setField(term1065, term1065.getClass(), "songNameEng", "HHQcYMSBVc");
        setField(term1065, term1065.getClass(), "songNameReading", "wdoqITnaAP");
        setField(term1065, term1065.getClass(), "arranger", "rIPMBcrNqB");
        setField(term1065, term1065.getClass(), "lyrics", "UDaboHZHhz");
        setField(term1065, term1065.getClass(), "music", "nRvKihUSPj");
        setField(term1065, term1065.getClass(), "performerNumber", term1142);
        setField(term1065, term1065.getClass(), "difficulty", term1144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusic", argTypes, term1065, args);
    }

};


