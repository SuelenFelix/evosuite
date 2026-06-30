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

public class StartResponse_getMylst4_150609914146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97663;

    public StartResponse_getMylst4_150609914146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98102 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term98101 = ((Class) term98102).getDeclaredField((String) "SUCCESS");
        ((Field) term98101).setAccessible(true);
        Object enum230 = ((Field) term98101).get((Object) null);
        Class<? extends Object> term98370 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term98369 = ((Class) term98370).getDeclaredField((String) "MY_LIST_B");
        ((Field) term98369).setAccessible(true);
        Object enum231 = ((Field) term98369).get((Object) null);
        Class<? extends Object> term98704 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term98703 = ((Class) term98704).getDeclaredField((String) "HARD");
        ((Field) term98703).setAccessible(true);
        Object enum232 = ((Field) term98703).get((Object) null);
        Class<? extends Object> term98973 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term98972 = ((Class) term98973).getDeclaredField((String) "EXTRA");
        ((Field) term98972).setAccessible(true);
        Object enum233 = ((Field) term98972).get((Object) null);
        Class<? extends Object> term99280 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term99279 = ((Class) term99280).getDeclaredField((String) "GOLD");
        ((Field) term99279).setAccessible(true);
        Object enum234 = ((Field) term99279).get((Object) null);
        term97663 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term97761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97766 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term97663, term97663.getClass(), "pd_id", 716486048);
        setField(term97663, term97663.getClass(), "start_result", enum230);
        setIntField(term97663, term97663.getClass(), "accept_idx", -466708718);
        setIntField(term97663, term97663.getClass(), "start_idx", 1038029515);
        setField(term97663, term97663.getClass(), "player_name", "fzQzzdIOMC");
        setIntField(term97663, term97663.getClass(), "hp_vol", 1137154606);
        setBooleanField(term97663, term97663.getClass(), "btn_se_vol", true);
        setIntField(term97663, term97663.getClass(), "btn_se_vol2", -100681578);
        setIntField(term97663, term97663.getClass(), "sldr_se_vol2", 296568835);
        setField(term97663, term97663.getClass(), "sort_kind", enum231);
        setIntField(term97663, term97663.getClass(), "lv_num", 1431951992);
        setIntField(term97663, term97663.getClass(), "lv_pnt", -1608123016);
        setField(term97663, term97663.getClass(), "lv_str", "hLVDOhfCKX");
        setIntField(term97663, term97663.getClass(), "lv_efct_id", -896473214);
        setIntField(term97663, term97663.getClass(), "lv_plt_id", 401203924);
        setField(term97663, term97663.getClass(), "mdl_eqp_ary", "yXLTfzOgfX");
        setField(term97663, term97663.getClass(), "c_itm_eqp_ary", "MANlfBKTPY");
        setField(term97663, term97663.getClass(), "ms_itm_flg_ary", "mRoEmuCJhW");
        setIntField(term97762, term97762.getClass(), "year", 2027);
        setShortField(term97762, term97762.getClass(), "month", (short) 8);
        setShortField(term97762, term97762.getClass(), "day", (short) 23);
        setField(term97761, term97761.getClass(), "date", term97762);
        setByteField(term97766, term97766.getClass(), "hour", (byte) 15);
        setByteField(term97766, term97766.getClass(), "minute", (byte) 12);
        setByteField(term97766, term97766.getClass(), "second", (byte) 6);
        setIntField(term97766, term97766.getClass(), "nano", 541218258);
        setField(term97761, term97761.getClass(), "time", term97766);
        setField(term97663, term97663.getClass(), "mdl_eqp_tm", term97761);
        setField(term97663, term97663.getClass(), "mdl_have", "JJUWbMXpyM");
        setField(term97663, term97663.getClass(), "cstmz_itm_have", "KDrRQWVXok");
        setBooleanField(term97663, term97663.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term97663, term97663.getClass(), "use_mdl_pri", false);
        setBooleanField(term97663, term97663.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term97663, term97663.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term97663, term97663.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term97663, term97663.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term97663, term97663.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term97663, term97663.getClass(), "vcld_pts", -1212399479);
        setIntField(term97663, term97663.getClass(), "nxt_pv_id", 2107679041);
        setField(term97663, term97663.getClass(), "nxt_dffclty", enum232);
        setField(term97663, term97663.getClass(), "nxt_edtn", enum233);
        setField(term97663, term97663.getClass(), "cv_cid", "oOOwvWgxtf");
        setField(term97663, term97663.getClass(), "cv_sc", "ywoADeiUfF");
        setField(term97663, term97663.getClass(), "cv_rr", "loHiudJxbt");
        setField(term97663, term97663.getClass(), "cv_bv", "lRbxbybNew");
        setField(term97663, term97663.getClass(), "cv_bf", "WzGudiEARD");
        setIntField(term97663, term97663.getClass(), "cnp_cid", 2040965507);
        setIntField(term97663, term97663.getClass(), "cnp_val", -1281083262);
        setField(term97663, term97663.getClass(), "cnp_rr", enum234);
        setField(term97663, term97663.getClass(), "cnp_sp", "IoefPqGtaj");
        setField(term97663, term97663.getClass(), "my_lst_0", "YMmtjELJuB");
        setField(term97663, term97663.getClass(), "my_lst_1", "FzyIShiOmb");
        setField(term97663, term97663.getClass(), "my_lst_2", "PEUfeJaZTk");
        setField(term97663, term97663.getClass(), "my_lst_3", "AIvyeIdskz");
        setField(term97663, term97663.getClass(), "my_lst_4", "iSQqMWMRlU");
        setField(term97663, term97663.getClass(), "dsp_clr_brdr", "djWEnlbOXu");
        setBooleanField(term97663, term97663.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term97663, term97663.getClass(), "dsp_clr_sts", true);
        setField(term97663, term97663.getClass(), "clr_sts", "MvDMzQBWME");
        setBooleanField(term97663, term97663.getClass(), "rgo_sts", false);
        setField(term97663, term97663.getClass(), "my_qst_id", "sZyAwmdGVS");
        setField(term97663, term97663.getClass(), "my_qst_sts", "VoKhXiLAaW");
        setField(term97663, term97663.getClass(), "my_qst_prgrs", "CaalXzRXQI");
        setField(term97663, term97663.getClass(), "my_qst_et", "eRBnKPjyVg");
        setField(term97663, term97663.getClass(), "p_std_ie_have", "svPqsHBvrm");
        setField(term97663, term97663.getClass(), "p_std_se_have", "sRzUJLYMmB");
        setField(term97663, term97663.getClass(), "cmd", "XxILklSDwz");
        setField(term97663, term97663.getClass(), "req_id", "TLjhFZbwKO");
        setField(term97663, term97663.getClass(), "stat", "nxEbLIApFc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_lst_4", argTypes, term97663, args);
    }

};


