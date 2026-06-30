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
import java.lang.Integer;

public class StartResponse_setLvnum_207812896468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143775;
     Object term144215;

    public StartResponse_setLvnum_207812896468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term144218 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term144217 = ((Class) term144218).getDeclaredField((String) "FAILED");
        ((Field) term144217).setAccessible(true);
        Object enum341 = ((Field) term144217).get((Object) null);
        Class<? extends Object> term144483 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term144482 = ((Class) term144483).getDeclaredField((String) "MY_LIST_B");
        ((Field) term144482).setAccessible(true);
        Object enum342 = ((Field) term144482).get((Object) null);
        Class<? extends Object> term144817 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term144816 = ((Class) term144817).getDeclaredField((String) "EXTREME");
        ((Field) term144816).setAccessible(true);
        Object enum343 = ((Field) term144816).get((Object) null);
        Class<? extends Object> term145095 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term145094 = ((Class) term145095).getDeclaredField((String) "EXTRA");
        ((Field) term145094).setAccessible(true);
        Object enum344 = ((Field) term145094).get((Object) null);
        Class<? extends Object> term145402 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term145401 = ((Class) term145402).getDeclaredField((String) "GOLD");
        ((Field) term145401).setAccessible(true);
        Object enum345 = ((Field) term145401).get((Object) null);
        term143775 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term143872 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143873 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143877 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term143775, term143775.getClass(), "pd_id", 320739944);
        setField(term143775, term143775.getClass(), "start_result", enum341);
        setIntField(term143775, term143775.getClass(), "accept_idx", 760218111);
        setIntField(term143775, term143775.getClass(), "start_idx", -1986366126);
        setField(term143775, term143775.getClass(), "player_name", "ntUYcalSmz");
        setIntField(term143775, term143775.getClass(), "hp_vol", -1963228619);
        setBooleanField(term143775, term143775.getClass(), "btn_se_vol", true);
        setIntField(term143775, term143775.getClass(), "btn_se_vol2", -709868952);
        setIntField(term143775, term143775.getClass(), "sldr_se_vol2", 847207929);
        setField(term143775, term143775.getClass(), "sort_kind", enum342);
        setIntField(term143775, term143775.getClass(), "lv_num", -1665928103);
        setIntField(term143775, term143775.getClass(), "lv_pnt", 1574458332);
        setField(term143775, term143775.getClass(), "lv_str", "lnZXLpyQoO");
        setIntField(term143775, term143775.getClass(), "lv_efct_id", -975856245);
        setIntField(term143775, term143775.getClass(), "lv_plt_id", -1023366103);
        setField(term143775, term143775.getClass(), "mdl_eqp_ary", "lOIEIGbwPj");
        setField(term143775, term143775.getClass(), "c_itm_eqp_ary", "TvmWaJWmLY");
        setField(term143775, term143775.getClass(), "ms_itm_flg_ary", "TSUdwgvHgU");
        setIntField(term143873, term143873.getClass(), "year", 2028);
        setShortField(term143873, term143873.getClass(), "month", (short) 4);
        setShortField(term143873, term143873.getClass(), "day", (short) 1);
        setField(term143872, term143872.getClass(), "date", term143873);
        setByteField(term143877, term143877.getClass(), "hour", (byte) 16);
        setByteField(term143877, term143877.getClass(), "minute", (byte) 22);
        setByteField(term143877, term143877.getClass(), "second", (byte) 32);
        setIntField(term143877, term143877.getClass(), "nano", 406353763);
        setField(term143872, term143872.getClass(), "time", term143877);
        setField(term143775, term143775.getClass(), "mdl_eqp_tm", term143872);
        setField(term143775, term143775.getClass(), "mdl_have", "YBQxTjzIrN");
        setField(term143775, term143775.getClass(), "cstmz_itm_have", "xfqaJVcHGx");
        setBooleanField(term143775, term143775.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term143775, term143775.getClass(), "use_mdl_pri", true);
        setBooleanField(term143775, term143775.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term143775, term143775.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term143775, term143775.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term143775, term143775.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term143775, term143775.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term143775, term143775.getClass(), "vcld_pts", 81427089);
        setIntField(term143775, term143775.getClass(), "nxt_pv_id", 755951489);
        setField(term143775, term143775.getClass(), "nxt_dffclty", enum343);
        setField(term143775, term143775.getClass(), "nxt_edtn", enum344);
        setField(term143775, term143775.getClass(), "cv_cid", "bANxpqKESI");
        setField(term143775, term143775.getClass(), "cv_sc", "sgpUSVSuVZ");
        setField(term143775, term143775.getClass(), "cv_rr", "ZOYhOzwINI");
        setField(term143775, term143775.getClass(), "cv_bv", "sPqjQQfymN");
        setField(term143775, term143775.getClass(), "cv_bf", "tNKFzflLBd");
        setIntField(term143775, term143775.getClass(), "cnp_cid", 1175146356);
        setIntField(term143775, term143775.getClass(), "cnp_val", -2137419728);
        setField(term143775, term143775.getClass(), "cnp_rr", enum345);
        setField(term143775, term143775.getClass(), "cnp_sp", "xHLlctEoGh");
        setField(term143775, term143775.getClass(), "my_lst_0", "aqgUzcnqpE");
        setField(term143775, term143775.getClass(), "my_lst_1", "yZDlWLIKEp");
        setField(term143775, term143775.getClass(), "my_lst_2", "dAEiXUxDrI");
        setField(term143775, term143775.getClass(), "my_lst_3", "AgQWngzXPH");
        setField(term143775, term143775.getClass(), "my_lst_4", "EZJmAIzdHM");
        setField(term143775, term143775.getClass(), "dsp_clr_brdr", "LAOkeXXkDr");
        setBooleanField(term143775, term143775.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term143775, term143775.getClass(), "dsp_clr_sts", true);
        setField(term143775, term143775.getClass(), "clr_sts", "YkZqFgrgVM");
        setBooleanField(term143775, term143775.getClass(), "rgo_sts", true);
        setField(term143775, term143775.getClass(), "my_qst_id", "QEJBgSNviH");
        setField(term143775, term143775.getClass(), "my_qst_sts", "bjigisSVNp");
        setField(term143775, term143775.getClass(), "my_qst_prgrs", "yJCCaWqQuK");
        setField(term143775, term143775.getClass(), "my_qst_et", "tgBNqkdndl");
        setField(term143775, term143775.getClass(), "p_std_ie_have", "GXKhRJLVFZ");
        setField(term143775, term143775.getClass(), "p_std_se_have", "qDflhZTJjR");
        setField(term143775, term143775.getClass(), "cmd", "bzQSjpIauE");
        setField(term143775, term143775.getClass(), "req_id", "ESQqarFUtp");
        setField(term143775, term143775.getClass(), "stat", "TiCRQbKtcf");
        term144215 = new Integer(1558810715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term144215;
        callMethod(klass, "setLv_num", argTypes, term143775, args);
    }

};


