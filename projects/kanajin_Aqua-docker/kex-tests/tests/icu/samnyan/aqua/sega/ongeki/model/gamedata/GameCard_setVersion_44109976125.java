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

public class GameCard_setVersion_44109976125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6242;

    public GameCard_setVersion_44109976125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6242 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term6242, term6242.getClass(), "id", 4178434741742309755L);
        setField(term6242, term6242.getClass(), "name", "vvoLrMGCoN");
        setField(term6242, term6242.getClass(), "nickName", "pXdglvyrQe");
        setField(term6242, term6242.getClass(), "attribute", "OcfNzHYdki");
        setIntField(term6242, term6242.getClass(), "charaId", 1375330971);
        setField(term6242, term6242.getClass(), "school", "uPuCVuZYOI");
        setField(term6242, term6242.getClass(), "gakunen", "TweMFhxNdj");
        setField(term6242, term6242.getClass(), "rarity", "NBrvVzvQHe");
        setField(term6242, term6242.getClass(), "levelParam", "FjOiNAfBOc");
        setIntField(term6242, term6242.getClass(), "skillId", -478195677);
        setIntField(term6242, term6242.getClass(), "choKaikaSkillId", 972867650);
        setField(term6242, term6242.getClass(), "cardNumber", "iCCsaLHohG");
        setField(term6242, term6242.getClass(), "version", "NJhGgctbdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MYWYUeLGOp";
        callMethod(klass, "setVersion", argTypes, term6242, args);
    }

};


