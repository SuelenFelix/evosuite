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

public class GameSetting_setMatchingUri_178663507331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10144;

    public GameSetting_setMatchingUri_178663507331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10144 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term10144, term10144.getClass(), "romVersion", "YyojIzvxLZ");
        setField(term10144, term10144.getClass(), "dataVersion", "fxapaYlZea");
        setBooleanField(term10144, term10144.getClass(), "isMaintenance", true);
        setIntField(term10144, term10144.getClass(), "requestInterval", -1610494666);
        setField(term10144, term10144.getClass(), "rebootStartTime", "VJgREHwfRM");
        setField(term10144, term10144.getClass(), "rebootEndTime", "kXnpLIZTAr");
        setBooleanField(term10144, term10144.getClass(), "isBackgroundDistribute", true);
        setIntField(term10144, term10144.getClass(), "maxCountCharacter", 564476854);
        setIntField(term10144, term10144.getClass(), "maxCountItem", 963238257);
        setIntField(term10144, term10144.getClass(), "maxCountMusic", 1819563159);
        setField(term10144, term10144.getClass(), "matchStartTime", "ZiMAmqpbzk");
        setField(term10144, term10144.getClass(), "matchEndTime", "UwJtBPAtSU");
        setIntField(term10144, term10144.getClass(), "matchTimeLimit", -131038479);
        setIntField(term10144, term10144.getClass(), "matchErrorLimit", 1690337049);
        setField(term10144, term10144.getClass(), "matchingUri", "nBaMiSdFmS");
        setField(term10144, term10144.getClass(), "udpHolePunchUri", "ezwGsjqTai");
        setField(term10144, term10144.getClass(), "reflectorUri", "ngeHWMRjnn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FOKfDXQxMM";
        callMethod(klass, "setMatchingUri", argTypes, term10144, args);
    }

};


