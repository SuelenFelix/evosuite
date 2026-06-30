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

public class PowerOnResponseV2_setYear_160211378834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26867;
     Object term27043;

    public PowerOnResponseV2_setYear_160211378834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26867 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term26867, term26867.getClass(), "stat", -249614216);
        setField(term26867, term26867.getClass(), "uri", "GAPGgDekVG");
        setField(term26867, term26867.getClass(), "host", "WmTogHwGLE");
        setField(term26867, term26867.getClass(), "place_id", "qYOIXsGycY");
        setField(term26867, term26867.getClass(), "name", "sJNXNshRLe");
        setField(term26867, term26867.getClass(), "nickname", "AYnbmgRCKr");
        setField(term26867, term26867.getClass(), "region0", "iQRfDlaoYD");
        setField(term26867, term26867.getClass(), "region_name0", "kpcyrjDQzN");
        setField(term26867, term26867.getClass(), "region_name1", "IyukykAHLQ");
        setField(term26867, term26867.getClass(), "region_name2", "CwZcgFJqMh");
        setField(term26867, term26867.getClass(), "region_name3", "RldCZqgRbO");
        setField(term26867, term26867.getClass(), "country", "LOVugCAgJs");
        setIntField(term26867, term26867.getClass(), "year", 1870727665);
        setIntField(term26867, term26867.getClass(), "month", -519881101);
        setIntField(term26867, term26867.getClass(), "day", -680920524);
        setIntField(term26867, term26867.getClass(), "hour", -916335264);
        setIntField(term26867, term26867.getClass(), "minute", -919416536);
        setIntField(term26867, term26867.getClass(), "second", -43417861);
        setField(term26867, term26867.getClass(), "setting", "SNmHXwCiFY");
        setField(term26867, term26867.getClass(), "timezone", "HZfkWoqyUW");
        setField(term26867, term26867.getClass(), "res_class", "QRwANPSyfT");
        term27043 = new Integer(-1533843432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27043;
        callMethod(klass, "setYear", argTypes, term26867, args);
    }

};


