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

public class GameMusic_setSortName_52400691514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14535;

    public GameMusic_setSortName_52400691514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14535 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term14535, term14535.getClass(), "id", 6005241913654469005L);
        setField(term14535, term14535.getClass(), "name", "UDlkdccCRn");
        setField(term14535, term14535.getClass(), "sortName", "McpzErOcYb");
        setField(term14535, term14535.getClass(), "artistName", "jqrVEUvYEz");
        setField(term14535, term14535.getClass(), "genre", "QITgiBrmfj");
        setIntField(term14535, term14535.getClass(), "bossCardId", -2015048153);
        setIntField(term14535, term14535.getClass(), "bossLevel", -2063457669);
        setField(term14535, term14535.getClass(), "level0", "pXxkiXgQnq");
        setField(term14535, term14535.getClass(), "level1", "tKmrUDURku");
        setField(term14535, term14535.getClass(), "level2", "JeZbrwZmsP");
        setField(term14535, term14535.getClass(), "level3", "bxyfeicqrK");
        setField(term14535, term14535.getClass(), "level4", "vBnWPlsZMk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fIZsWucfXz";
        callMethod(klass, "setSortName", argTypes, term14535, args);
    }

};


