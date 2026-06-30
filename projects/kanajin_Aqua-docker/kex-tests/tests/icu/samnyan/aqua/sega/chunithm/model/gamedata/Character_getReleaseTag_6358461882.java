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

public class Character_getReleaseTag_6358461882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15235;

    public Character_getReleaseTag_6358461882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15235 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term15235, term15235.getClass(), "id", -2255965562447970862L);
        setField(term15235, term15235.getClass(), "name", "ktbqerIaKW");
        setField(term15235, term15235.getClass(), "releaseTag", "VoghngXfsK");
        setField(term15235, term15235.getClass(), "worksName", "GbahCBMvct");
        setField(term15235, term15235.getClass(), "illustratorName", "iiHBhsNFgk");
        setField(term15235, term15235.getClass(), "firstSkillId", "HknsTajwxJ");
        setField(term15235, term15235.getClass(), "skills", "XtiurrVYKw");
        setField(term15235, term15235.getClass(), "addImages", "rsumfoDNHa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseTag", argTypes, term15235, args);
    }

};


