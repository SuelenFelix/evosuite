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

public class GameSetting_setRequestInterval_115341643920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7765;
     Object term7882;

    public GameSetting_setRequestInterval_115341643920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7765 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term7765, term7765.getClass(), "romVersion", "vXiaNiquft");
        setField(term7765, term7765.getClass(), "dataVersion", "lucCeiVnYe");
        setBooleanField(term7765, term7765.getClass(), "isMaintenance", true);
        setIntField(term7765, term7765.getClass(), "requestInterval", -715290594);
        setField(term7765, term7765.getClass(), "rebootStartTime", "iYwkCLMsbJ");
        setField(term7765, term7765.getClass(), "rebootEndTime", "MXLsVQWrwc");
        setBooleanField(term7765, term7765.getClass(), "isBackgroundDistribute", true);
        setIntField(term7765, term7765.getClass(), "maxCountCharacter", -860371306);
        setIntField(term7765, term7765.getClass(), "maxCountItem", -125626789);
        setIntField(term7765, term7765.getClass(), "maxCountMusic", -309827965);
        setField(term7765, term7765.getClass(), "matchStartTime", "lRaSlqzqNY");
        setField(term7765, term7765.getClass(), "matchEndTime", "TiEyxWXsra");
        setIntField(term7765, term7765.getClass(), "matchTimeLimit", -1534471014);
        setIntField(term7765, term7765.getClass(), "matchErrorLimit", -468720148);
        setField(term7765, term7765.getClass(), "matchingUri", "TuLgwTZsPP");
        setField(term7765, term7765.getClass(), "udpHolePunchUri", "KoasxTJGpx");
        setField(term7765, term7765.getClass(), "reflectorUri", "ceGeARYMoa");
        term7882 = new Integer(164755425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7882;
        callMethod(klass, "setRequestInterval", argTypes, term7765, args);
    }

};


