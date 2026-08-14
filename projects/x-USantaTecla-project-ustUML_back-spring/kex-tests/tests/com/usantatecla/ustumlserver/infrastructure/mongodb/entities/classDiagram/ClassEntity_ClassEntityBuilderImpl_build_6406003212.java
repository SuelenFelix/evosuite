package com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ClassEntity_ClassEntityBuilderImpl_build_6406003212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56323;

    public ClassEntity_ClassEntityBuilderImpl_build_6406003212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term56324 = new ArrayList();
        ArrayList term56333 = new ArrayList();
        ((ArrayList) term56333).add((Object)null);
        ((ArrayList) term56333).add((Object)null);
        ((ArrayList) term56333).add((Object)null);
        ((ArrayList) term56333).add((Object)null);
        ((ArrayList) term56333).add((Object)null);
        ((ArrayList) term56333).add((Object)null);
        ((ArrayList) term56333).add((Object)null);
        ((ArrayList) term56333).add((Object)null);
        ((ArrayList) term56333).add((Object)null);
        Object term56330 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term56330, term56330.getClass(), "name", "");
        setField(term56330, term56330.getClass(), "type", "");
        setField(term56330, term56330.getClass(), "modifiers", term56333);
        ArrayList term56339 = new ArrayList();
        ((ArrayList) term56339).add((Object)null);
        ((ArrayList) term56339).add((Object)null);
        ((ArrayList) term56339).add((Object)null);
        Object term56336 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term56336, term56336.getClass(), "name", "");
        setField(term56336, term56336.getClass(), "type", "");
        setField(term56336, term56336.getClass(), "modifiers", term56339);
        ArrayList term56345 = new ArrayList();
        ((ArrayList) term56345).add((Object)null);
        ((ArrayList) term56345).add((Object)null);
        ((ArrayList) term56345).add((Object)null);
        ((ArrayList) term56345).add((Object)null);
        ((ArrayList) term56345).add((Object)null);
        ((ArrayList) term56345).add((Object)null);
        Object term56342 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term56342, term56342.getClass(), "name", "");
        setField(term56342, term56342.getClass(), "type", "");
        setField(term56342, term56342.getClass(), "modifiers", term56345);
        ArrayList term56351 = new ArrayList();
        ((ArrayList) term56351).add((Object)null);
        ((ArrayList) term56351).add((Object)null);
        ((ArrayList) term56351).add((Object)null);
        ((ArrayList) term56351).add((Object)null);
        ((ArrayList) term56351).add((Object)null);
        ((ArrayList) term56351).add((Object)null);
        ((ArrayList) term56351).add((Object)null);
        ((ArrayList) term56351).add((Object)null);
        Object term56348 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term56348, term56348.getClass(), "name", "");
        setField(term56348, term56348.getClass(), "type", "");
        setField(term56348, term56348.getClass(), "modifiers", term56351);
        ArrayList term56328 = new ArrayList();
        ((ArrayList) term56328).add(term56330);
        ((ArrayList) term56328).add(term56336);
        ((ArrayList) term56328).add(term56342);
        ((ArrayList) term56328).add(term56348);
        ArrayList term56361 = new ArrayList();
        ArrayList term56364 = new ArrayList();
        ((ArrayList) term56364).add((Object)null);
        ((ArrayList) term56364).add((Object)null);
        ((ArrayList) term56364).add((Object)null);
        ((ArrayList) term56364).add((Object)null);
        ((ArrayList) term56364).add((Object)null);
        ((ArrayList) term56364).add((Object)null);
        Object term56358 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term56358, term56358.getClass(), "name", "");
        setField(term56358, term56358.getClass(), "type", "");
        setField(term56358, term56358.getClass(), "modifiers", term56361);
        setField(term56358, term56358.getClass(), "parametersEntities", term56364);
        ArrayList term56370 = new ArrayList();
        ((ArrayList) term56370).add((Object)null);
        ((ArrayList) term56370).add((Object)null);
        ArrayList term56373 = new ArrayList();
        Object term56367 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term56367, term56367.getClass(), "name", "");
        setField(term56367, term56367.getClass(), "type", "");
        setField(term56367, term56367.getClass(), "modifiers", term56370);
        setField(term56367, term56367.getClass(), "parametersEntities", term56373);
        ArrayList term56379 = new ArrayList();
        ((ArrayList) term56379).add((Object)null);
        ((ArrayList) term56379).add((Object)null);
        ((ArrayList) term56379).add((Object)null);
        ((ArrayList) term56379).add((Object)null);
        ((ArrayList) term56379).add((Object)null);
        ((ArrayList) term56379).add((Object)null);
        ((ArrayList) term56379).add((Object)null);
        ArrayList term56382 = new ArrayList();
        ((ArrayList) term56382).add((Object)null);
        ((ArrayList) term56382).add((Object)null);
        ((ArrayList) term56382).add((Object)null);
        ((ArrayList) term56382).add((Object)null);
        Object term56376 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term56376, term56376.getClass(), "name", "");
        setField(term56376, term56376.getClass(), "type", "");
        setField(term56376, term56376.getClass(), "modifiers", term56379);
        setField(term56376, term56376.getClass(), "parametersEntities", term56382);
        ArrayList term56388 = new ArrayList();
        ((ArrayList) term56388).add((Object)null);
        ((ArrayList) term56388).add((Object)null);
        ((ArrayList) term56388).add((Object)null);
        ((ArrayList) term56388).add((Object)null);
        ((ArrayList) term56388).add((Object)null);
        ((ArrayList) term56388).add((Object)null);
        ((ArrayList) term56388).add((Object)null);
        ArrayList term56391 = new ArrayList();
        Object term56385 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term56385, term56385.getClass(), "name", "");
        setField(term56385, term56385.getClass(), "type", "");
        setField(term56385, term56385.getClass(), "modifiers", term56388);
        setField(term56385, term56385.getClass(), "parametersEntities", term56391);
        ArrayList term56356 = new ArrayList();
        ((ArrayList) term56356).add(term56358);
        ((ArrayList) term56356).add(term56367);
        ((ArrayList) term56356).add(term56376);
        ((ArrayList) term56356).add(term56385);
        ArrayList term56420 = new ArrayList();
        ((ArrayList) term56420).add((Object)null);
        ((ArrayList) term56420).add((Object)null);
        ((ArrayList) term56420).add((Object)null);
        term56323 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity$ClassEntityBuilderImpl"));
        setField(term56323, term56323.getClass(), "modifiers", term56324);
        setField(term56323, term56323.getClass(), "attributesEntities", term56328);
        setField(term56323, term56323.getClass(), "methodsEntities", term56356);
        setField(term56323, term56323.getClass(), "id", "qAmVqwwdyf");
        setField(term56323, term56323.getClass(), "name", "IXPaHQnEUy");
        setField(term56323, term56323.getClass(), "relationEntities", term56420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity$ClassEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term56323, args);
    }

};


