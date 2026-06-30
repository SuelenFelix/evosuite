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

public class StartResponse_getCvsc_75581287034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72691;

    public StartResponse_getCvsc_75581287034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73137 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term73136 = ((Class) term73137).getDeclaredField((String) "FAILED");
        ((Field) term73136).setAccessible(true);
        Object enum170 = ((Field) term73136).get((Object) null);
        Class<? extends Object> term73402 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term73401 = ((Class) term73402).getDeclaredField((String) "MY_LIST_A");
        ((Field) term73401).setAccessible(true);
        Object enum171 = ((Field) term73401).get((Object) null);
        Class<? extends Object> term73736 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term73735 = ((Class) term73736).getDeclaredField((String) "EXTREME");
        ((Field) term73735).setAccessible(true);
        Object enum172 = ((Field) term73735).get((Object) null);
        Class<? extends Object> term74014 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term74013 = ((Class) term74014).getDeclaredField((String) "ORIGINAL");
        ((Field) term74013).setAccessible(true);
        Object enum173 = ((Field) term74013).get((Object) null);
        Class<? extends Object> term74330 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term74329 = ((Class) term74330).getDeclaredField((String) "BRONZE");
        ((Field) term74329).setAccessible(true);
        Object enum174 = ((Field) term74329).get((Object) null);
        term72691 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term72788 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72789 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72793 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term72691, term72691.getClass(), "pd_id", -26316536);
        setField(term72691, term72691.getClass(), "start_result", enum170);
        setIntField(term72691, term72691.getClass(), "accept_idx", 1716165145);
        setIntField(term72691, term72691.getClass(), "start_idx", 1692937831);
        setField(term72691, term72691.getClass(), "player_name", "ngeHWMRjnn");
        setIntField(term72691, term72691.getClass(), "hp_vol", -1539747985);
        setBooleanField(term72691, term72691.getClass(), "btn_se_vol", false);
        setIntField(term72691, term72691.getClass(), "btn_se_vol2", -1982489643);
        setIntField(term72691, term72691.getClass(), "sldr_se_vol2", 550892835);
        setField(term72691, term72691.getClass(), "sort_kind", enum171);
        setIntField(term72691, term72691.getClass(), "lv_num", 1237549886);
        setIntField(term72691, term72691.getClass(), "lv_pnt", -1945635750);
        setField(term72691, term72691.getClass(), "lv_str", "FOKfDXQxMM");
        setIntField(term72691, term72691.getClass(), "lv_efct_id", -1622760744);
        setIntField(term72691, term72691.getClass(), "lv_plt_id", 2068435279);
        setField(term72691, term72691.getClass(), "mdl_eqp_ary", "gbxMvhrWpA");
        setField(term72691, term72691.getClass(), "c_itm_eqp_ary", "huNTIobUHx");
        setField(term72691, term72691.getClass(), "ms_itm_flg_ary", "MrVeCmRVzF");
        setIntField(term72789, term72789.getClass(), "year", 2010);
        setShortField(term72789, term72789.getClass(), "month", (short) 5);
        setShortField(term72789, term72789.getClass(), "day", (short) 2);
        setField(term72788, term72788.getClass(), "date", term72789);
        setByteField(term72793, term72793.getClass(), "hour", (byte) 2);
        setByteField(term72793, term72793.getClass(), "minute", (byte) 22);
        setByteField(term72793, term72793.getClass(), "second", (byte) 33);
        setIntField(term72793, term72793.getClass(), "nano", 530835039);
        setField(term72788, term72788.getClass(), "time", term72793);
        setField(term72691, term72691.getClass(), "mdl_eqp_tm", term72788);
        setField(term72691, term72691.getClass(), "mdl_have", "CPVnQYACKw");
        setField(term72691, term72691.getClass(), "cstmz_itm_have", "sbdLhVCRsw");
        setBooleanField(term72691, term72691.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term72691, term72691.getClass(), "use_mdl_pri", true);
        setBooleanField(term72691, term72691.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term72691, term72691.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term72691, term72691.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term72691, term72691.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term72691, term72691.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term72691, term72691.getClass(), "vcld_pts", -1556527718);
        setIntField(term72691, term72691.getClass(), "nxt_pv_id", 895255351);
        setField(term72691, term72691.getClass(), "nxt_dffclty", enum172);
        setField(term72691, term72691.getClass(), "nxt_edtn", enum173);
        setField(term72691, term72691.getClass(), "cv_cid", "soJHvZwbtF");
        setField(term72691, term72691.getClass(), "cv_sc", "dTGwgkfDVj");
        setField(term72691, term72691.getClass(), "cv_rr", "zHiuLPzYQM");
        setField(term72691, term72691.getClass(), "cv_bv", "ioYxUYJBrh");
        setField(term72691, term72691.getClass(), "cv_bf", "GXoLEdKEIe");
        setIntField(term72691, term72691.getClass(), "cnp_cid", -1317044799);
        setIntField(term72691, term72691.getClass(), "cnp_val", -1428063820);
        setField(term72691, term72691.getClass(), "cnp_rr", enum174);
        setField(term72691, term72691.getClass(), "cnp_sp", "EugWXkztim");
        setField(term72691, term72691.getClass(), "my_lst_0", "DvRdOzzihn");
        setField(term72691, term72691.getClass(), "my_lst_1", "wIygCdQAKO");
        setField(term72691, term72691.getClass(), "my_lst_2", "JsXroBYqwr");
        setField(term72691, term72691.getClass(), "my_lst_3", "YciMAObLwl");
        setField(term72691, term72691.getClass(), "my_lst_4", "qAmVqwwdyf");
        setField(term72691, term72691.getClass(), "dsp_clr_brdr", "IXPaHQnEUy");
        setBooleanField(term72691, term72691.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term72691, term72691.getClass(), "dsp_clr_sts", false);
        setField(term72691, term72691.getClass(), "clr_sts", "zhcWVVrrjs");
        setBooleanField(term72691, term72691.getClass(), "rgo_sts", false);
        setField(term72691, term72691.getClass(), "my_qst_id", "EAMaFLdmaG");
        setField(term72691, term72691.getClass(), "my_qst_sts", "DYZSJMwbhX");
        setField(term72691, term72691.getClass(), "my_qst_prgrs", "QGcshsIIWo");
        setField(term72691, term72691.getClass(), "my_qst_et", "dPHtrzKWgf");
        setField(term72691, term72691.getClass(), "p_std_ie_have", "olmFxfIVeh");
        setField(term72691, term72691.getClass(), "p_std_se_have", "iSPirUEhXs");
        setField(term72691, term72691.getClass(), "cmd", "WWyLFmYpAy");
        setField(term72691, term72691.getClass(), "req_id", "vbSWeJWOQh");
        setField(term72691, term72691.getClass(), "stat", "hyvFdAvkOr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCv_sc", argTypes, term72691, args);
    }

};


