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

public class StartResponse_setMdleqptm_47534432076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160587;
     Object term161026;

    public StartResponse_setMdleqptm_47534432076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term161037 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term161036 = ((Class) term161037).getDeclaredField((String) "FAILED");
        ((Field) term161036).setAccessible(true);
        Object enum381 = ((Field) term161036).get((Object) null);
        Class<? extends Object> term161302 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term161301 = ((Class) term161302).getDeclaredField((String) "MY_LIST_C");
        ((Field) term161301).setAccessible(true);
        Object enum382 = ((Field) term161301).get((Object) null);
        Class<? extends Object> term161636 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term161635 = ((Class) term161636).getDeclaredField((String) "EASY");
        ((Field) term161635).setAccessible(true);
        Object enum383 = ((Field) term161635).get((Object) null);
        Class<? extends Object> term161905 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term161904 = ((Class) term161905).getDeclaredField((String) "EXTRA");
        ((Field) term161904).setAccessible(true);
        Object enum384 = ((Field) term161904).get((Object) null);
        Class<? extends Object> term162212 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term162211 = ((Class) term162212).getDeclaredField((String) "SILVER");
        ((Field) term162211).setAccessible(true);
        Object enum385 = ((Field) term162211).get((Object) null);
        term160587 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term160684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160689 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term160587, term160587.getClass(), "pd_id", 1594426218);
        setField(term160587, term160587.getClass(), "start_result", enum381);
        setIntField(term160587, term160587.getClass(), "accept_idx", -2060535464);
        setIntField(term160587, term160587.getClass(), "start_idx", -1242946317);
        setField(term160587, term160587.getClass(), "player_name", "mukHRKZmND");
        setIntField(term160587, term160587.getClass(), "hp_vol", -1541566235);
        setBooleanField(term160587, term160587.getClass(), "btn_se_vol", false);
        setIntField(term160587, term160587.getClass(), "btn_se_vol2", -189738995);
        setIntField(term160587, term160587.getClass(), "sldr_se_vol2", 1943019963);
        setField(term160587, term160587.getClass(), "sort_kind", enum382);
        setIntField(term160587, term160587.getClass(), "lv_num", 186472650);
        setIntField(term160587, term160587.getClass(), "lv_pnt", 279675992);
        setField(term160587, term160587.getClass(), "lv_str", "WVPSokrFPV");
        setIntField(term160587, term160587.getClass(), "lv_efct_id", -1626074989);
        setIntField(term160587, term160587.getClass(), "lv_plt_id", -552272253);
        setField(term160587, term160587.getClass(), "mdl_eqp_ary", "jELmrpQCNf");
        setField(term160587, term160587.getClass(), "c_itm_eqp_ary", "NkjAcBXmmT");
        setField(term160587, term160587.getClass(), "ms_itm_flg_ary", "KgtGJGInhu");
        setIntField(term160685, term160685.getClass(), "year", 2011);
        setShortField(term160685, term160685.getClass(), "month", (short) 8);
        setShortField(term160685, term160685.getClass(), "day", (short) 1);
        setField(term160684, term160684.getClass(), "date", term160685);
        setByteField(term160689, term160689.getClass(), "hour", (byte) 7);
        setByteField(term160689, term160689.getClass(), "minute", (byte) 2);
        setByteField(term160689, term160689.getClass(), "second", (byte) 46);
        setIntField(term160689, term160689.getClass(), "nano", 187178462);
        setField(term160684, term160684.getClass(), "time", term160689);
        setField(term160587, term160587.getClass(), "mdl_eqp_tm", term160684);
        setField(term160587, term160587.getClass(), "mdl_have", "mVHDjrsMAV");
        setField(term160587, term160587.getClass(), "cstmz_itm_have", "rjWnqcjYuU");
        setBooleanField(term160587, term160587.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term160587, term160587.getClass(), "use_mdl_pri", true);
        setBooleanField(term160587, term160587.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term160587, term160587.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term160587, term160587.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term160587, term160587.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term160587, term160587.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term160587, term160587.getClass(), "vcld_pts", -633523956);
        setIntField(term160587, term160587.getClass(), "nxt_pv_id", 1761540885);
        setField(term160587, term160587.getClass(), "nxt_dffclty", enum383);
        setField(term160587, term160587.getClass(), "nxt_edtn", enum384);
        setField(term160587, term160587.getClass(), "cv_cid", "JhszTkUWCg");
        setField(term160587, term160587.getClass(), "cv_sc", "gfNPCeiULY");
        setField(term160587, term160587.getClass(), "cv_rr", "aUJLXfcWME");
        setField(term160587, term160587.getClass(), "cv_bv", "ixeIpUaVug");
        setField(term160587, term160587.getClass(), "cv_bf", "TELyWFMBJv");
        setIntField(term160587, term160587.getClass(), "cnp_cid", -168498989);
        setIntField(term160587, term160587.getClass(), "cnp_val", 388247095);
        setField(term160587, term160587.getClass(), "cnp_rr", enum385);
        setField(term160587, term160587.getClass(), "cnp_sp", "bIqbgRdzpB");
        setField(term160587, term160587.getClass(), "my_lst_0", "FIUbHJmAEj");
        setField(term160587, term160587.getClass(), "my_lst_1", "mJrFDaDdyY");
        setField(term160587, term160587.getClass(), "my_lst_2", "HqyBQNuLnz");
        setField(term160587, term160587.getClass(), "my_lst_3", "xWkZKbrvmX");
        setField(term160587, term160587.getClass(), "my_lst_4", "PTEWoxLNqQ");
        setField(term160587, term160587.getClass(), "dsp_clr_brdr", "XiAUBffMZP");
        setBooleanField(term160587, term160587.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term160587, term160587.getClass(), "dsp_clr_sts", false);
        setField(term160587, term160587.getClass(), "clr_sts", "pkfsHvqODq");
        setBooleanField(term160587, term160587.getClass(), "rgo_sts", false);
        setField(term160587, term160587.getClass(), "my_qst_id", "OoRBUdwown");
        setField(term160587, term160587.getClass(), "my_qst_sts", "lSidZunNtu");
        setField(term160587, term160587.getClass(), "my_qst_prgrs", "TLUhUnoanK");
        setField(term160587, term160587.getClass(), "my_qst_et", "JXyQTIyIrU");
        setField(term160587, term160587.getClass(), "p_std_ie_have", "uplmRQRGWr");
        setField(term160587, term160587.getClass(), "p_std_se_have", "ZEmNnaQFYB");
        setField(term160587, term160587.getClass(), "cmd", "FNxFpCZxLW");
        setField(term160587, term160587.getClass(), "req_id", "sXMXSCUbRu");
        setField(term160587, term160587.getClass(), "stat", "iualVLfDmL");
        term161026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161031 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term161027, term161027.getClass(), "year", 2020);
        setShortField(term161027, term161027.getClass(), "month", (short) 9);
        setShortField(term161027, term161027.getClass(), "day", (short) 3);
        setField(term161026, term161026.getClass(), "date", term161027);
        setByteField(term161031, term161031.getClass(), "hour", (byte) 10);
        setByteField(term161031, term161031.getClass(), "minute", (byte) 44);
        setByteField(term161031, term161031.getClass(), "second", (byte) 5);
        setIntField(term161031, term161031.getClass(), "nano", 572560230);
        setField(term161026, term161026.getClass(), "time", term161031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term161026;
        callMethod(klass, "setMdl_eqp_tm", argTypes, term160587, args);
    }

};


