package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameSetting_setMaxCountItem_150658625222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6176;
     Object term6234;

    public GameSetting_setMaxCountItem_150658625222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6176 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term6176, term6176.getClass(), "dataVersion", "QUymMnsCIj");
        setField(term6176, term6176.getClass(), "onlineDataVersion", "ikTtOgdVYS");
        setBooleanField(term6176, term6176.getClass(), "isMaintenance", false);
        setIntField(term6176, term6176.getClass(), "requestInterval", 1471031478);
        setField(term6176, term6176.getClass(), "rebootStartTime", "JptuwlirlS");
        setField(term6176, term6176.getClass(), "rebootEndTime", "TKOMaGswbU");
        setBooleanField(term6176, term6176.getClass(), "isBackgroundDistribute", false);
        setIntField(term6176, term6176.getClass(), "maxCountCharacter", -334716487);
        setIntField(term6176, term6176.getClass(), "maxCountCard", -1739012814);
        setIntField(term6176, term6176.getClass(), "maxCountItem", 1989014880);
        setIntField(term6176, term6176.getClass(), "maxCountMusic", -330280702);
        setIntField(term6176, term6176.getClass(), "maxCountMusicItem", -1858425735);
        setIntField(term6176, term6176.getClass(), "macCountRivalMusic", 1818274550);
        term6234 = new Integer(1044519085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6234;
        callMethod(klass, "setMaxCountItem", argTypes, term6176, args);
    }

};


