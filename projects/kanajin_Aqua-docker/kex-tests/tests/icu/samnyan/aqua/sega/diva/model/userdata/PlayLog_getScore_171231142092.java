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

public class PlayLog_getScore_171231142092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354886;

    public PlayLog_getScore_171231142092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354886 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term354886, term354886.getClass(), "id", 0L);
        setField(term354886, term354886.getClass(), "pdId", null);
        setIntField(term354886, term354886.getClass(), "pvId", 0);
        setField(term354886, term354886.getClass(), "difficulty", null);
        setField(term354886, term354886.getClass(), "edition", null);
        setIntField(term354886, term354886.getClass(), "scriptVer", 0);
        setIntField(term354886, term354886.getClass(), "score", 0);
        setField(term354886, term354886.getClass(), "challengeKind", null);
        setIntField(term354886, term354886.getClass(), "challengeResult", 0);
        setField(term354886, term354886.getClass(), "clearResult", null);
        setIntField(term354886, term354886.getClass(), "vp", 0);
        setIntField(term354886, term354886.getClass(), "coolCount", 0);
        setIntField(term354886, term354886.getClass(), "coolPercent", 0);
        setIntField(term354886, term354886.getClass(), "fineCount", 0);
        setIntField(term354886, term354886.getClass(), "finePercent", 0);
        setIntField(term354886, term354886.getClass(), "safeCount", 0);
        setIntField(term354886, term354886.getClass(), "safePercent", 0);
        setIntField(term354886, term354886.getClass(), "sadCount", 0);
        setIntField(term354886, term354886.getClass(), "sadPercent", 0);
        setIntField(term354886, term354886.getClass(), "wrongCount", 0);
        setIntField(term354886, term354886.getClass(), "wrongPercent", 0);
        setIntField(term354886, term354886.getClass(), "maxCombo", 0);
        setIntField(term354886, term354886.getClass(), "chanceTime", 0);
        setIntField(term354886, term354886.getClass(), "holdScore", 0);
        setIntField(term354886, term354886.getClass(), "attainPoint", 0);
        setIntField(term354886, term354886.getClass(), "skinId", 0);
        setIntField(term354886, term354886.getClass(), "buttonSe", 0);
        setIntField(term354886, term354886.getClass(), "buttonSeVol", 0);
        setIntField(term354886, term354886.getClass(), "sliderSe", 0);
        setIntField(term354886, term354886.getClass(), "ChainSlideSe", 0);
        setIntField(term354886, term354886.getClass(), "SliderTouchSe", 0);
        setField(term354886, term354886.getClass(), "modules", null);
        setIntField(term354886, term354886.getClass(), "stageCompletion", 0);
        setIntField(term354886, term354886.getClass(), "slideScore", 0);
        setIntField(term354886, term354886.getClass(), "isVocalChange", 0);
        setField(term354886, term354886.getClass(), "customizeItems", null);
        setField(term354886, term354886.getClass(), "rhythmGameOptions", null);
        setIntField(term354886, term354886.getClass(), "screenShotCount", 0);
        setField(term354886, term354886.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term354886, args);
    }

};


