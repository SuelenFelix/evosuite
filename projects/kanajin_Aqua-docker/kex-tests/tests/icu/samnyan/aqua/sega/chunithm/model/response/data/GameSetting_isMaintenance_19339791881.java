package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_isMaintenance_19339791881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607;

    public GameSetting_isMaintenance_19339791881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term607 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term607, term607.getClass(), "dataVersion", 1063420942);
        setBooleanField(term607, term607.getClass(), "isMaintenance", false);
        setIntField(term607, term607.getClass(), "requestInterval", 1375330971);
        setField(term607, term607.getClass(), "rebootStartTime", "MuLcgQHgqz");
        setField(term607, term607.getClass(), "rebootEndTime", "xxtlPwDYFs");
        setBooleanField(term607, term607.getClass(), "isBackgroundDistribute", false);
        setIntField(term607, term607.getClass(), "maxCountCharacter", -478195677);
        setIntField(term607, term607.getClass(), "maxCountItem", 972867650);
        setIntField(term607, term607.getClass(), "maxCountMusic", 1655935355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaintenance", argTypes, term607, args);
    }

};


