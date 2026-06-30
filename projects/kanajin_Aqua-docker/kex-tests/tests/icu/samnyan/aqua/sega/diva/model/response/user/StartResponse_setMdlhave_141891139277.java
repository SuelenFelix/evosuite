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

public class StartResponse_setMdlhave_141891139277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162671;

    public StartResponse_setMdlhave_141891139277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term163119 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term163118 = ((Class) term163119).getDeclaredField((String) "FAILED");
        ((Field) term163118).setAccessible(true);
        Object enum386 = ((Field) term163118).get((Object) null);
        Class<? extends Object> term163384 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term163383 = ((Class) term163384).getDeclaredField((String) "NAME");
        ((Field) term163383).setAccessible(true);
        Object enum387 = ((Field) term163383).get((Object) null);
        Class<? extends Object> term163703 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term163702 = ((Class) term163703).getDeclaredField((String) "EASY");
        ((Field) term163702).setAccessible(true);
        Object enum388 = ((Field) term163702).get((Object) null);
        Class<? extends Object> term163972 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term163971 = ((Class) term163972).getDeclaredField((String) "ORIGINAL");
        ((Field) term163971).setAccessible(true);
        Object enum389 = ((Field) term163971).get((Object) null);
        Class<? extends Object> term164288 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term164287 = ((Class) term164288).getDeclaredField((String) "NONE");
        ((Field) term164287).setAccessible(true);
        Object enum390 = ((Field) term164287).get((Object) null);
        term162671 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term162763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162768 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term162671, term162671.getClass(), "pd_id", -1320402633);
        setField(term162671, term162671.getClass(), "start_result", enum386);
        setIntField(term162671, term162671.getClass(), "accept_idx", 919602316);
        setIntField(term162671, term162671.getClass(), "start_idx", 1833713431);
        setField(term162671, term162671.getClass(), "player_name", "bhEFtkUvDw");
        setIntField(term162671, term162671.getClass(), "hp_vol", -706222608);
        setBooleanField(term162671, term162671.getClass(), "btn_se_vol", true);
        setIntField(term162671, term162671.getClass(), "btn_se_vol2", -2003607923);
        setIntField(term162671, term162671.getClass(), "sldr_se_vol2", 1378805929);
        setField(term162671, term162671.getClass(), "sort_kind", enum387);
        setIntField(term162671, term162671.getClass(), "lv_num", 695052304);
        setIntField(term162671, term162671.getClass(), "lv_pnt", -179937218);
        setField(term162671, term162671.getClass(), "lv_str", "ZmbknwMIBa");
        setIntField(term162671, term162671.getClass(), "lv_efct_id", 940896043);
        setIntField(term162671, term162671.getClass(), "lv_plt_id", -1156002984);
        setField(term162671, term162671.getClass(), "mdl_eqp_ary", "UiRmBTpDTp");
        setField(term162671, term162671.getClass(), "c_itm_eqp_ary", "zQtuUgUIjK");
        setField(term162671, term162671.getClass(), "ms_itm_flg_ary", "VBeGRjPsPN");
        setIntField(term162764, term162764.getClass(), "year", 2020);
        setShortField(term162764, term162764.getClass(), "month", (short) 8);
        setShortField(term162764, term162764.getClass(), "day", (short) 16);
        setField(term162763, term162763.getClass(), "date", term162764);
        setByteField(term162768, term162768.getClass(), "hour", (byte) 4);
        setByteField(term162768, term162768.getClass(), "minute", (byte) 37);
        setByteField(term162768, term162768.getClass(), "second", (byte) 19);
        setIntField(term162768, term162768.getClass(), "nano", 605410923);
        setField(term162763, term162763.getClass(), "time", term162768);
        setField(term162671, term162671.getClass(), "mdl_eqp_tm", term162763);
        setField(term162671, term162671.getClass(), "mdl_have", "pZrAdSHQIs");
        setField(term162671, term162671.getClass(), "cstmz_itm_have", "XTOiucaEva");
        setBooleanField(term162671, term162671.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term162671, term162671.getClass(), "use_mdl_pri", true);
        setBooleanField(term162671, term162671.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term162671, term162671.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term162671, term162671.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term162671, term162671.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term162671, term162671.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term162671, term162671.getClass(), "vcld_pts", 1676254730);
        setIntField(term162671, term162671.getClass(), "nxt_pv_id", -1661200819);
        setField(term162671, term162671.getClass(), "nxt_dffclty", enum388);
        setField(term162671, term162671.getClass(), "nxt_edtn", enum389);
        setField(term162671, term162671.getClass(), "cv_cid", "JMekRNxFMU");
        setField(term162671, term162671.getClass(), "cv_sc", "LBNEEquiet");
        setField(term162671, term162671.getClass(), "cv_rr", "cBMdxJirJj");
        setField(term162671, term162671.getClass(), "cv_bv", "kVnxgkemHF");
        setField(term162671, term162671.getClass(), "cv_bf", "JUQnEoujef");
        setIntField(term162671, term162671.getClass(), "cnp_cid", -235039141);
        setIntField(term162671, term162671.getClass(), "cnp_val", -1414233013);
        setField(term162671, term162671.getClass(), "cnp_rr", enum390);
        setField(term162671, term162671.getClass(), "cnp_sp", "riXARUiigm");
        setField(term162671, term162671.getClass(), "my_lst_0", "RbXhBDZbRT");
        setField(term162671, term162671.getClass(), "my_lst_1", "QDaTqkWnGj");
        setField(term162671, term162671.getClass(), "my_lst_2", "vNObzQvzxo");
        setField(term162671, term162671.getClass(), "my_lst_3", "uyuWzXeJvn");
        setField(term162671, term162671.getClass(), "my_lst_4", "jvQHxWAYDO");
        setField(term162671, term162671.getClass(), "dsp_clr_brdr", "mntnLPfhte");
        setBooleanField(term162671, term162671.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term162671, term162671.getClass(), "dsp_clr_sts", true);
        setField(term162671, term162671.getClass(), "clr_sts", "rIKLUjcdnZ");
        setBooleanField(term162671, term162671.getClass(), "rgo_sts", true);
        setField(term162671, term162671.getClass(), "my_qst_id", "MQaKKukkYD");
        setField(term162671, term162671.getClass(), "my_qst_sts", "ThGyaiqnHq");
        setField(term162671, term162671.getClass(), "my_qst_prgrs", "AtEuOtHJrK");
        setField(term162671, term162671.getClass(), "my_qst_et", "gzqokHWvLu");
        setField(term162671, term162671.getClass(), "p_std_ie_have", "ANCcRsABGP");
        setField(term162671, term162671.getClass(), "p_std_se_have", "MBadwVIvwu");
        setField(term162671, term162671.getClass(), "cmd", "zTMIjtwMQL");
        setField(term162671, term162671.getClass(), "req_id", "cjJhlsbSLZ");
        setField(term162671, term162671.getClass(), "stat", "BvcBilSFZf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ppUmoMssug";
        callMethod(klass, "setMdl_have", argTypes, term162671, args);
    }

};


