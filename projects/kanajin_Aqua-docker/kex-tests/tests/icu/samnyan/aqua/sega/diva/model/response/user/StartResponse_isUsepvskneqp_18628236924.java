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

public class StartResponse_isUsepvskneqp_18628236924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51887;

    public StartResponse_isUsepvskneqp_18628236924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52326 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term52325 = ((Class) term52326).getDeclaredField((String) "SUCCESS");
        ((Field) term52325).setAccessible(true);
        Object enum120 = ((Field) term52325).get((Object) null);
        Class<? extends Object> term52594 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term52593 = ((Class) term52594).getDeclaredField((String) "MY_LIST_B");
        ((Field) term52593).setAccessible(true);
        Object enum121 = ((Field) term52593).get((Object) null);
        Class<? extends Object> term52928 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term52927 = ((Class) term52928).getDeclaredField((String) "EASY");
        ((Field) term52927).setAccessible(true);
        Object enum122 = ((Field) term52927).get((Object) null);
        Class<? extends Object> term53197 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term53196 = ((Class) term53197).getDeclaredField((String) "EXTRA");
        ((Field) term53196).setAccessible(true);
        Object enum123 = ((Field) term53196).get((Object) null);
        Class<? extends Object> term53504 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term53503 = ((Class) term53504).getDeclaredField((String) "GOLD");
        ((Field) term53503).setAccessible(true);
        Object enum124 = ((Field) term53503).get((Object) null);
        term51887 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term51985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51990 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51887, term51887.getClass(), "pd_id", 2063762142);
        setField(term51887, term51887.getClass(), "start_result", enum120);
        setIntField(term51887, term51887.getClass(), "accept_idx", 1658391716);
        setIntField(term51887, term51887.getClass(), "start_idx", 2143282300);
        setField(term51887, term51887.getClass(), "player_name", "wdtiuPgTVJ");
        setIntField(term51887, term51887.getClass(), "hp_vol", 1137624258);
        setBooleanField(term51887, term51887.getClass(), "btn_se_vol", false);
        setIntField(term51887, term51887.getClass(), "btn_se_vol2", 977862393);
        setIntField(term51887, term51887.getClass(), "sldr_se_vol2", 301401782);
        setField(term51887, term51887.getClass(), "sort_kind", enum121);
        setIntField(term51887, term51887.getClass(), "lv_num", 1988605357);
        setIntField(term51887, term51887.getClass(), "lv_pnt", 808203320);
        setField(term51887, term51887.getClass(), "lv_str", "HUgzMgrpsK");
        setIntField(term51887, term51887.getClass(), "lv_efct_id", -544382127);
        setIntField(term51887, term51887.getClass(), "lv_plt_id", -1830198043);
        setField(term51887, term51887.getClass(), "mdl_eqp_ary", "ubaBUfLolu");
        setField(term51887, term51887.getClass(), "c_itm_eqp_ary", "itAUCFhZhq");
        setField(term51887, term51887.getClass(), "ms_itm_flg_ary", "bIqaKgXgPm");
        setIntField(term51986, term51986.getClass(), "year", 2025);
        setShortField(term51986, term51986.getClass(), "month", (short) 3);
        setShortField(term51986, term51986.getClass(), "day", (short) 9);
        setField(term51985, term51985.getClass(), "date", term51986);
        setByteField(term51990, term51990.getClass(), "hour", (byte) 5);
        setByteField(term51990, term51990.getClass(), "minute", (byte) 49);
        setByteField(term51990, term51990.getClass(), "second", (byte) 12);
        setIntField(term51990, term51990.getClass(), "nano", 791695028);
        setField(term51985, term51985.getClass(), "time", term51990);
        setField(term51887, term51887.getClass(), "mdl_eqp_tm", term51985);
        setField(term51887, term51887.getClass(), "mdl_have", "uOJFOUcNvv");
        setField(term51887, term51887.getClass(), "cstmz_itm_have", "tkmmGweDwJ");
        setBooleanField(term51887, term51887.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term51887, term51887.getClass(), "use_mdl_pri", false);
        setBooleanField(term51887, term51887.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term51887, term51887.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term51887, term51887.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term51887, term51887.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term51887, term51887.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term51887, term51887.getClass(), "vcld_pts", -439048495);
        setIntField(term51887, term51887.getClass(), "nxt_pv_id", -1849105286);
        setField(term51887, term51887.getClass(), "nxt_dffclty", enum122);
        setField(term51887, term51887.getClass(), "nxt_edtn", enum123);
        setField(term51887, term51887.getClass(), "cv_cid", "pMfTuAFXxg");
        setField(term51887, term51887.getClass(), "cv_sc", "XCZmhkblRc");
        setField(term51887, term51887.getClass(), "cv_rr", "gFUWMydGCU");
        setField(term51887, term51887.getClass(), "cv_bv", "LLegSTfqJt");
        setField(term51887, term51887.getClass(), "cv_bf", "XQfmqLbqHS");
        setIntField(term51887, term51887.getClass(), "cnp_cid", 1334483645);
        setIntField(term51887, term51887.getClass(), "cnp_val", 917513193);
        setField(term51887, term51887.getClass(), "cnp_rr", enum124);
        setField(term51887, term51887.getClass(), "cnp_sp", "jLVLqQSjqg");
        setField(term51887, term51887.getClass(), "my_lst_0", "JKGueoHesL");
        setField(term51887, term51887.getClass(), "my_lst_1", "CRAUqtVBkU");
        setField(term51887, term51887.getClass(), "my_lst_2", "DddqUYfomL");
        setField(term51887, term51887.getClass(), "my_lst_3", "YQwoogpPyi");
        setField(term51887, term51887.getClass(), "my_lst_4", "rnPhHoorxj");
        setField(term51887, term51887.getClass(), "dsp_clr_brdr", "GuwJLKquuI");
        setBooleanField(term51887, term51887.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term51887, term51887.getClass(), "dsp_clr_sts", false);
        setField(term51887, term51887.getClass(), "clr_sts", "vYMCjgnztg");
        setBooleanField(term51887, term51887.getClass(), "rgo_sts", false);
        setField(term51887, term51887.getClass(), "my_qst_id", "YupgKTSEiI");
        setField(term51887, term51887.getClass(), "my_qst_sts", "HuOUlaFmvJ");
        setField(term51887, term51887.getClass(), "my_qst_prgrs", "dWVwcwFGNo");
        setField(term51887, term51887.getClass(), "my_qst_et", "PNdLRrSAIY");
        setField(term51887, term51887.getClass(), "p_std_ie_have", "nJnRIRiLZK");
        setField(term51887, term51887.getClass(), "p_std_se_have", "eWnrMSbYbT");
        setField(term51887, term51887.getClass(), "cmd", "AjoFvDFyCY");
        setField(term51887, term51887.getClass(), "req_id", "OFTJwdPiTG");
        setField(term51887, term51887.getClass(), "stat", "QiUprSEluR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUse_pv_skn_eqp", argTypes, term51887, args);
    }

};


