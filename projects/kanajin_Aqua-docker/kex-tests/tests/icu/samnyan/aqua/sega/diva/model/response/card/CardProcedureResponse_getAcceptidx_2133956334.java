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

public class CardProcedureResponse_getAcceptidx_2133956334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4333;

    public CardProcedureResponse_getAcceptidx_2133956334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4428 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term4427 = ((Class) term4428).getDeclaredField((String) "FAILED");
        ((Field) term4427).setAccessible(true);
        Object enum13 = ((Field) term4427).get((Object) null);
        Integer term4360 = new Integer(597278769);
        Integer term4362 = new Integer(-1685132342);
        Integer term4376 = new Integer(-1456670397);
        Integer term4378 = new Integer(1622346318);
        Integer term4380 = new Integer(1048535127);
        Class<? extends Object> term4703 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term4702 = ((Class) term4703).getDeclaredField((String) "MISS");
        ((Field) term4702).setAccessible(true);
        Object enum14 = ((Field) term4702).get((Object) null);
        term4333 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term4333, term4333.getClass(), "cd_adm_result", enum13);
        setIntField(term4333, term4333.getClass(), "chg_name_price", 597278769);
        setIntField(term4333, term4333.getClass(), "accept_idx", -1685132342);
        setIntField(term4333, term4333.getClass(), "pd_id", -1456670397);
        setField(term4333, term4333.getClass(), "player_name", "SbAoxhfrkn");
        setField(term4333, term4333.getClass(), "lv_num", term4360);
        setField(term4333, term4333.getClass(), "lv_pnt", term4362);
        setField(term4333, term4333.getClass(), "lv_str", "kuTXqwMtDB");
        setField(term4333, term4333.getClass(), "lv_efct_id", term4376);
        setField(term4333, term4333.getClass(), "lv_plt_id", term4378);
        setField(term4333, term4333.getClass(), "vcld_pts", term4380);
        setField(term4333, term4333.getClass(), "passwd_stat", enum14);
        setField(term4333, term4333.getClass(), "cmd", "Ghbwtircqb");
        setField(term4333, term4333.getClass(), "req_id", "xrwlQZdwCp");
        setField(term4333, term4333.getClass(), "stat", "IDCWpPLRkE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term4333, args);
    }

};


