package com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ActorEntity_hashCode_3652348649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546;

    public ActorEntity_hashCode_3652348649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term571 = new ArrayList();
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        term546 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.ActorEntity"));
        setField(term546, term546.getClass(), "id", "xOEqzGAmDU");
        setField(term546, term546.getClass(), "name", "eZFUvlxvGV");
        setField(term546, term546.getClass(), "relationEntities", term571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.useCaseDiagram.ActorEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term546, args);
    }

};


