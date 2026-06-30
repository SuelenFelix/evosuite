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

public class Contest_getId_81113997452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75047;

    public Contest_getId_81113997452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75047 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest"));
        setIntField(term75047, term75047.getClass(), "id", 0);
        setBooleanField(term75047, term75047.getClass(), "enable", false);
        setField(term75047, term75047.getClass(), "startTime", null);
        setField(term75047, term75047.getClass(), "endTime", null);
        setField(term75047, term75047.getClass(), "name", null);
        setField(term75047, term75047.getClass(), "description", null);
        setField(term75047, term75047.getClass(), "league", null);
        setIntField(term75047, term75047.getClass(), "stars", 0);
        setIntField(term75047, term75047.getClass(), "minComplexity", 0);
        setIntField(term75047, term75047.getClass(), "maxComplexity", 0);
        setIntField(term75047, term75047.getClass(), "stages", 0);
        setField(term75047, term75047.getClass(), "stageLimit", null);
        setField(term75047, term75047.getClass(), "normaType", null);
        setIntField(term75047, term75047.getClass(), "bronzeBorders", 0);
        setIntField(term75047, term75047.getClass(), "sliverBorders", 0);
        setIntField(term75047, term75047.getClass(), "goldBorders", 0);
        setField(term75047, term75047.getClass(), "pvList", null);
        setField(term75047, term75047.getClass(), "pvDiffList", null);
        setField(term75047, term75047.getClass(), "bronzeContestReward", null);
        setField(term75047, term75047.getClass(), "sliverContestReward", null);
        setField(term75047, term75047.getClass(), "goldContestReward", null);
        setField(term75047, term75047.getClass(), "contestEntryReward", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term75047, args);
    }

};


