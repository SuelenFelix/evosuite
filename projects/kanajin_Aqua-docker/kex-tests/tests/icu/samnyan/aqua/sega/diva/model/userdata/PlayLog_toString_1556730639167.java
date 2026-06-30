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

public class PlayLog_toString_1556730639167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357271;

    public PlayLog_toString_1556730639167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357271 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term357271, term357271.getClass(), "id", 0L);
        setField(term357271, term357271.getClass(), "pdId", null);
        setIntField(term357271, term357271.getClass(), "pvId", 0);
        setField(term357271, term357271.getClass(), "difficulty", null);
        setField(term357271, term357271.getClass(), "edition", null);
        setIntField(term357271, term357271.getClass(), "scriptVer", 0);
        setIntField(term357271, term357271.getClass(), "score", 0);
        setField(term357271, term357271.getClass(), "challengeKind", null);
        setIntField(term357271, term357271.getClass(), "challengeResult", 0);
        setField(term357271, term357271.getClass(), "clearResult", null);
        setIntField(term357271, term357271.getClass(), "vp", 0);
        setIntField(term357271, term357271.getClass(), "coolCount", 0);
        setIntField(term357271, term357271.getClass(), "coolPercent", 0);
        setIntField(term357271, term357271.getClass(), "fineCount", 0);
        setIntField(term357271, term357271.getClass(), "finePercent", 0);
        setIntField(term357271, term357271.getClass(), "safeCount", 0);
        setIntField(term357271, term357271.getClass(), "safePercent", 0);
        setIntField(term357271, term357271.getClass(), "sadCount", 0);
        setIntField(term357271, term357271.getClass(), "sadPercent", 0);
        setIntField(term357271, term357271.getClass(), "wrongCount", 0);
        setIntField(term357271, term357271.getClass(), "wrongPercent", 0);
        setIntField(term357271, term357271.getClass(), "maxCombo", 0);
        setIntField(term357271, term357271.getClass(), "chanceTime", 0);
        setIntField(term357271, term357271.getClass(), "holdScore", 0);
        setIntField(term357271, term357271.getClass(), "attainPoint", 0);
        setIntField(term357271, term357271.getClass(), "skinId", 0);
        setIntField(term357271, term357271.getClass(), "buttonSe", 0);
        setIntField(term357271, term357271.getClass(), "buttonSeVol", 0);
        setIntField(term357271, term357271.getClass(), "sliderSe", 0);
        setIntField(term357271, term357271.getClass(), "ChainSlideSe", 0);
        setIntField(term357271, term357271.getClass(), "SliderTouchSe", 0);
        setField(term357271, term357271.getClass(), "modules", null);
        setIntField(term357271, term357271.getClass(), "stageCompletion", 0);
        setIntField(term357271, term357271.getClass(), "slideScore", 0);
        setIntField(term357271, term357271.getClass(), "isVocalChange", 0);
        setField(term357271, term357271.getClass(), "customizeItems", null);
        setField(term357271, term357271.getClass(), "rhythmGameOptions", null);
        setIntField(term357271, term357271.getClass(), "screenShotCount", 0);
        setField(term357271, term357271.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term357271, args);
    }

};


