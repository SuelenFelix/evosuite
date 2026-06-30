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

public class StartResponse_setUsepvskneqp_176100891581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171043;
     Object term171488;

    public StartResponse_setUsepvskneqp_176100891581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term171491 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term171490 = ((Class) term171491).getDeclaredField((String) "SUCCESS");
        ((Field) term171490).setAccessible(true);
        Object enum406 = ((Field) term171490).get((Object) null);
        Class<? extends Object> term171759 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term171758 = ((Class) term171759).getDeclaredField((String) "MY_LIST_A");
        ((Field) term171758).setAccessible(true);
        Object enum407 = ((Field) term171758).get((Object) null);
        Class<? extends Object> term172093 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term172092 = ((Class) term172093).getDeclaredField((String) "NORMAL");
        ((Field) term172092).setAccessible(true);
        Object enum408 = ((Field) term172092).get((Object) null);
        Class<? extends Object> term172368 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term172367 = ((Class) term172368).getDeclaredField((String) "ORIGINAL");
        ((Field) term172367).setAccessible(true);
        Object enum409 = ((Field) term172367).get((Object) null);
        Class<? extends Object> term172684 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term172683 = ((Class) term172684).getDeclaredField((String) "BRONZE");
        ((Field) term172683).setAccessible(true);
        Object enum410 = ((Field) term172683).get((Object) null);
        term171043 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term171141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171146 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term171043, term171043.getClass(), "pd_id", 1151963130);
        setField(term171043, term171043.getClass(), "start_result", enum406);
        setIntField(term171043, term171043.getClass(), "accept_idx", -1855819749);
        setIntField(term171043, term171043.getClass(), "start_idx", 1059048043);
        setField(term171043, term171043.getClass(), "player_name", "COsGswsrtI");
        setIntField(term171043, term171043.getClass(), "hp_vol", 537273345);
        setBooleanField(term171043, term171043.getClass(), "btn_se_vol", true);
        setIntField(term171043, term171043.getClass(), "btn_se_vol2", -346107257);
        setIntField(term171043, term171043.getClass(), "sldr_se_vol2", -1577393360);
        setField(term171043, term171043.getClass(), "sort_kind", enum407);
        setIntField(term171043, term171043.getClass(), "lv_num", 1112256038);
        setIntField(term171043, term171043.getClass(), "lv_pnt", -441333794);
        setField(term171043, term171043.getClass(), "lv_str", "ebUWnoVDmk");
        setIntField(term171043, term171043.getClass(), "lv_efct_id", 1504698817);
        setIntField(term171043, term171043.getClass(), "lv_plt_id", -2018333791);
        setField(term171043, term171043.getClass(), "mdl_eqp_ary", "wCcojFgWKb");
        setField(term171043, term171043.getClass(), "c_itm_eqp_ary", "iHtqLPNWTt");
        setField(term171043, term171043.getClass(), "ms_itm_flg_ary", "TQgECVDMEf");
        setIntField(term171142, term171142.getClass(), "year", 2021);
        setShortField(term171142, term171142.getClass(), "month", (short) 3);
        setShortField(term171142, term171142.getClass(), "day", (short) 13);
        setField(term171141, term171141.getClass(), "date", term171142);
        setByteField(term171146, term171146.getClass(), "hour", (byte) 6);
        setByteField(term171146, term171146.getClass(), "minute", (byte) 25);
        setByteField(term171146, term171146.getClass(), "second", (byte) 42);
        setIntField(term171146, term171146.getClass(), "nano", 282924199);
        setField(term171141, term171141.getClass(), "time", term171146);
        setField(term171043, term171043.getClass(), "mdl_eqp_tm", term171141);
        setField(term171043, term171043.getClass(), "mdl_have", "KIBOVYItqe");
        setField(term171043, term171043.getClass(), "cstmz_itm_have", "GUztJeVeCc");
        setBooleanField(term171043, term171043.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term171043, term171043.getClass(), "use_mdl_pri", false);
        setBooleanField(term171043, term171043.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term171043, term171043.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term171043, term171043.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term171043, term171043.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term171043, term171043.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term171043, term171043.getClass(), "vcld_pts", -742476678);
        setIntField(term171043, term171043.getClass(), "nxt_pv_id", -824369460);
        setField(term171043, term171043.getClass(), "nxt_dffclty", enum408);
        setField(term171043, term171043.getClass(), "nxt_edtn", enum409);
        setField(term171043, term171043.getClass(), "cv_cid", "YNXFGgstqj");
        setField(term171043, term171043.getClass(), "cv_sc", "xZTWqxWsAc");
        setField(term171043, term171043.getClass(), "cv_rr", "sWchglYniO");
        setField(term171043, term171043.getClass(), "cv_bv", "lohegbXyjA");
        setField(term171043, term171043.getClass(), "cv_bf", "HlddItIexw");
        setIntField(term171043, term171043.getClass(), "cnp_cid", -1573760035);
        setIntField(term171043, term171043.getClass(), "cnp_val", -1147965121);
        setField(term171043, term171043.getClass(), "cnp_rr", enum410);
        setField(term171043, term171043.getClass(), "cnp_sp", "HnpLvemmRI");
        setField(term171043, term171043.getClass(), "my_lst_0", "dHrIcaTbcS");
        setField(term171043, term171043.getClass(), "my_lst_1", "tAqyToqusS");
        setField(term171043, term171043.getClass(), "my_lst_2", "MwiFLgdSDA");
        setField(term171043, term171043.getClass(), "my_lst_3", "VhnistEcCA");
        setField(term171043, term171043.getClass(), "my_lst_4", "hlPKLObFBU");
        setField(term171043, term171043.getClass(), "dsp_clr_brdr", "oNGVAyjCob");
        setBooleanField(term171043, term171043.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term171043, term171043.getClass(), "dsp_clr_sts", true);
        setField(term171043, term171043.getClass(), "clr_sts", "lzqPLDonds");
        setBooleanField(term171043, term171043.getClass(), "rgo_sts", true);
        setField(term171043, term171043.getClass(), "my_qst_id", "gCFzBxPZKw");
        setField(term171043, term171043.getClass(), "my_qst_sts", "YNVbzJpOdk");
        setField(term171043, term171043.getClass(), "my_qst_prgrs", "CjPfMVeNPm");
        setField(term171043, term171043.getClass(), "my_qst_et", "TeqSJDWXQD");
        setField(term171043, term171043.getClass(), "p_std_ie_have", "XNgNLbjmim");
        setField(term171043, term171043.getClass(), "p_std_se_have", "InNyZMCrst");
        setField(term171043, term171043.getClass(), "cmd", "llSJDzNeEq");
        setField(term171043, term171043.getClass(), "req_id", "YIDNFdhfGO");
        setField(term171043, term171043.getClass(), "stat", "adNbqunmox");
        term171488 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term171488;
        callMethod(klass, "setUse_pv_skn_eqp", argTypes, term171043, args);
    }

};


