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

public class Contest_setId_142009048874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75267;
     Object term75277;

    public Contest_setId_142009048874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75267 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        setIntField(term75267, term75267.getClass(), "id", 0);
        setBooleanField(term75267, term75267.getClass(), "enable", false);
        setField(term75267, term75267.getClass(), "startTime", null);
        setField(term75267, term75267.getClass(), "endTime", null);
        setField(term75267, term75267.getClass(), "name", null);
        setField(term75267, term75267.getClass(), "description", null);
        setField(term75267, term75267.getClass(), "league", null);
        setIntField(term75267, term75267.getClass(), "stars", 0);
        setIntField(term75267, term75267.getClass(), "minComplexity", 0);
        setIntField(term75267, term75267.getClass(), "maxComplexity", 0);
        setIntField(term75267, term75267.getClass(), "stages", 0);
        setField(term75267, term75267.getClass(), "stageLimit", null);
        setField(term75267, term75267.getClass(), "normaType", null);
        setIntField(term75267, term75267.getClass(), "bronzeBorders", 0);
        setIntField(term75267, term75267.getClass(), "sliverBorders", 0);
        setIntField(term75267, term75267.getClass(), "goldBorders", 0);
        setField(term75267, term75267.getClass(), "pvList", null);
        setField(term75267, term75267.getClass(), "pvDiffList", null);
        setField(term75267, term75267.getClass(), "bronzeContestReward", null);
        setField(term75267, term75267.getClass(), "sliverContestReward", null);
        setField(term75267, term75267.getClass(), "goldContestReward", null);
        setField(term75267, term75267.getClass(), "contestEntryReward", null);
        term75277 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75277;
        callMethod(klass, "setId", argTypes, term75267, args);
    }

};


