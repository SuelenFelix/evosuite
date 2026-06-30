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

public class GameSetting_getMatchTimeLimit_141639763212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6063;

    public GameSetting_getMatchTimeLimit_141639763212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6063 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term6063, term6063.getClass(), "romVersion", "UsxeLMVkAK");
        setField(term6063, term6063.getClass(), "dataVersion", "ITrhiKKzcb");
        setBooleanField(term6063, term6063.getClass(), "isMaintenance", false);
        setIntField(term6063, term6063.getClass(), "requestInterval", 802196878);
        setField(term6063, term6063.getClass(), "rebootStartTime", "qMKmSzOQXg");
        setField(term6063, term6063.getClass(), "rebootEndTime", "CURQCMkqbZ");
        setBooleanField(term6063, term6063.getClass(), "isBackgroundDistribute", false);
        setIntField(term6063, term6063.getClass(), "maxCountCharacter", -174401540);
        setIntField(term6063, term6063.getClass(), "maxCountItem", -1881073314);
        setIntField(term6063, term6063.getClass(), "maxCountMusic", -1902513009);
        setField(term6063, term6063.getClass(), "matchStartTime", "VZwkkQktrm");
        setField(term6063, term6063.getClass(), "matchEndTime", "wIuJvIvEMb");
        setIntField(term6063, term6063.getClass(), "matchTimeLimit", 1810303681);
        setIntField(term6063, term6063.getClass(), "matchErrorLimit", 1374798468);
        setField(term6063, term6063.getClass(), "matchingUri", "EyojsbSjWT");
        setField(term6063, term6063.getClass(), "udpHolePunchUri", "szGicGyWDL");
        setField(term6063, term6063.getClass(), "reflectorUri", "lkdvUiYwRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchTimeLimit", argTypes, term6063, args);
    }

};


