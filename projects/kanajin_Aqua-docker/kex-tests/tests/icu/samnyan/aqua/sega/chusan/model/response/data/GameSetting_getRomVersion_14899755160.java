package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getRomVersion_14899755160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3579;

    public GameSetting_getRomVersion_14899755160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3579 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term3579, term3579.getClass(), "romVersion", "ReruUQRXwl");
        setField(term3579, term3579.getClass(), "dataVersion", "DWEsVQwuaE");
        setBooleanField(term3579, term3579.getClass(), "isMaintenance", false);
        setIntField(term3579, term3579.getClass(), "requestInterval", 46527533);
        setField(term3579, term3579.getClass(), "rebootStartTime", "qGkNzZAeDN");
        setField(term3579, term3579.getClass(), "rebootEndTime", "wdtiuPgTVJ");
        setBooleanField(term3579, term3579.getClass(), "isBackgroundDistribute", false);
        setIntField(term3579, term3579.getClass(), "maxCountCharacter", 1199950979);
        setIntField(term3579, term3579.getClass(), "maxCountItem", 733812186);
        setIntField(term3579, term3579.getClass(), "maxCountMusic", -840076719);
        setField(term3579, term3579.getClass(), "matchStartTime", "HUgzMgrpsK");
        setField(term3579, term3579.getClass(), "matchEndTime", "ubaBUfLolu");
        setIntField(term3579, term3579.getClass(), "matchTimeLimit", 2002762153);
        setIntField(term3579, term3579.getClass(), "matchErrorLimit", -531666058);
        setField(term3579, term3579.getClass(), "matchingUri", "itAUCFhZhq");
        setField(term3579, term3579.getClass(), "udpHolePunchUri", "bIqaKgXgPm");
        setField(term3579, term3579.getClass(), "reflectorUri", "uOJFOUcNvv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRomVersion", argTypes, term3579, args);
    }

};


