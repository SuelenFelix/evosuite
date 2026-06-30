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

public class CardProcedureResponse_getCdadmresult_18108816572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3021;

    public CardProcedureResponse_getCdadmresult_18108816572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3115 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term3114 = ((Class) term3115).getDeclaredField((String) "FAILED");
        ((Field) term3114).setAccessible(true);
        Object enum9 = ((Field) term3114).get((Object) null);
        Integer term3048 = new Integer(-616727354);
        Integer term3050 = new Integer(-1955890973);
        Integer term3064 = new Integer(-2038273078);
        Integer term3066 = new Integer(1227103734);
        Integer term3068 = new Integer(-1339778481);
        Class<? extends Object> term3390 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term3389 = ((Class) term3390).getDeclaredField((String) "SET");
        ((Field) term3389).setAccessible(true);
        Object enum10 = ((Field) term3389).get((Object) null);
        term3021 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term3021, term3021.getClass(), "cd_adm_result", enum9);
        setIntField(term3021, term3021.getClass(), "chg_name_price", -1339778481);
        setIntField(term3021, term3021.getClass(), "accept_idx", 1725571209);
        setIntField(term3021, term3021.getClass(), "pd_id", -522618178);
        setField(term3021, term3021.getClass(), "player_name", "eZFUvlxvGV");
        setField(term3021, term3021.getClass(), "lv_num", term3048);
        setField(term3021, term3021.getClass(), "lv_pnt", term3050);
        setField(term3021, term3021.getClass(), "lv_str", "BYqFIqCKAV");
        setField(term3021, term3021.getClass(), "lv_efct_id", term3064);
        setField(term3021, term3021.getClass(), "lv_plt_id", term3066);
        setField(term3021, term3021.getClass(), "vcld_pts", term3068);
        setField(term3021, term3021.getClass(), "passwd_stat", enum10);
        setField(term3021, term3021.getClass(), "cmd", "vrQLuWIDJX");
        setField(term3021, term3021.getClass(), "req_id", "flxyYxBRtu");
        setField(term3021, term3021.getClass(), "stat", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCd_adm_result", argTypes, term3021, args);
    }

};


