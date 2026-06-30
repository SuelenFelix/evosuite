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

public class Character_setIllustratorName_28195051512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16863;

    public Character_setIllustratorName_28195051512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16863 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term16863, term16863.getClass(), "id", 8034714140377562739L);
        setField(term16863, term16863.getClass(), "name", "jlraKkBWFA");
        setField(term16863, term16863.getClass(), "releaseTag", "mRBtFTxVdE");
        setField(term16863, term16863.getClass(), "worksName", "IVacFDAZcj");
        setField(term16863, term16863.getClass(), "illustratorName", "EEYmuwyVDP");
        setField(term16863, term16863.getClass(), "firstSkillId", "EWFbEDAVrE");
        setField(term16863, term16863.getClass(), "skills", "EMiMtYgfvr");
        setField(term16863, term16863.getClass(), "addImages", "OyYyYYnJuF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aYLvcxZohT";
        callMethod(klass, "setIllustratorName", argTypes, term16863, args);
    }

};


