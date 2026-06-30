package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OngekiDataExport_init_46289183298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public OngekiDataExport_init_46289183298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.OngekiDataExport");
        Class<?>[] argTypes = new Class<?>[22];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.util.List");
        argTypes[7] = Class.forName("java.util.List");
        argTypes[8] = Class.forName("java.util.List");
        argTypes[9] = Class.forName("java.util.List");
        argTypes[10] = Class.forName("java.util.List");
        argTypes[11] = Class.forName("java.util.List");
        argTypes[12] = Class.forName("java.util.List");
        argTypes[13] = Class.forName("java.util.List");
        argTypes[14] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        argTypes[15] = Class.forName("java.util.List");
        argTypes[16] = Class.forName("java.util.List");
        argTypes[17] = Class.forName("java.util.List");
        argTypes[18] = Class.forName("java.util.List");
        argTypes[19] = Class.forName("java.util.List");
        argTypes[20] = Class.forName("java.util.List");
        argTypes[21] = Class.forName("java.util.List");
        Object[] args = new Object[22];
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
        args[12] = null;
        args[13] = null;
        args[14] = null;
        args[15] = null;
        args[16] = null;
        args[17] = null;
        args[18] = null;
        args[19] = null;
        args[20] = null;
        args[21] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


