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
import java.lang.Boolean;

public class StartResponse_setUsepvsldrtchseeqp_204026787985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179387;
     Object term179831;

    public StartResponse_setUsepvsldrtchseeqp_204026787985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term179834 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term179833 = ((Class) term179834).getDeclaredField((String) "SUCCESS");
        ((Field) term179833).setAccessible(true);
        Object enum426 = ((Field) term179833).get((Object) null);
        Class<? extends Object> term180102 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term180101 = ((Class) term180102).getDeclaredField((String) "COMPLEXITY");
        ((Field) term180101).setAccessible(true);
        Object enum427 = ((Field) term180101).get((Object) null);
        Class<? extends Object> term180439 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term180438 = ((Class) term180439).getDeclaredField((String) "HARD");
        ((Field) term180438).setAccessible(true);
        Object enum428 = ((Field) term180438).get((Object) null);
        Class<? extends Object> term180708 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term180707 = ((Class) term180708).getDeclaredField((String) "ORIGINAL");
        ((Field) term180707).setAccessible(true);
        Object enum429 = ((Field) term180707).get((Object) null);
        Class<? extends Object> term181024 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term181023 = ((Class) term181024).getDeclaredField((String) "BRONZE");
        ((Field) term181023).setAccessible(true);
        Object enum430 = ((Field) term181023).get((Object) null);
        term179387 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term179486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179491 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term179387, term179387.getClass(), "pd_id", 1455842357);
        setField(term179387, term179387.getClass(), "start_result", enum426);
        setIntField(term179387, term179387.getClass(), "accept_idx", 1349806561);
        setIntField(term179387, term179387.getClass(), "start_idx", 923905351);
        setField(term179387, term179387.getClass(), "player_name", "tVJNKfGPYg");
        setIntField(term179387, term179387.getClass(), "hp_vol", 428360161);
        setBooleanField(term179387, term179387.getClass(), "btn_se_vol", true);
        setIntField(term179387, term179387.getClass(), "btn_se_vol2", 631528579);
        setIntField(term179387, term179387.getClass(), "sldr_se_vol2", -1652091834);
        setField(term179387, term179387.getClass(), "sort_kind", enum427);
        setIntField(term179387, term179387.getClass(), "lv_num", -282021579);
        setIntField(term179387, term179387.getClass(), "lv_pnt", -1652588127);
        setField(term179387, term179387.getClass(), "lv_str", "AlAUNSOTmH");
        setIntField(term179387, term179387.getClass(), "lv_efct_id", -1902823385);
        setIntField(term179387, term179387.getClass(), "lv_plt_id", -784924879);
        setField(term179387, term179387.getClass(), "mdl_eqp_ary", "IeuSZGvhvH");
        setField(term179387, term179387.getClass(), "c_itm_eqp_ary", "zCejWZdaIc");
        setField(term179387, term179387.getClass(), "ms_itm_flg_ary", "aCfzlsgXhB");
        setIntField(term179487, term179487.getClass(), "year", 2025);
        setShortField(term179487, term179487.getClass(), "month", (short) 12);
        setShortField(term179487, term179487.getClass(), "day", (short) 16);
        setField(term179486, term179486.getClass(), "date", term179487);
        setByteField(term179491, term179491.getClass(), "hour", (byte) 7);
        setByteField(term179491, term179491.getClass(), "minute", (byte) 53);
        setByteField(term179491, term179491.getClass(), "second", (byte) 23);
        setIntField(term179491, term179491.getClass(), "nano", 532991944);
        setField(term179486, term179486.getClass(), "time", term179491);
        setField(term179387, term179387.getClass(), "mdl_eqp_tm", term179486);
        setField(term179387, term179387.getClass(), "mdl_have", "HmhoMiUgEv");
        setField(term179387, term179387.getClass(), "cstmz_itm_have", "MuJvYyPzjX");
        setBooleanField(term179387, term179387.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term179387, term179387.getClass(), "use_mdl_pri", true);
        setBooleanField(term179387, term179387.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term179387, term179387.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term179387, term179387.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term179387, term179387.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term179387, term179387.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term179387, term179387.getClass(), "vcld_pts", -1062027102);
        setIntField(term179387, term179387.getClass(), "nxt_pv_id", 1763217806);
        setField(term179387, term179387.getClass(), "nxt_dffclty", enum428);
        setField(term179387, term179387.getClass(), "nxt_edtn", enum429);
        setField(term179387, term179387.getClass(), "cv_cid", "pEZeQhLjKN");
        setField(term179387, term179387.getClass(), "cv_sc", "saKRDpPnGD");
        setField(term179387, term179387.getClass(), "cv_rr", "UesGweYSco");
        setField(term179387, term179387.getClass(), "cv_bv", "uVnPUUZHSY");
        setField(term179387, term179387.getClass(), "cv_bf", "LaWPqdDqyl");
        setIntField(term179387, term179387.getClass(), "cnp_cid", 1644949396);
        setIntField(term179387, term179387.getClass(), "cnp_val", -2017073245);
        setField(term179387, term179387.getClass(), "cnp_rr", enum430);
        setField(term179387, term179387.getClass(), "cnp_sp", "BGDjrSZTJY");
        setField(term179387, term179387.getClass(), "my_lst_0", "VUVCEVItic");
        setField(term179387, term179387.getClass(), "my_lst_1", "tloEDDASGy");
        setField(term179387, term179387.getClass(), "my_lst_2", "CQMdMBIICe");
        setField(term179387, term179387.getClass(), "my_lst_3", "rbJaIkrSnM");
        setField(term179387, term179387.getClass(), "my_lst_4", "EAKcPFEKbX");
        setField(term179387, term179387.getClass(), "dsp_clr_brdr", "uPdAMNFhdG");
        setBooleanField(term179387, term179387.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term179387, term179387.getClass(), "dsp_clr_sts", true);
        setField(term179387, term179387.getClass(), "clr_sts", "VjXPlvOnMK");
        setBooleanField(term179387, term179387.getClass(), "rgo_sts", true);
        setField(term179387, term179387.getClass(), "my_qst_id", "VVfwcKWfYk");
        setField(term179387, term179387.getClass(), "my_qst_sts", "tsYXZxQtLG");
        setField(term179387, term179387.getClass(), "my_qst_prgrs", "JUAWRJdehl");
        setField(term179387, term179387.getClass(), "my_qst_et", "fFslDwqqzQ");
        setField(term179387, term179387.getClass(), "p_std_ie_have", "oyTybTkTFd");
        setField(term179387, term179387.getClass(), "p_std_se_have", "NNjMZLPIcc");
        setField(term179387, term179387.getClass(), "cmd", "fAcvTHLHOa");
        setField(term179387, term179387.getClass(), "req_id", "QavvcNVesW");
        setField(term179387, term179387.getClass(), "stat", "JmFxhkDeIA");
        term179831 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term179831;
        callMethod(klass, "setUse_pv_sldr_tch_se_eqp", argTypes, term179387, args);
    }

};


