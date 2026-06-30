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

public class Contest_setGoldContestReward_3223864994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75485;

    public Contest_setGoldContestReward_3223864994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75485 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        setIntField(term75485, term75485.getClass(), "id", 0);
        setBooleanField(term75485, term75485.getClass(), "enable", false);
        setField(term75485, term75485.getClass(), "startTime", null);
        setField(term75485, term75485.getClass(), "endTime", null);
        setField(term75485, term75485.getClass(), "name", null);
        setField(term75485, term75485.getClass(), "description", null);
        setField(term75485, term75485.getClass(), "league", null);
        setIntField(term75485, term75485.getClass(), "stars", 0);
        setIntField(term75485, term75485.getClass(), "minComplexity", 0);
        setIntField(term75485, term75485.getClass(), "maxComplexity", 0);
        setIntField(term75485, term75485.getClass(), "stages", 0);
        setField(term75485, term75485.getClass(), "stageLimit", null);
        setField(term75485, term75485.getClass(), "normaType", null);
        setIntField(term75485, term75485.getClass(), "bronzeBorders", 0);
        setIntField(term75485, term75485.getClass(), "sliverBorders", 0);
        setIntField(term75485, term75485.getClass(), "goldBorders", 0);
        setField(term75485, term75485.getClass(), "pvList", null);
        setField(term75485, term75485.getClass(), "pvDiffList", null);
        setField(term75485, term75485.getClass(), "bronzeContestReward", null);
        setField(term75485, term75485.getClass(), "sliverContestReward", null);
        setField(term75485, term75485.getClass(), "goldContestReward", null);
        setField(term75485, term75485.getClass(), "contestEntryReward", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGoldContestReward", argTypes, term75485, args);
    }

};


