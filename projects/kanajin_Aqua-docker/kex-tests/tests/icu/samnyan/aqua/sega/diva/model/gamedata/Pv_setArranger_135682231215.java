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

public class Pv_setArranger_135682231215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2351;

    public Pv_setArranger_135682231215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2352 = new Integer(1684998508);
        Integer term2354 = new Integer(-1476644457);
        Integer term2428 = new Integer(1270666529);
        HashMap term2430 = new HashMap();
        term2351 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term2351, term2351.getClass(), "pvId", term2352);
        setField(term2351, term2351.getClass(), "bpm", term2354);
        setField(term2351, term2351.getClass(), "songName", "UEdzEKEEEV");
        setField(term2351, term2351.getClass(), "songNameEng", "BcENaQFYSd");
        setField(term2351, term2351.getClass(), "songNameReading", "POPYycoDBy");
        setField(term2351, term2351.getClass(), "arranger", "LuWMOXdAPA");
        setField(term2351, term2351.getClass(), "lyrics", "blSffTnsOv");
        setField(term2351, term2351.getClass(), "music", "qbUMcIvEXH");
        setField(term2351, term2351.getClass(), "performerNumber", term2428);
        setField(term2351, term2351.getClass(), "difficulty", term2430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IbxeAMwLVt";
        callMethod(klass, "setArranger", argTypes, term2351, args);
    }

};


