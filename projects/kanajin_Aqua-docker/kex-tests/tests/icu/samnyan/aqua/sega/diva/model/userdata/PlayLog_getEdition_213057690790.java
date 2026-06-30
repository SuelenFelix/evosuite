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

public class PlayLog_getEdition_213057690790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354824;

    public PlayLog_getEdition_213057690790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354824 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term354824, term354824.getClass(), "id", 0L);
        setField(term354824, term354824.getClass(), "pdId", null);
        setIntField(term354824, term354824.getClass(), "pvId", 0);
        setField(term354824, term354824.getClass(), "difficulty", null);
        setField(term354824, term354824.getClass(), "edition", null);
        setIntField(term354824, term354824.getClass(), "scriptVer", 0);
        setIntField(term354824, term354824.getClass(), "score", 0);
        setField(term354824, term354824.getClass(), "challengeKind", null);
        setIntField(term354824, term354824.getClass(), "challengeResult", 0);
        setField(term354824, term354824.getClass(), "clearResult", null);
        setIntField(term354824, term354824.getClass(), "vp", 0);
        setIntField(term354824, term354824.getClass(), "coolCount", 0);
        setIntField(term354824, term354824.getClass(), "coolPercent", 0);
        setIntField(term354824, term354824.getClass(), "fineCount", 0);
        setIntField(term354824, term354824.getClass(), "finePercent", 0);
        setIntField(term354824, term354824.getClass(), "safeCount", 0);
        setIntField(term354824, term354824.getClass(), "safePercent", 0);
        setIntField(term354824, term354824.getClass(), "sadCount", 0);
        setIntField(term354824, term354824.getClass(), "sadPercent", 0);
        setIntField(term354824, term354824.getClass(), "wrongCount", 0);
        setIntField(term354824, term354824.getClass(), "wrongPercent", 0);
        setIntField(term354824, term354824.getClass(), "maxCombo", 0);
        setIntField(term354824, term354824.getClass(), "chanceTime", 0);
        setIntField(term354824, term354824.getClass(), "holdScore", 0);
        setIntField(term354824, term354824.getClass(), "attainPoint", 0);
        setIntField(term354824, term354824.getClass(), "skinId", 0);
        setIntField(term354824, term354824.getClass(), "buttonSe", 0);
        setIntField(term354824, term354824.getClass(), "buttonSeVol", 0);
        setIntField(term354824, term354824.getClass(), "sliderSe", 0);
        setIntField(term354824, term354824.getClass(), "ChainSlideSe", 0);
        setIntField(term354824, term354824.getClass(), "SliderTouchSe", 0);
        setField(term354824, term354824.getClass(), "modules", null);
        setIntField(term354824, term354824.getClass(), "stageCompletion", 0);
        setIntField(term354824, term354824.getClass(), "slideScore", 0);
        setIntField(term354824, term354824.getClass(), "isVocalChange", 0);
        setField(term354824, term354824.getClass(), "customizeItems", null);
        setField(term354824, term354824.getClass(), "rhythmGameOptions", null);
        setIntField(term354824, term354824.getClass(), "screenShotCount", 0);
        setField(term354824, term354824.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdition", argTypes, term354824, args);
    }

};


