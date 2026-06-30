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

public class GameSetting_setRebootEndTime_189681793322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8203;

    public GameSetting_setRebootEndTime_189681793322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8203 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term8203, term8203.getClass(), "romVersion", "YEkxWsWaUl");
        setField(term8203, term8203.getClass(), "dataVersion", "RINhPkhhct");
        setBooleanField(term8203, term8203.getClass(), "isMaintenance", true);
        setIntField(term8203, term8203.getClass(), "requestInterval", 1780832439);
        setField(term8203, term8203.getClass(), "rebootStartTime", "vjNPcTSqmS");
        setField(term8203, term8203.getClass(), "rebootEndTime", "fFhdWuJbdC");
        setBooleanField(term8203, term8203.getClass(), "isBackgroundDistribute", true);
        setIntField(term8203, term8203.getClass(), "maxCountCharacter", 1781593194);
        setIntField(term8203, term8203.getClass(), "maxCountItem", -929366947);
        setIntField(term8203, term8203.getClass(), "maxCountMusic", -10579292);
        setField(term8203, term8203.getClass(), "matchStartTime", "JlgLIHPabR");
        setField(term8203, term8203.getClass(), "matchEndTime", "LHnkeoNwHq");
        setIntField(term8203, term8203.getClass(), "matchTimeLimit", 2042788478);
        setIntField(term8203, term8203.getClass(), "matchErrorLimit", -620591021);
        setField(term8203, term8203.getClass(), "matchingUri", "gVnDVbSyKa");
        setField(term8203, term8203.getClass(), "udpHolePunchUri", "kdCYNMSuoD");
        setField(term8203, term8203.getClass(), "reflectorUri", "eRYlSLwtvV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "duOyJsARTD";
        callMethod(klass, "setRebootEndTime", argTypes, term8203, args);
    }

};


