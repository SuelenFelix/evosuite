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

public class PlayLog_getPvId_52978813788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354762;

    public PlayLog_getPvId_52978813788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354762 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term354762, term354762.getClass(), "id", 0L);
        setField(term354762, term354762.getClass(), "pdId", null);
        setIntField(term354762, term354762.getClass(), "pvId", 0);
        setField(term354762, term354762.getClass(), "difficulty", null);
        setField(term354762, term354762.getClass(), "edition", null);
        setIntField(term354762, term354762.getClass(), "scriptVer", 0);
        setIntField(term354762, term354762.getClass(), "score", 0);
        setField(term354762, term354762.getClass(), "challengeKind", null);
        setIntField(term354762, term354762.getClass(), "challengeResult", 0);
        setField(term354762, term354762.getClass(), "clearResult", null);
        setIntField(term354762, term354762.getClass(), "vp", 0);
        setIntField(term354762, term354762.getClass(), "coolCount", 0);
        setIntField(term354762, term354762.getClass(), "coolPercent", 0);
        setIntField(term354762, term354762.getClass(), "fineCount", 0);
        setIntField(term354762, term354762.getClass(), "finePercent", 0);
        setIntField(term354762, term354762.getClass(), "safeCount", 0);
        setIntField(term354762, term354762.getClass(), "safePercent", 0);
        setIntField(term354762, term354762.getClass(), "sadCount", 0);
        setIntField(term354762, term354762.getClass(), "sadPercent", 0);
        setIntField(term354762, term354762.getClass(), "wrongCount", 0);
        setIntField(term354762, term354762.getClass(), "wrongPercent", 0);
        setIntField(term354762, term354762.getClass(), "maxCombo", 0);
        setIntField(term354762, term354762.getClass(), "chanceTime", 0);
        setIntField(term354762, term354762.getClass(), "holdScore", 0);
        setIntField(term354762, term354762.getClass(), "attainPoint", 0);
        setIntField(term354762, term354762.getClass(), "skinId", 0);
        setIntField(term354762, term354762.getClass(), "buttonSe", 0);
        setIntField(term354762, term354762.getClass(), "buttonSeVol", 0);
        setIntField(term354762, term354762.getClass(), "sliderSe", 0);
        setIntField(term354762, term354762.getClass(), "ChainSlideSe", 0);
        setIntField(term354762, term354762.getClass(), "SliderTouchSe", 0);
        setField(term354762, term354762.getClass(), "modules", null);
        setIntField(term354762, term354762.getClass(), "stageCompletion", 0);
        setIntField(term354762, term354762.getClass(), "slideScore", 0);
        setIntField(term354762, term354762.getClass(), "isVocalChange", 0);
        setField(term354762, term354762.getClass(), "customizeItems", null);
        setField(term354762, term354762.getClass(), "rhythmGameOptions", null);
        setIntField(term354762, term354762.getClass(), "screenShotCount", 0);
        setField(term354762, term354762.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvId", argTypes, term354762, args);
    }

};


