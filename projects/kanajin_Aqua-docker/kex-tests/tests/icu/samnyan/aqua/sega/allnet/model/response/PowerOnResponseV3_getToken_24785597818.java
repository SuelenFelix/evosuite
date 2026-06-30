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

public class PowerOnResponseV3_getToken_24785597818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6769;

    public PowerOnResponseV3_getToken_24785597818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6769 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term6769, term6769.getClass(), "stat", 1622346318);
        setField(term6769, term6769.getClass(), "uri", "QSrDQfEsTR");
        setField(term6769, term6769.getClass(), "host", "PsqusYmejD");
        setField(term6769, term6769.getClass(), "place_id", "NTWMiBEaDF");
        setField(term6769, term6769.getClass(), "name", "SPBstwKFVr");
        setField(term6769, term6769.getClass(), "nickname", "WxYUTuqmIq");
        setField(term6769, term6769.getClass(), "region0", "OeQLvhVERT");
        setField(term6769, term6769.getClass(), "region_name0", "IlvgFINwIa");
        setField(term6769, term6769.getClass(), "region_name1", "GEJABPlHSI");
        setField(term6769, term6769.getClass(), "region_name2", "aQFUvuaYxd");
        setField(term6769, term6769.getClass(), "region_name3", "zNFLXMifnS");
        setField(term6769, term6769.getClass(), "country", "HHQcYMSBVc");
        setField(term6769, term6769.getClass(), "allnet_id", "wdoqITnaAP");
        setField(term6769, term6769.getClass(), "client_timezone", "rIPMBcrNqB");
        setField(term6769, term6769.getClass(), "utc_time", "UDaboHZHhz");
        setField(term6769, term6769.getClass(), "setting", "nRvKihUSPj");
        setField(term6769, term6769.getClass(), "res_ver", "BbNeQJpYPr");
        setField(term6769, term6769.getClass(), "token", "riMtzCoxNj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term6769, args);
    }

};


