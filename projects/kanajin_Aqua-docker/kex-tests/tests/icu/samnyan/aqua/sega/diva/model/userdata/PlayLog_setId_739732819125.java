package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class PlayLog_setId_739732819125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355909;
     Object term355940;

    public PlayLog_setId_739732819125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355909 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term355909, term355909.getClass(), "id", 0L);
        setField(term355909, term355909.getClass(), "pdId", null);
        setIntField(term355909, term355909.getClass(), "pvId", 0);
        setField(term355909, term355909.getClass(), "difficulty", null);
        setField(term355909, term355909.getClass(), "edition", null);
        setIntField(term355909, term355909.getClass(), "scriptVer", 0);
        setIntField(term355909, term355909.getClass(), "score", 0);
        setField(term355909, term355909.getClass(), "challengeKind", null);
        setIntField(term355909, term355909.getClass(), "challengeResult", 0);
        setField(term355909, term355909.getClass(), "clearResult", null);
        setIntField(term355909, term355909.getClass(), "vp", 0);
        setIntField(term355909, term355909.getClass(), "coolCount", 0);
        setIntField(term355909, term355909.getClass(), "coolPercent", 0);
        setIntField(term355909, term355909.getClass(), "fineCount", 0);
        setIntField(term355909, term355909.getClass(), "finePercent", 0);
        setIntField(term355909, term355909.getClass(), "safeCount", 0);
        setIntField(term355909, term355909.getClass(), "safePercent", 0);
        setIntField(term355909, term355909.getClass(), "sadCount", 0);
        setIntField(term355909, term355909.getClass(), "sadPercent", 0);
        setIntField(term355909, term355909.getClass(), "wrongCount", 0);
        setIntField(term355909, term355909.getClass(), "wrongPercent", 0);
        setIntField(term355909, term355909.getClass(), "maxCombo", 0);
        setIntField(term355909, term355909.getClass(), "chanceTime", 0);
        setIntField(term355909, term355909.getClass(), "holdScore", 0);
        setIntField(term355909, term355909.getClass(), "attainPoint", 0);
        setIntField(term355909, term355909.getClass(), "skinId", 0);
        setIntField(term355909, term355909.getClass(), "buttonSe", 0);
        setIntField(term355909, term355909.getClass(), "buttonSeVol", 0);
        setIntField(term355909, term355909.getClass(), "sliderSe", 0);
        setIntField(term355909, term355909.getClass(), "ChainSlideSe", 0);
        setIntField(term355909, term355909.getClass(), "SliderTouchSe", 0);
        setField(term355909, term355909.getClass(), "modules", null);
        setIntField(term355909, term355909.getClass(), "stageCompletion", 0);
        setIntField(term355909, term355909.getClass(), "slideScore", 0);
        setIntField(term355909, term355909.getClass(), "isVocalChange", 0);
        setField(term355909, term355909.getClass(), "customizeItems", null);
        setField(term355909, term355909.getClass(), "rhythmGameOptions", null);
        setIntField(term355909, term355909.getClass(), "screenShotCount", 0);
        setField(term355909, term355909.getClass(), "dateTime", null);
        term355940 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term355940;
        callMethod(klass, "setId", argTypes, term355909, args);
    }

};


