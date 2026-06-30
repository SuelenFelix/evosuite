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

public class Contest_getStageLimit_149353518763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75157;

    public Contest_getStageLimit_149353518763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75157 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        setIntField(term75157, term75157.getClass(), "id", 0);
        setBooleanField(term75157, term75157.getClass(), "enable", false);
        setField(term75157, term75157.getClass(), "startTime", null);
        setField(term75157, term75157.getClass(), "endTime", null);
        setField(term75157, term75157.getClass(), "name", null);
        setField(term75157, term75157.getClass(), "description", null);
        setField(term75157, term75157.getClass(), "league", null);
        setIntField(term75157, term75157.getClass(), "stars", 0);
        setIntField(term75157, term75157.getClass(), "minComplexity", 0);
        setIntField(term75157, term75157.getClass(), "maxComplexity", 0);
        setIntField(term75157, term75157.getClass(), "stages", 0);
        setField(term75157, term75157.getClass(), "stageLimit", null);
        setField(term75157, term75157.getClass(), "normaType", null);
        setIntField(term75157, term75157.getClass(), "bronzeBorders", 0);
        setIntField(term75157, term75157.getClass(), "sliverBorders", 0);
        setIntField(term75157, term75157.getClass(), "goldBorders", 0);
        setField(term75157, term75157.getClass(), "pvList", null);
        setField(term75157, term75157.getClass(), "pvDiffList", null);
        setField(term75157, term75157.getClass(), "bronzeContestReward", null);
        setField(term75157, term75157.getClass(), "sliverContestReward", null);
        setField(term75157, term75157.getClass(), "goldContestReward", null);
        setField(term75157, term75157.getClass(), "contestEntryReward", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStageLimit", argTypes, term75157, args);
    }

};


