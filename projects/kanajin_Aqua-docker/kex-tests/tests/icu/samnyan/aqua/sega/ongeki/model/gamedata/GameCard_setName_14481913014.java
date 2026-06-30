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

public class GameCard_setName_14481913014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3827;

    public GameCard_setName_14481913014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3827 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term3827, term3827.getClass(), "id", 2120084523938730454L);
        setField(term3827, term3827.getClass(), "name", "OYbzXylRWW");
        setField(term3827, term3827.getClass(), "nickName", "DSNsTGYXDF");
        setField(term3827, term3827.getClass(), "attribute", "sQvGcVjdEx");
        setIntField(term3827, term3827.getClass(), "charaId", -602026508);
        setField(term3827, term3827.getClass(), "school", "rLHAoqXgPh");
        setField(term3827, term3827.getClass(), "gakunen", "zUlRdimJtU");
        setField(term3827, term3827.getClass(), "rarity", "vwbEQQNQrx");
        setField(term3827, term3827.getClass(), "levelParam", "xtftXXMbem");
        setIntField(term3827, term3827.getClass(), "skillId", -157887805);
        setIntField(term3827, term3827.getClass(), "choKaikaSkillId", 1876565163);
        setField(term3827, term3827.getClass(), "cardNumber", "cudZvLMQon");
        setField(term3827, term3827.getClass(), "version", "lihXWlGDxk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JmcmxoGhIK";
        callMethod(klass, "setName", argTypes, term3827, args);
    }

};


