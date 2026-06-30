package io.graversen.minecraft.rcon.query.playerlist;

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
import static io.graversen.minecraft.rcon.query.playerlist.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class PlayerNames_getPlayerNames_20986736602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;

    public PlayerNames_getPlayerNames_20986736602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term67 = new ArrayList();
        ((ArrayList) term67).add("EGtDIRbSSb");
        ((ArrayList) term67).add("SzjVpOQTyS");
        ((ArrayList) term67).add("MjGYSRKTNF");
        ((ArrayList) term67).add("hRNSzYYIrc");
        ((ArrayList) term67).add("RMFIsYGgne");
        ((ArrayList) term67).add("NRdvgJlhkX");
        ((ArrayList) term67).add("uuaPigETmJ");
        ((ArrayList) term67).add("MxlszYVzRf");
        ((ArrayList) term67).add("LQFpaHEwXR");
        term66 = newInstance(Class.forName("io.graversen.minecraft.rcon.query.playerlist.PlayerNames"));
        setField(term66, term66.getClass(), "playerNames", term67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.query.playerlist.PlayerNames");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerNames", argTypes, term66, args);
    }

};


