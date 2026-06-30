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

public class StartResponse_setCnpsp_108817398998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206910;

    public StartResponse_setCnpsp_108817398998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207366 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term207365 = ((Class) term207366).getDeclaredField((String) "FAILED");
        ((Field) term207365).setAccessible(true);
        Object enum492 = ((Field) term207365).get((Object) null);
        Class<? extends Object> term207631 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term207630 = ((Class) term207631).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term207630).setAccessible(true);
        Object enum493 = ((Field) term207630).get((Object) null);
        Class<? extends Object> term207974 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term207973 = ((Class) term207974).getDeclaredField((String) "HARD");
        ((Field) term207973).setAccessible(true);
        Object enum494 = ((Field) term207973).get((Object) null);
        Class<? extends Object> term208243 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term208242 = ((Class) term208243).getDeclaredField((String) "ORIGINAL");
        ((Field) term208242).setAccessible(true);
        Object enum495 = ((Field) term208242).get((Object) null);
        Class<? extends Object> term208559 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term208558 = ((Class) term208559).getDeclaredField((String) "NONE");
        ((Field) term208558).setAccessible(true);
        Object enum496 = ((Field) term208558).get((Object) null);
        term206910 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term207010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term207015 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term206910, term206910.getClass(), "pd_id", 427274898);
        setField(term206910, term206910.getClass(), "start_result", enum492);
        setIntField(term206910, term206910.getClass(), "accept_idx", -1654552020);
        setIntField(term206910, term206910.getClass(), "start_idx", -1049546692);
        setField(term206910, term206910.getClass(), "player_name", "TdSezgsZkW");
        setIntField(term206910, term206910.getClass(), "hp_vol", 1397781598);
        setBooleanField(term206910, term206910.getClass(), "btn_se_vol", false);
        setIntField(term206910, term206910.getClass(), "btn_se_vol2", -44720365);
        setIntField(term206910, term206910.getClass(), "sldr_se_vol2", 1963632911);
        setField(term206910, term206910.getClass(), "sort_kind", enum493);
        setIntField(term206910, term206910.getClass(), "lv_num", -1100497683);
        setIntField(term206910, term206910.getClass(), "lv_pnt", 155423433);
        setField(term206910, term206910.getClass(), "lv_str", "aJlxWEbXVP");
        setIntField(term206910, term206910.getClass(), "lv_efct_id", -815471632);
        setIntField(term206910, term206910.getClass(), "lv_plt_id", -1469668708);
        setField(term206910, term206910.getClass(), "mdl_eqp_ary", "pxpYGruvWy");
        setField(term206910, term206910.getClass(), "c_itm_eqp_ary", "BMskFMPoeb");
        setField(term206910, term206910.getClass(), "ms_itm_flg_ary", "LdfzgJfEqK");
        setIntField(term207011, term207011.getClass(), "year", 2014);
        setShortField(term207011, term207011.getClass(), "month", (short) 7);
        setShortField(term207011, term207011.getClass(), "day", (short) 22);
        setField(term207010, term207010.getClass(), "date", term207011);
        setByteField(term207015, term207015.getClass(), "hour", (byte) 9);
        setByteField(term207015, term207015.getClass(), "minute", (byte) 40);
        setByteField(term207015, term207015.getClass(), "second", (byte) 34);
        setIntField(term207015, term207015.getClass(), "nano", 463008257);
        setField(term207010, term207010.getClass(), "time", term207015);
        setField(term206910, term206910.getClass(), "mdl_eqp_tm", term207010);
        setField(term206910, term206910.getClass(), "mdl_have", "YdzBhsGATX");
        setField(term206910, term206910.getClass(), "cstmz_itm_have", "IxrOGCWNvM");
        setBooleanField(term206910, term206910.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term206910, term206910.getClass(), "use_mdl_pri", true);
        setBooleanField(term206910, term206910.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term206910, term206910.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term206910, term206910.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term206910, term206910.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term206910, term206910.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term206910, term206910.getClass(), "vcld_pts", 1796950482);
        setIntField(term206910, term206910.getClass(), "nxt_pv_id", -945759470);
        setField(term206910, term206910.getClass(), "nxt_dffclty", enum494);
        setField(term206910, term206910.getClass(), "nxt_edtn", enum495);
        setField(term206910, term206910.getClass(), "cv_cid", "ixwssTuJbB");
        setField(term206910, term206910.getClass(), "cv_sc", "IXdiuaFyFC");
        setField(term206910, term206910.getClass(), "cv_rr", "CLVzSrhOjS");
        setField(term206910, term206910.getClass(), "cv_bv", "OrrgHDCMip");
        setField(term206910, term206910.getClass(), "cv_bf", "mEYsXJvgdv");
        setIntField(term206910, term206910.getClass(), "cnp_cid", 657342039);
        setIntField(term206910, term206910.getClass(), "cnp_val", 1483999606);
        setField(term206910, term206910.getClass(), "cnp_rr", enum496);
        setField(term206910, term206910.getClass(), "cnp_sp", "JKbmIUKwNm");
        setField(term206910, term206910.getClass(), "my_lst_0", "rftaOUctkN");
        setField(term206910, term206910.getClass(), "my_lst_1", "BqodsrSZso");
        setField(term206910, term206910.getClass(), "my_lst_2", "APQYHLBKit");
        setField(term206910, term206910.getClass(), "my_lst_3", "tIucnzigbY");
        setField(term206910, term206910.getClass(), "my_lst_4", "SMZbMLuReo");
        setField(term206910, term206910.getClass(), "dsp_clr_brdr", "YNXNgIokRz");
        setBooleanField(term206910, term206910.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term206910, term206910.getClass(), "dsp_clr_sts", true);
        setField(term206910, term206910.getClass(), "clr_sts", "XRDgUBBIlB");
        setBooleanField(term206910, term206910.getClass(), "rgo_sts", true);
        setField(term206910, term206910.getClass(), "my_qst_id", "kWMQGdvKwx");
        setField(term206910, term206910.getClass(), "my_qst_sts", "zRwnGNjqEc");
        setField(term206910, term206910.getClass(), "my_qst_prgrs", "PadBNsKGSM");
        setField(term206910, term206910.getClass(), "my_qst_et", "BqLgONTWcn");
        setField(term206910, term206910.getClass(), "p_std_ie_have", "QyyvfuUsSl");
        setField(term206910, term206910.getClass(), "p_std_se_have", "urXLfQoyuc");
        setField(term206910, term206910.getClass(), "cmd", "KoWkwRBvcY");
        setField(term206910, term206910.getClass(), "req_id", "kqDHOsurKa");
        setField(term206910, term206910.getClass(), "stat", "NCqNKzmHkE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eFSnWGCXQK";
        callMethod(klass, "setCnp_sp", argTypes, term206910, args);
    }

};


