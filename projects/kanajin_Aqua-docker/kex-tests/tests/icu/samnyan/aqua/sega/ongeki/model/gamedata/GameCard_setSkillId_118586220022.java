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
import java.lang.Integer;

public class GameCard_setSkillId_118586220022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5607;
     Object term5720;

    public GameCard_setSkillId_118586220022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5607 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term5607, term5607.getClass(), "id", 1439298019805881866L);
        setField(term5607, term5607.getClass(), "name", "NTlKJDDWlk");
        setField(term5607, term5607.getClass(), "nickName", "vOuMEpOQAg");
        setField(term5607, term5607.getClass(), "attribute", "SIODFGaQhr");
        setIntField(term5607, term5607.getClass(), "charaId", -93135961);
        setField(term5607, term5607.getClass(), "school", "qYzsiuXOgS");
        setField(term5607, term5607.getClass(), "gakunen", "bxrCBbrrct");
        setField(term5607, term5607.getClass(), "rarity", "CKWpJaaaxX");
        setField(term5607, term5607.getClass(), "levelParam", "UBRmXJmfrt");
        setIntField(term5607, term5607.getClass(), "skillId", -112921587);
        setIntField(term5607, term5607.getClass(), "choKaikaSkillId", 933028652);
        setField(term5607, term5607.getClass(), "cardNumber", "WZzvmIHhzZ");
        setField(term5607, term5607.getClass(), "version", "doQLHkjpNm");
        term5720 = new Integer(287287233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5720;
        callMethod(klass, "setSkillId", argTypes, term5607, args);
    }

};


