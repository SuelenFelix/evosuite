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

public class CardProcedureResponse_getVcldpts_4175581812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9633;

    public CardProcedureResponse_getVcldpts_4175581812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9731 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term9730 = ((Class) term9731).getDeclaredField((String) "FAILED");
        ((Field) term9730).setAccessible(true);
        Object enum29 = ((Field) term9730).get((Object) null);
        Integer term9660 = new Integer(292681826);
        Integer term9662 = new Integer(458147407);
        Integer term9676 = new Integer(-184153539);
        Integer term9678 = new Integer(493620644);
        Integer term9680 = new Integer(1328271830);
        Class<? extends Object> term10006 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term10005 = ((Class) term10006).getDeclaredField((String) "REISSUE");
        ((Field) term10005).setAccessible(true);
        Object enum30 = ((Field) term10005).get((Object) null);
        term9633 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term9633, term9633.getClass(), "cd_adm_result", enum29);
        setIntField(term9633, term9633.getClass(), "chg_name_price", 679763016);
        setIntField(term9633, term9633.getClass(), "accept_idx", 1962444399);
        setIntField(term9633, term9633.getClass(), "pd_id", 767834723);
        setField(term9633, term9633.getClass(), "player_name", "KoyGrUJeJW");
        setField(term9633, term9633.getClass(), "lv_num", term9660);
        setField(term9633, term9633.getClass(), "lv_pnt", term9662);
        setField(term9633, term9633.getClass(), "lv_str", "HqBOwkVqjD");
        setField(term9633, term9633.getClass(), "lv_efct_id", term9676);
        setField(term9633, term9633.getClass(), "lv_plt_id", term9678);
        setField(term9633, term9633.getClass(), "vcld_pts", term9680);
        setField(term9633, term9633.getClass(), "passwd_stat", enum30);
        setField(term9633, term9633.getClass(), "cmd", "MAcUBcBckh");
        setField(term9633, term9633.getClass(), "req_id", "oVgzLbrsFr");
        setField(term9633, term9633.getClass(), "stat", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVcld_pts", argTypes, term9633, args);
    }

};


