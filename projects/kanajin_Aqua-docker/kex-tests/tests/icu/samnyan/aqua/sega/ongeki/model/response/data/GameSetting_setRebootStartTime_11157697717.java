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

public class GameSetting_setRebootStartTime_11157697717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5636;

    public GameSetting_setRebootStartTime_11157697717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5636 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term5636, term5636.getClass(), "dataVersion", "QVLresHoaP");
        setField(term5636, term5636.getClass(), "onlineDataVersion", "IbxeAMwLVt");
        setBooleanField(term5636, term5636.getClass(), "isMaintenance", false);
        setIntField(term5636, term5636.getClass(), "requestInterval", -1298688401);
        setField(term5636, term5636.getClass(), "rebootStartTime", "bShlAqoTmZ");
        setField(term5636, term5636.getClass(), "rebootEndTime", "nOKlKlNhtU");
        setBooleanField(term5636, term5636.getClass(), "isBackgroundDistribute", false);
        setIntField(term5636, term5636.getClass(), "maxCountCharacter", 1907832341);
        setIntField(term5636, term5636.getClass(), "maxCountCard", 932199784);
        setIntField(term5636, term5636.getClass(), "maxCountItem", 1953620444);
        setIntField(term5636, term5636.getClass(), "maxCountMusic", -1111307978);
        setIntField(term5636, term5636.getClass(), "maxCountMusicItem", 609697271);
        setIntField(term5636, term5636.getClass(), "macCountRivalMusic", 1121247998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gXFNBHJSey";
        callMethod(klass, "setRebootStartTime", argTypes, term5636, args);
    }

};


