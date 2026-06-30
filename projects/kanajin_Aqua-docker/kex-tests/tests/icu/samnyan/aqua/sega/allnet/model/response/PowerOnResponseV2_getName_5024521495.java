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

public class PowerOnResponseV2_getName_5024521495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17459;

    public PowerOnResponseV2_getName_5024521495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17459 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term17459, term17459.getClass(), "stat", 1063420942);
        setField(term17459, term17459.getClass(), "uri", "HuOUlaFmvJ");
        setField(term17459, term17459.getClass(), "host", "dWVwcwFGNo");
        setField(term17459, term17459.getClass(), "place_id", "PNdLRrSAIY");
        setField(term17459, term17459.getClass(), "name", "nJnRIRiLZK");
        setField(term17459, term17459.getClass(), "nickname", "eWnrMSbYbT");
        setField(term17459, term17459.getClass(), "region0", "AjoFvDFyCY");
        setField(term17459, term17459.getClass(), "region_name0", "OFTJwdPiTG");
        setField(term17459, term17459.getClass(), "region_name1", "QiUprSEluR");
        setField(term17459, term17459.getClass(), "region_name2", "cDOXXottZh");
        setField(term17459, term17459.getClass(), "region_name3", "rfqJDkDppz");
        setField(term17459, term17459.getClass(), "country", "MGorMVGauT");
        setIntField(term17459, term17459.getClass(), "year", 1375330971);
        setIntField(term17459, term17459.getClass(), "month", -478195677);
        setIntField(term17459, term17459.getClass(), "day", 972867650);
        setIntField(term17459, term17459.getClass(), "hour", 1655935355);
        setIntField(term17459, term17459.getClass(), "minute", -481533957);
        setIntField(term17459, term17459.getClass(), "second", 1240914516);
        setField(term17459, term17459.getClass(), "setting", "jXKxUGTuEF");
        setField(term17459, term17459.getClass(), "timezone", "nDCcyhiTnS");
        setField(term17459, term17459.getClass(), "res_class", "Bcivwcjece");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term17459, args);
    }

};


