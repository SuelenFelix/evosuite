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

public class StartResponse_getPstdiehave_119802282656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118495;

    public StartResponse_getPstdiehave_119802282656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term118936 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term118935 = ((Class) term118936).getDeclaredField((String) "FAILED");
        ((Field) term118935).setAccessible(true);
        Object enum280 = ((Field) term118935).get((Object) null);
        Class<? extends Object> term119201 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term119200 = ((Class) term119201).getDeclaredField((String) "MY_LIST_A");
        ((Field) term119200).setAccessible(true);
        Object enum281 = ((Field) term119200).get((Object) null);
        Class<? extends Object> term119535 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term119534 = ((Class) term119535).getDeclaredField((String) "HARD");
        ((Field) term119534).setAccessible(true);
        Object enum282 = ((Field) term119534).get((Object) null);
        Class<? extends Object> term119804 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term119803 = ((Class) term119804).getDeclaredField((String) "ORIGINAL");
        ((Field) term119803).setAccessible(true);
        Object enum283 = ((Field) term119803).get((Object) null);
        Class<? extends Object> term120120 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term120119 = ((Class) term120120).getDeclaredField((String) "NONE");
        ((Field) term120119).setAccessible(true);
        Object enum284 = ((Field) term120119).get((Object) null);
        term118495 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term118592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118597 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term118495, term118495.getClass(), "pd_id", -407582855);
        setField(term118495, term118495.getClass(), "start_result", enum280);
        setIntField(term118495, term118495.getClass(), "accept_idx", 1190753616);
        setIntField(term118495, term118495.getClass(), "start_idx", -752378450);
        setField(term118495, term118495.getClass(), "player_name", "idwbHVHUcz");
        setIntField(term118495, term118495.getClass(), "hp_vol", 848907965);
        setBooleanField(term118495, term118495.getClass(), "btn_se_vol", true);
        setIntField(term118495, term118495.getClass(), "btn_se_vol2", 1865070548);
        setIntField(term118495, term118495.getClass(), "sldr_se_vol2", 1904515443);
        setField(term118495, term118495.getClass(), "sort_kind", enum281);
        setIntField(term118495, term118495.getClass(), "lv_num", 1361126430);
        setIntField(term118495, term118495.getClass(), "lv_pnt", 1728588701);
        setField(term118495, term118495.getClass(), "lv_str", "sWJHIWZMuX");
        setIntField(term118495, term118495.getClass(), "lv_efct_id", -355769268);
        setIntField(term118495, term118495.getClass(), "lv_plt_id", -114460662);
        setField(term118495, term118495.getClass(), "mdl_eqp_ary", "PwMdJRwzDW");
        setField(term118495, term118495.getClass(), "c_itm_eqp_ary", "sMiHxgXUuN");
        setField(term118495, term118495.getClass(), "ms_itm_flg_ary", "oVChCWWDag");
        setIntField(term118593, term118593.getClass(), "year", 2022);
        setShortField(term118593, term118593.getClass(), "month", (short) 6);
        setShortField(term118593, term118593.getClass(), "day", (short) 20);
        setField(term118592, term118592.getClass(), "date", term118593);
        setByteField(term118597, term118597.getClass(), "hour", (byte) 7);
        setByteField(term118597, term118597.getClass(), "minute", (byte) 57);
        setByteField(term118597, term118597.getClass(), "second", (byte) 37);
        setIntField(term118597, term118597.getClass(), "nano", 90374877);
        setField(term118592, term118592.getClass(), "time", term118597);
        setField(term118495, term118495.getClass(), "mdl_eqp_tm", term118592);
        setField(term118495, term118495.getClass(), "mdl_have", "EteTxkDxin");
        setField(term118495, term118495.getClass(), "cstmz_itm_have", "mKgLwPdYbY");
        setBooleanField(term118495, term118495.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term118495, term118495.getClass(), "use_mdl_pri", true);
        setBooleanField(term118495, term118495.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term118495, term118495.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term118495, term118495.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term118495, term118495.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term118495, term118495.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term118495, term118495.getClass(), "vcld_pts", -355376034);
        setIntField(term118495, term118495.getClass(), "nxt_pv_id", 588390599);
        setField(term118495, term118495.getClass(), "nxt_dffclty", enum282);
        setField(term118495, term118495.getClass(), "nxt_edtn", enum283);
        setField(term118495, term118495.getClass(), "cv_cid", "zqykonsLIo");
        setField(term118495, term118495.getClass(), "cv_sc", "KoPzTuvIeK");
        setField(term118495, term118495.getClass(), "cv_rr", "SMoWUILIhn");
        setField(term118495, term118495.getClass(), "cv_bv", "SvSKSCjgTM");
        setField(term118495, term118495.getClass(), "cv_bf", "UFxnRbWtog");
        setIntField(term118495, term118495.getClass(), "cnp_cid", -95969566);
        setIntField(term118495, term118495.getClass(), "cnp_val", -68615285);
        setField(term118495, term118495.getClass(), "cnp_rr", enum284);
        setField(term118495, term118495.getClass(), "cnp_sp", "NSxzAUSujy");
        setField(term118495, term118495.getClass(), "my_lst_0", "FEezgglqXC");
        setField(term118495, term118495.getClass(), "my_lst_1", "rvYqMRgiPA");
        setField(term118495, term118495.getClass(), "my_lst_2", "qOZXeUUmdz");
        setField(term118495, term118495.getClass(), "my_lst_3", "FCovVZHqPx");
        setField(term118495, term118495.getClass(), "my_lst_4", "jSTBfkWjge");
        setField(term118495, term118495.getClass(), "dsp_clr_brdr", "uKYhZULSHp");
        setBooleanField(term118495, term118495.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term118495, term118495.getClass(), "dsp_clr_sts", false);
        setField(term118495, term118495.getClass(), "clr_sts", "xdYuLllgpn");
        setBooleanField(term118495, term118495.getClass(), "rgo_sts", true);
        setField(term118495, term118495.getClass(), "my_qst_id", "ayonlqalLA");
        setField(term118495, term118495.getClass(), "my_qst_sts", "fzzIOVxKdF");
        setField(term118495, term118495.getClass(), "my_qst_prgrs", "cdvmxZaBEK");
        setField(term118495, term118495.getClass(), "my_qst_et", "QHYZiyDyPC");
        setField(term118495, term118495.getClass(), "p_std_ie_have", "kcHMyiheuH");
        setField(term118495, term118495.getClass(), "p_std_se_have", "DGMBBNDEYs");
        setField(term118495, term118495.getClass(), "cmd", "vpuKZSMmKQ");
        setField(term118495, term118495.getClass(), "req_id", "IXQQwaXITf");
        setField(term118495, term118495.getClass(), "stat", "fNzFTiRCjp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getP_std_ie_have", argTypes, term118495, args);
    }

};


