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

public class StartResponse_setCvcid_88504208090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189819;

    public StartResponse_setCvcid_88504208090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term190273 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term190272 = ((Class) term190273).getDeclaredField((String) "SUCCESS");
        ((Field) term190272).setAccessible(true);
        Object enum451 = ((Field) term190272).get((Object) null);
        Class<? extends Object> term190541 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term190540 = ((Class) term190541).getDeclaredField((String) "COMPLEXITY");
        ((Field) term190540).setAccessible(true);
        Object enum452 = ((Field) term190540).get((Object) null);
        Class<? extends Object> term190878 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term190877 = ((Class) term190878).getDeclaredField((String) "EASY");
        ((Field) term190877).setAccessible(true);
        Object enum453 = ((Field) term190877).get((Object) null);
        Class<? extends Object> term191147 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term191146 = ((Class) term191147).getDeclaredField((String) "EXTRA");
        ((Field) term191146).setAccessible(true);
        Object enum454 = ((Field) term191146).get((Object) null);
        Class<? extends Object> term191454 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term191453 = ((Class) term191454).getDeclaredField((String) "SILVER");
        ((Field) term191453).setAccessible(true);
        Object enum455 = ((Field) term191453).get((Object) null);
        term189819 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term189918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term189919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term189923 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term189819, term189819.getClass(), "pd_id", -1445089135);
        setField(term189819, term189819.getClass(), "start_result", enum451);
        setIntField(term189819, term189819.getClass(), "accept_idx", -291618851);
        setIntField(term189819, term189819.getClass(), "start_idx", -378436487);
        setField(term189819, term189819.getClass(), "player_name", "VSmPzUiFzd");
        setIntField(term189819, term189819.getClass(), "hp_vol", 584949609);
        setBooleanField(term189819, term189819.getClass(), "btn_se_vol", false);
        setIntField(term189819, term189819.getClass(), "btn_se_vol2", 879795058);
        setIntField(term189819, term189819.getClass(), "sldr_se_vol2", -1016087889);
        setField(term189819, term189819.getClass(), "sort_kind", enum452);
        setIntField(term189819, term189819.getClass(), "lv_num", 1968287557);
        setIntField(term189819, term189819.getClass(), "lv_pnt", 1101385603);
        setField(term189819, term189819.getClass(), "lv_str", "bLpZNCaWDB");
        setIntField(term189819, term189819.getClass(), "lv_efct_id", 1980267589);
        setIntField(term189819, term189819.getClass(), "lv_plt_id", -2009434910);
        setField(term189819, term189819.getClass(), "mdl_eqp_ary", "knmwCEeMTY");
        setField(term189819, term189819.getClass(), "c_itm_eqp_ary", "qTiIgMQXbW");
        setField(term189819, term189819.getClass(), "ms_itm_flg_ary", "rARmHDyRHE");
        setIntField(term189919, term189919.getClass(), "year", 2015);
        setShortField(term189919, term189919.getClass(), "month", (short) 3);
        setShortField(term189919, term189919.getClass(), "day", (short) 15);
        setField(term189918, term189918.getClass(), "date", term189919);
        setByteField(term189923, term189923.getClass(), "hour", (byte) 8);
        setByteField(term189923, term189923.getClass(), "minute", (byte) 45);
        setByteField(term189923, term189923.getClass(), "second", (byte) 29);
        setIntField(term189923, term189923.getClass(), "nano", 781486470);
        setField(term189918, term189918.getClass(), "time", term189923);
        setField(term189819, term189819.getClass(), "mdl_eqp_tm", term189918);
        setField(term189819, term189819.getClass(), "mdl_have", "bvybTJUNMY");
        setField(term189819, term189819.getClass(), "cstmz_itm_have", "MoGyMoOkMi");
        setBooleanField(term189819, term189819.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term189819, term189819.getClass(), "use_mdl_pri", true);
        setBooleanField(term189819, term189819.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term189819, term189819.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term189819, term189819.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term189819, term189819.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term189819, term189819.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term189819, term189819.getClass(), "vcld_pts", -374887532);
        setIntField(term189819, term189819.getClass(), "nxt_pv_id", -165487736);
        setField(term189819, term189819.getClass(), "nxt_dffclty", enum453);
        setField(term189819, term189819.getClass(), "nxt_edtn", enum454);
        setField(term189819, term189819.getClass(), "cv_cid", "qDEvNqJeGg");
        setField(term189819, term189819.getClass(), "cv_sc", "fUxWNxirZc");
        setField(term189819, term189819.getClass(), "cv_rr", "vHkrNjGRyv");
        setField(term189819, term189819.getClass(), "cv_bv", "PxGAOnzJzj");
        setField(term189819, term189819.getClass(), "cv_bf", "fQVSHtJlDS");
        setIntField(term189819, term189819.getClass(), "cnp_cid", -608393431);
        setIntField(term189819, term189819.getClass(), "cnp_val", 298082829);
        setField(term189819, term189819.getClass(), "cnp_rr", enum455);
        setField(term189819, term189819.getClass(), "cnp_sp", "CGdXCWNTxp");
        setField(term189819, term189819.getClass(), "my_lst_0", "TUBgEnrcjn");
        setField(term189819, term189819.getClass(), "my_lst_1", "eUhEGNLBOk");
        setField(term189819, term189819.getClass(), "my_lst_2", "UrLisdyvVs");
        setField(term189819, term189819.getClass(), "my_lst_3", "VckRXyiShh");
        setField(term189819, term189819.getClass(), "my_lst_4", "ZKwDTklKHb");
        setField(term189819, term189819.getClass(), "dsp_clr_brdr", "tQMlnMStsQ");
        setBooleanField(term189819, term189819.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term189819, term189819.getClass(), "dsp_clr_sts", true);
        setField(term189819, term189819.getClass(), "clr_sts", "OYJvKAMFEk");
        setBooleanField(term189819, term189819.getClass(), "rgo_sts", false);
        setField(term189819, term189819.getClass(), "my_qst_id", "puNAveVBkA");
        setField(term189819, term189819.getClass(), "my_qst_sts", "BcZKUIbuQL");
        setField(term189819, term189819.getClass(), "my_qst_prgrs", "YvjPnZyRnw");
        setField(term189819, term189819.getClass(), "my_qst_et", "IKmMfqFPku");
        setField(term189819, term189819.getClass(), "p_std_ie_have", "NACnGDmVPl");
        setField(term189819, term189819.getClass(), "p_std_se_have", "SfWiFjkLGW");
        setField(term189819, term189819.getClass(), "cmd", "urBahuOkUQ");
        setField(term189819, term189819.getClass(), "req_id", "zHcZrTMdOT");
        setField(term189819, term189819.getClass(), "stat", "zIAIXHeKXt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fVkSkOqFEO";
        callMethod(klass, "setCv_cid", argTypes, term189819, args);
    }

};


