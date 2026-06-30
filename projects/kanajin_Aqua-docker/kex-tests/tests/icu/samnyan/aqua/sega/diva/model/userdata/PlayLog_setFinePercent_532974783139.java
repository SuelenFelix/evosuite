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

public class PlayLog_setFinePercent_532974783139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356361;
     Object term356392;

    public PlayLog_setFinePercent_532974783139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356361 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356361, term356361.getClass(), "id", 0L);
        setField(term356361, term356361.getClass(), "pdId", null);
        setIntField(term356361, term356361.getClass(), "pvId", 0);
        setField(term356361, term356361.getClass(), "difficulty", null);
        setField(term356361, term356361.getClass(), "edition", null);
        setIntField(term356361, term356361.getClass(), "scriptVer", 0);
        setIntField(term356361, term356361.getClass(), "score", 0);
        setField(term356361, term356361.getClass(), "challengeKind", null);
        setIntField(term356361, term356361.getClass(), "challengeResult", 0);
        setField(term356361, term356361.getClass(), "clearResult", null);
        setIntField(term356361, term356361.getClass(), "vp", 0);
        setIntField(term356361, term356361.getClass(), "coolCount", 0);
        setIntField(term356361, term356361.getClass(), "coolPercent", 0);
        setIntField(term356361, term356361.getClass(), "fineCount", 0);
        setIntField(term356361, term356361.getClass(), "finePercent", 0);
        setIntField(term356361, term356361.getClass(), "safeCount", 0);
        setIntField(term356361, term356361.getClass(), "safePercent", 0);
        setIntField(term356361, term356361.getClass(), "sadCount", 0);
        setIntField(term356361, term356361.getClass(), "sadPercent", 0);
        setIntField(term356361, term356361.getClass(), "wrongCount", 0);
        setIntField(term356361, term356361.getClass(), "wrongPercent", 0);
        setIntField(term356361, term356361.getClass(), "maxCombo", 0);
        setIntField(term356361, term356361.getClass(), "chanceTime", 0);
        setIntField(term356361, term356361.getClass(), "holdScore", 0);
        setIntField(term356361, term356361.getClass(), "attainPoint", 0);
        setIntField(term356361, term356361.getClass(), "skinId", 0);
        setIntField(term356361, term356361.getClass(), "buttonSe", 0);
        setIntField(term356361, term356361.getClass(), "buttonSeVol", 0);
        setIntField(term356361, term356361.getClass(), "sliderSe", 0);
        setIntField(term356361, term356361.getClass(), "ChainSlideSe", 0);
        setIntField(term356361, term356361.getClass(), "SliderTouchSe", 0);
        setField(term356361, term356361.getClass(), "modules", null);
        setIntField(term356361, term356361.getClass(), "stageCompletion", 0);
        setIntField(term356361, term356361.getClass(), "slideScore", 0);
        setIntField(term356361, term356361.getClass(), "isVocalChange", 0);
        setField(term356361, term356361.getClass(), "customizeItems", null);
        setField(term356361, term356361.getClass(), "rhythmGameOptions", null);
        setIntField(term356361, term356361.getClass(), "screenShotCount", 0);
        setField(term356361, term356361.getClass(), "dateTime", null);
        term356392 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term356392;
        callMethod(klass, "setFinePercent", argTypes, term356361, args);
    }

};


