package net.javaguides.springboot.model;

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
import static net.javaguides.springboot.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class User_setLocation_105708808811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2586;
     Object term2664;

    public User_setLocation_105708808811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2586 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term2636 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2586, term2586.getClass(), "id", -2068172595987555756L);
        setField(term2586, term2586.getClass(), "email", "ZVecLZMLHF");
        setField(term2586, term2586.getClass(), "firstName", "fztQhjqwdP");
        setField(term2586, term2586.getClass(), "lastName", "eVpkWxjuki");
        setField(term2586, term2586.getClass(), "password", "SJiQaLvSKv");
        setLongField(term2636, term2636.getClass(), "id", -6292278961887936280L);
        setField(term2636, term2636.getClass(), "place", "OEXDRUKcFl");
        setField(term2636, term2636.getClass(), "description", "RYdKCNNMBR");
        setDoubleField(term2636, term2636.getClass(), "longitude", 0.5804948995371725);
        setDoubleField(term2636, term2636.getClass(), "latitude", 0.20737514139742264);
        setField(term2586, term2586.getClass(), "location", term2636);
        term2664 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2664, term2664.getClass(), "id", -6645965768855543712L);
        setField(term2664, term2664.getClass(), "place", "yGtHPyvYiQ");
        setField(term2664, term2664.getClass(), "description", "MvRIxilFMJ");
        setDoubleField(term2664, term2664.getClass(), "longitude", 0.7919370314903882);
        setDoubleField(term2664, term2664.getClass(), "latitude", 0.2109867221632754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.javaguides.springboot.model.Location");
        Object[] args = new Object[1];
        args[0] = term2664;
        callMethod(klass, "setLocation", argTypes, term2586, args);
    }

};


