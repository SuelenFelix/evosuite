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

public class CardProcedureResponse_setVcldpts_22291671224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17663;
     Object term17761;

    public CardProcedureResponse_setVcldpts_22291671224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17764 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term17763 = ((Class) term17764).getDeclaredField((String) "SUCCESS");
        ((Field) term17763).setAccessible(true);
        Object enum53 = ((Field) term17763).get((Object) null);
        Integer term17691 = new Integer(1045657203);
        Integer term17693 = new Integer(1386130016);
        Integer term17707 = new Integer(1072005683);
        Integer term17709 = new Integer(1861318859);
        Integer term17711 = new Integer(1474524152);
        Class<? extends Object> term18042 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term18041 = ((Class) term18042).getDeclaredField((String) "REISSUE");
        ((Field) term18041).setAccessible(true);
        Object enum54 = ((Field) term18041).get((Object) null);
        term17663 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term17663, term17663.getClass(), "cd_adm_result", enum53);
        setIntField(term17663, term17663.getClass(), "chg_name_price", 1375330971);
        setIntField(term17663, term17663.getClass(), "accept_idx", -478195677);
        setIntField(term17663, term17663.getClass(), "pd_id", 972867650);
        setField(term17663, term17663.getClass(), "player_name", "fWKJoSoCwE");
        setField(term17663, term17663.getClass(), "lv_num", term17691);
        setField(term17663, term17663.getClass(), "lv_pnt", term17693);
        setField(term17663, term17663.getClass(), "lv_str", "wfaXBpWAUH");
        setField(term17663, term17663.getClass(), "lv_efct_id", term17707);
        setField(term17663, term17663.getClass(), "lv_plt_id", term17709);
        setField(term17663, term17663.getClass(), "vcld_pts", term17711);
        setField(term17663, term17663.getClass(), "passwd_stat", enum54);
        setField(term17663, term17663.getClass(), "cmd", "VMeAzAHwZj");
        setField(term17663, term17663.getClass(), "req_id", "PznxWXsZME");
        setField(term17663, term17663.getClass(), "stat", "ZzIujlwVsw");
        term17761 = new Integer(568954359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term17761;
        callMethod(klass, "setVcld_pts", argTypes, term17663, args);
    }

};


