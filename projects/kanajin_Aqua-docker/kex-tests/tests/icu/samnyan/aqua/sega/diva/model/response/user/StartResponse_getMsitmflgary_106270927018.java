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

public class StartResponse_getMsitmflgary_106270927018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39415;

    public StartResponse_getMsitmflgary_106270927018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39861 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term39860 = ((Class) term39861).getDeclaredField((String) "FAILED");
        ((Field) term39860).setAccessible(true);
        Object enum90 = ((Field) term39860).get((Object) null);
        Class<? extends Object> term40126 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term40125 = ((Class) term40126).getDeclaredField((String) "MY_LIST_A");
        ((Field) term40125).setAccessible(true);
        Object enum91 = ((Field) term40125).get((Object) null);
        Class<? extends Object> term40460 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term40459 = ((Class) term40460).getDeclaredField((String) "EXTREME");
        ((Field) term40459).setAccessible(true);
        Object enum92 = ((Field) term40459).get((Object) null);
        Class<? extends Object> term40738 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term40737 = ((Class) term40738).getDeclaredField((String) "ORIGINAL");
        ((Field) term40737).setAccessible(true);
        Object enum93 = ((Field) term40737).get((Object) null);
        Class<? extends Object> term41054 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term41053 = ((Class) term41054).getDeclaredField((String) "BRONZE");
        ((Field) term41053).setAccessible(true);
        Object enum94 = ((Field) term41053).get((Object) null);
        term39415 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term39512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39517 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term39415, term39415.getClass(), "pd_id", -2003192918);
        setField(term39415, term39415.getClass(), "start_result", enum90);
        setIntField(term39415, term39415.getClass(), "accept_idx", -1362856620);
        setIntField(term39415, term39415.getClass(), "start_idx", -1835839814);
        setField(term39415, term39415.getClass(), "player_name", "mnHyQbMyld");
        setIntField(term39415, term39415.getClass(), "hp_vol", -1404350380);
        setBooleanField(term39415, term39415.getClass(), "btn_se_vol", false);
        setIntField(term39415, term39415.getClass(), "btn_se_vol2", -2013924238);
        setIntField(term39415, term39415.getClass(), "sldr_se_vol2", 579006268);
        setField(term39415, term39415.getClass(), "sort_kind", enum91);
        setIntField(term39415, term39415.getClass(), "lv_num", -1694747156);
        setIntField(term39415, term39415.getClass(), "lv_pnt", 1466373988);
        setField(term39415, term39415.getClass(), "lv_str", "KHtaDOIcJZ");
        setIntField(term39415, term39415.getClass(), "lv_efct_id", -358526505);
        setIntField(term39415, term39415.getClass(), "lv_plt_id", 1843268026);
        setField(term39415, term39415.getClass(), "mdl_eqp_ary", "vgdwrCZczl");
        setField(term39415, term39415.getClass(), "c_itm_eqp_ary", "gKMNrpKBpu");
        setField(term39415, term39415.getClass(), "ms_itm_flg_ary", "ZbHJVEqcoa");
        setIntField(term39513, term39513.getClass(), "year", 2017);
        setShortField(term39513, term39513.getClass(), "month", (short) 3);
        setShortField(term39513, term39513.getClass(), "day", (short) 5);
        setField(term39512, term39512.getClass(), "date", term39513);
        setByteField(term39517, term39517.getClass(), "hour", (byte) 20);
        setByteField(term39517, term39517.getClass(), "minute", (byte) 34);
        setByteField(term39517, term39517.getClass(), "second", (byte) 55);
        setIntField(term39517, term39517.getClass(), "nano", 78024496);
        setField(term39512, term39512.getClass(), "time", term39517);
        setField(term39415, term39415.getClass(), "mdl_eqp_tm", term39512);
        setField(term39415, term39415.getClass(), "mdl_have", "awDQVEVIKi");
        setField(term39415, term39415.getClass(), "cstmz_itm_have", "HJwNgUzZZR");
        setBooleanField(term39415, term39415.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term39415, term39415.getClass(), "use_mdl_pri", true);
        setBooleanField(term39415, term39415.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term39415, term39415.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term39415, term39415.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term39415, term39415.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term39415, term39415.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term39415, term39415.getClass(), "vcld_pts", 954660603);
        setIntField(term39415, term39415.getClass(), "nxt_pv_id", -1351605385);
        setField(term39415, term39415.getClass(), "nxt_dffclty", enum92);
        setField(term39415, term39415.getClass(), "nxt_edtn", enum93);
        setField(term39415, term39415.getClass(), "cv_cid", "FvUCZgTXhq");
        setField(term39415, term39415.getClass(), "cv_sc", "wWWidPCHzx");
        setField(term39415, term39415.getClass(), "cv_rr", "OwPIiBRuKK");
        setField(term39415, term39415.getClass(), "cv_bv", "sgfGySMODT");
        setField(term39415, term39415.getClass(), "cv_bf", "ndAITnOsny");
        setIntField(term39415, term39415.getClass(), "cnp_cid", 278355793);
        setIntField(term39415, term39415.getClass(), "cnp_val", -310648604);
        setField(term39415, term39415.getClass(), "cnp_rr", enum94);
        setField(term39415, term39415.getClass(), "cnp_sp", "CVZnTiJucs");
        setField(term39415, term39415.getClass(), "my_lst_0", "ecHEQufXoq");
        setField(term39415, term39415.getClass(), "my_lst_1", "btBLMvHzJg");
        setField(term39415, term39415.getClass(), "my_lst_2", "JdOMfNWgLP");
        setField(term39415, term39415.getClass(), "my_lst_3", "uWqXrwAsDU");
        setField(term39415, term39415.getClass(), "my_lst_4", "hgFbWAUtsu");
        setField(term39415, term39415.getClass(), "dsp_clr_brdr", "HqoTWlkbwF");
        setBooleanField(term39415, term39415.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term39415, term39415.getClass(), "dsp_clr_sts", true);
        setField(term39415, term39415.getClass(), "clr_sts", "CwNELDTAPP");
        setBooleanField(term39415, term39415.getClass(), "rgo_sts", false);
        setField(term39415, term39415.getClass(), "my_qst_id", "GSzQdbHLHw");
        setField(term39415, term39415.getClass(), "my_qst_sts", "IkfarsYNJO");
        setField(term39415, term39415.getClass(), "my_qst_prgrs", "aZKOWhHMEh");
        setField(term39415, term39415.getClass(), "my_qst_et", "YfkhviKZwl");
        setField(term39415, term39415.getClass(), "p_std_ie_have", "DcOhhAfJTI");
        setField(term39415, term39415.getClass(), "p_std_se_have", "gYTIkBFOoS");
        setField(term39415, term39415.getClass(), "cmd", "xmzSoVgiED");
        setField(term39415, term39415.getClass(), "req_id", "pdSvedKgPq");
        setField(term39415, term39415.getClass(), "stat", "epPTwvcoyb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMs_itm_flg_ary", argTypes, term39415, args);
    }

};


