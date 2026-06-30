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

public class CardProcedureResponse_setChgnameprice_112736870315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11631;
     Object term11725;

    public CardProcedureResponse_setChgnameprice_112736870315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11728 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term11727 = ((Class) term11728).getDeclaredField((String) "SUCCESS");
        ((Field) term11727).setAccessible(true);
        Object enum35 = ((Field) term11727).get((Object) null);
        Integer term11659 = new Integer(287287233);
        Integer term11661 = new Integer(962840079);
        Integer term11675 = new Integer(1540719661);
        Integer term11677 = new Integer(1265463001);
        Integer term11679 = new Integer(335112684);
        Class<? extends Object> term12006 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term12005 = ((Class) term12006).getDeclaredField((String) "SET");
        ((Field) term12005).setAccessible(true);
        Object enum36 = ((Field) term12005).get((Object) null);
        term11631 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term11631, term11631.getClass(), "cd_adm_result", enum35);
        setIntField(term11631, term11631.getClass(), "chg_name_price", 579005622);
        setIntField(term11631, term11631.getClass(), "accept_idx", -14890619);
        setIntField(term11631, term11631.getClass(), "pd_id", 1632125673);
        setField(term11631, term11631.getClass(), "player_name", "PkWMRdJcBb");
        setField(term11631, term11631.getClass(), "lv_num", term11659);
        setField(term11631, term11631.getClass(), "lv_pnt", term11661);
        setField(term11631, term11631.getClass(), "lv_str", "jSpAteRute");
        setField(term11631, term11631.getClass(), "lv_efct_id", term11675);
        setField(term11631, term11631.getClass(), "lv_plt_id", term11677);
        setField(term11631, term11631.getClass(), "vcld_pts", term11679);
        setField(term11631, term11631.getClass(), "passwd_stat", enum36);
        setField(term11631, term11631.getClass(), "cmd", "swZVeJAxjt");
        setField(term11631, term11631.getClass(), "req_id", "xOcJIiQQDu");
        setField(term11631, term11631.getClass(), "stat", "GVizqqzXpy");
        term11725 = new Integer(454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11725;
        callMethod(klass, "setChg_name_price", argTypes, term11631, args);
    }

};


