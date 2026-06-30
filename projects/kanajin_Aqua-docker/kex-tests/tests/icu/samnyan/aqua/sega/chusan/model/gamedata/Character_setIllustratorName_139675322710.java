package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Character_setIllustratorName_139675322710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3851;

    public Character_setIllustratorName_139675322710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3851 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character"));
        setLongField(term3851, term3851.getClass(), "id", 4044358158040652353L);
        setField(term3851, term3851.getClass(), "name", "jSpAteRute");
        setField(term3851, term3851.getClass(), "releaseTag", "swZVeJAxjt");
        setField(term3851, term3851.getClass(), "worksName", "xOcJIiQQDu");
        setField(term3851, term3851.getClass(), "illustratorName", "GVizqqzXpy");
        setField(term3851, term3851.getClass(), "addImages", "JqXGgAhZPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jiKYgYHqIS";
        callMethod(klass, "setIllustratorName", argTypes, term3851, args);
    }

};


