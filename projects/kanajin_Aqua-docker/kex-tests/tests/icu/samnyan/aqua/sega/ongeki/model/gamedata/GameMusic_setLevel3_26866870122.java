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

public class GameMusic_setLevel3_26866870122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16287;

    public GameMusic_setLevel3_26866870122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16287 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term16287, term16287.getClass(), "id", 846579494941632714L);
        setField(term16287, term16287.getClass(), "name", "PbLgCSAHce");
        setField(term16287, term16287.getClass(), "sortName", "NWldOLAbqk");
        setField(term16287, term16287.getClass(), "artistName", "qnYaYSpDwO");
        setField(term16287, term16287.getClass(), "genre", "dgbFDCdHtj");
        setIntField(term16287, term16287.getClass(), "bossCardId", 1830648570);
        setIntField(term16287, term16287.getClass(), "bossLevel", -227365013);
        setField(term16287, term16287.getClass(), "level0", "EKpdCBubDE");
        setField(term16287, term16287.getClass(), "level1", "zMsSLTfGhl");
        setField(term16287, term16287.getClass(), "level2", "bEmHScVZaQ");
        setField(term16287, term16287.getClass(), "level3", "TcuXODkzBV");
        setField(term16287, term16287.getClass(), "level4", "coJPjrBZNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vMsWjuPTnO";
        callMethod(klass, "setLevel3", argTypes, term16287, args);
    }

};


