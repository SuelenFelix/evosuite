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

public class PowerOnResponseV3_setAllnetid_78206962731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11901;

    public PowerOnResponseV3_setAllnetid_78206962731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11901 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term11901, term11901.getClass(), "stat", -73683645);
        setField(term11901, term11901.getClass(), "uri", "dgbFDCdHtj");
        setField(term11901, term11901.getClass(), "host", "EKpdCBubDE");
        setField(term11901, term11901.getClass(), "place_id", "zMsSLTfGhl");
        setField(term11901, term11901.getClass(), "name", "bEmHScVZaQ");
        setField(term11901, term11901.getClass(), "nickname", "TcuXODkzBV");
        setField(term11901, term11901.getClass(), "region0", "coJPjrBZNe");
        setField(term11901, term11901.getClass(), "region_name0", "vMsWjuPTnO");
        setField(term11901, term11901.getClass(), "region_name1", "zHvfKaOstO");
        setField(term11901, term11901.getClass(), "region_name2", "tOszriqETr");
        setField(term11901, term11901.getClass(), "region_name3", "ncSPTkhKjO");
        setField(term11901, term11901.getClass(), "country", "jcWKHRWhyj");
        setField(term11901, term11901.getClass(), "allnet_id", "nrQjODRMLD");
        setField(term11901, term11901.getClass(), "client_timezone", "PNoWXrsFic");
        setField(term11901, term11901.getClass(), "utc_time", "QZBHZqZope");
        setField(term11901, term11901.getClass(), "setting", "VBUahCvyxC");
        setField(term11901, term11901.getClass(), "res_ver", "MlzTkzKMCX");
        setField(term11901, term11901.getClass(), "token", "UqKUbMyPMJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QpYltHAdyY";
        callMethod(klass, "setAllnet_id", argTypes, term11901, args);
    }

};


