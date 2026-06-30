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

public class PowerOnResponseV3_getStat_15490441041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;

    public PowerOnResponseV3_getStat_15490441041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term377, term377.getClass(), "stat", 1162663216);
        setField(term377, term377.getClass(), "uri", "tbcdzjIfER");
        setField(term377, term377.getClass(), "host", "HyxfbSQYBe");
        setField(term377, term377.getClass(), "place_id", "pCTimMblYc");
        setField(term377, term377.getClass(), "name", "hNxWaHcfhY");
        setField(term377, term377.getClass(), "nickname", "RkybSrpybU");
        setField(term377, term377.getClass(), "region0", "xOEqzGAmDU");
        setField(term377, term377.getClass(), "region_name0", "eZFUvlxvGV");
        setField(term377, term377.getClass(), "region_name1", "BYqFIqCKAV");
        setField(term377, term377.getClass(), "region_name2", "vrQLuWIDJX");
        setField(term377, term377.getClass(), "region_name3", "flxyYxBRtu");
        setField(term377, term377.getClass(), "country", "OclPbYPkcH");
        setField(term377, term377.getClass(), "allnet_id", "IoAlmYsBwc");
        setField(term377, term377.getClass(), "client_timezone", "TEParAifyi");
        setField(term377, term377.getClass(), "utc_time", "OWDIEULEFu");
        setField(term377, term377.getClass(), "setting", "dWRymuLBtr");
        setField(term377, term377.getClass(), "res_ver", "AijpHYOFuy");
        setField(term377, term377.getClass(), "token", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStat", argTypes, term377, args);
    }

};


