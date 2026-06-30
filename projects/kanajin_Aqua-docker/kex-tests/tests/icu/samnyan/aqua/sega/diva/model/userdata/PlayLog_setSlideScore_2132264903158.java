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
import java.lang.Integer;

public class PlayLog_setSlideScore_2132264903158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356986;
     Object term357017;

    public PlayLog_setSlideScore_2132264903158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356986 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356986, term356986.getClass(), "id", 0L);
        setField(term356986, term356986.getClass(), "pdId", null);
        setIntField(term356986, term356986.getClass(), "pvId", 0);
        setField(term356986, term356986.getClass(), "difficulty", null);
        setField(term356986, term356986.getClass(), "edition", null);
        setIntField(term356986, term356986.getClass(), "scriptVer", 0);
        setIntField(term356986, term356986.getClass(), "score", 0);
        setField(term356986, term356986.getClass(), "challengeKind", null);
        setIntField(term356986, term356986.getClass(), "challengeResult", 0);
        setField(term356986, term356986.getClass(), "clearResult", null);
        setIntField(term356986, term356986.getClass(), "vp", 0);
        setIntField(term356986, term356986.getClass(), "coolCount", 0);
        setIntField(term356986, term356986.getClass(), "coolPercent", 0);
        setIntField(term356986, term356986.getClass(), "fineCount", 0);
        setIntField(term356986, term356986.getClass(), "finePercent", 0);
        setIntField(term356986, term356986.getClass(), "safeCount", 0);
        setIntField(term356986, term356986.getClass(), "safePercent", 0);
        setIntField(term356986, term356986.getClass(), "sadCount", 0);
        setIntField(term356986, term356986.getClass(), "sadPercent", 0);
        setIntField(term356986, term356986.getClass(), "wrongCount", 0);
        setIntField(term356986, term356986.getClass(), "wrongPercent", 0);
        setIntField(term356986, term356986.getClass(), "maxCombo", 0);
        setIntField(term356986, term356986.getClass(), "chanceTime", 0);
        setIntField(term356986, term356986.getClass(), "holdScore", 0);
        setIntField(term356986, term356986.getClass(), "attainPoint", 0);
        setIntField(term356986, term356986.getClass(), "skinId", 0);
        setIntField(term356986, term356986.getClass(), "buttonSe", 0);
        setIntField(term356986, term356986.getClass(), "buttonSeVol", 0);
        setIntField(term356986, term356986.getClass(), "sliderSe", 0);
        setIntField(term356986, term356986.getClass(), "ChainSlideSe", 0);
        setIntField(term356986, term356986.getClass(), "SliderTouchSe", 0);
        setField(term356986, term356986.getClass(), "modules", null);
        setIntField(term356986, term356986.getClass(), "stageCompletion", 0);
        setIntField(term356986, term356986.getClass(), "slideScore", 0);
        setIntField(term356986, term356986.getClass(), "isVocalChange", 0);
        setField(term356986, term356986.getClass(), "customizeItems", null);
        setField(term356986, term356986.getClass(), "rhythmGameOptions", null);
        setIntField(term356986, term356986.getClass(), "screenShotCount", 0);
        setField(term356986, term356986.getClass(), "dateTime", null);
        term357017 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term357017;
        callMethod(klass, "setSlideScore", argTypes, term356986, args);
    }

};


