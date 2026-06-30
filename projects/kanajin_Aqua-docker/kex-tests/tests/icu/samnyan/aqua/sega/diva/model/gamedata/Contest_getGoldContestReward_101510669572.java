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

public class Contest_getGoldContestReward_101510669572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75247;

    public Contest_getGoldContestReward_101510669572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75247 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        setIntField(term75247, term75247.getClass(), "id", 0);
        setBooleanField(term75247, term75247.getClass(), "enable", false);
        setField(term75247, term75247.getClass(), "startTime", null);
        setField(term75247, term75247.getClass(), "endTime", null);
        setField(term75247, term75247.getClass(), "name", null);
        setField(term75247, term75247.getClass(), "description", null);
        setField(term75247, term75247.getClass(), "league", null);
        setIntField(term75247, term75247.getClass(), "stars", 0);
        setIntField(term75247, term75247.getClass(), "minComplexity", 0);
        setIntField(term75247, term75247.getClass(), "maxComplexity", 0);
        setIntField(term75247, term75247.getClass(), "stages", 0);
        setField(term75247, term75247.getClass(), "stageLimit", null);
        setField(term75247, term75247.getClass(), "normaType", null);
        setIntField(term75247, term75247.getClass(), "bronzeBorders", 0);
        setIntField(term75247, term75247.getClass(), "sliverBorders", 0);
        setIntField(term75247, term75247.getClass(), "goldBorders", 0);
        setField(term75247, term75247.getClass(), "pvList", null);
        setField(term75247, term75247.getClass(), "pvDiffList", null);
        setField(term75247, term75247.getClass(), "bronzeContestReward", null);
        setField(term75247, term75247.getClass(), "sliverContestReward", null);
        setField(term75247, term75247.getClass(), "goldContestReward", null);
        setField(term75247, term75247.getClass(), "contestEntryReward", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoldContestReward", argTypes, term75247, args);
    }

};


