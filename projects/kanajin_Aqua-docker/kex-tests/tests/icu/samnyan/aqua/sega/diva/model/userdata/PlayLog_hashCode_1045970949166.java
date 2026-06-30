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

public class PlayLog_hashCode_1045970949166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357240;

    public PlayLog_hashCode_1045970949166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357240 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term357240, term357240.getClass(), "id", 0L);
        setField(term357240, term357240.getClass(), "pdId", null);
        setIntField(term357240, term357240.getClass(), "pvId", 0);
        setField(term357240, term357240.getClass(), "difficulty", null);
        setField(term357240, term357240.getClass(), "edition", null);
        setIntField(term357240, term357240.getClass(), "scriptVer", 0);
        setIntField(term357240, term357240.getClass(), "score", 0);
        setField(term357240, term357240.getClass(), "challengeKind", null);
        setIntField(term357240, term357240.getClass(), "challengeResult", 0);
        setField(term357240, term357240.getClass(), "clearResult", null);
        setIntField(term357240, term357240.getClass(), "vp", 0);
        setIntField(term357240, term357240.getClass(), "coolCount", 0);
        setIntField(term357240, term357240.getClass(), "coolPercent", 0);
        setIntField(term357240, term357240.getClass(), "fineCount", 0);
        setIntField(term357240, term357240.getClass(), "finePercent", 0);
        setIntField(term357240, term357240.getClass(), "safeCount", 0);
        setIntField(term357240, term357240.getClass(), "safePercent", 0);
        setIntField(term357240, term357240.getClass(), "sadCount", 0);
        setIntField(term357240, term357240.getClass(), "sadPercent", 0);
        setIntField(term357240, term357240.getClass(), "wrongCount", 0);
        setIntField(term357240, term357240.getClass(), "wrongPercent", 0);
        setIntField(term357240, term357240.getClass(), "maxCombo", 0);
        setIntField(term357240, term357240.getClass(), "chanceTime", 0);
        setIntField(term357240, term357240.getClass(), "holdScore", 0);
        setIntField(term357240, term357240.getClass(), "attainPoint", 0);
        setIntField(term357240, term357240.getClass(), "skinId", 0);
        setIntField(term357240, term357240.getClass(), "buttonSe", 0);
        setIntField(term357240, term357240.getClass(), "buttonSeVol", 0);
        setIntField(term357240, term357240.getClass(), "sliderSe", 0);
        setIntField(term357240, term357240.getClass(), "ChainSlideSe", 0);
        setIntField(term357240, term357240.getClass(), "SliderTouchSe", 0);
        setField(term357240, term357240.getClass(), "modules", null);
        setIntField(term357240, term357240.getClass(), "stageCompletion", 0);
        setIntField(term357240, term357240.getClass(), "slideScore", 0);
        setIntField(term357240, term357240.getClass(), "isVocalChange", 0);
        setField(term357240, term357240.getClass(), "customizeItems", null);
        setField(term357240, term357240.getClass(), "rhythmGameOptions", null);
        setIntField(term357240, term357240.getClass(), "screenShotCount", 0);
        setField(term357240, term357240.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term357240, args);
    }

};


