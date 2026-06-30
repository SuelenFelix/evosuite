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

public class GameCard_setGakunen_66362618619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4932;

    public GameCard_setGakunen_66362618619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4932 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term4932, term4932.getClass(), "id", -484994522244390100L);
        setField(term4932, term4932.getClass(), "name", "GrqozDKFOk");
        setField(term4932, term4932.getClass(), "nickName", "CFyoseFGLF");
        setField(term4932, term4932.getClass(), "attribute", "SFqCrhEWLm");
        setIntField(term4932, term4932.getClass(), "charaId", 493620644);
        setField(term4932, term4932.getClass(), "school", "GZdcJyZntS");
        setField(term4932, term4932.getClass(), "gakunen", "OIHoJeysUi");
        setField(term4932, term4932.getClass(), "rarity", "WXMWFDGcLB");
        setField(term4932, term4932.getClass(), "levelParam", "wKWbJssZuG");
        setIntField(term4932, term4932.getClass(), "skillId", 1328271830);
        setIntField(term4932, term4932.getClass(), "choKaikaSkillId", 1596070772);
        setField(term4932, term4932.getClass(), "cardNumber", "NzBMMhkhpT");
        setField(term4932, term4932.getClass(), "version", "qCpEbQDHdF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AHbZyFOmlo";
        callMethod(klass, "setGakunen", argTypes, term4932, args);
    }

};


