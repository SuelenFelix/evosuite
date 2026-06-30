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

public class FestaInfoResponse_setFiattr_173830695917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9345;

    public FestaInfoResponse_setFiattr_173830695917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9345 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term9345, term9345.getClass(), "fi_id", "UimMMORkzd");
        setField(term9345, term9345.getClass(), "fi_name", "huVIXUWLtI");
        setField(term9345, term9345.getClass(), "fi_kind", "vhKzFyKPOT");
        setField(term9345, term9345.getClass(), "fi_difficulty", "nQhIgWXdRc");
        setField(term9345, term9345.getClass(), "fi_pv_id_lst", "EusenEbIoF");
        setField(term9345, term9345.getClass(), "fi_attr", "SScVQYSvWH");
        setField(term9345, term9345.getClass(), "fi_add_vp", "MnovcqFhCl");
        setField(term9345, term9345.getClass(), "fi_mul_vp", "qYtAeLzOhW");
        setField(term9345, term9345.getClass(), "fi_st", "tJzmOfcUnY");
        setField(term9345, term9345.getClass(), "fi_et", "TKlccZUpjz");
        setField(term9345, term9345.getClass(), "fi_lut", "GGzwMoHZXC");
        setField(term9345, term9345.getClass(), "cmd", "IpmgwHTgnG");
        setField(term9345, term9345.getClass(), "req_id", "tIpkeYIezR");
        setField(term9345, term9345.getClass(), "stat", "YkZtEtthvz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dwlZSxlXOo";
        callMethod(klass, "setFi_attr", argTypes, term9345, args);
    }

};


