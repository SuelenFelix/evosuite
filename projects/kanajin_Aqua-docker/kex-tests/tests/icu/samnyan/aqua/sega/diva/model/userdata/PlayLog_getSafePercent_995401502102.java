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

public class PlayLog_getSafePercent_995401502102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355196;

    public PlayLog_getSafePercent_995401502102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355196 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term355196, term355196.getClass(), "id", 0L);
        setField(term355196, term355196.getClass(), "pdId", null);
        setIntField(term355196, term355196.getClass(), "pvId", 0);
        setField(term355196, term355196.getClass(), "difficulty", null);
        setField(term355196, term355196.getClass(), "edition", null);
        setIntField(term355196, term355196.getClass(), "scriptVer", 0);
        setIntField(term355196, term355196.getClass(), "score", 0);
        setField(term355196, term355196.getClass(), "challengeKind", null);
        setIntField(term355196, term355196.getClass(), "challengeResult", 0);
        setField(term355196, term355196.getClass(), "clearResult", null);
        setIntField(term355196, term355196.getClass(), "vp", 0);
        setIntField(term355196, term355196.getClass(), "coolCount", 0);
        setIntField(term355196, term355196.getClass(), "coolPercent", 0);
        setIntField(term355196, term355196.getClass(), "fineCount", 0);
        setIntField(term355196, term355196.getClass(), "finePercent", 0);
        setIntField(term355196, term355196.getClass(), "safeCount", 0);
        setIntField(term355196, term355196.getClass(), "safePercent", 0);
        setIntField(term355196, term355196.getClass(), "sadCount", 0);
        setIntField(term355196, term355196.getClass(), "sadPercent", 0);
        setIntField(term355196, term355196.getClass(), "wrongCount", 0);
        setIntField(term355196, term355196.getClass(), "wrongPercent", 0);
        setIntField(term355196, term355196.getClass(), "maxCombo", 0);
        setIntField(term355196, term355196.getClass(), "chanceTime", 0);
        setIntField(term355196, term355196.getClass(), "holdScore", 0);
        setIntField(term355196, term355196.getClass(), "attainPoint", 0);
        setIntField(term355196, term355196.getClass(), "skinId", 0);
        setIntField(term355196, term355196.getClass(), "buttonSe", 0);
        setIntField(term355196, term355196.getClass(), "buttonSeVol", 0);
        setIntField(term355196, term355196.getClass(), "sliderSe", 0);
        setIntField(term355196, term355196.getClass(), "ChainSlideSe", 0);
        setIntField(term355196, term355196.getClass(), "SliderTouchSe", 0);
        setField(term355196, term355196.getClass(), "modules", null);
        setIntField(term355196, term355196.getClass(), "stageCompletion", 0);
        setIntField(term355196, term355196.getClass(), "slideScore", 0);
        setIntField(term355196, term355196.getClass(), "isVocalChange", 0);
        setField(term355196, term355196.getClass(), "customizeItems", null);
        setField(term355196, term355196.getClass(), "rhythmGameOptions", null);
        setIntField(term355196, term355196.getClass(), "screenShotCount", 0);
        setField(term355196, term355196.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSafePercent", argTypes, term355196, args);
    }

};


