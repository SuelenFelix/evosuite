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

public class PlayLog_getChainSlideSe_500171000115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355599;

    public PlayLog_getChainSlideSe_500171000115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355599 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term355599, term355599.getClass(), "id", 0L);
        setField(term355599, term355599.getClass(), "pdId", null);
        setIntField(term355599, term355599.getClass(), "pvId", 0);
        setField(term355599, term355599.getClass(), "difficulty", null);
        setField(term355599, term355599.getClass(), "edition", null);
        setIntField(term355599, term355599.getClass(), "scriptVer", 0);
        setIntField(term355599, term355599.getClass(), "score", 0);
        setField(term355599, term355599.getClass(), "challengeKind", null);
        setIntField(term355599, term355599.getClass(), "challengeResult", 0);
        setField(term355599, term355599.getClass(), "clearResult", null);
        setIntField(term355599, term355599.getClass(), "vp", 0);
        setIntField(term355599, term355599.getClass(), "coolCount", 0);
        setIntField(term355599, term355599.getClass(), "coolPercent", 0);
        setIntField(term355599, term355599.getClass(), "fineCount", 0);
        setIntField(term355599, term355599.getClass(), "finePercent", 0);
        setIntField(term355599, term355599.getClass(), "safeCount", 0);
        setIntField(term355599, term355599.getClass(), "safePercent", 0);
        setIntField(term355599, term355599.getClass(), "sadCount", 0);
        setIntField(term355599, term355599.getClass(), "sadPercent", 0);
        setIntField(term355599, term355599.getClass(), "wrongCount", 0);
        setIntField(term355599, term355599.getClass(), "wrongPercent", 0);
        setIntField(term355599, term355599.getClass(), "maxCombo", 0);
        setIntField(term355599, term355599.getClass(), "chanceTime", 0);
        setIntField(term355599, term355599.getClass(), "holdScore", 0);
        setIntField(term355599, term355599.getClass(), "attainPoint", 0);
        setIntField(term355599, term355599.getClass(), "skinId", 0);
        setIntField(term355599, term355599.getClass(), "buttonSe", 0);
        setIntField(term355599, term355599.getClass(), "buttonSeVol", 0);
        setIntField(term355599, term355599.getClass(), "sliderSe", 0);
        setIntField(term355599, term355599.getClass(), "ChainSlideSe", 0);
        setIntField(term355599, term355599.getClass(), "SliderTouchSe", 0);
        setField(term355599, term355599.getClass(), "modules", null);
        setIntField(term355599, term355599.getClass(), "stageCompletion", 0);
        setIntField(term355599, term355599.getClass(), "slideScore", 0);
        setIntField(term355599, term355599.getClass(), "isVocalChange", 0);
        setField(term355599, term355599.getClass(), "customizeItems", null);
        setField(term355599, term355599.getClass(), "rhythmGameOptions", null);
        setIntField(term355599, term355599.getClass(), "screenShotCount", 0);
        setField(term355599, term355599.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChainSlideSe", argTypes, term355599, args);
    }

};


