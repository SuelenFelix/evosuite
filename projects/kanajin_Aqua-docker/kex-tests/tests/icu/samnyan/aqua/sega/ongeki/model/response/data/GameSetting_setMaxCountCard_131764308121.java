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

public class GameSetting_setMaxCountCard_131764308121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6076;
     Object term6134;

    public GameSetting_setMaxCountCard_131764308121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6076 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term6076, term6076.getClass(), "dataVersion", "xVFgeyYxZS");
        setField(term6076, term6076.getClass(), "onlineDataVersion", "iQiGTulJiH");
        setBooleanField(term6076, term6076.getClass(), "isMaintenance", true);
        setIntField(term6076, term6076.getClass(), "requestInterval", -2087321012);
        setField(term6076, term6076.getClass(), "rebootStartTime", "utCuuVCKqE");
        setField(term6076, term6076.getClass(), "rebootEndTime", "zSfoqzJbPT");
        setBooleanField(term6076, term6076.getClass(), "isBackgroundDistribute", false);
        setIntField(term6076, term6076.getClass(), "maxCountCharacter", -1613074612);
        setIntField(term6076, term6076.getClass(), "maxCountCard", 1054908502);
        setIntField(term6076, term6076.getClass(), "maxCountItem", -1226802566);
        setIntField(term6076, term6076.getClass(), "maxCountMusic", 1162813858);
        setIntField(term6076, term6076.getClass(), "maxCountMusicItem", 494596414);
        setIntField(term6076, term6076.getClass(), "macCountRivalMusic", 1226377461);
        term6134 = new Integer(-1540486514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6134;
        callMethod(klass, "setMaxCountCard", argTypes, term6076, args);
    }

};


