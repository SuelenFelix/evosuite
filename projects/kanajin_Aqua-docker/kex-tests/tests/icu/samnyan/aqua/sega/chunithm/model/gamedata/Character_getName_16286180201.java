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

public class Character_getName_16286180201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15079;

    public Character_getName_16286180201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15079 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term15079, term15079.getClass(), "id", -6432617521836576658L);
        setField(term15079, term15079.getClass(), "name", "UxgSdhxPCH");
        setField(term15079, term15079.getClass(), "releaseTag", "DAujxZPHJC");
        setField(term15079, term15079.getClass(), "worksName", "IlBhdrCvHq");
        setField(term15079, term15079.getClass(), "illustratorName", "OirVUQhauU");
        setField(term15079, term15079.getClass(), "firstSkillId", "GLbyDfbNZI");
        setField(term15079, term15079.getClass(), "skills", "oNLcCYDAsO");
        setField(term15079, term15079.getClass(), "addImages", "CNqMxLvtcJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term15079, args);
    }

};


