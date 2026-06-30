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

public class GameSetting_setRomVersion_135527065217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7098;

    public GameSetting_setRomVersion_135527065217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7098 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term7098, term7098.getClass(), "romVersion", "scpIQUfPKw");
        setField(term7098, term7098.getClass(), "dataVersion", "QKYBpCjuYt");
        setBooleanField(term7098, term7098.getClass(), "isMaintenance", true);
        setIntField(term7098, term7098.getClass(), "requestInterval", -1997574107);
        setField(term7098, term7098.getClass(), "rebootStartTime", "vjiRfoGdkl");
        setField(term7098, term7098.getClass(), "rebootEndTime", "TwaxeSHvnR");
        setBooleanField(term7098, term7098.getClass(), "isBackgroundDistribute", true);
        setIntField(term7098, term7098.getClass(), "maxCountCharacter", 748487022);
        setIntField(term7098, term7098.getClass(), "maxCountItem", -706230330);
        setIntField(term7098, term7098.getClass(), "maxCountMusic", -926446006);
        setField(term7098, term7098.getClass(), "matchStartTime", "paPzDETzIq");
        setField(term7098, term7098.getClass(), "matchEndTime", "fufeuGfwpN");
        setIntField(term7098, term7098.getClass(), "matchTimeLimit", 572417171);
        setIntField(term7098, term7098.getClass(), "matchErrorLimit", 46222099);
        setField(term7098, term7098.getClass(), "matchingUri", "XJbkXbljvz");
        setField(term7098, term7098.getClass(), "udpHolePunchUri", "fuvdkDwBeH");
        setField(term7098, term7098.getClass(), "reflectorUri", "NTefzwLPhx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dirFuhqyNu";
        callMethod(klass, "setRomVersion", argTypes, term7098, args);
    }

};


