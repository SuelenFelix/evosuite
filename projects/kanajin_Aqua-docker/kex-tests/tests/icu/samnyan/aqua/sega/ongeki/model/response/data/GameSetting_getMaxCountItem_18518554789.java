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

public class GameSetting_getMaxCountItem_18518554789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4804;

    public GameSetting_getMaxCountItem_18518554789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4804 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term4804, term4804.getClass(), "dataVersion", "MlPtwXnJOJ");
        setField(term4804, term4804.getClass(), "onlineDataVersion", "DbfiyFeaTe");
        setBooleanField(term4804, term4804.getClass(), "isMaintenance", false);
        setIntField(term4804, term4804.getClass(), "requestInterval", -1640361091);
        setField(term4804, term4804.getClass(), "rebootStartTime", "dQxXGBtDLZ");
        setField(term4804, term4804.getClass(), "rebootEndTime", "EgSgEFIyyN");
        setBooleanField(term4804, term4804.getClass(), "isBackgroundDistribute", false);
        setIntField(term4804, term4804.getClass(), "maxCountCharacter", -1908164516);
        setIntField(term4804, term4804.getClass(), "maxCountCard", -1343269854);
        setIntField(term4804, term4804.getClass(), "maxCountItem", -731459309);
        setIntField(term4804, term4804.getClass(), "maxCountMusic", -913468095);
        setIntField(term4804, term4804.getClass(), "maxCountMusicItem", 38489871);
        setIntField(term4804, term4804.getClass(), "macCountRivalMusic", -1667787735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountItem", argTypes, term4804, args);
    }

};


