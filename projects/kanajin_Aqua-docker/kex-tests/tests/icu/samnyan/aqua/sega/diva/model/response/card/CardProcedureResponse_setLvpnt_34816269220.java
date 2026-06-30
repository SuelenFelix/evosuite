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

public class CardProcedureResponse_setLvpnt_34816269220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14963;
     Object term15057;

    public CardProcedureResponse_setLvpnt_34816269220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15060 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term15059 = ((Class) term15060).getDeclaredField((String) "FAILED");
        ((Field) term15059).setAccessible(true);
        Object enum45 = ((Field) term15059).get((Object) null);
        Integer term14990 = new Integer(-1034506028);
        Integer term14992 = new Integer(-1263114719);
        Integer term15006 = new Integer(-894662986);
        Integer term15008 = new Integer(304775596);
        Integer term15010 = new Integer(-1347665717);
        Class<? extends Object> term15335 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term15334 = ((Class) term15335).getDeclaredField((String) "MISS");
        ((Field) term15334).setAccessible(true);
        Object enum46 = ((Field) term15334).get((Object) null);
        term14963 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term14963, term14963.getClass(), "cd_adm_result", enum45);
        setIntField(term14963, term14963.getClass(), "chg_name_price", -1588772968);
        setIntField(term14963, term14963.getClass(), "accept_idx", -93135961);
        setIntField(term14963, term14963.getClass(), "pd_id", -112921587);
        setField(term14963, term14963.getClass(), "player_name", "yGtHPyvYiQ");
        setField(term14963, term14963.getClass(), "lv_num", term14990);
        setField(term14963, term14963.getClass(), "lv_pnt", term14992);
        setField(term14963, term14963.getClass(), "lv_str", "MvRIxilFMJ");
        setField(term14963, term14963.getClass(), "lv_efct_id", term15006);
        setField(term14963, term14963.getClass(), "lv_plt_id", term15008);
        setField(term14963, term14963.getClass(), "vcld_pts", term15010);
        setField(term14963, term14963.getClass(), "passwd_stat", enum46);
        setField(term14963, term14963.getClass(), "cmd", "iNwOJRBEjp");
        setField(term14963, term14963.getClass(), "req_id", "XylxrMBraH");
        setField(term14963, term14963.getClass(), "stat", "pORebkoRdD");
        term15057 = new Integer(-1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term15057;
        callMethod(klass, "setLv_pnt", argTypes, term14963, args);
    }

};


