package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV2_setUri_109493967023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23149;

    public PowerOnResponseV2_setUri_109493967023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23149 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term23149, term23149.getClass(), "stat", -1870495012);
        setField(term23149, term23149.getClass(), "uri", "ojLrjltndD");
        setField(term23149, term23149.getClass(), "host", "VJtFSexKat");
        setField(term23149, term23149.getClass(), "place_id", "xPVddlPSQR");
        setField(term23149, term23149.getClass(), "name", "MxrhCLTMTH");
        setField(term23149, term23149.getClass(), "nickname", "kEehLMZcOU");
        setField(term23149, term23149.getClass(), "region0", "RhLliqMiOF");
        setField(term23149, term23149.getClass(), "region_name0", "jlhonEGrJH");
        setField(term23149, term23149.getClass(), "region_name1", "RKcKwlEYZb");
        setField(term23149, term23149.getClass(), "region_name2", "acPRDlpsid");
        setField(term23149, term23149.getClass(), "region_name3", "YyojIzvxLZ");
        setField(term23149, term23149.getClass(), "country", "fxapaYlZea");
        setIntField(term23149, term23149.getClass(), "year", -1310015129);
        setIntField(term23149, term23149.getClass(), "month", -2104981311);
        setIntField(term23149, term23149.getClass(), "day", -571169753);
        setIntField(term23149, term23149.getClass(), "hour", 318591690);
        setIntField(term23149, term23149.getClass(), "minute", -165587447);
        setIntField(term23149, term23149.getClass(), "second", -1347358701);
        setField(term23149, term23149.getClass(), "setting", "VJgREHwfRM");
        setField(term23149, term23149.getClass(), "timezone", "kXnpLIZTAr");
        setField(term23149, term23149.getClass(), "res_class", "ZiMAmqpbzk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UwJtBPAtSU";
        callMethod(klass, "setUri", argTypes, term23149, args);
    }

};


