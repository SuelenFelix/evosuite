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

public class CardProcedureResponse_getLvstr_27822209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7655;

    public CardProcedureResponse_getLvstr_27822209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7749 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term7748 = ((Class) term7749).getDeclaredField((String) "FAILED");
        ((Field) term7748).setAccessible(true);
        Object enum23 = ((Field) term7748).get((Object) null);
        Integer term7682 = new Integer(1962444399);
        Integer term7684 = new Integer(767834723);
        Integer term7698 = new Integer(-602026508);
        Integer term7700 = new Integer(-157887805);
        Integer term7702 = new Integer(1876565163);
        Class<? extends Object> term8024 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term8023 = ((Class) term8024).getDeclaredField((String) "SET");
        ((Field) term8023).setAccessible(true);
        Object enum24 = ((Field) term8023).get((Object) null);
        term7655 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term7655, term7655.getClass(), "cd_adm_result", enum23);
        setIntField(term7655, term7655.getClass(), "chg_name_price", -203030934);
        setIntField(term7655, term7655.getClass(), "accept_idx", -1179120542);
        setIntField(term7655, term7655.getClass(), "pd_id", -73683645);
        setField(term7655, term7655.getClass(), "player_name", "ytSBIKXogI");
        setField(term7655, term7655.getClass(), "lv_num", term7682);
        setField(term7655, term7655.getClass(), "lv_pnt", term7684);
        setField(term7655, term7655.getClass(), "lv_str", "nHXjMycHlU");
        setField(term7655, term7655.getClass(), "lv_efct_id", term7698);
        setField(term7655, term7655.getClass(), "lv_plt_id", term7700);
        setField(term7655, term7655.getClass(), "vcld_pts", term7702);
        setField(term7655, term7655.getClass(), "passwd_stat", enum24);
        setField(term7655, term7655.getClass(), "cmd", "ieCtQFdkii");
        setField(term7655, term7655.getClass(), "req_id", "dEnhdmILtU");
        setField(term7655, term7655.getClass(), "stat", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_str", argTypes, term7655, args);
    }

};


