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

public class StartResponse_getMdlhave_128971346420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43571;

    public StartResponse_getMdlhave_128971346420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44013 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term44012 = ((Class) term44013).getDeclaredField((String) "SUCCESS");
        ((Field) term44012).setAccessible(true);
        Object enum100 = ((Field) term44012).get((Object) null);
        Class<? extends Object> term44281 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term44280 = ((Class) term44281).getDeclaredField((String) "MY_LIST_B");
        ((Field) term44280).setAccessible(true);
        Object enum101 = ((Field) term44280).get((Object) null);
        Class<? extends Object> term44615 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term44614 = ((Class) term44615).getDeclaredField((String) "EXTREME");
        ((Field) term44614).setAccessible(true);
        Object enum102 = ((Field) term44614).get((Object) null);
        Class<? extends Object> term44893 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term44892 = ((Class) term44893).getDeclaredField((String) "EXTRA");
        ((Field) term44892).setAccessible(true);
        Object enum103 = ((Field) term44892).get((Object) null);
        Class<? extends Object> term45200 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term45199 = ((Class) term45200).getDeclaredField((String) "GOLD");
        ((Field) term45199).setAccessible(true);
        Object enum104 = ((Field) term45199).get((Object) null);
        term43571 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term43669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43674 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term43571, term43571.getClass(), "pd_id", -2070466617);
        setField(term43571, term43571.getClass(), "start_result", enum100);
        setIntField(term43571, term43571.getClass(), "accept_idx", -1127721881);
        setIntField(term43571, term43571.getClass(), "start_idx", 1074848808);
        setField(term43571, term43571.getClass(), "player_name", "LvztehSlhM");
        setIntField(term43571, term43571.getClass(), "hp_vol", -146054762);
        setBooleanField(term43571, term43571.getClass(), "btn_se_vol", false);
        setIntField(term43571, term43571.getClass(), "btn_se_vol2", 798043553);
        setIntField(term43571, term43571.getClass(), "sldr_se_vol2", 533197381);
        setField(term43571, term43571.getClass(), "sort_kind", enum101);
        setIntField(term43571, term43571.getClass(), "lv_num", 1048271679);
        setIntField(term43571, term43571.getClass(), "lv_pnt", -1529797673);
        setField(term43571, term43571.getClass(), "lv_str", "njvnWFTMxN");
        setIntField(term43571, term43571.getClass(), "lv_efct_id", -868676396);
        setIntField(term43571, term43571.getClass(), "lv_plt_id", 1922684808);
        setField(term43571, term43571.getClass(), "mdl_eqp_ary", "fLRqcTSfzF");
        setField(term43571, term43571.getClass(), "c_itm_eqp_ary", "EBYHwsuWAU");
        setField(term43571, term43571.getClass(), "ms_itm_flg_ary", "PtIjKpiSix");
        setIntField(term43670, term43670.getClass(), "year", 2014);
        setShortField(term43670, term43670.getClass(), "month", (short) 7);
        setShortField(term43670, term43670.getClass(), "day", (short) 13);
        setField(term43669, term43669.getClass(), "date", term43670);
        setByteField(term43674, term43674.getClass(), "hour", (byte) 21);
        setByteField(term43674, term43674.getClass(), "minute", (byte) 46);
        setByteField(term43674, term43674.getClass(), "second", (byte) 0);
        setIntField(term43674, term43674.getClass(), "nano", 887884128);
        setField(term43669, term43669.getClass(), "time", term43674);
        setField(term43571, term43571.getClass(), "mdl_eqp_tm", term43669);
        setField(term43571, term43571.getClass(), "mdl_have", "NZdTuwSCIM");
        setField(term43571, term43571.getClass(), "cstmz_itm_have", "dDHcmzPAmP");
        setBooleanField(term43571, term43571.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term43571, term43571.getClass(), "use_mdl_pri", true);
        setBooleanField(term43571, term43571.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term43571, term43571.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term43571, term43571.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term43571, term43571.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term43571, term43571.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term43571, term43571.getClass(), "vcld_pts", -2005784375);
        setIntField(term43571, term43571.getClass(), "nxt_pv_id", -288604325);
        setField(term43571, term43571.getClass(), "nxt_dffclty", enum102);
        setField(term43571, term43571.getClass(), "nxt_edtn", enum103);
        setField(term43571, term43571.getClass(), "cv_cid", "HEaTkWYBgv");
        setField(term43571, term43571.getClass(), "cv_sc", "MpJsPKLTIU");
        setField(term43571, term43571.getClass(), "cv_rr", "IiNCZfdouL");
        setField(term43571, term43571.getClass(), "cv_bv", "AhOHzCsHKW");
        setField(term43571, term43571.getClass(), "cv_bf", "UqgLPaaAHi");
        setIntField(term43571, term43571.getClass(), "cnp_cid", -1268314569);
        setIntField(term43571, term43571.getClass(), "cnp_val", 877649659);
        setField(term43571, term43571.getClass(), "cnp_rr", enum104);
        setField(term43571, term43571.getClass(), "cnp_sp", "xypryEkUPF");
        setField(term43571, term43571.getClass(), "my_lst_0", "zyZTzHNjQr");
        setField(term43571, term43571.getClass(), "my_lst_1", "YSrFKQQwXE");
        setField(term43571, term43571.getClass(), "my_lst_2", "qxhOsmyyjm");
        setField(term43571, term43571.getClass(), "my_lst_3", "DuKcNfVVYR");
        setField(term43571, term43571.getClass(), "my_lst_4", "fRujHWvXjJ");
        setField(term43571, term43571.getClass(), "dsp_clr_brdr", "EAIAAStlTz");
        setBooleanField(term43571, term43571.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term43571, term43571.getClass(), "dsp_clr_sts", false);
        setField(term43571, term43571.getClass(), "clr_sts", "yIWXcOQTgy");
        setBooleanField(term43571, term43571.getClass(), "rgo_sts", true);
        setField(term43571, term43571.getClass(), "my_qst_id", "xAWekqanqc");
        setField(term43571, term43571.getClass(), "my_qst_sts", "GSOWFHMlbF");
        setField(term43571, term43571.getClass(), "my_qst_prgrs", "vpZIqpFbKM");
        setField(term43571, term43571.getClass(), "my_qst_et", "dAbwpJCDif");
        setField(term43571, term43571.getClass(), "p_std_ie_have", "ATSXJPySio");
        setField(term43571, term43571.getClass(), "p_std_se_have", "XZkOUcbfFg");
        setField(term43571, term43571.getClass(), "cmd", "TGiJfagfky");
        setField(term43571, term43571.getClass(), "req_id", "BJklinBmhN");
        setField(term43571, term43571.getClass(), "stat", "IOddzvEWcl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdl_have", argTypes, term43571, args);
    }

};


