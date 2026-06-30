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

public class GameCard_getAttribute_8369326273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1592;

    public GameCard_getAttribute_8369326273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1592 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard"));
        setLongField(term1592, term1592.getClass(), "id", 5127676408959197577L);
        setField(term1592, term1592.getClass(), "name", "bLPjGVBhlX");
        setField(term1592, term1592.getClass(), "nickName", "whBvTVIIlC");
        setField(term1592, term1592.getClass(), "attribute", "IgRJUzaCwW");
        setIntField(term1592, term1592.getClass(), "charaId", -1339778481);
        setField(term1592, term1592.getClass(), "school", "JUmudUmaaV");
        setField(term1592, term1592.getClass(), "gakunen", "KoyGrUJeJW");
        setField(term1592, term1592.getClass(), "rarity", "HqBOwkVqjD");
        setField(term1592, term1592.getClass(), "levelParam", "MAcUBcBckh");
        setIntField(term1592, term1592.getClass(), "skillId", 1725571209);
        setIntField(term1592, term1592.getClass(), "choKaikaSkillId", -522618178);
        setField(term1592, term1592.getClass(), "cardNumber", "oVgzLbrsFr");
        setField(term1592, term1592.getClass(), "version", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttribute", argTypes, term1592, args);
    }

};


