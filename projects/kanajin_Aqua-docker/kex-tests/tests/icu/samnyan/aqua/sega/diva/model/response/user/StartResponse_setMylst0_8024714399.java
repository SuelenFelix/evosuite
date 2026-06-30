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

public class StartResponse_setMylst0_8024714399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209022;

    public StartResponse_setMylst0_8024714399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term209478 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term209477 = ((Class) term209478).getDeclaredField((String) "SUCCESS");
        ((Field) term209477).setAccessible(true);
        Object enum497 = ((Field) term209477).get((Object) null);
        Class<? extends Object> term209746 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term209745 = ((Class) term209746).getDeclaredField((String) "MY_LIST_C");
        ((Field) term209745).setAccessible(true);
        Object enum498 = ((Field) term209745).get((Object) null);
        Class<? extends Object> term210080 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term210079 = ((Class) term210080).getDeclaredField((String) "EXTREME");
        ((Field) term210079).setAccessible(true);
        Object enum499 = ((Field) term210079).get((Object) null);
        Class<? extends Object> term210358 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term210357 = ((Class) term210358).getDeclaredField((String) "EXTRA");
        ((Field) term210357).setAccessible(true);
        Object enum500 = ((Field) term210357).get((Object) null);
        Class<? extends Object> term210665 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term210664 = ((Class) term210665).getDeclaredField((String) "SILVER");
        ((Field) term210664).setAccessible(true);
        Object enum501 = ((Field) term210664).get((Object) null);
        term209022 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term209120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209125 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term209022, term209022.getClass(), "pd_id", 1871761182);
        setField(term209022, term209022.getClass(), "start_result", enum497);
        setIntField(term209022, term209022.getClass(), "accept_idx", 233983728);
        setIntField(term209022, term209022.getClass(), "start_idx", -1650132476);
        setField(term209022, term209022.getClass(), "player_name", "GrrqChmbDB");
        setIntField(term209022, term209022.getClass(), "hp_vol", 1719680265);
        setBooleanField(term209022, term209022.getClass(), "btn_se_vol", false);
        setIntField(term209022, term209022.getClass(), "btn_se_vol2", -1890898783);
        setIntField(term209022, term209022.getClass(), "sldr_se_vol2", 1357632911);
        setField(term209022, term209022.getClass(), "sort_kind", enum498);
        setIntField(term209022, term209022.getClass(), "lv_num", 1768195761);
        setIntField(term209022, term209022.getClass(), "lv_pnt", -1382661134);
        setField(term209022, term209022.getClass(), "lv_str", "AOUZgesZGu");
        setIntField(term209022, term209022.getClass(), "lv_efct_id", -1042022818);
        setIntField(term209022, term209022.getClass(), "lv_plt_id", 317372051);
        setField(term209022, term209022.getClass(), "mdl_eqp_ary", "RApShxzpug");
        setField(term209022, term209022.getClass(), "c_itm_eqp_ary", "aygFZPbIko");
        setField(term209022, term209022.getClass(), "ms_itm_flg_ary", "hUhlDCVWIF");
        setIntField(term209121, term209121.getClass(), "year", 2027);
        setShortField(term209121, term209121.getClass(), "month", (short) 6);
        setShortField(term209121, term209121.getClass(), "day", (short) 20);
        setField(term209120, term209120.getClass(), "date", term209121);
        setByteField(term209125, term209125.getClass(), "hour", (byte) 23);
        setByteField(term209125, term209125.getClass(), "minute", (byte) 21);
        setByteField(term209125, term209125.getClass(), "second", (byte) 6);
        setIntField(term209125, term209125.getClass(), "nano", 897776059);
        setField(term209120, term209120.getClass(), "time", term209125);
        setField(term209022, term209022.getClass(), "mdl_eqp_tm", term209120);
        setField(term209022, term209022.getClass(), "mdl_have", "GjzKvoPaBR");
        setField(term209022, term209022.getClass(), "cstmz_itm_have", "VZRLekBSXz");
        setBooleanField(term209022, term209022.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term209022, term209022.getClass(), "use_mdl_pri", false);
        setBooleanField(term209022, term209022.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term209022, term209022.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term209022, term209022.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term209022, term209022.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term209022, term209022.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term209022, term209022.getClass(), "vcld_pts", 892170444);
        setIntField(term209022, term209022.getClass(), "nxt_pv_id", -82417507);
        setField(term209022, term209022.getClass(), "nxt_dffclty", enum499);
        setField(term209022, term209022.getClass(), "nxt_edtn", enum500);
        setField(term209022, term209022.getClass(), "cv_cid", "XfdYCOWEXZ");
        setField(term209022, term209022.getClass(), "cv_sc", "aPbJKoMxFL");
        setField(term209022, term209022.getClass(), "cv_rr", "FgtqUFBPnP");
        setField(term209022, term209022.getClass(), "cv_bv", "NUkHqaKZhA");
        setField(term209022, term209022.getClass(), "cv_bf", "kHSkpGasYO");
        setIntField(term209022, term209022.getClass(), "cnp_cid", -511400358);
        setIntField(term209022, term209022.getClass(), "cnp_val", -742178468);
        setField(term209022, term209022.getClass(), "cnp_rr", enum501);
        setField(term209022, term209022.getClass(), "cnp_sp", "OvTdHngAsq");
        setField(term209022, term209022.getClass(), "my_lst_0", "dlLhtWVZjw");
        setField(term209022, term209022.getClass(), "my_lst_1", "bGfglrDSXT");
        setField(term209022, term209022.getClass(), "my_lst_2", "sIrqbajnbs");
        setField(term209022, term209022.getClass(), "my_lst_3", "AaxFofoThl");
        setField(term209022, term209022.getClass(), "my_lst_4", "ukaqYcLsKW");
        setField(term209022, term209022.getClass(), "dsp_clr_brdr", "EZLBboYbhD");
        setBooleanField(term209022, term209022.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term209022, term209022.getClass(), "dsp_clr_sts", false);
        setField(term209022, term209022.getClass(), "clr_sts", "bZISImXSTe");
        setBooleanField(term209022, term209022.getClass(), "rgo_sts", false);
        setField(term209022, term209022.getClass(), "my_qst_id", "yrKoMMHHHY");
        setField(term209022, term209022.getClass(), "my_qst_sts", "JqDCwLjqnp");
        setField(term209022, term209022.getClass(), "my_qst_prgrs", "FHqHhmdJat");
        setField(term209022, term209022.getClass(), "my_qst_et", "QvpedpvzkV");
        setField(term209022, term209022.getClass(), "p_std_ie_have", "hSWpWtRQyH");
        setField(term209022, term209022.getClass(), "p_std_se_have", "DgHnOCKjBN");
        setField(term209022, term209022.getClass(), "cmd", "nSSytCAuBk");
        setField(term209022, term209022.getClass(), "req_id", "XiZyOHXnNC");
        setField(term209022, term209022.getClass(), "stat", "gQlDPvSqrX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EnYnZHmIml";
        callMethod(klass, "setMy_lst_0", argTypes, term209022, args);
    }

};


