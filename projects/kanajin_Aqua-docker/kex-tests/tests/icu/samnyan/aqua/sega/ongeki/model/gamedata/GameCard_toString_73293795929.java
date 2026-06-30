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

public class GameCard_toString_73293795929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7078;

    public GameCard_toString_73293795929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7078 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term7078, term7078.getClass(), "id", 4784595517102746672L);
        setField(term7078, term7078.getClass(), "name", "IlvgFINwIa");
        setField(term7078, term7078.getClass(), "nickName", "GEJABPlHSI");
        setField(term7078, term7078.getClass(), "attribute", "aQFUvuaYxd");
        setIntField(term7078, term7078.getClass(), "charaId", -1772434990);
        setField(term7078, term7078.getClass(), "school", "zNFLXMifnS");
        setField(term7078, term7078.getClass(), "gakunen", "HHQcYMSBVc");
        setField(term7078, term7078.getClass(), "rarity", "wdoqITnaAP");
        setField(term7078, term7078.getClass(), "levelParam", "rIPMBcrNqB");
        setIntField(term7078, term7078.getClass(), "skillId", -1845499264);
        setIntField(term7078, term7078.getClass(), "choKaikaSkillId", -505439934);
        setField(term7078, term7078.getClass(), "cardNumber", "UDaboHZHhz");
        setField(term7078, term7078.getClass(), "version", "nRvKihUSPj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7078, args);
    }

};


