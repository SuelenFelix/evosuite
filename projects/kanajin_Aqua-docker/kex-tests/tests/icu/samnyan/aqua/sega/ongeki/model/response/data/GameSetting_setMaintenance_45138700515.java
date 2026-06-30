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
import java.lang.Boolean;

public class GameSetting_setMaintenance_45138700515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5436;
     Object term5494;

    public GameSetting_setMaintenance_45138700515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5436 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term5436, term5436.getClass(), "dataVersion", "HvxahUfZcJ");
        setField(term5436, term5436.getClass(), "onlineDataVersion", "WkLpmqoQxy");
        setBooleanField(term5436, term5436.getClass(), "isMaintenance", true);
        setIntField(term5436, term5436.getClass(), "requestInterval", 360715062);
        setField(term5436, term5436.getClass(), "rebootStartTime", "XiNoscmYhd");
        setField(term5436, term5436.getClass(), "rebootEndTime", "asMqnMNrZp");
        setBooleanField(term5436, term5436.getClass(), "isBackgroundDistribute", false);
        setIntField(term5436, term5436.getClass(), "maxCountCharacter", 1047409266);
        setIntField(term5436, term5436.getClass(), "maxCountCard", 1427248961);
        setIntField(term5436, term5436.getClass(), "maxCountItem", 1445291866);
        setIntField(term5436, term5436.getClass(), "maxCountMusic", -139927812);
        setIntField(term5436, term5436.getClass(), "maxCountMusicItem", -2065157320);
        setIntField(term5436, term5436.getClass(), "macCountRivalMusic", 1782011477);
        term5494 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5494;
        callMethod(klass, "setMaintenance", argTypes, term5436, args);
    }

};


