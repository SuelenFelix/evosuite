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
import java.lang.Long;

public class GameCard_setId_156352549913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3622;
     Object term3735;

    public GameCard_setId_156352549913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3622 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term3622, term3622.getClass(), "id", -4502405999831680926L);
        setField(term3622, term3622.getClass(), "name", "hMmaoREuCK");
        setField(term3622, term3622.getClass(), "nickName", "VeDtgDzGAN");
        setField(term3622, term3622.getClass(), "attribute", "aWYOWZFyaX");
        setIntField(term3622, term3622.getClass(), "charaId", 679763016);
        setField(term3622, term3622.getClass(), "school", "BRIVNtfUWU");
        setField(term3622, term3622.getClass(), "gakunen", "DbiCVtPPCT");
        setField(term3622, term3622.getClass(), "rarity", "WzFopsaDuG");
        setField(term3622, term3622.getClass(), "levelParam", "PapWxkhEWe");
        setIntField(term3622, term3622.getClass(), "skillId", 1962444399);
        setIntField(term3622, term3622.getClass(), "choKaikaSkillId", 767834723);
        setField(term3622, term3622.getClass(), "cardNumber", "smnHEqRFRx");
        setField(term3622, term3622.getClass(), "version", "XYtryyobou");
        term3735 = new Long(1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3735;
        callMethod(klass, "setId", argTypes, term3622, args);
    }

};


