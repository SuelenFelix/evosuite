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

public class StartResponse_getMylst2_150609721944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93519;

    public StartResponse_getMylst2_150609721944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93957 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term93956 = ((Class) term93957).getDeclaredField((String) "FAILED");
        ((Field) term93956).setAccessible(true);
        Object enum220 = ((Field) term93956).get((Object) null);
        Class<? extends Object> term94222 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term94221 = ((Class) term94222).getDeclaredField((String) "NAME");
        ((Field) term94221).setAccessible(true);
        Object enum221 = ((Field) term94221).get((Object) null);
        Class<? extends Object> term94541 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term94540 = ((Class) term94541).getDeclaredField((String) "EASY");
        ((Field) term94540).setAccessible(true);
        Object enum222 = ((Field) term94540).get((Object) null);
        Class<? extends Object> term94810 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term94809 = ((Class) term94810).getDeclaredField((String) "ORIGINAL");
        ((Field) term94809).setAccessible(true);
        Object enum223 = ((Field) term94809).get((Object) null);
        Class<? extends Object> term95126 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term95125 = ((Class) term95126).getDeclaredField((String) "BRONZE");
        ((Field) term95125).setAccessible(true);
        Object enum224 = ((Field) term95125).get((Object) null);
        term93519 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term93611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93616 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term93519, term93519.getClass(), "pd_id", 34167717);
        setField(term93519, term93519.getClass(), "start_result", enum220);
        setIntField(term93519, term93519.getClass(), "accept_idx", -514195141);
        setIntField(term93519, term93519.getClass(), "start_idx", -297946422);
        setField(term93519, term93519.getClass(), "player_name", "QwKYpiVQlL");
        setIntField(term93519, term93519.getClass(), "hp_vol", 385463636);
        setBooleanField(term93519, term93519.getClass(), "btn_se_vol", false);
        setIntField(term93519, term93519.getClass(), "btn_se_vol2", -1677599962);
        setIntField(term93519, term93519.getClass(), "sldr_se_vol2", -1790275458);
        setField(term93519, term93519.getClass(), "sort_kind", enum221);
        setIntField(term93519, term93519.getClass(), "lv_num", -497534255);
        setIntField(term93519, term93519.getClass(), "lv_pnt", 1588942911);
        setField(term93519, term93519.getClass(), "lv_str", "kSGsHNQQoW");
        setIntField(term93519, term93519.getClass(), "lv_efct_id", -2129828854);
        setIntField(term93519, term93519.getClass(), "lv_plt_id", -47438786);
        setField(term93519, term93519.getClass(), "mdl_eqp_ary", "MWezlyjdaG");
        setField(term93519, term93519.getClass(), "c_itm_eqp_ary", "drpBJuEKQG");
        setField(term93519, term93519.getClass(), "ms_itm_flg_ary", "GGpORnLrOW");
        setIntField(term93612, term93612.getClass(), "year", 2020);
        setShortField(term93612, term93612.getClass(), "month", (short) 5);
        setShortField(term93612, term93612.getClass(), "day", (short) 18);
        setField(term93611, term93611.getClass(), "date", term93612);
        setByteField(term93616, term93616.getClass(), "hour", (byte) 5);
        setByteField(term93616, term93616.getClass(), "minute", (byte) 46);
        setByteField(term93616, term93616.getClass(), "second", (byte) 13);
        setIntField(term93616, term93616.getClass(), "nano", 45893173);
        setField(term93611, term93611.getClass(), "time", term93616);
        setField(term93519, term93519.getClass(), "mdl_eqp_tm", term93611);
        setField(term93519, term93519.getClass(), "mdl_have", "gDGZwlpOZx");
        setField(term93519, term93519.getClass(), "cstmz_itm_have", "gkDpxkHPDg");
        setBooleanField(term93519, term93519.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term93519, term93519.getClass(), "use_mdl_pri", false);
        setBooleanField(term93519, term93519.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term93519, term93519.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term93519, term93519.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term93519, term93519.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term93519, term93519.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term93519, term93519.getClass(), "vcld_pts", -1955400589);
        setIntField(term93519, term93519.getClass(), "nxt_pv_id", 626179200);
        setField(term93519, term93519.getClass(), "nxt_dffclty", enum222);
        setField(term93519, term93519.getClass(), "nxt_edtn", enum223);
        setField(term93519, term93519.getClass(), "cv_cid", "pADwkrWiMW");
        setField(term93519, term93519.getClass(), "cv_sc", "FDORDJuAXQ");
        setField(term93519, term93519.getClass(), "cv_rr", "yjqoDeLBLg");
        setField(term93519, term93519.getClass(), "cv_bv", "DCepDqVwas");
        setField(term93519, term93519.getClass(), "cv_bf", "wKIBUlfNCx");
        setIntField(term93519, term93519.getClass(), "cnp_cid", -511077684);
        setIntField(term93519, term93519.getClass(), "cnp_val", -711507760);
        setField(term93519, term93519.getClass(), "cnp_rr", enum224);
        setField(term93519, term93519.getClass(), "cnp_sp", "iGfMUWRvod");
        setField(term93519, term93519.getClass(), "my_lst_0", "zUXaSvayQe");
        setField(term93519, term93519.getClass(), "my_lst_1", "bPVcnnQPSC");
        setField(term93519, term93519.getClass(), "my_lst_2", "PQLyoEKWSa");
        setField(term93519, term93519.getClass(), "my_lst_3", "HOgkhttJZS");
        setField(term93519, term93519.getClass(), "my_lst_4", "goqNSmXSSS");
        setField(term93519, term93519.getClass(), "dsp_clr_brdr", "AkViBLdqXM");
        setBooleanField(term93519, term93519.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term93519, term93519.getClass(), "dsp_clr_sts", false);
        setField(term93519, term93519.getClass(), "clr_sts", "UlxGFzEifL");
        setBooleanField(term93519, term93519.getClass(), "rgo_sts", true);
        setField(term93519, term93519.getClass(), "my_qst_id", "HilHTbDKDF");
        setField(term93519, term93519.getClass(), "my_qst_sts", "IaEqlVwmNS");
        setField(term93519, term93519.getClass(), "my_qst_prgrs", "ljNOgdPWrL");
        setField(term93519, term93519.getClass(), "my_qst_et", "oBlIZiyRMS");
        setField(term93519, term93519.getClass(), "p_std_ie_have", "QUYAkhtCNh");
        setField(term93519, term93519.getClass(), "p_std_se_have", "kOaAQOLyqd");
        setField(term93519, term93519.getClass(), "cmd", "ICBWiKaeHC");
        setField(term93519, term93519.getClass(), "req_id", "WAljagiCzu");
        setField(term93519, term93519.getClass(), "stat", "XKMXfDZajw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_lst_2", argTypes, term93519, args);
    }

};


