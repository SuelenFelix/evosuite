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

public class FestaInfoResponse_setFidifficulty_202724693715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8683;

    public FestaInfoResponse_setFidifficulty_202724693715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8683 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term8683, term8683.getClass(), "fi_id", "zgKiINdgNu");
        setField(term8683, term8683.getClass(), "fi_name", "zLMTXDQHYH");
        setField(term8683, term8683.getClass(), "fi_kind", "PqywFWJlpE");
        setField(term8683, term8683.getClass(), "fi_difficulty", "OzXRsFGTIp");
        setField(term8683, term8683.getClass(), "fi_pv_id_lst", "TjWpyghUWN");
        setField(term8683, term8683.getClass(), "fi_attr", "dkZFDZxcde");
        setField(term8683, term8683.getClass(), "fi_add_vp", "WXcZEtUKlI");
        setField(term8683, term8683.getClass(), "fi_mul_vp", "IkpjUOuWQU");
        setField(term8683, term8683.getClass(), "fi_st", "boSSpezHeU");
        setField(term8683, term8683.getClass(), "fi_et", "OUeBWNTQDh");
        setField(term8683, term8683.getClass(), "fi_lut", "gltJarNuUk");
        setField(term8683, term8683.getClass(), "cmd", "ZwZIDwYcSW");
        setField(term8683, term8683.getClass(), "req_id", "sOdkipUKRu");
        setField(term8683, term8683.getClass(), "stat", "oKwCDqywym");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zjZYTddemL";
        callMethod(klass, "setFi_difficulty", argTypes, term8683, args);
    }

};


