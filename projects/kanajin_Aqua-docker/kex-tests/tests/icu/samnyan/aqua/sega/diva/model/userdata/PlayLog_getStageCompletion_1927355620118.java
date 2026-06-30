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

public class PlayLog_getStageCompletion_1927355620118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355692;

    public PlayLog_getStageCompletion_1927355620118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355692 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term355692, term355692.getClass(), "id", 0L);
        setField(term355692, term355692.getClass(), "pdId", null);
        setIntField(term355692, term355692.getClass(), "pvId", 0);
        setField(term355692, term355692.getClass(), "difficulty", null);
        setField(term355692, term355692.getClass(), "edition", null);
        setIntField(term355692, term355692.getClass(), "scriptVer", 0);
        setIntField(term355692, term355692.getClass(), "score", 0);
        setField(term355692, term355692.getClass(), "challengeKind", null);
        setIntField(term355692, term355692.getClass(), "challengeResult", 0);
        setField(term355692, term355692.getClass(), "clearResult", null);
        setIntField(term355692, term355692.getClass(), "vp", 0);
        setIntField(term355692, term355692.getClass(), "coolCount", 0);
        setIntField(term355692, term355692.getClass(), "coolPercent", 0);
        setIntField(term355692, term355692.getClass(), "fineCount", 0);
        setIntField(term355692, term355692.getClass(), "finePercent", 0);
        setIntField(term355692, term355692.getClass(), "safeCount", 0);
        setIntField(term355692, term355692.getClass(), "safePercent", 0);
        setIntField(term355692, term355692.getClass(), "sadCount", 0);
        setIntField(term355692, term355692.getClass(), "sadPercent", 0);
        setIntField(term355692, term355692.getClass(), "wrongCount", 0);
        setIntField(term355692, term355692.getClass(), "wrongPercent", 0);
        setIntField(term355692, term355692.getClass(), "maxCombo", 0);
        setIntField(term355692, term355692.getClass(), "chanceTime", 0);
        setIntField(term355692, term355692.getClass(), "holdScore", 0);
        setIntField(term355692, term355692.getClass(), "attainPoint", 0);
        setIntField(term355692, term355692.getClass(), "skinId", 0);
        setIntField(term355692, term355692.getClass(), "buttonSe", 0);
        setIntField(term355692, term355692.getClass(), "buttonSeVol", 0);
        setIntField(term355692, term355692.getClass(), "sliderSe", 0);
        setIntField(term355692, term355692.getClass(), "ChainSlideSe", 0);
        setIntField(term355692, term355692.getClass(), "SliderTouchSe", 0);
        setField(term355692, term355692.getClass(), "modules", null);
        setIntField(term355692, term355692.getClass(), "stageCompletion", 0);
        setIntField(term355692, term355692.getClass(), "slideScore", 0);
        setIntField(term355692, term355692.getClass(), "isVocalChange", 0);
        setField(term355692, term355692.getClass(), "customizeItems", null);
        setField(term355692, term355692.getClass(), "rhythmGameOptions", null);
        setIntField(term355692, term355692.getClass(), "screenShotCount", 0);
        setField(term355692, term355692.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStageCompletion", argTypes, term355692, args);
    }

};


