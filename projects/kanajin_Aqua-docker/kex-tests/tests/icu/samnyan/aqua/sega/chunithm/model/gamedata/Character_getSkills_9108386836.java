package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Character_getSkills_9108386836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15859;

    public Character_getSkills_9108386836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15859 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term15859, term15859.getClass(), "id", -4023935540989049732L);
        setField(term15859, term15859.getClass(), "name", "NWldOLAbqk");
        setField(term15859, term15859.getClass(), "releaseTag", "qnYaYSpDwO");
        setField(term15859, term15859.getClass(), "worksName", "dgbFDCdHtj");
        setField(term15859, term15859.getClass(), "illustratorName", "EKpdCBubDE");
        setField(term15859, term15859.getClass(), "firstSkillId", "zMsSLTfGhl");
        setField(term15859, term15859.getClass(), "skills", "bEmHScVZaQ");
        setField(term15859, term15859.getClass(), "addImages", "TcuXODkzBV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkills", argTypes, term15859, args);
    }

};


