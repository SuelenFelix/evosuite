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
import java.lang.Boolean;

public class Contest_setEnable_22676609675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75279;
     Object term75289;

    public Contest_setEnable_22676609675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75279 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        setIntField(term75279, term75279.getClass(), "id", 0);
        setBooleanField(term75279, term75279.getClass(), "enable", false);
        setField(term75279, term75279.getClass(), "startTime", null);
        setField(term75279, term75279.getClass(), "endTime", null);
        setField(term75279, term75279.getClass(), "name", null);
        setField(term75279, term75279.getClass(), "description", null);
        setField(term75279, term75279.getClass(), "league", null);
        setIntField(term75279, term75279.getClass(), "stars", 0);
        setIntField(term75279, term75279.getClass(), "minComplexity", 0);
        setIntField(term75279, term75279.getClass(), "maxComplexity", 0);
        setIntField(term75279, term75279.getClass(), "stages", 0);
        setField(term75279, term75279.getClass(), "stageLimit", null);
        setField(term75279, term75279.getClass(), "normaType", null);
        setIntField(term75279, term75279.getClass(), "bronzeBorders", 0);
        setIntField(term75279, term75279.getClass(), "sliverBorders", 0);
        setIntField(term75279, term75279.getClass(), "goldBorders", 0);
        setField(term75279, term75279.getClass(), "pvList", null);
        setField(term75279, term75279.getClass(), "pvDiffList", null);
        setField(term75279, term75279.getClass(), "bronzeContestReward", null);
        setField(term75279, term75279.getClass(), "sliverContestReward", null);
        setField(term75279, term75279.getClass(), "goldContestReward", null);
        setField(term75279, term75279.getClass(), "contestEntryReward", null);
        term75289 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term75289;
        callMethod(klass, "setEnable", argTypes, term75279, args);
    }

};


