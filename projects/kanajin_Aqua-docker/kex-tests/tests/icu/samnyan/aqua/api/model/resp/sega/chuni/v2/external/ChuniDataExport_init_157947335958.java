package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChuniDataExport_init_157947335958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ChuniDataExport_init_157947335958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ChuniDataExport");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.util.List");
        argTypes[7] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserGameOption");
        argTypes[8] = Class.forName("java.util.List");
        argTypes[9] = Class.forName("java.util.List");
        argTypes[10] = Class.forName("java.util.List");
        argTypes[11] = Class.forName("java.util.List");
        Object[] args = new Object[12];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        args[11] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


