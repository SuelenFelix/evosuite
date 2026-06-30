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

public class CardProcedureResponse_setAcceptidx_112777541116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12291;
     Object term12386;

    public CardProcedureResponse_setAcceptidx_112777541116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12389 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term12388 = ((Class) term12389).getDeclaredField((String) "SUCCESS");
        ((Field) term12388).setAccessible(true);
        Object enum37 = ((Field) term12388).get((Object) null);
        Integer term12319 = new Integer(1551099402);
        Integer term12321 = new Integer(-2027534003);
        Integer term12335 = new Integer(1063420942);
        Integer term12337 = new Integer(1375330971);
        Integer term12339 = new Integer(-478195677);
        Class<? extends Object> term12667 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term12666 = ((Class) term12667).getDeclaredField((String) "MISS");
        ((Field) term12666).setAccessible(true);
        Object enum38 = ((Field) term12666).get((Object) null);
        term12291 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term12291, term12291.getClass(), "cd_adm_result", enum37);
        setIntField(term12291, term12291.getClass(), "chg_name_price", -1786399638);
        setIntField(term12291, term12291.getClass(), "accept_idx", 2055867847);
        setIntField(term12291, term12291.getClass(), "pd_id", -1048298087);
        setField(term12291, term12291.getClass(), "player_name", "JqXGgAhZPl");
        setField(term12291, term12291.getClass(), "lv_num", term12319);
        setField(term12291, term12291.getClass(), "lv_pnt", term12321);
        setField(term12291, term12291.getClass(), "lv_str", "jiKYgYHqIS");
        setField(term12291, term12291.getClass(), "lv_efct_id", term12335);
        setField(term12291, term12291.getClass(), "lv_plt_id", term12337);
        setField(term12291, term12291.getClass(), "vcld_pts", term12339);
        setField(term12291, term12291.getClass(), "passwd_stat", enum38);
        setField(term12291, term12291.getClass(), "cmd", "DfISiziTgG");
        setField(term12291, term12291.getClass(), "req_id", "XqgfKFvPSD");
        setField(term12291, term12291.getClass(), "stat", "JiVRgTZvKc");
        term12386 = new Integer(292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12386;
        callMethod(klass, "setAccept_idx", argTypes, term12291, args);
    }

};


