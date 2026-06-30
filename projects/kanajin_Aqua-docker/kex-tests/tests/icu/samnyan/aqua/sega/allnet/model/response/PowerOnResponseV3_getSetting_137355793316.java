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

public class PowerOnResponseV3_getSetting_137355793316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6017;

    public PowerOnResponseV3_getSetting_137355793316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6017 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term6017, term6017.getClass(), "stat", -1685132342);
        setField(term6017, term6017.getClass(), "uri", "GBOEuByOfr");
        setField(term6017, term6017.getClass(), "host", "NHbOFFjyVK");
        setField(term6017, term6017.getClass(), "place_id", "zaloBqlrSo");
        setField(term6017, term6017.getClass(), "name", "vvoLrMGCoN");
        setField(term6017, term6017.getClass(), "nickname", "pXdglvyrQe");
        setField(term6017, term6017.getClass(), "region0", "OcfNzHYdki");
        setField(term6017, term6017.getClass(), "region_name0", "uPuCVuZYOI");
        setField(term6017, term6017.getClass(), "region_name1", "TweMFhxNdj");
        setField(term6017, term6017.getClass(), "region_name2", "NBrvVzvQHe");
        setField(term6017, term6017.getClass(), "region_name3", "FjOiNAfBOc");
        setField(term6017, term6017.getClass(), "country", "iCCsaLHohG");
        setField(term6017, term6017.getClass(), "allnet_id", "NJhGgctbdj");
        setField(term6017, term6017.getClass(), "client_timezone", "MYWYUeLGOp");
        setField(term6017, term6017.getClass(), "utc_time", "tsTGdgQYUL");
        setField(term6017, term6017.getClass(), "setting", "TtGbVmKcnX");
        setField(term6017, term6017.getClass(), "res_ver", "GJVkUrCVdD");
        setField(term6017, term6017.getClass(), "token", "zNdorvdUgu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSetting", argTypes, term6017, args);
    }

};


