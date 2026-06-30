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

public class StartResponse_setUsepvchnsldseeqp_19548414584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177299;
     Object term177741;

    public StartResponse_setUsepvchnsldseeqp_19548414584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term177744 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term177743 = ((Class) term177744).getDeclaredField((String) "FAILED");
        ((Field) term177743).setAccessible(true);
        Object enum421 = ((Field) term177743).get((Object) null);
        Class<? extends Object> term178009 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term178008 = ((Class) term178009).getDeclaredField((String) "COMPLEXITY");
        ((Field) term178008).setAccessible(true);
        Object enum422 = ((Field) term178008).get((Object) null);
        Class<? extends Object> term178346 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term178345 = ((Class) term178346).getDeclaredField((String) "NORMAL");
        ((Field) term178345).setAccessible(true);
        Object enum423 = ((Field) term178345).get((Object) null);
        Class<? extends Object> term178621 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term178620 = ((Class) term178621).getDeclaredField((String) "EXTRA");
        ((Field) term178620).setAccessible(true);
        Object enum424 = ((Field) term178620).get((Object) null);
        Class<? extends Object> term178928 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term178927 = ((Class) term178928).getDeclaredField((String) "SILVER");
        ((Field) term178927).setAccessible(true);
        Object enum425 = ((Field) term178927).get((Object) null);
        term177299 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term177397 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term177398 = newInstance(Class.forName("java.time.LocalDate"));
        Object term177402 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term177299, term177299.getClass(), "pd_id", 932810106);
        setField(term177299, term177299.getClass(), "start_result", enum421);
        setIntField(term177299, term177299.getClass(), "accept_idx", -2138801137);
        setIntField(term177299, term177299.getClass(), "start_idx", -1470115841);
        setField(term177299, term177299.getClass(), "player_name", "cFwZnaLmLP");
        setIntField(term177299, term177299.getClass(), "hp_vol", 480909331);
        setBooleanField(term177299, term177299.getClass(), "btn_se_vol", false);
        setIntField(term177299, term177299.getClass(), "btn_se_vol2", -2024983877);
        setIntField(term177299, term177299.getClass(), "sldr_se_vol2", 1757149811);
        setField(term177299, term177299.getClass(), "sort_kind", enum422);
        setIntField(term177299, term177299.getClass(), "lv_num", 1505375686);
        setIntField(term177299, term177299.getClass(), "lv_pnt", -132005524);
        setField(term177299, term177299.getClass(), "lv_str", "cBtfnWBMkE");
        setIntField(term177299, term177299.getClass(), "lv_efct_id", -1235127374);
        setIntField(term177299, term177299.getClass(), "lv_plt_id", -2077814162);
        setField(term177299, term177299.getClass(), "mdl_eqp_ary", "sFixkFlMhw");
        setField(term177299, term177299.getClass(), "c_itm_eqp_ary", "wNaCYPwDGZ");
        setField(term177299, term177299.getClass(), "ms_itm_flg_ary", "CFojehEtAR");
        setIntField(term177398, term177398.getClass(), "year", 2013);
        setShortField(term177398, term177398.getClass(), "month", (short) 9);
        setShortField(term177398, term177398.getClass(), "day", (short) 19);
        setField(term177397, term177397.getClass(), "date", term177398);
        setByteField(term177402, term177402.getClass(), "hour", (byte) 12);
        setByteField(term177402, term177402.getClass(), "minute", (byte) 29);
        setByteField(term177402, term177402.getClass(), "second", (byte) 28);
        setIntField(term177402, term177402.getClass(), "nano", 244069764);
        setField(term177397, term177397.getClass(), "time", term177402);
        setField(term177299, term177299.getClass(), "mdl_eqp_tm", term177397);
        setField(term177299, term177299.getClass(), "mdl_have", "EYeLeoxDrM");
        setField(term177299, term177299.getClass(), "cstmz_itm_have", "zIPJJJubgX");
        setBooleanField(term177299, term177299.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term177299, term177299.getClass(), "use_mdl_pri", false);
        setBooleanField(term177299, term177299.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term177299, term177299.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term177299, term177299.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term177299, term177299.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term177299, term177299.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term177299, term177299.getClass(), "vcld_pts", 444514470);
        setIntField(term177299, term177299.getClass(), "nxt_pv_id", -147055177);
        setField(term177299, term177299.getClass(), "nxt_dffclty", enum423);
        setField(term177299, term177299.getClass(), "nxt_edtn", enum424);
        setField(term177299, term177299.getClass(), "cv_cid", "WRbxmSFTaO");
        setField(term177299, term177299.getClass(), "cv_sc", "ZekQCuvPXT");
        setField(term177299, term177299.getClass(), "cv_rr", "GUXdlpmVNQ");
        setField(term177299, term177299.getClass(), "cv_bv", "QxSwOpnogl");
        setField(term177299, term177299.getClass(), "cv_bf", "wXeTrDfRqa");
        setIntField(term177299, term177299.getClass(), "cnp_cid", 1979044375);
        setIntField(term177299, term177299.getClass(), "cnp_val", 961252909);
        setField(term177299, term177299.getClass(), "cnp_rr", enum425);
        setField(term177299, term177299.getClass(), "cnp_sp", "QsFsmwqvwM");
        setField(term177299, term177299.getClass(), "my_lst_0", "pSDSdAjceB");
        setField(term177299, term177299.getClass(), "my_lst_1", "TGMaCYOqml");
        setField(term177299, term177299.getClass(), "my_lst_2", "btqCBRPcNd");
        setField(term177299, term177299.getClass(), "my_lst_3", "LEbiLyVKDG");
        setField(term177299, term177299.getClass(), "my_lst_4", "PzUzEwZhUT");
        setField(term177299, term177299.getClass(), "dsp_clr_brdr", "bJKvwEFeLG");
        setBooleanField(term177299, term177299.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term177299, term177299.getClass(), "dsp_clr_sts", true);
        setField(term177299, term177299.getClass(), "clr_sts", "MQzXbKeQIa");
        setBooleanField(term177299, term177299.getClass(), "rgo_sts", true);
        setField(term177299, term177299.getClass(), "my_qst_id", "YHDwlXeRTi");
        setField(term177299, term177299.getClass(), "my_qst_sts", "WIJiLZqEqc");
        setField(term177299, term177299.getClass(), "my_qst_prgrs", "OuZMVgPpoE");
        setField(term177299, term177299.getClass(), "my_qst_et", "nDUyFfanYp");
        setField(term177299, term177299.getClass(), "p_std_ie_have", "hYmQxPxTFd");
        setField(term177299, term177299.getClass(), "p_std_se_have", "Clkrygzvpw");
        setField(term177299, term177299.getClass(), "cmd", "TPzGOBNENK");
        setField(term177299, term177299.getClass(), "req_id", "ADhlvQDtuh");
        setField(term177299, term177299.getClass(), "stat", "rvUfMhtNrD");
        term177741 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term177741;
        callMethod(klass, "setUse_pv_chn_sld_se_eqp", argTypes, term177299, args);
    }

};


