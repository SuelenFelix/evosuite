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

public class StartResponse_setPlayername_21011483562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131001;

    public StartResponse_setPlayername_21011483562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term131449 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term131448 = ((Class) term131449).getDeclaredField((String) "SUCCESS");
        ((Field) term131448).setAccessible(true);
        Object enum310 = ((Field) term131448).get((Object) null);
        Class<? extends Object> term131717 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term131716 = ((Class) term131717).getDeclaredField((String) "NAME");
        ((Field) term131716).setAccessible(true);
        Object enum311 = ((Field) term131716).get((Object) null);
        Class<? extends Object> term132036 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term132035 = ((Class) term132036).getDeclaredField((String) "EASY");
        ((Field) term132035).setAccessible(true);
        Object enum312 = ((Field) term132035).get((Object) null);
        Class<? extends Object> term132305 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term132304 = ((Class) term132305).getDeclaredField((String) "EXTRA");
        ((Field) term132304).setAccessible(true);
        Object enum313 = ((Field) term132304).get((Object) null);
        Class<? extends Object> term132612 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term132611 = ((Class) term132612).getDeclaredField((String) "SILVER");
        ((Field) term132611).setAccessible(true);
        Object enum314 = ((Field) term132611).get((Object) null);
        term131001 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term131094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131099 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term131001, term131001.getClass(), "pd_id", 1544768934);
        setField(term131001, term131001.getClass(), "start_result", enum310);
        setIntField(term131001, term131001.getClass(), "accept_idx", -383508597);
        setIntField(term131001, term131001.getClass(), "start_idx", -819372164);
        setField(term131001, term131001.getClass(), "player_name", "EYJXMlkLoO");
        setIntField(term131001, term131001.getClass(), "hp_vol", 958132675);
        setBooleanField(term131001, term131001.getClass(), "btn_se_vol", true);
        setIntField(term131001, term131001.getClass(), "btn_se_vol2", -689879283);
        setIntField(term131001, term131001.getClass(), "sldr_se_vol2", 1985432430);
        setField(term131001, term131001.getClass(), "sort_kind", enum311);
        setIntField(term131001, term131001.getClass(), "lv_num", -1769933499);
        setIntField(term131001, term131001.getClass(), "lv_pnt", -1510932472);
        setField(term131001, term131001.getClass(), "lv_str", "qJtkJJhOSV");
        setIntField(term131001, term131001.getClass(), "lv_efct_id", 1970654816);
        setIntField(term131001, term131001.getClass(), "lv_plt_id", 1354781442);
        setField(term131001, term131001.getClass(), "mdl_eqp_ary", "vQbiGKncal");
        setField(term131001, term131001.getClass(), "c_itm_eqp_ary", "NTSNSiYeUu");
        setField(term131001, term131001.getClass(), "ms_itm_flg_ary", "SBTEFDmQVY");
        setIntField(term131095, term131095.getClass(), "year", 2016);
        setShortField(term131095, term131095.getClass(), "month", (short) 10);
        setShortField(term131095, term131095.getClass(), "day", (short) 20);
        setField(term131094, term131094.getClass(), "date", term131095);
        setByteField(term131099, term131099.getClass(), "hour", (byte) 18);
        setByteField(term131099, term131099.getClass(), "minute", (byte) 39);
        setByteField(term131099, term131099.getClass(), "second", (byte) 1);
        setIntField(term131099, term131099.getClass(), "nano", 196253988);
        setField(term131094, term131094.getClass(), "time", term131099);
        setField(term131001, term131001.getClass(), "mdl_eqp_tm", term131094);
        setField(term131001, term131001.getClass(), "mdl_have", "ohZpRiNDZM");
        setField(term131001, term131001.getClass(), "cstmz_itm_have", "qEXIxhmUwz");
        setBooleanField(term131001, term131001.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term131001, term131001.getClass(), "use_mdl_pri", true);
        setBooleanField(term131001, term131001.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term131001, term131001.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term131001, term131001.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term131001, term131001.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term131001, term131001.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term131001, term131001.getClass(), "vcld_pts", -393590701);
        setIntField(term131001, term131001.getClass(), "nxt_pv_id", 86344574);
        setField(term131001, term131001.getClass(), "nxt_dffclty", enum312);
        setField(term131001, term131001.getClass(), "nxt_edtn", enum313);
        setField(term131001, term131001.getClass(), "cv_cid", "RlyxtfCqKY");
        setField(term131001, term131001.getClass(), "cv_sc", "kyTUkLCRYm");
        setField(term131001, term131001.getClass(), "cv_rr", "oAotZgNUFH");
        setField(term131001, term131001.getClass(), "cv_bv", "TowhQcovXu");
        setField(term131001, term131001.getClass(), "cv_bf", "UFGOnIMOzf");
        setIntField(term131001, term131001.getClass(), "cnp_cid", -829441157);
        setIntField(term131001, term131001.getClass(), "cnp_val", -1489991025);
        setField(term131001, term131001.getClass(), "cnp_rr", enum314);
        setField(term131001, term131001.getClass(), "cnp_sp", "ySiyRlAQpt");
        setField(term131001, term131001.getClass(), "my_lst_0", "MiankJgKCp");
        setField(term131001, term131001.getClass(), "my_lst_1", "lmZBCmpOeb");
        setField(term131001, term131001.getClass(), "my_lst_2", "cPlYOAUqsP");
        setField(term131001, term131001.getClass(), "my_lst_3", "ritBUyuuKt");
        setField(term131001, term131001.getClass(), "my_lst_4", "YfziBBiPvL");
        setField(term131001, term131001.getClass(), "dsp_clr_brdr", "lNBaHEkYui");
        setBooleanField(term131001, term131001.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term131001, term131001.getClass(), "dsp_clr_sts", false);
        setField(term131001, term131001.getClass(), "clr_sts", "BqxRCYZwmn");
        setBooleanField(term131001, term131001.getClass(), "rgo_sts", true);
        setField(term131001, term131001.getClass(), "my_qst_id", "KHPDZjrXQp");
        setField(term131001, term131001.getClass(), "my_qst_sts", "fpyUFzdCwQ");
        setField(term131001, term131001.getClass(), "my_qst_prgrs", "OQqBkSGDem");
        setField(term131001, term131001.getClass(), "my_qst_et", "vZzZOvsIYn");
        setField(term131001, term131001.getClass(), "p_std_ie_have", "pAIBwhAbDu");
        setField(term131001, term131001.getClass(), "p_std_se_have", "iqhNUjVbRG");
        setField(term131001, term131001.getClass(), "cmd", "SSqIrPwJXd");
        setField(term131001, term131001.getClass(), "req_id", "jAxYagPvcV");
        setField(term131001, term131001.getClass(), "stat", "ZXLgGUqgyW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PdeSzTcBgY";
        callMethod(klass, "setPlayer_name", argTypes, term131001, args);
    }

};


