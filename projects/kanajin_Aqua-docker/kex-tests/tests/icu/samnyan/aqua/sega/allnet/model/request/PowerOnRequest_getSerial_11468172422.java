package icu.samnyan.aqua.sega.allnet.model.request;

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
import static icu.samnyan.aqua.sega.allnet.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnRequest_getSerial_11468172422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443;

    public PowerOnRequest_getSerial_11468172422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term443, term443.getClass(), "game_id", "hNxWaHcfhY");
        setField(term443, term443.getClass(), "ver", "RkybSrpybU");
        setField(term443, term443.getClass(), "serial", "xOEqzGAmDU");
        setField(term443, term443.getClass(), "ip", "eZFUvlxvGV");
        setField(term443, term443.getClass(), "firm_ver", "BYqFIqCKAV");
        setField(term443, term443.getClass(), "boot_ver", "vrQLuWIDJX");
        setField(term443, term443.getClass(), "encode", "flxyYxBRtu");
        setField(term443, term443.getClass(), "format_ver", "OclPbYPkcH");
        setField(term443, term443.getClass(), "hops", "IoAlmYsBwc");
        setField(term443, term443.getClass(), "token", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSerial", argTypes, term443, args);
    }

};


