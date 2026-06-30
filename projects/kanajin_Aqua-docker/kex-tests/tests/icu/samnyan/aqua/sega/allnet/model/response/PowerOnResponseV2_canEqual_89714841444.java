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

public class PowerOnResponseV2_canEqual_89714841444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30106;
     Object term30282;

    public PowerOnResponseV2_canEqual_89714841444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30106 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term30106, term30106.getClass(), "stat", 844222656);
        setField(term30106, term30106.getClass(), "uri", "kSGsHNQQoW");
        setField(term30106, term30106.getClass(), "host", "MWezlyjdaG");
        setField(term30106, term30106.getClass(), "place_id", "drpBJuEKQG");
        setField(term30106, term30106.getClass(), "name", "GGpORnLrOW");
        setField(term30106, term30106.getClass(), "nickname", "gDGZwlpOZx");
        setField(term30106, term30106.getClass(), "region0", "gkDpxkHPDg");
        setField(term30106, term30106.getClass(), "region_name0", "pADwkrWiMW");
        setField(term30106, term30106.getClass(), "region_name1", "FDORDJuAXQ");
        setField(term30106, term30106.getClass(), "region_name2", "yjqoDeLBLg");
        setField(term30106, term30106.getClass(), "region_name3", "DCepDqVwas");
        setField(term30106, term30106.getClass(), "country", "wKIBUlfNCx");
        setIntField(term30106, term30106.getClass(), "year", -18216811);
        setIntField(term30106, term30106.getClass(), "month", -1813280137);
        setIntField(term30106, term30106.getClass(), "day", 719656595);
        setIntField(term30106, term30106.getClass(), "hour", -1516995753);
        setIntField(term30106, term30106.getClass(), "minute", -390501023);
        setIntField(term30106, term30106.getClass(), "second", -1667482829);
        setField(term30106, term30106.getClass(), "setting", "iGfMUWRvod");
        setField(term30106, term30106.getClass(), "timezone", "zUXaSvayQe");
        setField(term30106, term30106.getClass(), "res_class", "bPVcnnQPSC");
        term30282 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30282;
        callMethod(klass, "canEqual", argTypes, term30106, args);
    }

};


