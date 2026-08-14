package mil.nga.geopackage.attributes;

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
import static mil.nga.geopackage.attributes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class AttributesTableMetadata_create_98401308315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135538;

    public AttributesTableMetadata_create_98401308315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term135660 = new ArrayList();
        HashMap term135665 = new HashMap();
        term135538 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term135551 = (Object[]) newArray("java.lang.String", 9);
        setField(term135538, term135538.getClass(), "tableName", "eywpqasaKj");
        setElement(term135551, 0, "QnaLMKXAzJ");
        setElement(term135551, 1, "QrHmFoeUoY");
        setElement(term135551, 2, "BIysFVoAAl");
        setElement(term135551, 3, "TAqcGSOgIz");
        setElement(term135551, 4, "hqyMxHWbGv");
        setElement(term135551, 5, "ucSkoerFDq");
        setElement(term135551, 6, "UasONzOTXn");
        setElement(term135551, 7, "gRkWWojcfo");
        setElement(term135551, 8, "FHujUNXIxu");
        setField(term135538, term135538.getClass(), "columnNames", term135551);
        setField(term135538, term135538.getClass(), "columns", term135660);
        setBooleanField(term135538, term135538.getClass(), "custom", false);
        setField(term135538, term135538.getClass(), "nameToIndex", term135665);
        setIntField(term135538, term135538.getClass(), "pkIndex", 1501165033);
        setBooleanField(term135538, term135538.getClass(), "pkModifiable", false);
        setBooleanField(term135538, term135538.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Object[] args = new Object[1];
        args[0] = term135538;
        callMethod(klass, "create", argTypes, null, args);
    }

};


