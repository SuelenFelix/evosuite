package icu.samnyan.aqua.sega.chunithm.model.response;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class GetGameSettingResp_setAou_194313459117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26842;
     Object term26845;

    public GetGameSettingResp_setAou_194313459117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26842 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        setField(term26842, term26842.getClass(), "gameSetting", null);
        setBooleanField(term26842, term26842.getClass(), "isDumpUpload", false);
        setBooleanField(term26842, term26842.getClass(), "isAou", false);
        term26845 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term26845;
        callMethod(klass, "setAou", argTypes, term26842, args);
    }

};


