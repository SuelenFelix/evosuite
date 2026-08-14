package ru.smartup.timetracker.service.freeze;

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
import static ru.smartup.timetracker.service.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FreezeSchedulePlanner_runNewFreeze_16716285742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2017;

    public FreezeSchedulePlanner_runNewFreeze_16716285742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2017 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term2018 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term2019 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term2020 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2022 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term2023 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2017, term2017.getClass(), "crudFreezeService", null);
        setField(term2020, term2020.getClass(), "id", "");
        setField(term2022, term2022.getClass(), "standardTransitions", null);
        setField(term2022, term2022.getClass(), "standardOffsets", null);
        setField(term2022, term2022.getClass(), "savingsInstantTransitions", null);
        setField(term2022, term2022.getClass(), "savingsLocalTransitions", null);
        setField(term2022, term2022.getClass(), "wallOffsets", null);
        setField(term2022, term2022.getClass(), "lastRules", null);
        setField(term2022, term2022.getClass(), "lastRulesCache", null);
        setField(term2020, term2020.getClass(), "rules", term2022);
        setField(term2019, term2019.getClass(), "timeZone", term2020);
        setByteField(term2023, term2023.getClass(), "hour", (byte) 4);
        setByteField(term2023, term2023.getClass(), "minute", (byte) 46);
        setByteField(term2023, term2023.getClass(), "second", (byte) 12);
        setIntField(term2023, term2023.getClass(), "nano", 580494898);
        setField(term2019, term2019.getClass(), "fixedTimeFreeze", term2023);
        setIntField(term2019, term2019.getClass(), "dayToUnfreeze", -916584829);
        setField(term2018, term2018.getClass(), "freezeProperties", term2019);
        setField(term2017, term2017.getClass(), "freezeDateUtils", term2018);
        setField(term2017, term2017.getClass(), "freezeScheduler", null);
        setField(term2017, term2017.getClass(), "trackUnitService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "runNewFreeze", argTypes, term2017, args);
    }

};


