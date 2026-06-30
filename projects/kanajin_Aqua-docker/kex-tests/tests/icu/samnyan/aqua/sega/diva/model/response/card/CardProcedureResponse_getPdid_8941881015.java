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

public class CardProcedureResponse_getPdid_8941881015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4991;

    public CardProcedureResponse_getPdid_8941881015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5088 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term5087 = ((Class) term5088).getDeclaredField((String) "SUCCESS");
        ((Field) term5087).setAccessible(true);
        Object enum15 = ((Field) term5087).get((Object) null);
        Integer term5019 = new Integer(-655067527);
        Integer term5021 = new Integer(-6029667);
        Integer term5035 = new Integer(-2068769794);
        Integer term5037 = new Integer(-117576464);
        Integer term5039 = new Integer(-1007160944);
        Class<? extends Object> term5366 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term5365 = ((Class) term5366).getDeclaredField((String) "RESET");
        ((Field) term5365).setAccessible(true);
        Object enum16 = ((Field) term5365).get((Object) null);
        term4991 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term4991, term4991.getClass(), "cd_adm_result", enum15);
        setIntField(term4991, term4991.getClass(), "chg_name_price", 1622346318);
        setIntField(term4991, term4991.getClass(), "accept_idx", 1048535127);
        setIntField(term4991, term4991.getClass(), "pd_id", -655067527);
        setField(term4991, term4991.getClass(), "player_name", "nyiiPDVjAc");
        setField(term4991, term4991.getClass(), "lv_num", term5019);
        setField(term4991, term4991.getClass(), "lv_pnt", term5021);
        setField(term4991, term4991.getClass(), "lv_str", "aKnKipADSo");
        setField(term4991, term4991.getClass(), "lv_efct_id", term5035);
        setField(term4991, term4991.getClass(), "lv_plt_id", term5037);
        setField(term4991, term4991.getClass(), "vcld_pts", term5039);
        setField(term4991, term4991.getClass(), "passwd_stat", enum16);
        setField(term4991, term4991.getClass(), "cmd", "wSQxaModmm");
        setField(term4991, term4991.getClass(), "req_id", "UlajhuVLaP");
        setField(term4991, term4991.getClass(), "stat", "gGSMzuGICf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term4991, args);
    }

};


