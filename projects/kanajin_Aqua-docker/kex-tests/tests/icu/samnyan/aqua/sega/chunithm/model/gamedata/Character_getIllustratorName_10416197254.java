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

public class Character_getIllustratorName_10416197254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15547;

    public Character_getIllustratorName_10416197254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15547 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term15547, term15547.getClass(), "id", 7489064039921396098L);
        setField(term15547, term15547.getClass(), "name", "jQWttOAiwL");
        setField(term15547, term15547.getClass(), "releaseTag", "DzKFxEuEEC");
        setField(term15547, term15547.getClass(), "worksName", "CAMnvfDLJL");
        setField(term15547, term15547.getClass(), "illustratorName", "mfHtgSbdjD");
        setField(term15547, term15547.getClass(), "firstSkillId", "cmuaUiHMVL");
        setField(term15547, term15547.getClass(), "skills", "xjoSGPWUgu");
        setField(term15547, term15547.getClass(), "addImages", "uzmqjnOUXu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIllustratorName", argTypes, term15547, args);
    }

};


