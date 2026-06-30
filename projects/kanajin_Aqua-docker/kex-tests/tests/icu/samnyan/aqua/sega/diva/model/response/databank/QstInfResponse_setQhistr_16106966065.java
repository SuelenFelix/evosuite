package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class QstInfResponse_setQhistr_16106966065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12039;

    public QstInfResponse_setQhistr_16106966065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12039 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse"));
        setField(term12039, term12039.getClass(), "qi_lut", "qnYaYSpDwO");
        setField(term12039, term12039.getClass(), "qhi_str", "dgbFDCdHtj");
        setField(term12039, term12039.getClass(), "qrai_str", "EKpdCBubDE");
        setField(term12039, term12039.getClass(), "cmd", "zMsSLTfGhl");
        setField(term12039, term12039.getClass(), "req_id", "bEmHScVZaQ");
        setField(term12039, term12039.getClass(), "stat", "TcuXODkzBV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "coJPjrBZNe";
        callMethod(klass, "setQhi_str", argTypes, term12039, args);
    }

};


