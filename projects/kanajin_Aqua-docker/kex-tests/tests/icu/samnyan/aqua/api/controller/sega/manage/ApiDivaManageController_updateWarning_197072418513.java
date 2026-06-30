package icu.samnyan.aqua.api.controller.sega.manage;

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
import static icu.samnyan.aqua.api.controller.sega.manage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ApiDivaManageController_updateWarning_197072418513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2291;

    public ApiDivaManageController_updateWarning_197072418513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2291 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.PropertyEntry"));
        setLongField(term2291, term2291.getClass(), "id", 6375119433582206027L);
        setField(term2291, term2291.getClass(), "propertyKey", "aJlieCFVtF");
        setField(term2291, term2291.getClass(), "propertyValue", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.controller.sega.manage.ApiDivaManageController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.PropertyEntry");
        Object[] args = new Object[1];
        args[0] = term2291;
        callMethod(klass, "updateWarning", argTypes, null, args);
    }

};


