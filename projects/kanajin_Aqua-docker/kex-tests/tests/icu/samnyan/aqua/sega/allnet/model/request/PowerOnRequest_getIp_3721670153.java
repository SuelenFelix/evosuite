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

public class PowerOnRequest_getIp_3721670153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664;

    public PowerOnRequest_getIp_3721670153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term664, term664.getClass(), "game_id", "OWDIEULEFu");
        setField(term664, term664.getClass(), "ver", "dWRymuLBtr");
        setField(term664, term664.getClass(), "serial", "AijpHYOFuy");
        setField(term664, term664.getClass(), "ip", "SbAoxhfrkn");
        setField(term664, term664.getClass(), "firm_ver", "kuTXqwMtDB");
        setField(term664, term664.getClass(), "boot_ver", "Ghbwtircqb");
        setField(term664, term664.getClass(), "encode", "xrwlQZdwCp");
        setField(term664, term664.getClass(), "format_ver", "IDCWpPLRkE");
        setField(term664, term664.getClass(), "hops", "nyiiPDVjAc");
        setField(term664, term664.getClass(), "token", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIp", argTypes, term664, args);
    }

};


