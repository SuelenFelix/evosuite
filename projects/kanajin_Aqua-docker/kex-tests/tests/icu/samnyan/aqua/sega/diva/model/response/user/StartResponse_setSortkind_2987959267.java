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

public class StartResponse_setSortkind_2987959267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141425;
     Object enum340;

    public StartResponse_setSortkind_2987959267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term141876 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term141875 = ((Class) term141876).getDeclaredField((String) "SUCCESS");
        ((Field) term141875).setAccessible(true);
        Object enum335 = ((Field) term141875).get((Object) null);
        Class<? extends Object> term142144 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term142143 = ((Class) term142144).getDeclaredField((String) "NAME");
        ((Field) term142143).setAccessible(true);
        Object enum336 = ((Field) term142143).get((Object) null);
        Class<? extends Object> term142463 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term142462 = ((Class) term142463).getDeclaredField((String) "NORMAL");
        ((Field) term142462).setAccessible(true);
        Object enum337 = ((Field) term142462).get((Object) null);
        Class<? extends Object> term142738 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term142737 = ((Class) term142738).getDeclaredField((String) "EXTRA");
        ((Field) term142737).setAccessible(true);
        Object enum338 = ((Field) term142737).get((Object) null);
        Class<? extends Object> term143045 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term143044 = ((Class) term143045).getDeclaredField((String) "GOLD");
        ((Field) term143044).setAccessible(true);
        Object enum339 = ((Field) term143044).get((Object) null);
        term141425 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term141518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141523 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term141425, term141425.getClass(), "pd_id", -1042470635);
        setField(term141425, term141425.getClass(), "start_result", enum335);
        setIntField(term141425, term141425.getClass(), "accept_idx", -524352937);
        setIntField(term141425, term141425.getClass(), "start_idx", 1472218987);
        setField(term141425, term141425.getClass(), "player_name", "rMbsSfMKvX");
        setIntField(term141425, term141425.getClass(), "hp_vol", 805176809);
        setBooleanField(term141425, term141425.getClass(), "btn_se_vol", false);
        setIntField(term141425, term141425.getClass(), "btn_se_vol2", -82632953);
        setIntField(term141425, term141425.getClass(), "sldr_se_vol2", -1473876284);
        setField(term141425, term141425.getClass(), "sort_kind", enum336);
        setIntField(term141425, term141425.getClass(), "lv_num", -1389314671);
        setIntField(term141425, term141425.getClass(), "lv_pnt", -499699841);
        setField(term141425, term141425.getClass(), "lv_str", "oCsqRJXMBc");
        setIntField(term141425, term141425.getClass(), "lv_efct_id", 360972386);
        setIntField(term141425, term141425.getClass(), "lv_plt_id", -2063884849);
        setField(term141425, term141425.getClass(), "mdl_eqp_ary", "npPxKNoqdS");
        setField(term141425, term141425.getClass(), "c_itm_eqp_ary", "tGgCtmAQPu");
        setField(term141425, term141425.getClass(), "ms_itm_flg_ary", "HokisXXNMR");
        setIntField(term141519, term141519.getClass(), "year", 2025);
        setShortField(term141519, term141519.getClass(), "month", (short) 8);
        setShortField(term141519, term141519.getClass(), "day", (short) 22);
        setField(term141518, term141518.getClass(), "date", term141519);
        setByteField(term141523, term141523.getClass(), "hour", (byte) 6);
        setByteField(term141523, term141523.getClass(), "minute", (byte) 48);
        setByteField(term141523, term141523.getClass(), "second", (byte) 49);
        setIntField(term141523, term141523.getClass(), "nano", 46400229);
        setField(term141518, term141518.getClass(), "time", term141523);
        setField(term141425, term141425.getClass(), "mdl_eqp_tm", term141518);
        setField(term141425, term141425.getClass(), "mdl_have", "JbtvoXZZHr");
        setField(term141425, term141425.getClass(), "cstmz_itm_have", "eMlkqCfrnK");
        setBooleanField(term141425, term141425.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term141425, term141425.getClass(), "use_mdl_pri", false);
        setBooleanField(term141425, term141425.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term141425, term141425.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term141425, term141425.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term141425, term141425.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term141425, term141425.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term141425, term141425.getClass(), "vcld_pts", 1054887169);
        setIntField(term141425, term141425.getClass(), "nxt_pv_id", 692873905);
        setField(term141425, term141425.getClass(), "nxt_dffclty", enum337);
        setField(term141425, term141425.getClass(), "nxt_edtn", enum338);
        setField(term141425, term141425.getClass(), "cv_cid", "HCiwohQDUV");
        setField(term141425, term141425.getClass(), "cv_sc", "RRWTUIdKkl");
        setField(term141425, term141425.getClass(), "cv_rr", "pBnfJsGPNO");
        setField(term141425, term141425.getClass(), "cv_bv", "hzaRTeUQpV");
        setField(term141425, term141425.getClass(), "cv_bf", "RlIgxHiNOB");
        setIntField(term141425, term141425.getClass(), "cnp_cid", 1734759369);
        setIntField(term141425, term141425.getClass(), "cnp_val", 1841493736);
        setField(term141425, term141425.getClass(), "cnp_rr", enum339);
        setField(term141425, term141425.getClass(), "cnp_sp", "kSpBCSqyfl");
        setField(term141425, term141425.getClass(), "my_lst_0", "OUrtbTvuiW");
        setField(term141425, term141425.getClass(), "my_lst_1", "UnkpYLSsCR");
        setField(term141425, term141425.getClass(), "my_lst_2", "AaxnITALtd");
        setField(term141425, term141425.getClass(), "my_lst_3", "RdnRRpWglh");
        setField(term141425, term141425.getClass(), "my_lst_4", "YcXTXuOFYV");
        setField(term141425, term141425.getClass(), "dsp_clr_brdr", "HGhIlMCaKM");
        setBooleanField(term141425, term141425.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term141425, term141425.getClass(), "dsp_clr_sts", false);
        setField(term141425, term141425.getClass(), "clr_sts", "pPxivEPfHY");
        setBooleanField(term141425, term141425.getClass(), "rgo_sts", false);
        setField(term141425, term141425.getClass(), "my_qst_id", "BiitfiJmRW");
        setField(term141425, term141425.getClass(), "my_qst_sts", "ILHarzuGbn");
        setField(term141425, term141425.getClass(), "my_qst_prgrs", "uNGHHAwCFL");
        setField(term141425, term141425.getClass(), "my_qst_et", "fbshyuUfqy");
        setField(term141425, term141425.getClass(), "p_std_ie_have", "eupNcihLEw");
        setField(term141425, term141425.getClass(), "p_std_se_have", "iFFcolxwcm");
        setField(term141425, term141425.getClass(), "cmd", "bAsZBSqnyM");
        setField(term141425, term141425.getClass(), "req_id", "urrmpQzmTU");
        setField(term141425, term141425.getClass(), "stat", "GWoZyTTlNx");
        Class<? extends Object> term143499 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term143498 = ((Class) term143499).getDeclaredField((String) "COMPLEXITY");
        ((Field) term143498).setAccessible(true);
        enum340 = ((Field) term143498).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Object[] args = new Object[1];
        args[0] = enum340;
        callMethod(klass, "setSort_kind", argTypes, term141425, args);
    }

};


