package dev.zevolution.netflixhexaarch.transportlayers.mapper;

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
import static dev.zevolution.netflixhexaarch.transportlayers.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class SoftwareMapperImpl_map_17461091843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37297;
     Object term37298;

    public SoftwareMapperImpl_map_17461091843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37297 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.transportlayers.mapper.SoftwareMapperImpl"));
        Integer term37326 = new Integer(-634976996);
        Object term37301 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.entities.Software"));
        setField(term37301, term37301.getClass(), "name", "GAxMzRqmXU");
        setField(term37301, term37301.getClass(), "description", "XMhUDGKSWO");
        setField(term37301, term37301.getClass(), "score", term37326);
        setField(term37301, term37301.getClass(), "author", "jLgzxtuvVo");
        term37298 = new LinkedList();
        ((LinkedList) term37298).add(term37301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.transportlayers.mapper.SoftwareMapperImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term37298;
        callMethod(klass, "map", argTypes, term37297, args);
    }

};


