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

public class Contest_setName_116653317178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75311;

    public Contest_setName_116653317178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75311 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        setIntField(term75311, term75311.getClass(), "id", 0);
        setBooleanField(term75311, term75311.getClass(), "enable", false);
        setField(term75311, term75311.getClass(), "startTime", null);
        setField(term75311, term75311.getClass(), "endTime", null);
        setField(term75311, term75311.getClass(), "name", null);
        setField(term75311, term75311.getClass(), "description", null);
        setField(term75311, term75311.getClass(), "league", null);
        setIntField(term75311, term75311.getClass(), "stars", 0);
        setIntField(term75311, term75311.getClass(), "minComplexity", 0);
        setIntField(term75311, term75311.getClass(), "maxComplexity", 0);
        setIntField(term75311, term75311.getClass(), "stages", 0);
        setField(term75311, term75311.getClass(), "stageLimit", null);
        setField(term75311, term75311.getClass(), "normaType", null);
        setIntField(term75311, term75311.getClass(), "bronzeBorders", 0);
        setIntField(term75311, term75311.getClass(), "sliverBorders", 0);
        setIntField(term75311, term75311.getClass(), "goldBorders", 0);
        setField(term75311, term75311.getClass(), "pvList", null);
        setField(term75311, term75311.getClass(), "pvDiffList", null);
        setField(term75311, term75311.getClass(), "bronzeContestReward", null);
        setField(term75311, term75311.getClass(), "sliverContestReward", null);
        setField(term75311, term75311.getClass(), "goldContestReward", null);
        setField(term75311, term75311.getClass(), "contestEntryReward", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term75311, args);
    }

};


