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

public class StartResponse_setUsepvmdleqp_59599454879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166883;
     Object term167318;

    public StartResponse_setUsepvmdleqp_59599454879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term167321 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term167320 = ((Class) term167321).getDeclaredField((String) "FAILED");
        ((Field) term167320).setAccessible(true);
        Object enum396 = ((Field) term167320).get((Object) null);
        Class<? extends Object> term167586 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term167585 = ((Class) term167586).getDeclaredField((String) "NAME");
        ((Field) term167585).setAccessible(true);
        Object enum397 = ((Field) term167585).get((Object) null);
        Class<? extends Object> term167905 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term167904 = ((Class) term167905).getDeclaredField((String) "EXTREME");
        ((Field) term167904).setAccessible(true);
        Object enum398 = ((Field) term167904).get((Object) null);
        Class<? extends Object> term168183 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term168182 = ((Class) term168183).getDeclaredField((String) "EXTRA");
        ((Field) term168182).setAccessible(true);
        Object enum399 = ((Field) term168182).get((Object) null);
        Class<? extends Object> term168490 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term168489 = ((Class) term168490).getDeclaredField((String) "GOLD");
        ((Field) term168489).setAccessible(true);
        Object enum400 = ((Field) term168489).get((Object) null);
        term166883 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term166975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166980 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term166883, term166883.getClass(), "pd_id", 1201413899);
        setField(term166883, term166883.getClass(), "start_result", enum396);
        setIntField(term166883, term166883.getClass(), "accept_idx", -376722373);
        setIntField(term166883, term166883.getClass(), "start_idx", 1180687854);
        setField(term166883, term166883.getClass(), "player_name", "sgVVVUpnau");
        setIntField(term166883, term166883.getClass(), "hp_vol", 328631288);
        setBooleanField(term166883, term166883.getClass(), "btn_se_vol", false);
        setIntField(term166883, term166883.getClass(), "btn_se_vol2", -1631415805);
        setIntField(term166883, term166883.getClass(), "sldr_se_vol2", 1073400519);
        setField(term166883, term166883.getClass(), "sort_kind", enum397);
        setIntField(term166883, term166883.getClass(), "lv_num", -2025555268);
        setIntField(term166883, term166883.getClass(), "lv_pnt", -746950289);
        setField(term166883, term166883.getClass(), "lv_str", "xwVTgDhNdW");
        setIntField(term166883, term166883.getClass(), "lv_efct_id", -137577510);
        setIntField(term166883, term166883.getClass(), "lv_plt_id", 719185716);
        setField(term166883, term166883.getClass(), "mdl_eqp_ary", "ruqGjVRVlD");
        setField(term166883, term166883.getClass(), "c_itm_eqp_ary", "oeoFYkQLVk");
        setField(term166883, term166883.getClass(), "ms_itm_flg_ary", "fibZqjUmdU");
        setIntField(term166976, term166976.getClass(), "year", 2011);
        setShortField(term166976, term166976.getClass(), "month", (short) 4);
        setShortField(term166976, term166976.getClass(), "day", (short) 19);
        setField(term166975, term166975.getClass(), "date", term166976);
        setByteField(term166980, term166980.getClass(), "hour", (byte) 12);
        setByteField(term166980, term166980.getClass(), "minute", (byte) 0);
        setByteField(term166980, term166980.getClass(), "second", (byte) 14);
        setIntField(term166980, term166980.getClass(), "nano", 849079063);
        setField(term166975, term166975.getClass(), "time", term166980);
        setField(term166883, term166883.getClass(), "mdl_eqp_tm", term166975);
        setField(term166883, term166883.getClass(), "mdl_have", "DvLIPKnbCV");
        setField(term166883, term166883.getClass(), "cstmz_itm_have", "QwAMZyCIhS");
        setBooleanField(term166883, term166883.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term166883, term166883.getClass(), "use_mdl_pri", false);
        setBooleanField(term166883, term166883.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term166883, term166883.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term166883, term166883.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term166883, term166883.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term166883, term166883.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term166883, term166883.getClass(), "vcld_pts", 1624820010);
        setIntField(term166883, term166883.getClass(), "nxt_pv_id", -831921156);
        setField(term166883, term166883.getClass(), "nxt_dffclty", enum398);
        setField(term166883, term166883.getClass(), "nxt_edtn", enum399);
        setField(term166883, term166883.getClass(), "cv_cid", "TnLDXZoBoo");
        setField(term166883, term166883.getClass(), "cv_sc", "RQTElJrtwb");
        setField(term166883, term166883.getClass(), "cv_rr", "hFvoVHxToy");
        setField(term166883, term166883.getClass(), "cv_bv", "ZybsWgYCUR");
        setField(term166883, term166883.getClass(), "cv_bf", "YZNLZnNFNI");
        setIntField(term166883, term166883.getClass(), "cnp_cid", -2085566906);
        setIntField(term166883, term166883.getClass(), "cnp_val", 1773193728);
        setField(term166883, term166883.getClass(), "cnp_rr", enum400);
        setField(term166883, term166883.getClass(), "cnp_sp", "uHcUlIseio");
        setField(term166883, term166883.getClass(), "my_lst_0", "bsmWXOcLZJ");
        setField(term166883, term166883.getClass(), "my_lst_1", "ltTwdndtbe");
        setField(term166883, term166883.getClass(), "my_lst_2", "XaldiIeyMi");
        setField(term166883, term166883.getClass(), "my_lst_3", "lkujDCFpdm");
        setField(term166883, term166883.getClass(), "my_lst_4", "sGfzmhpQEH");
        setField(term166883, term166883.getClass(), "dsp_clr_brdr", "FqGkFGXAbg");
        setBooleanField(term166883, term166883.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term166883, term166883.getClass(), "dsp_clr_sts", false);
        setField(term166883, term166883.getClass(), "clr_sts", "SSWEZgFiFO");
        setBooleanField(term166883, term166883.getClass(), "rgo_sts", true);
        setField(term166883, term166883.getClass(), "my_qst_id", "spphrCslQA");
        setField(term166883, term166883.getClass(), "my_qst_sts", "EPkEFVlZrY");
        setField(term166883, term166883.getClass(), "my_qst_prgrs", "jySnpYEVPv");
        setField(term166883, term166883.getClass(), "my_qst_et", "VdHqujFzSo");
        setField(term166883, term166883.getClass(), "p_std_ie_have", "cZbOKEdKPs");
        setField(term166883, term166883.getClass(), "p_std_se_have", "nvXqvMSAjc");
        setField(term166883, term166883.getClass(), "cmd", "agbhgbQisl");
        setField(term166883, term166883.getClass(), "req_id", "EZvlAVCXCm");
        setField(term166883, term166883.getClass(), "stat", "axtbmWOSRY");
        term167318 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term167318;
        callMethod(klass, "setUse_pv_mdl_eqp", argTypes, term166883, args);
    }

};


