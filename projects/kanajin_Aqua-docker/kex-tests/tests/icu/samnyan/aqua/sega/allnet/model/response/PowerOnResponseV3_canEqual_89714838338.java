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

public class PowerOnResponseV3_canEqual_89714838338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14666;
     Object term14872;

    public PowerOnResponseV3_canEqual_89714838338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14666 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term14666, term14666.getClass(), "stat", 679763016);
        setField(term14666, term14666.getClass(), "uri", "DuKcNfVVYR");
        setField(term14666, term14666.getClass(), "host", "fRujHWvXjJ");
        setField(term14666, term14666.getClass(), "place_id", "EAIAAStlTz");
        setField(term14666, term14666.getClass(), "name", "yIWXcOQTgy");
        setField(term14666, term14666.getClass(), "nickname", "xAWekqanqc");
        setField(term14666, term14666.getClass(), "region0", "GSOWFHMlbF");
        setField(term14666, term14666.getClass(), "region_name0", "vpZIqpFbKM");
        setField(term14666, term14666.getClass(), "region_name1", "dAbwpJCDif");
        setField(term14666, term14666.getClass(), "region_name2", "ATSXJPySio");
        setField(term14666, term14666.getClass(), "region_name3", "XZkOUcbfFg");
        setField(term14666, term14666.getClass(), "country", "TGiJfagfky");
        setField(term14666, term14666.getClass(), "allnet_id", "BJklinBmhN");
        setField(term14666, term14666.getClass(), "client_timezone", "IOddzvEWcl");
        setField(term14666, term14666.getClass(), "utc_time", "bIrtpkYJWT");
        setField(term14666, term14666.getClass(), "setting", "VuLLXpvPpZ");
        setField(term14666, term14666.getClass(), "res_ver", "UEdzEKEEEV");
        setField(term14666, term14666.getClass(), "token", "BcENaQFYSd");
        term14872 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14872;
        callMethod(klass, "canEqual", argTypes, term14666, args);
    }

};


