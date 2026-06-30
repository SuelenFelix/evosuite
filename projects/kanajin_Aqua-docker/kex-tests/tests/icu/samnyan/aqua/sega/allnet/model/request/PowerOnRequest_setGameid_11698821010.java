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

public class PowerOnRequest_setGameid_11698821010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2211;

    public PowerOnRequest_setGameid_11698821010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2211 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term2211, term2211.getClass(), "game_id", "SPpkrGcPRr");
        setField(term2211, term2211.getClass(), "ver", "sEccwbJKYE");
        setField(term2211, term2211.getClass(), "serial", "AWRooQKkdW");
        setField(term2211, term2211.getClass(), "ip", "vjxIhXHxGR");
        setField(term2211, term2211.getClass(), "firm_ver", "QXzGXbEXMu");
        setField(term2211, term2211.getClass(), "boot_ver", "qxSDVejjiY");
        setField(term2211, term2211.getClass(), "encode", "xBsXSDjXYK");
        setField(term2211, term2211.getClass(), "format_ver", "sEnIVFtZuQ");
        setField(term2211, term2211.getClass(), "hops", "ZVecLZMLHF");
        setField(term2211, term2211.getClass(), "token", "fztQhjqwdP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eVpkWxjuki";
        callMethod(klass, "setGame_id", argTypes, term2211, args);
    }

};


