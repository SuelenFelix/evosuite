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

public class FestaInfoResponse_getFiaddvp_12215687147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6145;

    public FestaInfoResponse_getFiaddvp_12215687147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6145 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term6145, term6145.getClass(), "fi_id", "ywmcuThdfL");
        setField(term6145, term6145.getClass(), "fi_name", "GBOEuByOfr");
        setField(term6145, term6145.getClass(), "fi_kind", "NHbOFFjyVK");
        setField(term6145, term6145.getClass(), "fi_difficulty", "zaloBqlrSo");
        setField(term6145, term6145.getClass(), "fi_pv_id_lst", "vvoLrMGCoN");
        setField(term6145, term6145.getClass(), "fi_attr", "pXdglvyrQe");
        setField(term6145, term6145.getClass(), "fi_add_vp", "OcfNzHYdki");
        setField(term6145, term6145.getClass(), "fi_mul_vp", "uPuCVuZYOI");
        setField(term6145, term6145.getClass(), "fi_st", "TweMFhxNdj");
        setField(term6145, term6145.getClass(), "fi_et", "NBrvVzvQHe");
        setField(term6145, term6145.getClass(), "fi_lut", "FjOiNAfBOc");
        setField(term6145, term6145.getClass(), "cmd", "iCCsaLHohG");
        setField(term6145, term6145.getClass(), "req_id", "NJhGgctbdj");
        setField(term6145, term6145.getClass(), "stat", "MYWYUeLGOp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_add_vp", argTypes, term6145, args);
    }

};


