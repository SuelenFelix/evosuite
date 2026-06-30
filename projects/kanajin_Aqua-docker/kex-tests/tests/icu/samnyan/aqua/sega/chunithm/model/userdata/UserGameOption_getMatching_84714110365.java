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

public class UserGameOption_getMatching_84714110365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73733;

    public UserGameOption_getMatching_84714110365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73733 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term73733, term73733.getClass(), "id", 0L);
        setField(term73733, term73733.getClass(), "user", null);
        setIntField(term73733, term73733.getClass(), "bgInfo", 0);
        setIntField(term73733, term73733.getClass(), "fieldColor", 0);
        setIntField(term73733, term73733.getClass(), "guideSound", 0);
        setIntField(term73733, term73733.getClass(), "soundEffect", 0);
        setIntField(term73733, term73733.getClass(), "guideLine", 0);
        setIntField(term73733, term73733.getClass(), "speed", 0);
        setIntField(term73733, term73733.getClass(), "optionSet", 0);
        setIntField(term73733, term73733.getClass(), "matching", 0);
        setIntField(term73733, term73733.getClass(), "judgePos", 0);
        setIntField(term73733, term73733.getClass(), "rating", 0);
        setIntField(term73733, term73733.getClass(), "judgeJustice", 0);
        setIntField(term73733, term73733.getClass(), "judgeAttack", 0);
        setIntField(term73733, term73733.getClass(), "headphone", 0);
        setIntField(term73733, term73733.getClass(), "playerLevel", 0);
        setIntField(term73733, term73733.getClass(), "successTap", 0);
        setIntField(term73733, term73733.getClass(), "successExTap", 0);
        setIntField(term73733, term73733.getClass(), "successSlideHold", 0);
        setIntField(term73733, term73733.getClass(), "successAir", 0);
        setIntField(term73733, term73733.getClass(), "successFlick", 0);
        setIntField(term73733, term73733.getClass(), "successSkill", 0);
        setIntField(term73733, term73733.getClass(), "successTapTimbre", 0);
        setIntField(term73733, term73733.getClass(), "privacy", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatching", argTypes, term73733, args);
    }

};


