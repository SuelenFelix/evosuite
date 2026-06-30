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

public class GameSetting_isBackgroundDistribute_3417073866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4821;

    public GameSetting_isBackgroundDistribute_3417073866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4821 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term4821, term4821.getClass(), "romVersion", "HcUUieXdep");
        setField(term4821, term4821.getClass(), "dataVersion", "AbonCTtbef");
        setBooleanField(term4821, term4821.getClass(), "isMaintenance", true);
        setIntField(term4821, term4821.getClass(), "requestInterval", -1134250665);
        setField(term4821, term4821.getClass(), "rebootStartTime", "maXrGOGoKA");
        setField(term4821, term4821.getClass(), "rebootEndTime", "zAkgWQVCpM");
        setBooleanField(term4821, term4821.getClass(), "isBackgroundDistribute", true);
        setIntField(term4821, term4821.getClass(), "maxCountCharacter", -1607263638);
        setIntField(term4821, term4821.getClass(), "maxCountItem", 691469974);
        setIntField(term4821, term4821.getClass(), "maxCountMusic", -2080503799);
        setField(term4821, term4821.getClass(), "matchStartTime", "yQUDyOroXU");
        setField(term4821, term4821.getClass(), "matchEndTime", "xweqkPdyJH");
        setIntField(term4821, term4821.getClass(), "matchTimeLimit", 13757525);
        setIntField(term4821, term4821.getClass(), "matchErrorLimit", 77853966);
        setField(term4821, term4821.getClass(), "matchingUri", "kwteHWzwcc");
        setField(term4821, term4821.getClass(), "udpHolePunchUri", "uMsWXqNhln");
        setField(term4821, term4821.getClass(), "reflectorUri", "MAnhIPOtHL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBackgroundDistribute", argTypes, term4821, args);
    }

};


