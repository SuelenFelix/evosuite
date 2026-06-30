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

public class PlayLog_getScriptVer_208000774691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354855;

    public PlayLog_getScriptVer_208000774691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354855 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term354855, term354855.getClass(), "id", 0L);
        setField(term354855, term354855.getClass(), "pdId", null);
        setIntField(term354855, term354855.getClass(), "pvId", 0);
        setField(term354855, term354855.getClass(), "difficulty", null);
        setField(term354855, term354855.getClass(), "edition", null);
        setIntField(term354855, term354855.getClass(), "scriptVer", 0);
        setIntField(term354855, term354855.getClass(), "score", 0);
        setField(term354855, term354855.getClass(), "challengeKind", null);
        setIntField(term354855, term354855.getClass(), "challengeResult", 0);
        setField(term354855, term354855.getClass(), "clearResult", null);
        setIntField(term354855, term354855.getClass(), "vp", 0);
        setIntField(term354855, term354855.getClass(), "coolCount", 0);
        setIntField(term354855, term354855.getClass(), "coolPercent", 0);
        setIntField(term354855, term354855.getClass(), "fineCount", 0);
        setIntField(term354855, term354855.getClass(), "finePercent", 0);
        setIntField(term354855, term354855.getClass(), "safeCount", 0);
        setIntField(term354855, term354855.getClass(), "safePercent", 0);
        setIntField(term354855, term354855.getClass(), "sadCount", 0);
        setIntField(term354855, term354855.getClass(), "sadPercent", 0);
        setIntField(term354855, term354855.getClass(), "wrongCount", 0);
        setIntField(term354855, term354855.getClass(), "wrongPercent", 0);
        setIntField(term354855, term354855.getClass(), "maxCombo", 0);
        setIntField(term354855, term354855.getClass(), "chanceTime", 0);
        setIntField(term354855, term354855.getClass(), "holdScore", 0);
        setIntField(term354855, term354855.getClass(), "attainPoint", 0);
        setIntField(term354855, term354855.getClass(), "skinId", 0);
        setIntField(term354855, term354855.getClass(), "buttonSe", 0);
        setIntField(term354855, term354855.getClass(), "buttonSeVol", 0);
        setIntField(term354855, term354855.getClass(), "sliderSe", 0);
        setIntField(term354855, term354855.getClass(), "ChainSlideSe", 0);
        setIntField(term354855, term354855.getClass(), "SliderTouchSe", 0);
        setField(term354855, term354855.getClass(), "modules", null);
        setIntField(term354855, term354855.getClass(), "stageCompletion", 0);
        setIntField(term354855, term354855.getClass(), "slideScore", 0);
        setIntField(term354855, term354855.getClass(), "isVocalChange", 0);
        setField(term354855, term354855.getClass(), "customizeItems", null);
        setField(term354855, term354855.getClass(), "rhythmGameOptions", null);
        setIntField(term354855, term354855.getClass(), "screenShotCount", 0);
        setField(term354855, term354855.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScriptVer", argTypes, term354855, args);
    }

};


