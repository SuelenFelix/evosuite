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

public class GameCard_setSchool_72756798318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4707;

    public GameCard_setSchool_72756798318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4707 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term4707, term4707.getClass(), "id", -6823727938421990489L);
        setField(term4707, term4707.getClass(), "name", "AZdLeSugwv");
        setField(term4707, term4707.getClass(), "nickName", "RMsXuyzKJV");
        setField(term4707, term4707.getClass(), "attribute", "FwPbDZcHmB");
        setIntField(term4707, term4707.getClass(), "charaId", 292681826);
        setField(term4707, term4707.getClass(), "school", "hOncybyCAH");
        setField(term4707, term4707.getClass(), "gakunen", "QduALnDSVo");
        setField(term4707, term4707.getClass(), "rarity", "izPpKDErnQ");
        setField(term4707, term4707.getClass(), "levelParam", "NnpwZBUTvx");
        setIntField(term4707, term4707.getClass(), "skillId", 458147407);
        setIntField(term4707, term4707.getClass(), "choKaikaSkillId", -184153539);
        setField(term4707, term4707.getClass(), "cardNumber", "tlQSNgTkQX");
        setField(term4707, term4707.getClass(), "version", "PCipZnmBOF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zcorEihhLK";
        callMethod(klass, "setSchool", argTypes, term4707, args);
    }

};


