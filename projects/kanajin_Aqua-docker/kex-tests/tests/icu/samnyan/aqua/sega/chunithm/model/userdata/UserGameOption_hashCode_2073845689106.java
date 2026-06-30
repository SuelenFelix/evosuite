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

public class UserGameOption_hashCode_2073845689106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74763;

    public UserGameOption_hashCode_2073845689106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74763 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74763, term74763.getClass(), "id", 0L);
        setField(term74763, term74763.getClass(), "user", null);
        setIntField(term74763, term74763.getClass(), "bgInfo", 0);
        setIntField(term74763, term74763.getClass(), "fieldColor", 0);
        setIntField(term74763, term74763.getClass(), "guideSound", 0);
        setIntField(term74763, term74763.getClass(), "soundEffect", 0);
        setIntField(term74763, term74763.getClass(), "guideLine", 0);
        setIntField(term74763, term74763.getClass(), "speed", 0);
        setIntField(term74763, term74763.getClass(), "optionSet", 0);
        setIntField(term74763, term74763.getClass(), "matching", 0);
        setIntField(term74763, term74763.getClass(), "judgePos", 0);
        setIntField(term74763, term74763.getClass(), "rating", 0);
        setIntField(term74763, term74763.getClass(), "judgeJustice", 0);
        setIntField(term74763, term74763.getClass(), "judgeAttack", 0);
        setIntField(term74763, term74763.getClass(), "headphone", 0);
        setIntField(term74763, term74763.getClass(), "playerLevel", 0);
        setIntField(term74763, term74763.getClass(), "successTap", 0);
        setIntField(term74763, term74763.getClass(), "successExTap", 0);
        setIntField(term74763, term74763.getClass(), "successSlideHold", 0);
        setIntField(term74763, term74763.getClass(), "successAir", 0);
        setIntField(term74763, term74763.getClass(), "successFlick", 0);
        setIntField(term74763, term74763.getClass(), "successSkill", 0);
        setIntField(term74763, term74763.getClass(), "successTapTimbre", 0);
        setIntField(term74763, term74763.getClass(), "privacy", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term74763, args);
    }

};


