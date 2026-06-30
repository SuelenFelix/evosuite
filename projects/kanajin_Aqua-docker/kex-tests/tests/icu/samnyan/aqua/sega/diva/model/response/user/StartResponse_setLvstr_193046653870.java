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

public class StartResponse_setLvstr_193046653870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147935;

    public StartResponse_setLvstr_193046653870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term148383 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term148382 = ((Class) term148383).getDeclaredField((String) "FAILED");
        ((Field) term148382).setAccessible(true);
        Object enum351 = ((Field) term148382).get((Object) null);
        Class<? extends Object> term148648 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term148647 = ((Class) term148648).getDeclaredField((String) "NAME");
        ((Field) term148647).setAccessible(true);
        Object enum352 = ((Field) term148647).get((Object) null);
        Class<? extends Object> term148967 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term148966 = ((Class) term148967).getDeclaredField((String) "EASY");
        ((Field) term148966).setAccessible(true);
        Object enum353 = ((Field) term148966).get((Object) null);
        Class<? extends Object> term149236 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term149235 = ((Class) term149236).getDeclaredField((String) "ORIGINAL");
        ((Field) term149235).setAccessible(true);
        Object enum354 = ((Field) term149235).get((Object) null);
        Class<? extends Object> term149552 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term149551 = ((Class) term149552).getDeclaredField((String) "NONE");
        ((Field) term149551).setAccessible(true);
        Object enum355 = ((Field) term149551).get((Object) null);
        term147935 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term148027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148032 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term147935, term147935.getClass(), "pd_id", 355911655);
        setField(term147935, term147935.getClass(), "start_result", enum351);
        setIntField(term147935, term147935.getClass(), "accept_idx", 1811833766);
        setIntField(term147935, term147935.getClass(), "start_idx", 735987104);
        setField(term147935, term147935.getClass(), "player_name", "TnpXhZmCRY");
        setIntField(term147935, term147935.getClass(), "hp_vol", -1784072578);
        setBooleanField(term147935, term147935.getClass(), "btn_se_vol", true);
        setIntField(term147935, term147935.getClass(), "btn_se_vol2", 2011764585);
        setIntField(term147935, term147935.getClass(), "sldr_se_vol2", -860680764);
        setField(term147935, term147935.getClass(), "sort_kind", enum352);
        setIntField(term147935, term147935.getClass(), "lv_num", -963198667);
        setIntField(term147935, term147935.getClass(), "lv_pnt", -1007935918);
        setField(term147935, term147935.getClass(), "lv_str", "ECVAXFhrTP");
        setIntField(term147935, term147935.getClass(), "lv_efct_id", 1485731037);
        setIntField(term147935, term147935.getClass(), "lv_plt_id", 1304396087);
        setField(term147935, term147935.getClass(), "mdl_eqp_ary", "ypytdNbrBc");
        setField(term147935, term147935.getClass(), "c_itm_eqp_ary", "XvrJCOSYei");
        setField(term147935, term147935.getClass(), "ms_itm_flg_ary", "QdRcxOxNSl");
        setIntField(term148028, term148028.getClass(), "year", 2022);
        setShortField(term148028, term148028.getClass(), "month", (short) 4);
        setShortField(term148028, term148028.getClass(), "day", (short) 15);
        setField(term148027, term148027.getClass(), "date", term148028);
        setByteField(term148032, term148032.getClass(), "hour", (byte) 20);
        setByteField(term148032, term148032.getClass(), "minute", (byte) 58);
        setByteField(term148032, term148032.getClass(), "second", (byte) 46);
        setIntField(term148032, term148032.getClass(), "nano", 435562727);
        setField(term148027, term148027.getClass(), "time", term148032);
        setField(term147935, term147935.getClass(), "mdl_eqp_tm", term148027);
        setField(term147935, term147935.getClass(), "mdl_have", "lvdsucnNvR");
        setField(term147935, term147935.getClass(), "cstmz_itm_have", "mSjSKfeMUn");
        setBooleanField(term147935, term147935.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term147935, term147935.getClass(), "use_mdl_pri", false);
        setBooleanField(term147935, term147935.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term147935, term147935.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term147935, term147935.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term147935, term147935.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term147935, term147935.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term147935, term147935.getClass(), "vcld_pts", 1782600602);
        setIntField(term147935, term147935.getClass(), "nxt_pv_id", -185892708);
        setField(term147935, term147935.getClass(), "nxt_dffclty", enum353);
        setField(term147935, term147935.getClass(), "nxt_edtn", enum354);
        setField(term147935, term147935.getClass(), "cv_cid", "nVXCBYnEcg");
        setField(term147935, term147935.getClass(), "cv_sc", "fcLnKXxzfM");
        setField(term147935, term147935.getClass(), "cv_rr", "FtyaWnfsgn");
        setField(term147935, term147935.getClass(), "cv_bv", "qphbpPdwrD");
        setField(term147935, term147935.getClass(), "cv_bf", "xHdHafzFSM");
        setIntField(term147935, term147935.getClass(), "cnp_cid", -203163250);
        setIntField(term147935, term147935.getClass(), "cnp_val", 498473526);
        setField(term147935, term147935.getClass(), "cnp_rr", enum355);
        setField(term147935, term147935.getClass(), "cnp_sp", "fAsiOEKVaH");
        setField(term147935, term147935.getClass(), "my_lst_0", "EltrILhEwT");
        setField(term147935, term147935.getClass(), "my_lst_1", "wCcSeUJzhg");
        setField(term147935, term147935.getClass(), "my_lst_2", "HlVHAsOBmJ");
        setField(term147935, term147935.getClass(), "my_lst_3", "nyThJEXHhd");
        setField(term147935, term147935.getClass(), "my_lst_4", "TRfRRMMCZw");
        setField(term147935, term147935.getClass(), "dsp_clr_brdr", "rwbfUcOMVc");
        setBooleanField(term147935, term147935.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term147935, term147935.getClass(), "dsp_clr_sts", false);
        setField(term147935, term147935.getClass(), "clr_sts", "ljTkNgJRUl");
        setBooleanField(term147935, term147935.getClass(), "rgo_sts", true);
        setField(term147935, term147935.getClass(), "my_qst_id", "siRXAywvyp");
        setField(term147935, term147935.getClass(), "my_qst_sts", "ZRLaReQeFg");
        setField(term147935, term147935.getClass(), "my_qst_prgrs", "cOcXspUxKR");
        setField(term147935, term147935.getClass(), "my_qst_et", "JNzgWUmqtl");
        setField(term147935, term147935.getClass(), "p_std_ie_have", "UxVfWaXiSr");
        setField(term147935, term147935.getClass(), "p_std_se_have", "yTrvklotrs");
        setField(term147935, term147935.getClass(), "cmd", "kNkFIdfwqs");
        setField(term147935, term147935.getClass(), "req_id", "sHLdqoTjnP");
        setField(term147935, term147935.getClass(), "stat", "UakuVGzEav");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DxiwTTouEo";
        callMethod(klass, "setLv_str", argTypes, term147935, args);
    }

};


