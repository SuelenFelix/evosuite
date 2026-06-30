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

public class Contest_setSliverBorders_163051052588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75421;
     Object term75431;

    public Contest_setSliverBorders_163051052588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75421 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        setIntField(term75421, term75421.getClass(), "id", 0);
        setBooleanField(term75421, term75421.getClass(), "enable", false);
        setField(term75421, term75421.getClass(), "startTime", null);
        setField(term75421, term75421.getClass(), "endTime", null);
        setField(term75421, term75421.getClass(), "name", null);
        setField(term75421, term75421.getClass(), "description", null);
        setField(term75421, term75421.getClass(), "league", null);
        setIntField(term75421, term75421.getClass(), "stars", 0);
        setIntField(term75421, term75421.getClass(), "minComplexity", 0);
        setIntField(term75421, term75421.getClass(), "maxComplexity", 0);
        setIntField(term75421, term75421.getClass(), "stages", 0);
        setField(term75421, term75421.getClass(), "stageLimit", null);
        setField(term75421, term75421.getClass(), "normaType", null);
        setIntField(term75421, term75421.getClass(), "bronzeBorders", 0);
        setIntField(term75421, term75421.getClass(), "sliverBorders", 0);
        setIntField(term75421, term75421.getClass(), "goldBorders", 0);
        setField(term75421, term75421.getClass(), "pvList", null);
        setField(term75421, term75421.getClass(), "pvDiffList", null);
        setField(term75421, term75421.getClass(), "bronzeContestReward", null);
        setField(term75421, term75421.getClass(), "sliverContestReward", null);
        setField(term75421, term75421.getClass(), "goldContestReward", null);
        setField(term75421, term75421.getClass(), "contestEntryReward", null);
        term75431 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75431;
        callMethod(klass, "setSliverBorders", argTypes, term75421, args);
    }

};


