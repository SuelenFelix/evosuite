package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getMaxCountItem_20372295898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5235;

    public GameSetting_getMaxCountItem_20372295898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5235 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term5235, term5235.getClass(), "romVersion", "nSWdsVyJRI");
        setField(term5235, term5235.getClass(), "dataVersion", "JBOPGgGKnc");
        setBooleanField(term5235, term5235.getClass(), "isMaintenance", true);
        setIntField(term5235, term5235.getClass(), "requestInterval", -1082123686);
        setField(term5235, term5235.getClass(), "rebootStartTime", "GlPTiCMCGP");
        setField(term5235, term5235.getClass(), "rebootEndTime", "jlcBpLoWfd");
        setBooleanField(term5235, term5235.getClass(), "isBackgroundDistribute", true);
        setIntField(term5235, term5235.getClass(), "maxCountCharacter", -991011239);
        setIntField(term5235, term5235.getClass(), "maxCountItem", -1774267288);
        setIntField(term5235, term5235.getClass(), "maxCountMusic", -1394083316);
        setField(term5235, term5235.getClass(), "matchStartTime", "oYymmLqbfJ");
        setField(term5235, term5235.getClass(), "matchEndTime", "YaDWphDOSz");
        setIntField(term5235, term5235.getClass(), "matchTimeLimit", 23814407);
        setIntField(term5235, term5235.getClass(), "matchErrorLimit", 1941438128);
        setField(term5235, term5235.getClass(), "matchingUri", "nnnmCgFBLw");
        setField(term5235, term5235.getClass(), "udpHolePunchUri", "hSSCyNEhyH");
        setField(term5235, term5235.getClass(), "reflectorUri", "jDFNSuvZqm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountItem", argTypes, term5235, args);
    }

};


