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
import java.lang.Integer;

public class PowerOnResponseV2_setStat_176003395722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22831;
     Object term23007;

    public PowerOnResponseV2_setStat_176003395722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22831 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term22831, term22831.getClass(), "stat", 389427431);
        setField(term22831, term22831.getClass(), "uri", "yLnzGqyHGL");
        setField(term22831, term22831.getClass(), "host", "IjprPXBDuY");
        setField(term22831, term22831.getClass(), "place_id", "wkqPmmFDAa");
        setField(term22831, term22831.getClass(), "name", "rLTDtNqLyW");
        setField(term22831, term22831.getClass(), "nickname", "CLsbWobdgS");
        setField(term22831, term22831.getClass(), "region0", "TbYrjEyFPc");
        setField(term22831, term22831.getClass(), "region_name0", "muefchpJiZ");
        setField(term22831, term22831.getClass(), "region_name1", "tuYaAqvYrh");
        setField(term22831, term22831.getClass(), "region_name2", "CIbhheukbR");
        setField(term22831, term22831.getClass(), "region_name3", "VOHPpErtan");
        setField(term22831, term22831.getClass(), "country", "GDMUlolTNs");
        setIntField(term22831, term22831.getClass(), "year", -1945706126);
        setIntField(term22831, term22831.getClass(), "month", 1152356969);
        setIntField(term22831, term22831.getClass(), "day", -1667990367);
        setIntField(term22831, term22831.getClass(), "hour", -1214628358);
        setIntField(term22831, term22831.getClass(), "minute", 1102721075);
        setIntField(term22831, term22831.getClass(), "second", -426764678);
        setField(term22831, term22831.getClass(), "setting", "xpLvWisjzN");
        setField(term22831, term22831.getClass(), "timezone", "IKfozyyKEj");
        setField(term22831, term22831.getClass(), "res_class", "thCjwQjRBL");
        term23007 = new Integer(-1222614956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23007;
        callMethod(klass, "setStat", argTypes, term22831, args);
    }

};


