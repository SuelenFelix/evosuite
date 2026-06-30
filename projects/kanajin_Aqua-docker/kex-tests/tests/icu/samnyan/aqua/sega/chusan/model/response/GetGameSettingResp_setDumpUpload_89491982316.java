package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class GetGameSettingResp_setDumpUpload_89491982316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55883;
     Object term55886;

    public GetGameSettingResp_setDumpUpload_89491982316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55883 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        setField(term55883, term55883.getClass(), "gameSetting", null);
        setBooleanField(term55883, term55883.getClass(), "isDumpUpload", false);
        setBooleanField(term55883, term55883.getClass(), "isAou", false);
        term55886 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term55886;
        callMethod(klass, "setDumpUpload", argTypes, term55883, args);
    }

};


