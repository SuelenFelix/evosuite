package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameCard_getGakunen_14751072106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2201;

    public GameCard_getGakunen_14751072106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2201 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term2201, term2201.getClass(), "id", 8428634514691209827L);
        setField(term2201, term2201.getClass(), "name", "XqgfKFvPSD");
        setField(term2201, term2201.getClass(), "nickName", "JiVRgTZvKc");
        setField(term2201, term2201.getClass(), "attribute", "XPKmummaqg");
        setIntField(term2201, term2201.getClass(), "charaId", 1622346318);
        setField(term2201, term2201.getClass(), "school", "BKLfkLiZTH");
        setField(term2201, term2201.getClass(), "gakunen", "SPpkrGcPRr");
        setField(term2201, term2201.getClass(), "rarity", "sEccwbJKYE");
        setField(term2201, term2201.getClass(), "levelParam", "AWRooQKkdW");
        setIntField(term2201, term2201.getClass(), "skillId", 1048535127);
        setIntField(term2201, term2201.getClass(), "choKaikaSkillId", -655067527);
        setField(term2201, term2201.getClass(), "cardNumber", "vjxIhXHxGR");
        setField(term2201, term2201.getClass(), "version", "QXzGXbEXMu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGakunen", argTypes, term2201, args);
    }

};


