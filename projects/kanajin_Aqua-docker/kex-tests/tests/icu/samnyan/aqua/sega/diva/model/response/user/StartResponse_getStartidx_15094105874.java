package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StartResponse_getStartidx_15094105874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10243;

    public StartResponse_getStartidx_15094105874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10684 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term10683 = ((Class) term10684).getDeclaredField((String) "SUCCESS");
        ((Field) term10683).setAccessible(true);
        Object enum20 = ((Field) term10683).get((Object) null);
        Class<? extends Object> term10952 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term10951 = ((Class) term10952).getDeclaredField((String) "MY_LIST_A");
        ((Field) term10951).setAccessible(true);
        Object enum21 = ((Field) term10951).get((Object) null);
        Class<? extends Object> term11286 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term11285 = ((Class) term11286).getDeclaredField((String) "HARD");
        ((Field) term11285).setAccessible(true);
        Object enum22 = ((Field) term11285).get((Object) null);
        Class<? extends Object> term11555 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term11554 = ((Class) term11555).getDeclaredField((String) "EXTRA");
        ((Field) term11554).setAccessible(true);
        Object enum23 = ((Field) term11554).get((Object) null);
        Class<? extends Object> term11862 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term11861 = ((Class) term11862).getDeclaredField((String) "SILVER");
        ((Field) term11861).setAccessible(true);
        Object enum24 = ((Field) term11861).get((Object) null);
        term10243 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term10341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10346 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term10243, term10243.getClass(), "pd_id", -1801760683);
        setField(term10243, term10243.getClass(), "start_result", enum20);
        setIntField(term10243, term10243.getClass(), "accept_idx", 1141317871);
        setIntField(term10243, term10243.getClass(), "start_idx", 890669485);
        setField(term10243, term10243.getClass(), "player_name", "ekxGuOYIwi");
        setIntField(term10243, term10243.getClass(), "hp_vol", 691577392);
        setBooleanField(term10243, term10243.getClass(), "btn_se_vol", false);
        setIntField(term10243, term10243.getClass(), "btn_se_vol2", -893623680);
        setIntField(term10243, term10243.getClass(), "sldr_se_vol2", -1963434938);
        setField(term10243, term10243.getClass(), "sort_kind", enum21);
        setIntField(term10243, term10243.getClass(), "lv_num", 906181092);
        setIntField(term10243, term10243.getClass(), "lv_pnt", 1045657203);
        setField(term10243, term10243.getClass(), "lv_str", "RbVQXSpxXy");
        setIntField(term10243, term10243.getClass(), "lv_efct_id", 1386130016);
        setIntField(term10243, term10243.getClass(), "lv_plt_id", 1072005683);
        setField(term10243, term10243.getClass(), "mdl_eqp_ary", "YpJbIgJWWv");
        setField(term10243, term10243.getClass(), "c_itm_eqp_ary", "JppkknKVOw");
        setField(term10243, term10243.getClass(), "ms_itm_flg_ary", "iljANwuEjk");
        setIntField(term10342, term10342.getClass(), "year", 2022);
        setShortField(term10342, term10342.getClass(), "month", (short) 2);
        setShortField(term10342, term10342.getClass(), "day", (short) 26);
        setField(term10341, term10341.getClass(), "date", term10342);
        setByteField(term10346, term10346.getClass(), "hour", (byte) 11);
        setByteField(term10346, term10346.getClass(), "minute", (byte) 42);
        setByteField(term10346, term10346.getClass(), "second", (byte) 15);
        setIntField(term10346, term10346.getClass(), "nano", 377731937);
        setField(term10341, term10341.getClass(), "time", term10346);
        setField(term10243, term10243.getClass(), "mdl_eqp_tm", term10341);
        setField(term10243, term10243.getClass(), "mdl_have", "kNqaJKIATy");
        setField(term10243, term10243.getClass(), "cstmz_itm_have", "vKQukfbJUd");
        setBooleanField(term10243, term10243.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term10243, term10243.getClass(), "use_mdl_pri", true);
        setBooleanField(term10243, term10243.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term10243, term10243.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term10243, term10243.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term10243, term10243.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term10243, term10243.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term10243, term10243.getClass(), "vcld_pts", 1861318859);
        setIntField(term10243, term10243.getClass(), "nxt_pv_id", 1474524152);
        setField(term10243, term10243.getClass(), "nxt_dffclty", enum22);
        setField(term10243, term10243.getClass(), "nxt_edtn", enum23);
        setField(term10243, term10243.getClass(), "cv_cid", "lFRJFUMVbx");
        setField(term10243, term10243.getClass(), "cv_sc", "sZdUNdggUW");
        setField(term10243, term10243.getClass(), "cv_rr", "OqbwYQfvAe");
        setField(term10243, term10243.getClass(), "cv_bv", "tRxZafjqIx");
        setField(term10243, term10243.getClass(), "cv_bf", "DhjNLmRMCu");
        setIntField(term10243, term10243.getClass(), "cnp_cid", 568954359);
        setIntField(term10243, term10243.getClass(), "cnp_val", 53410913);
        setField(term10243, term10243.getClass(), "cnp_rr", enum24);
        setField(term10243, term10243.getClass(), "cnp_sp", "PgPzMSEjjX");
        setField(term10243, term10243.getClass(), "my_lst_0", "wzsPSPcRdj");
        setField(term10243, term10243.getClass(), "my_lst_1", "kGMQdqJYyB");
        setField(term10243, term10243.getClass(), "my_lst_2", "XJJNClzHRf");
        setField(term10243, term10243.getClass(), "my_lst_3", "HDaezxQfQR");
        setField(term10243, term10243.getClass(), "my_lst_4", "iikZEapDlu");
        setField(term10243, term10243.getClass(), "dsp_clr_brdr", "nhoHrZfnIN");
        setBooleanField(term10243, term10243.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term10243, term10243.getClass(), "dsp_clr_sts", false);
        setField(term10243, term10243.getClass(), "clr_sts", "ZkMALXpEAZ");
        setBooleanField(term10243, term10243.getClass(), "rgo_sts", true);
        setField(term10243, term10243.getClass(), "my_qst_id", "tXfQjSqDzN");
        setField(term10243, term10243.getClass(), "my_qst_sts", "BjugTaMcxJ");
        setField(term10243, term10243.getClass(), "my_qst_prgrs", "vGiuZVPJNH");
        setField(term10243, term10243.getClass(), "my_qst_et", "tlzpzIjMib");
        setField(term10243, term10243.getClass(), "p_std_ie_have", "AZdLeSugwv");
        setField(term10243, term10243.getClass(), "p_std_se_have", "RMsXuyzKJV");
        setField(term10243, term10243.getClass(), "cmd", "FwPbDZcHmB");
        setField(term10243, term10243.getClass(), "req_id", "hOncybyCAH");
        setField(term10243, term10243.getClass(), "stat", "QduALnDSVo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart_idx", argTypes, term10243, args);
    }

};


