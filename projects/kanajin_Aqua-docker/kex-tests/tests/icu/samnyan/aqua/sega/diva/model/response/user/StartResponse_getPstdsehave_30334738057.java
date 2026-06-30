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

public class StartResponse_getPstdsehave_30334738057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120573;

    public StartResponse_getPstdsehave_30334738057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term121013 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term121012 = ((Class) term121013).getDeclaredField((String) "SUCCESS");
        ((Field) term121012).setAccessible(true);
        Object enum285 = ((Field) term121012).get((Object) null);
        Class<? extends Object> term121281 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term121280 = ((Class) term121281).getDeclaredField((String) "COMPLEXITY");
        ((Field) term121280).setAccessible(true);
        Object enum286 = ((Field) term121280).get((Object) null);
        Class<? extends Object> term121618 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term121617 = ((Class) term121618).getDeclaredField((String) "HARD");
        ((Field) term121617).setAccessible(true);
        Object enum287 = ((Field) term121617).get((Object) null);
        Class<? extends Object> term121887 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term121886 = ((Class) term121887).getDeclaredField((String) "EXTRA");
        ((Field) term121886).setAccessible(true);
        Object enum288 = ((Field) term121886).get((Object) null);
        Class<? extends Object> term122194 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term122193 = ((Class) term122194).getDeclaredField((String) "GOLD");
        ((Field) term122193).setAccessible(true);
        Object enum289 = ((Field) term122193).get((Object) null);
        term120573 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term120672 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120673 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120677 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term120573, term120573.getClass(), "pd_id", -337504086);
        setField(term120573, term120573.getClass(), "start_result", enum285);
        setIntField(term120573, term120573.getClass(), "accept_idx", 2074130991);
        setIntField(term120573, term120573.getClass(), "start_idx", 532588266);
        setField(term120573, term120573.getClass(), "player_name", "yaCGGogKro");
        setIntField(term120573, term120573.getClass(), "hp_vol", -1286686332);
        setBooleanField(term120573, term120573.getClass(), "btn_se_vol", true);
        setIntField(term120573, term120573.getClass(), "btn_se_vol2", -284885486);
        setIntField(term120573, term120573.getClass(), "sldr_se_vol2", 1791984446);
        setField(term120573, term120573.getClass(), "sort_kind", enum286);
        setIntField(term120573, term120573.getClass(), "lv_num", 804070622);
        setIntField(term120573, term120573.getClass(), "lv_pnt", 1850364894);
        setField(term120573, term120573.getClass(), "lv_str", "qxrRUnjshF");
        setIntField(term120573, term120573.getClass(), "lv_efct_id", 915367534);
        setIntField(term120573, term120573.getClass(), "lv_plt_id", 1949983666);
        setField(term120573, term120573.getClass(), "mdl_eqp_ary", "WmVcapKAeJ");
        setField(term120573, term120573.getClass(), "c_itm_eqp_ary", "jevOVdQdpc");
        setField(term120573, term120573.getClass(), "ms_itm_flg_ary", "TLLVSGTNsz");
        setIntField(term120673, term120673.getClass(), "year", 2023);
        setShortField(term120673, term120673.getClass(), "month", (short) 2);
        setShortField(term120673, term120673.getClass(), "day", (short) 16);
        setField(term120672, term120672.getClass(), "date", term120673);
        setByteField(term120677, term120677.getClass(), "hour", (byte) 3);
        setByteField(term120677, term120677.getClass(), "minute", (byte) 18);
        setByteField(term120677, term120677.getClass(), "second", (byte) 56);
        setIntField(term120677, term120677.getClass(), "nano", 733017887);
        setField(term120672, term120672.getClass(), "time", term120677);
        setField(term120573, term120573.getClass(), "mdl_eqp_tm", term120672);
        setField(term120573, term120573.getClass(), "mdl_have", "mbBWfaHCrP");
        setField(term120573, term120573.getClass(), "cstmz_itm_have", "wFyiZloCxg");
        setBooleanField(term120573, term120573.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term120573, term120573.getClass(), "use_mdl_pri", false);
        setBooleanField(term120573, term120573.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term120573, term120573.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term120573, term120573.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term120573, term120573.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term120573, term120573.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term120573, term120573.getClass(), "vcld_pts", 154111854);
        setIntField(term120573, term120573.getClass(), "nxt_pv_id", 710986341);
        setField(term120573, term120573.getClass(), "nxt_dffclty", enum287);
        setField(term120573, term120573.getClass(), "nxt_edtn", enum288);
        setField(term120573, term120573.getClass(), "cv_cid", "xYztJEIPWy");
        setField(term120573, term120573.getClass(), "cv_sc", "TDQIAXaJru");
        setField(term120573, term120573.getClass(), "cv_rr", "frPMFqGmrE");
        setField(term120573, term120573.getClass(), "cv_bv", "DvfOYWcNBN");
        setField(term120573, term120573.getClass(), "cv_bf", "cvbvwpPlNk");
        setIntField(term120573, term120573.getClass(), "cnp_cid", -873958002);
        setIntField(term120573, term120573.getClass(), "cnp_val", -1780848958);
        setField(term120573, term120573.getClass(), "cnp_rr", enum289);
        setField(term120573, term120573.getClass(), "cnp_sp", "uCdLbhvYeG");
        setField(term120573, term120573.getClass(), "my_lst_0", "ipoyEHBfoG");
        setField(term120573, term120573.getClass(), "my_lst_1", "iSBTpbiteU");
        setField(term120573, term120573.getClass(), "my_lst_2", "MTwFbEoMZj");
        setField(term120573, term120573.getClass(), "my_lst_3", "uEQbnHbyAn");
        setField(term120573, term120573.getClass(), "my_lst_4", "JpFIuyNEKW");
        setField(term120573, term120573.getClass(), "dsp_clr_brdr", "NksHsgcqDx");
        setBooleanField(term120573, term120573.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term120573, term120573.getClass(), "dsp_clr_sts", true);
        setField(term120573, term120573.getClass(), "clr_sts", "RjSNvOEvcT");
        setBooleanField(term120573, term120573.getClass(), "rgo_sts", false);
        setField(term120573, term120573.getClass(), "my_qst_id", "HLzuMxigqS");
        setField(term120573, term120573.getClass(), "my_qst_sts", "wiBOoDCyzd");
        setField(term120573, term120573.getClass(), "my_qst_prgrs", "TIaFKUJELS");
        setField(term120573, term120573.getClass(), "my_qst_et", "IPmndzGjtG");
        setField(term120573, term120573.getClass(), "p_std_ie_have", "pkQiBgYrkQ");
        setField(term120573, term120573.getClass(), "p_std_se_have", "SJLRFsNagf");
        setField(term120573, term120573.getClass(), "cmd", "UsCZaSgXzI");
        setField(term120573, term120573.getClass(), "req_id", "IXZCeVwvBM");
        setField(term120573, term120573.getClass(), "stat", "ElTdyUVQYi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getP_std_se_have", argTypes, term120573, args);
    }

};


