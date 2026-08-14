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
import java.lang.Integer;

public class SoftwareMapperImpl_map_221106272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37227;
     Object term37228;

    public SoftwareMapperImpl_map_221106272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37227 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.transportlayers.mapper.SoftwareMapperImpl"));
        Integer term37253 = new Integer(-310528004);
        term37228 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.entities.Software"));
        setField(term37228, term37228.getClass(), "name", "vJPujDInGq");
        setField(term37228, term37228.getClass(), "description", "cHZGcMhatT");
        setField(term37228, term37228.getClass(), "score", term37253);
        setField(term37228, term37228.getClass(), "author", "OZGyrUPedG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.transportlayers.mapper.SoftwareMapperImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("dev.zevolution.netflixhexaarch.entities.Software");
        Object[] args = new Object[1];
        args[0] = term37228;
        callMethod(klass, "map", argTypes, term37227, args);
    }

};


