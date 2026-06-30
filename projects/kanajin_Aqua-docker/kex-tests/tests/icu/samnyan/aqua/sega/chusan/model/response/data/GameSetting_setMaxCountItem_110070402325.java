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
import java.lang.Integer;

public class GameSetting_setMaxCountItem_110070402325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8850;
     Object term8967;

    public GameSetting_setMaxCountItem_110070402325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8850 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term8850, term8850.getClass(), "romVersion", "bOUAgAptAI");
        setField(term8850, term8850.getClass(), "dataVersion", "KSZfGbvzPE");
        setBooleanField(term8850, term8850.getClass(), "isMaintenance", false);
        setIntField(term8850, term8850.getClass(), "requestInterval", -1778687889);
        setField(term8850, term8850.getClass(), "rebootStartTime", "YfgYGgzYER");
        setField(term8850, term8850.getClass(), "rebootEndTime", "IDClvDZuqE");
        setBooleanField(term8850, term8850.getClass(), "isBackgroundDistribute", false);
        setIntField(term8850, term8850.getClass(), "maxCountCharacter", -1827662352);
        setIntField(term8850, term8850.getClass(), "maxCountItem", -1292290537);
        setIntField(term8850, term8850.getClass(), "maxCountMusic", 1060963259);
        setField(term8850, term8850.getClass(), "matchStartTime", "cMvKxpZOvg");
        setField(term8850, term8850.getClass(), "matchEndTime", "WWBYemIuiK");
        setIntField(term8850, term8850.getClass(), "matchTimeLimit", -1275604693);
        setIntField(term8850, term8850.getClass(), "matchErrorLimit", 455869012);
        setField(term8850, term8850.getClass(), "matchingUri", "nHYQYkycCR");
        setField(term8850, term8850.getClass(), "udpHolePunchUri", "yBiVacDcZX");
        setField(term8850, term8850.getClass(), "reflectorUri", "QrKfEgQeoy");
        term8967 = new Integer(782841747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8967;
        callMethod(klass, "setMaxCountItem", argTypes, term8850, args);
    }

};


