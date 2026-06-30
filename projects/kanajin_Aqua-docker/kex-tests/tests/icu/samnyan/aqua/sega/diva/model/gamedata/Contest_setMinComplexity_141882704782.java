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

public class Contest_setMinComplexity_141882704782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75353;
     Object term75363;

    public Contest_setMinComplexity_141882704782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75353 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        setIntField(term75353, term75353.getClass(), "id", 0);
        setBooleanField(term75353, term75353.getClass(), "enable", false);
        setField(term75353, term75353.getClass(), "startTime", null);
        setField(term75353, term75353.getClass(), "endTime", null);
        setField(term75353, term75353.getClass(), "name", null);
        setField(term75353, term75353.getClass(), "description", null);
        setField(term75353, term75353.getClass(), "league", null);
        setIntField(term75353, term75353.getClass(), "stars", 0);
        setIntField(term75353, term75353.getClass(), "minComplexity", 0);
        setIntField(term75353, term75353.getClass(), "maxComplexity", 0);
        setIntField(term75353, term75353.getClass(), "stages", 0);
        setField(term75353, term75353.getClass(), "stageLimit", null);
        setField(term75353, term75353.getClass(), "normaType", null);
        setIntField(term75353, term75353.getClass(), "bronzeBorders", 0);
        setIntField(term75353, term75353.getClass(), "sliverBorders", 0);
        setIntField(term75353, term75353.getClass(), "goldBorders", 0);
        setField(term75353, term75353.getClass(), "pvList", null);
        setField(term75353, term75353.getClass(), "pvDiffList", null);
        setField(term75353, term75353.getClass(), "bronzeContestReward", null);
        setField(term75353, term75353.getClass(), "sliverContestReward", null);
        setField(term75353, term75353.getClass(), "goldContestReward", null);
        setField(term75353, term75353.getClass(), "contestEntryReward", null);
        term75363 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75363;
        callMethod(klass, "setMinComplexity", argTypes, term75353, args);
    }

};


