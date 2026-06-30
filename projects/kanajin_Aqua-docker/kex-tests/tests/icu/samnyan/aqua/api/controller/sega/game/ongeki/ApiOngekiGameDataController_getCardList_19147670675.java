package icu.samnyan.aqua.api.controller.sega.game.ongeki;

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
import static icu.samnyan.aqua.api.controller.sega.game.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class ApiOngekiGameDataController_getCardList_19147670675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ApiOngekiGameDataController_getCardList_19147670675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term4, term4.getClass(), "id", 2442117782898005296L);
        setField(term4, term4.getClass(), "name", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "nickName", "sjlJAEtRrb");
        setField(term4, term4.getClass(), "attribute", "MuLcgQHgqz");
        setIntField(term4, term4.getClass(), "charaId", 568599855);
        setField(term4, term4.getClass(), "school", "xxtlPwDYFs");
        setField(term4, term4.getClass(), "gakunen", "jJCZpVmanW");
        setField(term4, term4.getClass(), "rarity", "EGtDIRbSSb");
        setField(term4, term4.getClass(), "levelParam", "SzjVpOQTyS");
        setIntField(term4, term4.getClass(), "skillId", 1162663216);
        setIntField(term4, term4.getClass(), "choKaikaSkillId", 1484323161);
        setField(term4, term4.getClass(), "cardNumber", "MjGYSRKTNF");
        setField(term4, term4.getClass(), "version", "hRNSzYYIrc");
        Object term118 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term118, term118.getClass(), "id", 6375119433582206027L);
        setField(term118, term118.getClass(), "name", "");
        setField(term118, term118.getClass(), "nickName", "");
        setField(term118, term118.getClass(), "attribute", "");
        setIntField(term118, term118.getClass(), "charaId", 391863371);
        setField(term118, term118.getClass(), "school", "");
        setField(term118, term118.getClass(), "gakunen", "");
        setField(term118, term118.getClass(), "rarity", "");
        setField(term118, term118.getClass(), "levelParam", "");
        setIntField(term118, term118.getClass(), "skillId", -1922583790);
        setIntField(term118, term118.getClass(), "choKaikaSkillId", -616727354);
        setField(term118, term118.getClass(), "cardNumber", "");
        setField(term118, term118.getClass(), "version", "");
        Object term133 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term133, term133.getClass(), "id", -8257434502486459194L);
        setField(term133, term133.getClass(), "name", null);
        setField(term133, term133.getClass(), "nickName", null);
        setField(term133, term133.getClass(), "attribute", null);
        setIntField(term133, term133.getClass(), "charaId", -1955890973);
        setField(term133, term133.getClass(), "school", null);
        setField(term133, term133.getClass(), "gakunen", null);
        setField(term133, term133.getClass(), "rarity", null);
        setField(term133, term133.getClass(), "levelParam", null);
        setIntField(term133, term133.getClass(), "skillId", -2038273078);
        setIntField(term133, term133.getClass(), "choKaikaSkillId", 1227103734);
        setField(term133, term133.getClass(), "cardNumber", null);
        setField(term133, term133.getClass(), "version", null);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term118);
        ((LinkedList) term1).add(term133);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.controller.sega.game.ongeki.ApiOngekiGameDataController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "getCardList", argTypes, null, args);
    }

};


