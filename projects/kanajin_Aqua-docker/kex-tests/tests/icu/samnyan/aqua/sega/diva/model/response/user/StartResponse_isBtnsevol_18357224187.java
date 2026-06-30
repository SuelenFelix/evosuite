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

public class StartResponse_isBtnsevol_18357224187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16449;

    public StartResponse_isBtnsevol_18357224187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16893 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term16892 = ((Class) term16893).getDeclaredField((String) "SUCCESS");
        ((Field) term16892).setAccessible(true);
        Object enum35 = ((Field) term16892).get((Object) null);
        Class<? extends Object> term17161 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term17160 = ((Class) term17161).getDeclaredField((String) "MY_LIST_A");
        ((Field) term17160).setAccessible(true);
        Object enum36 = ((Field) term17160).get((Object) null);
        Class<? extends Object> term17495 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term17494 = ((Class) term17495).getDeclaredField((String) "EXTREME");
        ((Field) term17494).setAccessible(true);
        Object enum37 = ((Field) term17494).get((Object) null);
        Class<? extends Object> term17773 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term17772 = ((Class) term17773).getDeclaredField((String) "EXTRA");
        ((Field) term17772).setAccessible(true);
        Object enum38 = ((Field) term17772).get((Object) null);
        Class<? extends Object> term18080 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term18079 = ((Class) term18080).getDeclaredField((String) "SILVER");
        ((Field) term18079).setAccessible(true);
        Object enum39 = ((Field) term18079).get((Object) null);
        term16449 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term16547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16552 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16449, term16449.getClass(), "pd_id", 2098647989);
        setField(term16449, term16449.getClass(), "start_result", enum35);
        setIntField(term16449, term16449.getClass(), "accept_idx", 1598895173);
        setIntField(term16449, term16449.getClass(), "start_idx", 1830648570);
        setField(term16449, term16449.getClass(), "player_name", "SPtPatHeOm");
        setIntField(term16449, term16449.getClass(), "hp_vol", -227365013);
        setBooleanField(term16449, term16449.getClass(), "btn_se_vol", false);
        setIntField(term16449, term16449.getClass(), "btn_se_vol2", 11724947);
        setIntField(term16449, term16449.getClass(), "sldr_se_vol2", 1953277050);
        setField(term16449, term16449.getClass(), "sort_kind", enum36);
        setIntField(term16449, term16449.getClass(), "lv_num", 1283079251);
        setIntField(term16449, term16449.getClass(), "lv_pnt", -523949691);
        setField(term16449, term16449.getClass(), "lv_str", "ywmcuThdfL");
        setIntField(term16449, term16449.getClass(), "lv_efct_id", 1398204340);
        setIntField(term16449, term16449.getClass(), "lv_plt_id", 229204365);
        setField(term16449, term16449.getClass(), "mdl_eqp_ary", "GBOEuByOfr");
        setField(term16449, term16449.getClass(), "c_itm_eqp_ary", "NHbOFFjyVK");
        setField(term16449, term16449.getClass(), "ms_itm_flg_ary", "zaloBqlrSo");
        setIntField(term16548, term16548.getClass(), "year", 2024);
        setShortField(term16548, term16548.getClass(), "month", (short) 1);
        setShortField(term16548, term16548.getClass(), "day", (short) 24);
        setField(term16547, term16547.getClass(), "date", term16548);
        setByteField(term16552, term16552.getClass(), "hour", (byte) 20);
        setByteField(term16552, term16552.getClass(), "minute", (byte) 28);
        setByteField(term16552, term16552.getClass(), "second", (byte) 39);
        setIntField(term16552, term16552.getClass(), "nano", 952728177);
        setField(term16547, term16547.getClass(), "time", term16552);
        setField(term16449, term16449.getClass(), "mdl_eqp_tm", term16547);
        setField(term16449, term16449.getClass(), "mdl_have", "vvoLrMGCoN");
        setField(term16449, term16449.getClass(), "cstmz_itm_have", "pXdglvyrQe");
        setBooleanField(term16449, term16449.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term16449, term16449.getClass(), "use_mdl_pri", true);
        setBooleanField(term16449, term16449.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term16449, term16449.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term16449, term16449.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term16449, term16449.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term16449, term16449.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term16449, term16449.getClass(), "vcld_pts", -461771056);
        setIntField(term16449, term16449.getClass(), "nxt_pv_id", -243422082);
        setField(term16449, term16449.getClass(), "nxt_dffclty", enum37);
        setField(term16449, term16449.getClass(), "nxt_edtn", enum38);
        setField(term16449, term16449.getClass(), "cv_cid", "OcfNzHYdki");
        setField(term16449, term16449.getClass(), "cv_sc", "uPuCVuZYOI");
        setField(term16449, term16449.getClass(), "cv_rr", "TweMFhxNdj");
        setField(term16449, term16449.getClass(), "cv_bv", "NBrvVzvQHe");
        setField(term16449, term16449.getClass(), "cv_bf", "FjOiNAfBOc");
        setIntField(term16449, term16449.getClass(), "cnp_cid", 1384592638);
        setIntField(term16449, term16449.getClass(), "cnp_val", -1002370457);
        setField(term16449, term16449.getClass(), "cnp_rr", enum39);
        setField(term16449, term16449.getClass(), "cnp_sp", "iCCsaLHohG");
        setField(term16449, term16449.getClass(), "my_lst_0", "NJhGgctbdj");
        setField(term16449, term16449.getClass(), "my_lst_1", "MYWYUeLGOp");
        setField(term16449, term16449.getClass(), "my_lst_2", "tsTGdgQYUL");
        setField(term16449, term16449.getClass(), "my_lst_3", "TtGbVmKcnX");
        setField(term16449, term16449.getClass(), "my_lst_4", "GJVkUrCVdD");
        setField(term16449, term16449.getClass(), "dsp_clr_brdr", "zNdorvdUgu");
        setBooleanField(term16449, term16449.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term16449, term16449.getClass(), "dsp_clr_sts", true);
        setField(term16449, term16449.getClass(), "clr_sts", "oPxuZbkYio");
        setBooleanField(term16449, term16449.getClass(), "rgo_sts", false);
        setField(term16449, term16449.getClass(), "my_qst_id", "vKitydDVnM");
        setField(term16449, term16449.getClass(), "my_qst_sts", "urCiQnUFBM");
        setField(term16449, term16449.getClass(), "my_qst_prgrs", "EKjQdtKxAM");
        setField(term16449, term16449.getClass(), "my_qst_et", "TXZAIPQJHt");
        setField(term16449, term16449.getClass(), "p_std_ie_have", "DIbeDHICho");
        setField(term16449, term16449.getClass(), "p_std_se_have", "dJGPlmSRnz");
        setField(term16449, term16449.getClass(), "cmd", "DPskuFUobI");
        setField(term16449, term16449.getClass(), "req_id", "wBGfLpNNiZ");
        setField(term16449, term16449.getClass(), "stat", "yUGCjlqgJE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBtn_se_vol", argTypes, term16449, args);
    }

};


