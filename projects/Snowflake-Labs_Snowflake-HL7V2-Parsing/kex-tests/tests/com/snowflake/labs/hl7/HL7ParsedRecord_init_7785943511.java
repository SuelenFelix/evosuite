package com.snowflake.labs.hl7;

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
import static com.snowflake.labs.hl7.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class HL7ParsedRecord_init_7785943511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public HL7ParsedRecord_init_7785943511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term150 = new Boolean(false);
        term137 = newInstance(Class.forName("com.snowflake.labs.hl7.HL7ParsedRecord"));
        setField(term137, term137.getClass(), "error_msg", "SzjVpOQTyS");
        setField(term137, term137.getClass(), "parsed_status", term150);
        setField(term137, term137.getClass(), "raw_msg", "MjGYSRKTNF");
        setField(term137, term137.getClass(), "hl7_xml", "hRNSzYYIrc");
        setField(term137, term137.getClass(), "hl7_json", "RMFIsYGgne");
        setField(term137, term137.getClass(), "message_type", "NRdvgJlhkX");
        setField(term137, term137.getClass(), "message_version", "uuaPigETmJ");
        setIntField(term137, term137.getClass(), "message_sequence_num", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snowflake.labs.hl7.HL7ParsedRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.snowflake.labs.hl7.HL7ParsedRecord");
        Object[] args = new Object[1];
        args[0] = term137;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


