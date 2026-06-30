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

public class GameCard_getId_5002122950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term983;

    public GameCard_getId_5002122950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term983 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term983, term983.getClass(), "id", -5476826692763582090L);
        setField(term983, term983.getClass(), "name", "gGSMzuGICf");
        setField(term983, term983.getClass(), "nickName", "hxCBltsObl");
        setField(term983, term983.getClass(), "attribute", "BndsHwAFMv");
        setIntField(term983, term983.getClass(), "charaId", 568599855);
        setField(term983, term983.getClass(), "school", "GzFkzHGYFt");
        setField(term983, term983.getClass(), "gakunen", "tShwQLRGNe");
        setField(term983, term983.getClass(), "rarity", "LvtrsXUliU");
        setField(term983, term983.getClass(), "levelParam", "xLbjWUgOIL");
        setIntField(term983, term983.getClass(), "skillId", 1162663216);
        setIntField(term983, term983.getClass(), "choKaikaSkillId", 1484323161);
        setField(term983, term983.getClass(), "cardNumber", "jDtqGUpnZN");
        setField(term983, term983.getClass(), "version", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term983, args);
    }

};


