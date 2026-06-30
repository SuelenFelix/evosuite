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

public class Character_setSkills_153821479714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17219;

    public Character_setSkills_153821479714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17219 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term17219, term17219.getClass(), "id", -3948863953565024517L);
        setField(term17219, term17219.getClass(), "name", "wWWidPCHzx");
        setField(term17219, term17219.getClass(), "releaseTag", "OwPIiBRuKK");
        setField(term17219, term17219.getClass(), "worksName", "sgfGySMODT");
        setField(term17219, term17219.getClass(), "illustratorName", "ndAITnOsny");
        setField(term17219, term17219.getClass(), "firstSkillId", "CVZnTiJucs");
        setField(term17219, term17219.getClass(), "skills", "ecHEQufXoq");
        setField(term17219, term17219.getClass(), "addImages", "btBLMvHzJg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JdOMfNWgLP";
        callMethod(klass, "setSkills", argTypes, term17219, args);
    }

};


