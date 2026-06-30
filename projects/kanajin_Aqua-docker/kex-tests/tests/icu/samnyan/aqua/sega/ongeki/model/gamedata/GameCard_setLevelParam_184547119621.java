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

public class GameCard_setLevelParam_184547119621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5382;

    public GameCard_setLevelParam_184547119621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5382 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term5382, term5382.getClass(), "id", 6617340557564669657L);
        setField(term5382, term5382.getClass(), "name", "ShIELyuULw");
        setField(term5382, term5382.getClass(), "nickName", "IpQuOGMgmj");
        setField(term5382, term5382.getClass(), "attribute", "pJbnHTYrxn");
        setIntField(term5382, term5382.getClass(), "charaId", 1225272962);
        setField(term5382, term5382.getClass(), "school", "iIRsCSYqXH");
        setField(term5382, term5382.getClass(), "gakunen", "nghfqDXyCG");
        setField(term5382, term5382.getClass(), "rarity", "WBAOTqErtm");
        setField(term5382, term5382.getClass(), "levelParam", "PqtVXXZMqK");
        setIntField(term5382, term5382.getClass(), "skillId", 1324040357);
        setIntField(term5382, term5382.getClass(), "choKaikaSkillId", -1588772968);
        setField(term5382, term5382.getClass(), "cardNumber", "rYbtIDVdnd");
        setField(term5382, term5382.getClass(), "version", "UKAReurpHG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVRMUmrljA";
        callMethod(klass, "setLevelParam", argTypes, term5382, args);
    }

};


