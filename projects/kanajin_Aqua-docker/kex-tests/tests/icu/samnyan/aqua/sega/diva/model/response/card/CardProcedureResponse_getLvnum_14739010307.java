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

public class CardProcedureResponse_getLvnum_14739010307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6327;

    public CardProcedureResponse_getLvnum_14739010307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6424 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term6423 = ((Class) term6424).getDeclaredField((String) "SUCCESS");
        ((Field) term6423).setAccessible(true);
        Object enum19 = ((Field) term6423).get((Object) null);
        Integer term6355 = new Integer(-203030934);
        Integer term6357 = new Integer(-1179120542);
        Integer term6371 = new Integer(-73683645);
        Integer term6373 = new Integer(-226514366);
        Integer term6375 = new Integer(1193880199);
        Class<? extends Object> term6702 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term6701 = ((Class) term6702).getDeclaredField((String) "RESET");
        ((Field) term6701).setAccessible(true);
        Object enum20 = ((Field) term6701).get((Object) null);
        term6327 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term6327, term6327.getClass(), "cd_adm_result", enum19);
        setIntField(term6327, term6327.getClass(), "chg_name_price", -1007160944);
        setIntField(term6327, term6327.getClass(), "accept_idx", 1135664017);
        setIntField(term6327, term6327.getClass(), "pd_id", 590364439);
        setField(term6327, term6327.getClass(), "player_name", "xLbjWUgOIL");
        setField(term6327, term6327.getClass(), "lv_num", term6355);
        setField(term6327, term6327.getClass(), "lv_pnt", term6357);
        setField(term6327, term6327.getClass(), "lv_str", "jDtqGUpnZN");
        setField(term6327, term6327.getClass(), "lv_efct_id", term6371);
        setField(term6327, term6327.getClass(), "lv_plt_id", term6373);
        setField(term6327, term6327.getClass(), "vcld_pts", term6375);
        setField(term6327, term6327.getClass(), "passwd_stat", enum20);
        setField(term6327, term6327.getClass(), "cmd", "nGKItKLYNC");
        setField(term6327, term6327.getClass(), "req_id", "UiUYnPrcCi");
        setField(term6327, term6327.getClass(), "stat", "UoYtihxVaS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_num", argTypes, term6327, args);
    }

};


