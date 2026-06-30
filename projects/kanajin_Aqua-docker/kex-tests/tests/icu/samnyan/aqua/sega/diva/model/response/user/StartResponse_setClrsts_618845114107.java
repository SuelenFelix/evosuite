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

public class StartResponse_setClrsts_618845114107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225846;

    public StartResponse_setClrsts_618845114107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term226303 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term226302 = ((Class) term226303).getDeclaredField((String) "SUCCESS");
        ((Field) term226302).setAccessible(true);
        Object enum537 = ((Field) term226302).get((Object) null);
        Class<? extends Object> term226571 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term226570 = ((Class) term226571).getDeclaredField((String) "COMPLEXITY");
        ((Field) term226570).setAccessible(true);
        Object enum538 = ((Field) term226570).get((Object) null);
        Class<? extends Object> term226908 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term226907 = ((Class) term226908).getDeclaredField((String) "UNDEFINED");
        ((Field) term226907).setAccessible(true);
        Object enum539 = ((Field) term226907).get((Object) null);
        Class<? extends Object> term227192 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term227191 = ((Class) term227192).getDeclaredField((String) "EXTRA");
        ((Field) term227191).setAccessible(true);
        Object enum540 = ((Field) term227191).get((Object) null);
        Class<? extends Object> term227499 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term227498 = ((Class) term227499).getDeclaredField((String) "GOLD");
        ((Field) term227498).setAccessible(true);
        Object enum541 = ((Field) term227498).get((Object) null);
        term225846 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term225945 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term225946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225950 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term225846, term225846.getClass(), "pd_id", -928538452);
        setField(term225846, term225846.getClass(), "start_result", enum537);
        setIntField(term225846, term225846.getClass(), "accept_idx", -1313207353);
        setIntField(term225846, term225846.getClass(), "start_idx", 402612318);
        setField(term225846, term225846.getClass(), "player_name", "RRjrjGfCoC");
        setIntField(term225846, term225846.getClass(), "hp_vol", -1628481565);
        setBooleanField(term225846, term225846.getClass(), "btn_se_vol", false);
        setIntField(term225846, term225846.getClass(), "btn_se_vol2", -217226756);
        setIntField(term225846, term225846.getClass(), "sldr_se_vol2", 1608000247);
        setField(term225846, term225846.getClass(), "sort_kind", enum538);
        setIntField(term225846, term225846.getClass(), "lv_num", 1354560887);
        setIntField(term225846, term225846.getClass(), "lv_pnt", -749474542);
        setField(term225846, term225846.getClass(), "lv_str", "MzbYanIDmI");
        setIntField(term225846, term225846.getClass(), "lv_efct_id", -47907780);
        setIntField(term225846, term225846.getClass(), "lv_plt_id", 1131462369);
        setField(term225846, term225846.getClass(), "mdl_eqp_ary", "RYHcwmdSCF");
        setField(term225846, term225846.getClass(), "c_itm_eqp_ary", "PbtJLrRbsa");
        setField(term225846, term225846.getClass(), "ms_itm_flg_ary", "iiDSRMEZEA");
        setIntField(term225946, term225946.getClass(), "year", 2013);
        setShortField(term225946, term225946.getClass(), "month", (short) 7);
        setShortField(term225946, term225946.getClass(), "day", (short) 3);
        setField(term225945, term225945.getClass(), "date", term225946);
        setByteField(term225950, term225950.getClass(), "hour", (byte) 10);
        setByteField(term225950, term225950.getClass(), "minute", (byte) 59);
        setByteField(term225950, term225950.getClass(), "second", (byte) 22);
        setIntField(term225950, term225950.getClass(), "nano", 937921480);
        setField(term225945, term225945.getClass(), "time", term225950);
        setField(term225846, term225846.getClass(), "mdl_eqp_tm", term225945);
        setField(term225846, term225846.getClass(), "mdl_have", "wBhcQErbFz");
        setField(term225846, term225846.getClass(), "cstmz_itm_have", "iJLzZkhOlH");
        setBooleanField(term225846, term225846.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term225846, term225846.getClass(), "use_mdl_pri", false);
        setBooleanField(term225846, term225846.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term225846, term225846.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term225846, term225846.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term225846, term225846.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term225846, term225846.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term225846, term225846.getClass(), "vcld_pts", -1161206731);
        setIntField(term225846, term225846.getClass(), "nxt_pv_id", -992847709);
        setField(term225846, term225846.getClass(), "nxt_dffclty", enum539);
        setField(term225846, term225846.getClass(), "nxt_edtn", enum540);
        setField(term225846, term225846.getClass(), "cv_cid", "GUDWKmTIil");
        setField(term225846, term225846.getClass(), "cv_sc", "hZnzaYDeRe");
        setField(term225846, term225846.getClass(), "cv_rr", "TbzRSKYwZN");
        setField(term225846, term225846.getClass(), "cv_bv", "IMobeYICFK");
        setField(term225846, term225846.getClass(), "cv_bf", "HkkBqbwwlq");
        setIntField(term225846, term225846.getClass(), "cnp_cid", 1125156671);
        setIntField(term225846, term225846.getClass(), "cnp_val", 1203107925);
        setField(term225846, term225846.getClass(), "cnp_rr", enum541);
        setField(term225846, term225846.getClass(), "cnp_sp", "iJCoKDwoAB");
        setField(term225846, term225846.getClass(), "my_lst_0", "vmxQPAehpJ");
        setField(term225846, term225846.getClass(), "my_lst_1", "xoFNyRpjCp");
        setField(term225846, term225846.getClass(), "my_lst_2", "WPaMGzqiDs");
        setField(term225846, term225846.getClass(), "my_lst_3", "YtgjAWKCrQ");
        setField(term225846, term225846.getClass(), "my_lst_4", "dVyyhFtNgV");
        setField(term225846, term225846.getClass(), "dsp_clr_brdr", "YBBxUpUwzX");
        setBooleanField(term225846, term225846.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term225846, term225846.getClass(), "dsp_clr_sts", false);
        setField(term225846, term225846.getClass(), "clr_sts", "ZujOTiubuf");
        setBooleanField(term225846, term225846.getClass(), "rgo_sts", true);
        setField(term225846, term225846.getClass(), "my_qst_id", "groJdWOLGJ");
        setField(term225846, term225846.getClass(), "my_qst_sts", "zzCCDeuyOo");
        setField(term225846, term225846.getClass(), "my_qst_prgrs", "ixrDOyTkCB");
        setField(term225846, term225846.getClass(), "my_qst_et", "PvrMbFoCJF");
        setField(term225846, term225846.getClass(), "p_std_ie_have", "UJOrVYoraU");
        setField(term225846, term225846.getClass(), "p_std_se_have", "iVSQwPmTaa");
        setField(term225846, term225846.getClass(), "cmd", "ZGRjCkxZnF");
        setField(term225846, term225846.getClass(), "req_id", "qntIiXdFTu");
        setField(term225846, term225846.getClass(), "stat", "qneYYcRNxx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UampjCLvRN";
        callMethod(klass, "setClr_sts", argTypes, term225846, args);
    }

};


