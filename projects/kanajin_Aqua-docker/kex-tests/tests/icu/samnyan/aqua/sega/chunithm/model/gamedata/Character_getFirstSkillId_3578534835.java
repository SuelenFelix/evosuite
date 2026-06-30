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

public class Character_getFirstSkillId_3578534835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15703;

    public Character_getFirstSkillId_3578534835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15703 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term15703, term15703.getClass(), "id", 6843866297465638866L);
        setField(term15703, term15703.getClass(), "name", "xeyjTOCOJb");
        setField(term15703, term15703.getClass(), "releaseTag", "DGRqjjdhzy");
        setField(term15703, term15703.getClass(), "worksName", "lQFkjJUPAR");
        setField(term15703, term15703.getClass(), "illustratorName", "BsuVlGUUjV");
        setField(term15703, term15703.getClass(), "firstSkillId", "bHHjfDCntT");
        setField(term15703, term15703.getClass(), "skills", "sEphiduvkv");
        setField(term15703, term15703.getClass(), "addImages", "PbLgCSAHce");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstSkillId", argTypes, term15703, args);
    }

};


