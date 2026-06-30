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

public class GameCard_getCardNumber_199094486011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3216;

    public GameCard_getCardNumber_199094486011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3216 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term3216, term3216.getClass(), "id", 7009926388951271268L);
        setField(term3216, term3216.getClass(), "name", "yVMkkQhvmN");
        setField(term3216, term3216.getClass(), "nickName", "mvrkADEgpp");
        setField(term3216, term3216.getClass(), "attribute", "pXOkjyeIRb");
        setIntField(term3216, term3216.getClass(), "charaId", -226514366);
        setField(term3216, term3216.getClass(), "school", "GgZWSjxjyE");
        setField(term3216, term3216.getClass(), "gakunen", "EeBVbzjcCI");
        setField(term3216, term3216.getClass(), "rarity", "UfQtPRyWRC");
        setField(term3216, term3216.getClass(), "levelParam", "FPvxVzzSvD");
        setIntField(term3216, term3216.getClass(), "skillId", 1193880199);
        setIntField(term3216, term3216.getClass(), "choKaikaSkillId", -1087774327);
        setField(term3216, term3216.getClass(), "cardNumber", "WHcwFgsGFC");
        setField(term3216, term3216.getClass(), "version", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardNumber", argTypes, term3216, args);
    }

};


