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

public class GameSetting_getMaxCountCharacter_21345175027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4608;

    public GameSetting_getMaxCountCharacter_21345175027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4608 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term4608, term4608.getClass(), "dataVersion", "POPYycoDBy");
        setField(term4608, term4608.getClass(), "onlineDataVersion", "LuWMOXdAPA");
        setBooleanField(term4608, term4608.getClass(), "isMaintenance", false);
        setIntField(term4608, term4608.getClass(), "requestInterval", -161850441);
        setField(term4608, term4608.getClass(), "rebootStartTime", "blSffTnsOv");
        setField(term4608, term4608.getClass(), "rebootEndTime", "qbUMcIvEXH");
        setBooleanField(term4608, term4608.getClass(), "isBackgroundDistribute", false);
        setIntField(term4608, term4608.getClass(), "maxCountCharacter", 1486351894);
        setIntField(term4608, term4608.getClass(), "maxCountCard", 1352463113);
        setIntField(term4608, term4608.getClass(), "maxCountItem", 897269648);
        setIntField(term4608, term4608.getClass(), "maxCountMusic", -1020664075);
        setIntField(term4608, term4608.getClass(), "maxCountMusicItem", -1412100145);
        setIntField(term4608, term4608.getClass(), "macCountRivalMusic", -1702355599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountCharacter", argTypes, term4608, args);
    }

};


