package icu.samnyan.aqua.sega.diva.model.response.card;

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
import static icu.samnyan.aqua.sega.diva.model.response.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class CardProcedureResponse_getPasswdstat_196352597213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10303;

    public CardProcedureResponse_getPasswdstat_196352597213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10397 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term10396 = ((Class) term10397).getDeclaredField((String) "FAILED");
        ((Field) term10396).setAccessible(true);
        Object enum31 = ((Field) term10396).get((Object) null);
        Integer term10330 = new Integer(1596070772);
        Integer term10332 = new Integer(97029295);
        Integer term10346 = new Integer(-1371869594);
        Integer term10348 = new Integer(-2095575670);
        Integer term10350 = new Integer(1225272962);
        Class<? extends Object> term10672 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term10671 = ((Class) term10672).getDeclaredField((String) "SET");
        ((Field) term10671).setAccessible(true);
        Object enum32 = ((Field) term10671).get((Object) null);
        term10303 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term10303, term10303.getClass(), "cd_adm_result", enum31);
        setIntField(term10303, term10303.getClass(), "chg_name_price", -602026508);
        setIntField(term10303, term10303.getClass(), "accept_idx", -157887805);
        setIntField(term10303, term10303.getClass(), "pd_id", 1876565163);
        setField(term10303, term10303.getClass(), "player_name", "OWKQODBLzb");
        setField(term10303, term10303.getClass(), "lv_num", term10330);
        setField(term10303, term10303.getClass(), "lv_pnt", term10332);
        setField(term10303, term10303.getClass(), "lv_str", "wGmYcqUkgE");
        setField(term10303, term10303.getClass(), "lv_efct_id", term10346);
        setField(term10303, term10303.getClass(), "lv_plt_id", term10348);
        setField(term10303, term10303.getClass(), "vcld_pts", term10350);
        setField(term10303, term10303.getClass(), "passwd_stat", enum32);
        setField(term10303, term10303.getClass(), "cmd", "idgaQsnJpQ");
        setField(term10303, term10303.getClass(), "req_id", "VgZnGoIFwQ");
        setField(term10303, term10303.getClass(), "stat", "jUbSRrkrYZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswd_stat", argTypes, term10303, args);
    }

};


