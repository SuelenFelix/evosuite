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
import java.lang.Integer;

public class StartResponse_setVcldpts_150869479286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181483;
     Object term181928;

    public StartResponse_setVcldpts_150869479286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term181931 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term181930 = ((Class) term181931).getDeclaredField((String) "FAILED");
        ((Field) term181930).setAccessible(true);
        Object enum431 = ((Field) term181930).get((Object) null);
        Class<? extends Object> term182196 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term182195 = ((Class) term182196).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term182195).setAccessible(true);
        Object enum432 = ((Field) term182195).get((Object) null);
        Class<? extends Object> term182539 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term182538 = ((Class) term182539).getDeclaredField((String) "EXTREME");
        ((Field) term182538).setAccessible(true);
        Object enum433 = ((Field) term182538).get((Object) null);
        Class<? extends Object> term182817 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term182816 = ((Class) term182817).getDeclaredField((String) "EXTRA");
        ((Field) term182816).setAccessible(true);
        Object enum434 = ((Field) term182816).get((Object) null);
        Class<? extends Object> term183124 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term183123 = ((Class) term183124).getDeclaredField((String) "SILVER");
        ((Field) term183123).setAccessible(true);
        Object enum435 = ((Field) term183123).get((Object) null);
        term181483 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term181583 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181584 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181588 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term181483, term181483.getClass(), "pd_id", 522440332);
        setField(term181483, term181483.getClass(), "start_result", enum431);
        setIntField(term181483, term181483.getClass(), "accept_idx", 1516598327);
        setIntField(term181483, term181483.getClass(), "start_idx", 82353584);
        setField(term181483, term181483.getClass(), "player_name", "XcJqDBnnMZ");
        setIntField(term181483, term181483.getClass(), "hp_vol", -758778797);
        setBooleanField(term181483, term181483.getClass(), "btn_se_vol", false);
        setIntField(term181483, term181483.getClass(), "btn_se_vol2", 765680355);
        setIntField(term181483, term181483.getClass(), "sldr_se_vol2", -1012090049);
        setField(term181483, term181483.getClass(), "sort_kind", enum432);
        setIntField(term181483, term181483.getClass(), "lv_num", -2025214553);
        setIntField(term181483, term181483.getClass(), "lv_pnt", -154750730);
        setField(term181483, term181483.getClass(), "lv_str", "SchXFoqYFy");
        setIntField(term181483, term181483.getClass(), "lv_efct_id", -2047179134);
        setIntField(term181483, term181483.getClass(), "lv_plt_id", 44908093);
        setField(term181483, term181483.getClass(), "mdl_eqp_ary", "MnHKbTZBTr");
        setField(term181483, term181483.getClass(), "c_itm_eqp_ary", "xCNDHQZBKx");
        setField(term181483, term181483.getClass(), "ms_itm_flg_ary", "OfXdotjbuM");
        setIntField(term181584, term181584.getClass(), "year", 2024);
        setShortField(term181584, term181584.getClass(), "month", (short) 2);
        setShortField(term181584, term181584.getClass(), "day", (short) 5);
        setField(term181583, term181583.getClass(), "date", term181584);
        setByteField(term181588, term181588.getClass(), "hour", (byte) 12);
        setByteField(term181588, term181588.getClass(), "minute", (byte) 28);
        setByteField(term181588, term181588.getClass(), "second", (byte) 37);
        setIntField(term181588, term181588.getClass(), "nano", 689695229);
        setField(term181583, term181583.getClass(), "time", term181588);
        setField(term181483, term181483.getClass(), "mdl_eqp_tm", term181583);
        setField(term181483, term181483.getClass(), "mdl_have", "DNkENYBesD");
        setField(term181483, term181483.getClass(), "cstmz_itm_have", "TSogTVVlxc");
        setBooleanField(term181483, term181483.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term181483, term181483.getClass(), "use_mdl_pri", true);
        setBooleanField(term181483, term181483.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term181483, term181483.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term181483, term181483.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term181483, term181483.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term181483, term181483.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term181483, term181483.getClass(), "vcld_pts", 887198203);
        setIntField(term181483, term181483.getClass(), "nxt_pv_id", 12581312);
        setField(term181483, term181483.getClass(), "nxt_dffclty", enum433);
        setField(term181483, term181483.getClass(), "nxt_edtn", enum434);
        setField(term181483, term181483.getClass(), "cv_cid", "kWEJlReukq");
        setField(term181483, term181483.getClass(), "cv_sc", "jkCUxevJxb");
        setField(term181483, term181483.getClass(), "cv_rr", "WqobQIRpLc");
        setField(term181483, term181483.getClass(), "cv_bv", "jesZbitPYU");
        setField(term181483, term181483.getClass(), "cv_bf", "oIbEvXxpda");
        setIntField(term181483, term181483.getClass(), "cnp_cid", 2087383644);
        setIntField(term181483, term181483.getClass(), "cnp_val", 405527523);
        setField(term181483, term181483.getClass(), "cnp_rr", enum435);
        setField(term181483, term181483.getClass(), "cnp_sp", "QyHVDeaOqb");
        setField(term181483, term181483.getClass(), "my_lst_0", "ZwnEWySrcE");
        setField(term181483, term181483.getClass(), "my_lst_1", "laQWfyDqCq");
        setField(term181483, term181483.getClass(), "my_lst_2", "gMFGfpbPZE");
        setField(term181483, term181483.getClass(), "my_lst_3", "QcfydYbOGP");
        setField(term181483, term181483.getClass(), "my_lst_4", "FdMzwKizAk");
        setField(term181483, term181483.getClass(), "dsp_clr_brdr", "jjwHVTqCkP");
        setBooleanField(term181483, term181483.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term181483, term181483.getClass(), "dsp_clr_sts", true);
        setField(term181483, term181483.getClass(), "clr_sts", "uUAkxSFPyL");
        setBooleanField(term181483, term181483.getClass(), "rgo_sts", false);
        setField(term181483, term181483.getClass(), "my_qst_id", "XfzbAdTaCO");
        setField(term181483, term181483.getClass(), "my_qst_sts", "rDcGfVDmsE");
        setField(term181483, term181483.getClass(), "my_qst_prgrs", "agspBqCjgG");
        setField(term181483, term181483.getClass(), "my_qst_et", "HMJaeNiTNW");
        setField(term181483, term181483.getClass(), "p_std_ie_have", "ggcJNlLcZb");
        setField(term181483, term181483.getClass(), "p_std_se_have", "EzhvjUZCQP");
        setField(term181483, term181483.getClass(), "cmd", "FTHebphiPR");
        setField(term181483, term181483.getClass(), "req_id", "OQjMPmyJQz");
        setField(term181483, term181483.getClass(), "stat", "FZQimBsMNt");
        term181928 = new Integer(-1123526433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term181928;
        callMethod(klass, "setVcld_pts", argTypes, term181483, args);
    }

};


