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

public class PlayLog_setRhythmGameOptions_2085162011161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357083;

    public PlayLog_setRhythmGameOptions_2085162011161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357083 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term357083, term357083.getClass(), "id", 0L);
        setField(term357083, term357083.getClass(), "pdId", null);
        setIntField(term357083, term357083.getClass(), "pvId", 0);
        setField(term357083, term357083.getClass(), "difficulty", null);
        setField(term357083, term357083.getClass(), "edition", null);
        setIntField(term357083, term357083.getClass(), "scriptVer", 0);
        setIntField(term357083, term357083.getClass(), "score", 0);
        setField(term357083, term357083.getClass(), "challengeKind", null);
        setIntField(term357083, term357083.getClass(), "challengeResult", 0);
        setField(term357083, term357083.getClass(), "clearResult", null);
        setIntField(term357083, term357083.getClass(), "vp", 0);
        setIntField(term357083, term357083.getClass(), "coolCount", 0);
        setIntField(term357083, term357083.getClass(), "coolPercent", 0);
        setIntField(term357083, term357083.getClass(), "fineCount", 0);
        setIntField(term357083, term357083.getClass(), "finePercent", 0);
        setIntField(term357083, term357083.getClass(), "safeCount", 0);
        setIntField(term357083, term357083.getClass(), "safePercent", 0);
        setIntField(term357083, term357083.getClass(), "sadCount", 0);
        setIntField(term357083, term357083.getClass(), "sadPercent", 0);
        setIntField(term357083, term357083.getClass(), "wrongCount", 0);
        setIntField(term357083, term357083.getClass(), "wrongPercent", 0);
        setIntField(term357083, term357083.getClass(), "maxCombo", 0);
        setIntField(term357083, term357083.getClass(), "chanceTime", 0);
        setIntField(term357083, term357083.getClass(), "holdScore", 0);
        setIntField(term357083, term357083.getClass(), "attainPoint", 0);
        setIntField(term357083, term357083.getClass(), "skinId", 0);
        setIntField(term357083, term357083.getClass(), "buttonSe", 0);
        setIntField(term357083, term357083.getClass(), "buttonSeVol", 0);
        setIntField(term357083, term357083.getClass(), "sliderSe", 0);
        setIntField(term357083, term357083.getClass(), "ChainSlideSe", 0);
        setIntField(term357083, term357083.getClass(), "SliderTouchSe", 0);
        setField(term357083, term357083.getClass(), "modules", null);
        setIntField(term357083, term357083.getClass(), "stageCompletion", 0);
        setIntField(term357083, term357083.getClass(), "slideScore", 0);
        setIntField(term357083, term357083.getClass(), "isVocalChange", 0);
        setField(term357083, term357083.getClass(), "customizeItems", null);
        setField(term357083, term357083.getClass(), "rhythmGameOptions", null);
        setIntField(term357083, term357083.getClass(), "screenShotCount", 0);
        setField(term357083, term357083.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRhythmGameOptions", argTypes, term357083, args);
    }

};


