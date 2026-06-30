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

public class StartResponse_getMyqstid_80662437952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110167;

    public StartResponse_getMyqstid_80662437952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term110611 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term110610 = ((Class) term110611).getDeclaredField((String) "SUCCESS");
        ((Field) term110610).setAccessible(true);
        Object enum260 = ((Field) term110610).get((Object) null);
        Class<? extends Object> term110879 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term110878 = ((Class) term110879).getDeclaredField((String) "MY_LIST_C");
        ((Field) term110878).setAccessible(true);
        Object enum261 = ((Field) term110878).get((Object) null);
        Class<? extends Object> term111213 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term111212 = ((Class) term111213).getDeclaredField((String) "EXTREME");
        ((Field) term111212).setAccessible(true);
        Object enum262 = ((Field) term111212).get((Object) null);
        Class<? extends Object> term111491 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term111490 = ((Class) term111491).getDeclaredField((String) "EXTRA");
        ((Field) term111490).setAccessible(true);
        Object enum263 = ((Field) term111490).get((Object) null);
        Class<? extends Object> term111798 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term111797 = ((Class) term111798).getDeclaredField((String) "SILVER");
        ((Field) term111797).setAccessible(true);
        Object enum264 = ((Field) term111797).get((Object) null);
        term110167 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term110265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110270 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term110167, term110167.getClass(), "pd_id", 1478914037);
        setField(term110167, term110167.getClass(), "start_result", enum260);
        setIntField(term110167, term110167.getClass(), "accept_idx", 1630231519);
        setIntField(term110167, term110167.getClass(), "start_idx", 1460702778);
        setField(term110167, term110167.getClass(), "player_name", "FTuOcSieav");
        setIntField(term110167, term110167.getClass(), "hp_vol", -1398142433);
        setBooleanField(term110167, term110167.getClass(), "btn_se_vol", true);
        setIntField(term110167, term110167.getClass(), "btn_se_vol2", -1112119058);
        setIntField(term110167, term110167.getClass(), "sldr_se_vol2", 2073858334);
        setField(term110167, term110167.getClass(), "sort_kind", enum261);
        setIntField(term110167, term110167.getClass(), "lv_num", -1693535639);
        setIntField(term110167, term110167.getClass(), "lv_pnt", 1344744036);
        setField(term110167, term110167.getClass(), "lv_str", "qSnwPXRuzC");
        setIntField(term110167, term110167.getClass(), "lv_efct_id", -98060427);
        setIntField(term110167, term110167.getClass(), "lv_plt_id", -1272268399);
        setField(term110167, term110167.getClass(), "mdl_eqp_ary", "gqhqalMaKC");
        setField(term110167, term110167.getClass(), "c_itm_eqp_ary", "qkMduZHBXR");
        setField(term110167, term110167.getClass(), "ms_itm_flg_ary", "jMQsCLYfKd");
        setIntField(term110266, term110266.getClass(), "year", 2011);
        setShortField(term110266, term110266.getClass(), "month", (short) 6);
        setShortField(term110266, term110266.getClass(), "day", (short) 26);
        setField(term110265, term110265.getClass(), "date", term110266);
        setByteField(term110270, term110270.getClass(), "hour", (byte) 22);
        setByteField(term110270, term110270.getClass(), "minute", (byte) 39);
        setByteField(term110270, term110270.getClass(), "second", (byte) 11);
        setIntField(term110270, term110270.getClass(), "nano", 686293604);
        setField(term110265, term110265.getClass(), "time", term110270);
        setField(term110167, term110167.getClass(), "mdl_eqp_tm", term110265);
        setField(term110167, term110167.getClass(), "mdl_have", "dpcpGqEQLd");
        setField(term110167, term110167.getClass(), "cstmz_itm_have", "pButgbcWlR");
        setBooleanField(term110167, term110167.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term110167, term110167.getClass(), "use_mdl_pri", false);
        setBooleanField(term110167, term110167.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term110167, term110167.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term110167, term110167.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term110167, term110167.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term110167, term110167.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term110167, term110167.getClass(), "vcld_pts", 1120271104);
        setIntField(term110167, term110167.getClass(), "nxt_pv_id", -128435804);
        setField(term110167, term110167.getClass(), "nxt_dffclty", enum262);
        setField(term110167, term110167.getClass(), "nxt_edtn", enum263);
        setField(term110167, term110167.getClass(), "cv_cid", "tPiZMhJIXj");
        setField(term110167, term110167.getClass(), "cv_sc", "lrEkNimddJ");
        setField(term110167, term110167.getClass(), "cv_rr", "fkeYGEUxMA");
        setField(term110167, term110167.getClass(), "cv_bv", "aJUGPodUIW");
        setField(term110167, term110167.getClass(), "cv_bf", "NpjPDfnDRd");
        setIntField(term110167, term110167.getClass(), "cnp_cid", 2136158480);
        setIntField(term110167, term110167.getClass(), "cnp_val", 2118747457);
        setField(term110167, term110167.getClass(), "cnp_rr", enum264);
        setField(term110167, term110167.getClass(), "cnp_sp", "SWMYovqYdk");
        setField(term110167, term110167.getClass(), "my_lst_0", "TQuvAoQcBe");
        setField(term110167, term110167.getClass(), "my_lst_1", "nGYLfZrtWO");
        setField(term110167, term110167.getClass(), "my_lst_2", "DBufEhhBCQ");
        setField(term110167, term110167.getClass(), "my_lst_3", "GiNZRBZjgO");
        setField(term110167, term110167.getClass(), "my_lst_4", "ceGAKcClsG");
        setField(term110167, term110167.getClass(), "dsp_clr_brdr", "SEldZGJyvX");
        setBooleanField(term110167, term110167.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term110167, term110167.getClass(), "dsp_clr_sts", true);
        setField(term110167, term110167.getClass(), "clr_sts", "vyvpqcHTQN");
        setBooleanField(term110167, term110167.getClass(), "rgo_sts", false);
        setField(term110167, term110167.getClass(), "my_qst_id", "QQcpNMSHvA");
        setField(term110167, term110167.getClass(), "my_qst_sts", "FLLklaMZvg");
        setField(term110167, term110167.getClass(), "my_qst_prgrs", "jRDZpkFkoD");
        setField(term110167, term110167.getClass(), "my_qst_et", "wwSknqIBIO");
        setField(term110167, term110167.getClass(), "p_std_ie_have", "zQPAxUFaeX");
        setField(term110167, term110167.getClass(), "p_std_se_have", "cKNHUkrYfK");
        setField(term110167, term110167.getClass(), "cmd", "crMeWqJOCQ");
        setField(term110167, term110167.getClass(), "req_id", "VUVgiQvSYa");
        setField(term110167, term110167.getClass(), "stat", "sEGgJJplmE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_id", argTypes, term110167, args);
    }

};


