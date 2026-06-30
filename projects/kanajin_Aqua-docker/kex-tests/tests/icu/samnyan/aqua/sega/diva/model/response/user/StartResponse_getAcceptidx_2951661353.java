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

public class StartResponse_getAcceptidx_2951661353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8145;

    public StartResponse_getAcceptidx_2951661353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8591 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term8590 = ((Class) term8591).getDeclaredField((String) "FAILED");
        ((Field) term8590).setAccessible(true);
        Object enum15 = ((Field) term8590).get((Object) null);
        Class<? extends Object> term8856 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term8855 = ((Class) term8856).getDeclaredField((String) "MY_LIST_C");
        ((Field) term8855).setAccessible(true);
        Object enum16 = ((Field) term8855).get((Object) null);
        Class<? extends Object> term9190 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term9189 = ((Class) term9190).getDeclaredField((String) "UNDEFINED");
        ((Field) term9189).setAccessible(true);
        Object enum17 = ((Field) term9189).get((Object) null);
        Class<? extends Object> term9474 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term9473 = ((Class) term9474).getDeclaredField((String) "ORIGINAL");
        ((Field) term9473).setAccessible(true);
        Object enum18 = ((Field) term9473).get((Object) null);
        Class<? extends Object> term9790 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term9789 = ((Class) term9790).getDeclaredField((String) "NONE");
        ((Field) term9789).setAccessible(true);
        Object enum19 = ((Field) term9789).get((Object) null);
        term8145 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term8242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8247 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8145, term8145.getClass(), "pd_id", -894662986);
        setField(term8145, term8145.getClass(), "start_result", enum15);
        setIntField(term8145, term8145.getClass(), "accept_idx", 304775596);
        setIntField(term8145, term8145.getClass(), "start_idx", -1347665717);
        setField(term8145, term8145.getClass(), "player_name", "XkIoWJRNwN");
        setIntField(term8145, term8145.getClass(), "hp_vol", -1888585309);
        setBooleanField(term8145, term8145.getClass(), "btn_se_vol", true);
        setIntField(term8145, term8145.getClass(), "btn_se_vol2", 683666002);
        setIntField(term8145, term8145.getClass(), "sldr_se_vol2", 1596213415);
        setField(term8145, term8145.getClass(), "sort_kind", enum16);
        setIntField(term8145, term8145.getClass(), "lv_num", -268815336);
        setIntField(term8145, term8145.getClass(), "lv_pnt", -1210583429);
        setField(term8145, term8145.getClass(), "lv_str", "aNWLJdrZMq");
        setIntField(term8145, term8145.getClass(), "lv_efct_id", -663691365);
        setIntField(term8145, term8145.getClass(), "lv_plt_id", 339854490);
        setField(term8145, term8145.getClass(), "mdl_eqp_ary", "HHmNoYxIGj");
        setField(term8145, term8145.getClass(), "c_itm_eqp_ary", "PtirvZmsGt");
        setField(term8145, term8145.getClass(), "ms_itm_flg_ary", "HWkpTmtlrc");
        setIntField(term8243, term8243.getClass(), "year", 2015);
        setShortField(term8243, term8243.getClass(), "month", (short) 4);
        setShortField(term8243, term8243.getClass(), "day", (short) 14);
        setField(term8242, term8242.getClass(), "date", term8243);
        setByteField(term8247, term8247.getClass(), "hour", (byte) 18);
        setByteField(term8247, term8247.getClass(), "minute", (byte) 24);
        setByteField(term8247, term8247.getClass(), "second", (byte) 32);
        setIntField(term8247, term8247.getClass(), "nano", 369233818);
        setField(term8242, term8242.getClass(), "time", term8247);
        setField(term8145, term8145.getClass(), "mdl_eqp_tm", term8242);
        setField(term8145, term8145.getClass(), "mdl_have", "hMmaoREuCK");
        setField(term8145, term8145.getClass(), "cstmz_itm_have", "VeDtgDzGAN");
        setBooleanField(term8145, term8145.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term8145, term8145.getClass(), "use_mdl_pri", true);
        setBooleanField(term8145, term8145.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term8145, term8145.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term8145, term8145.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term8145, term8145.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term8145, term8145.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term8145, term8145.getClass(), "vcld_pts", -615654495);
        setIntField(term8145, term8145.getClass(), "nxt_pv_id", -1476117762);
        setField(term8145, term8145.getClass(), "nxt_dffclty", enum17);
        setField(term8145, term8145.getClass(), "nxt_edtn", enum18);
        setField(term8145, term8145.getClass(), "cv_cid", "aWYOWZFyaX");
        setField(term8145, term8145.getClass(), "cv_sc", "BRIVNtfUWU");
        setField(term8145, term8145.getClass(), "cv_rr", "DbiCVtPPCT");
        setField(term8145, term8145.getClass(), "cv_bv", "WzFopsaDuG");
        setField(term8145, term8145.getClass(), "cv_bf", "PapWxkhEWe");
        setIntField(term8145, term8145.getClass(), "cnp_cid", -341962980);
        setIntField(term8145, term8145.getClass(), "cnp_val", 1532716628);
        setField(term8145, term8145.getClass(), "cnp_rr", enum19);
        setField(term8145, term8145.getClass(), "cnp_sp", "smnHEqRFRx");
        setField(term8145, term8145.getClass(), "my_lst_0", "XYtryyobou");
        setField(term8145, term8145.getClass(), "my_lst_1", "OYbzXylRWW");
        setField(term8145, term8145.getClass(), "my_lst_2", "DSNsTGYXDF");
        setField(term8145, term8145.getClass(), "my_lst_3", "sQvGcVjdEx");
        setField(term8145, term8145.getClass(), "my_lst_4", "rLHAoqXgPh");
        setField(term8145, term8145.getClass(), "dsp_clr_brdr", "zUlRdimJtU");
        setBooleanField(term8145, term8145.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term8145, term8145.getClass(), "dsp_clr_sts", true);
        setField(term8145, term8145.getClass(), "clr_sts", "vwbEQQNQrx");
        setBooleanField(term8145, term8145.getClass(), "rgo_sts", true);
        setField(term8145, term8145.getClass(), "my_qst_id", "xtftXXMbem");
        setField(term8145, term8145.getClass(), "my_qst_sts", "cudZvLMQon");
        setField(term8145, term8145.getClass(), "my_qst_prgrs", "lihXWlGDxk");
        setField(term8145, term8145.getClass(), "my_qst_et", "JmcmxoGhIK");
        setField(term8145, term8145.getClass(), "p_std_ie_have", "jXzmYyrnnT");
        setField(term8145, term8145.getClass(), "p_std_se_have", "igCAtimmYB");
        setField(term8145, term8145.getClass(), "cmd", "DyiXbeYIaN");
        setField(term8145, term8145.getClass(), "req_id", "VGizxZnyHX");
        setField(term8145, term8145.getClass(), "stat", "kVEZMHmRtR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term8145, args);
    }

};


