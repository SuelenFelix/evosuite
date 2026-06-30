package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserGameOption_getRating_8095595367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73781;

    public UserGameOption_getRating_8095595367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73781 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term73781, term73781.getClass(), "id", 0L);
        setField(term73781, term73781.getClass(), "user", null);
        setIntField(term73781, term73781.getClass(), "bgInfo", 0);
        setIntField(term73781, term73781.getClass(), "fieldColor", 0);
        setIntField(term73781, term73781.getClass(), "guideSound", 0);
        setIntField(term73781, term73781.getClass(), "soundEffect", 0);
        setIntField(term73781, term73781.getClass(), "guideLine", 0);
        setIntField(term73781, term73781.getClass(), "speed", 0);
        setIntField(term73781, term73781.getClass(), "optionSet", 0);
        setIntField(term73781, term73781.getClass(), "matching", 0);
        setIntField(term73781, term73781.getClass(), "judgePos", 0);
        setIntField(term73781, term73781.getClass(), "rating", 0);
        setIntField(term73781, term73781.getClass(), "judgeJustice", 0);
        setIntField(term73781, term73781.getClass(), "judgeAttack", 0);
        setIntField(term73781, term73781.getClass(), "headphone", 0);
        setIntField(term73781, term73781.getClass(), "playerLevel", 0);
        setIntField(term73781, term73781.getClass(), "successTap", 0);
        setIntField(term73781, term73781.getClass(), "successExTap", 0);
        setIntField(term73781, term73781.getClass(), "successSlideHold", 0);
        setIntField(term73781, term73781.getClass(), "successAir", 0);
        setIntField(term73781, term73781.getClass(), "successFlick", 0);
        setIntField(term73781, term73781.getClass(), "successSkill", 0);
        setIntField(term73781, term73781.getClass(), "successTapTimbre", 0);
        setIntField(term73781, term73781.getClass(), "privacy", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRating", argTypes, term73781, args);
    }

};


