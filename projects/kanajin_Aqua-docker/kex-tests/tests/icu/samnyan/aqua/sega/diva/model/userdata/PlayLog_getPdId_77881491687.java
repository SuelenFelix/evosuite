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

public class PlayLog_getPdId_77881491687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354731;

    public PlayLog_getPdId_77881491687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354731 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term354731, term354731.getClass(), "id", 0L);
        setField(term354731, term354731.getClass(), "pdId", null);
        setIntField(term354731, term354731.getClass(), "pvId", 0);
        setField(term354731, term354731.getClass(), "difficulty", null);
        setField(term354731, term354731.getClass(), "edition", null);
        setIntField(term354731, term354731.getClass(), "scriptVer", 0);
        setIntField(term354731, term354731.getClass(), "score", 0);
        setField(term354731, term354731.getClass(), "challengeKind", null);
        setIntField(term354731, term354731.getClass(), "challengeResult", 0);
        setField(term354731, term354731.getClass(), "clearResult", null);
        setIntField(term354731, term354731.getClass(), "vp", 0);
        setIntField(term354731, term354731.getClass(), "coolCount", 0);
        setIntField(term354731, term354731.getClass(), "coolPercent", 0);
        setIntField(term354731, term354731.getClass(), "fineCount", 0);
        setIntField(term354731, term354731.getClass(), "finePercent", 0);
        setIntField(term354731, term354731.getClass(), "safeCount", 0);
        setIntField(term354731, term354731.getClass(), "safePercent", 0);
        setIntField(term354731, term354731.getClass(), "sadCount", 0);
        setIntField(term354731, term354731.getClass(), "sadPercent", 0);
        setIntField(term354731, term354731.getClass(), "wrongCount", 0);
        setIntField(term354731, term354731.getClass(), "wrongPercent", 0);
        setIntField(term354731, term354731.getClass(), "maxCombo", 0);
        setIntField(term354731, term354731.getClass(), "chanceTime", 0);
        setIntField(term354731, term354731.getClass(), "holdScore", 0);
        setIntField(term354731, term354731.getClass(), "attainPoint", 0);
        setIntField(term354731, term354731.getClass(), "skinId", 0);
        setIntField(term354731, term354731.getClass(), "buttonSe", 0);
        setIntField(term354731, term354731.getClass(), "buttonSeVol", 0);
        setIntField(term354731, term354731.getClass(), "sliderSe", 0);
        setIntField(term354731, term354731.getClass(), "ChainSlideSe", 0);
        setIntField(term354731, term354731.getClass(), "SliderTouchSe", 0);
        setField(term354731, term354731.getClass(), "modules", null);
        setIntField(term354731, term354731.getClass(), "stageCompletion", 0);
        setIntField(term354731, term354731.getClass(), "slideScore", 0);
        setIntField(term354731, term354731.getClass(), "isVocalChange", 0);
        setField(term354731, term354731.getClass(), "customizeItems", null);
        setField(term354731, term354731.getClass(), "rhythmGameOptions", null);
        setIntField(term354731, term354731.getClass(), "screenShotCount", 0);
        setField(term354731, term354731.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term354731, args);
    }

};


