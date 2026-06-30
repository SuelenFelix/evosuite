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
import java.lang.Integer;

public class UserGameOption_setPrivacy_1829255834103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74689;
     Object term74713;

    public UserGameOption_setPrivacy_1829255834103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74689 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74689, term74689.getClass(), "id", 0L);
        setField(term74689, term74689.getClass(), "user", null);
        setIntField(term74689, term74689.getClass(), "bgInfo", 0);
        setIntField(term74689, term74689.getClass(), "fieldColor", 0);
        setIntField(term74689, term74689.getClass(), "guideSound", 0);
        setIntField(term74689, term74689.getClass(), "soundEffect", 0);
        setIntField(term74689, term74689.getClass(), "guideLine", 0);
        setIntField(term74689, term74689.getClass(), "speed", 0);
        setIntField(term74689, term74689.getClass(), "optionSet", 0);
        setIntField(term74689, term74689.getClass(), "matching", 0);
        setIntField(term74689, term74689.getClass(), "judgePos", 0);
        setIntField(term74689, term74689.getClass(), "rating", 0);
        setIntField(term74689, term74689.getClass(), "judgeJustice", 0);
        setIntField(term74689, term74689.getClass(), "judgeAttack", 0);
        setIntField(term74689, term74689.getClass(), "headphone", 0);
        setIntField(term74689, term74689.getClass(), "playerLevel", 0);
        setIntField(term74689, term74689.getClass(), "successTap", 0);
        setIntField(term74689, term74689.getClass(), "successExTap", 0);
        setIntField(term74689, term74689.getClass(), "successSlideHold", 0);
        setIntField(term74689, term74689.getClass(), "successAir", 0);
        setIntField(term74689, term74689.getClass(), "successFlick", 0);
        setIntField(term74689, term74689.getClass(), "successSkill", 0);
        setIntField(term74689, term74689.getClass(), "successTapTimbre", 0);
        setIntField(term74689, term74689.getClass(), "privacy", 0);
        term74713 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74713;
        callMethod(klass, "setPrivacy", argTypes, term74689, args);
    }

};


