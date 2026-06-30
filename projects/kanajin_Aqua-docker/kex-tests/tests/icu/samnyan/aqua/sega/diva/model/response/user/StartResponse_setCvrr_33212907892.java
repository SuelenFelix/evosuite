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

public class StartResponse_setCvrr_33212907892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194023;

    public StartResponse_setCvrr_33212907892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term194480 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term194479 = ((Class) term194480).getDeclaredField((String) "SUCCESS");
        ((Field) term194479).setAccessible(true);
        Object enum461 = ((Field) term194479).get((Object) null);
        Class<? extends Object> term194748 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term194747 = ((Class) term194748).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term194747).setAccessible(true);
        Object enum462 = ((Field) term194747).get((Object) null);
        Class<? extends Object> term195091 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term195090 = ((Class) term195091).getDeclaredField((String) "EXTREME");
        ((Field) term195090).setAccessible(true);
        Object enum463 = ((Field) term195090).get((Object) null);
        Class<? extends Object> term195369 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term195368 = ((Class) term195369).getDeclaredField((String) "EXTRA");
        ((Field) term195368).setAccessible(true);
        Object enum464 = ((Field) term195368).get((Object) null);
        Class<? extends Object> term195676 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term195675 = ((Class) term195676).getDeclaredField((String) "GOLD");
        ((Field) term195675).setAccessible(true);
        Object enum465 = ((Field) term195675).get((Object) null);
        term194023 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term194124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term194125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term194129 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term194023, term194023.getClass(), "pd_id", 1978065000);
        setField(term194023, term194023.getClass(), "start_result", enum461);
        setIntField(term194023, term194023.getClass(), "accept_idx", -2121133707);
        setIntField(term194023, term194023.getClass(), "start_idx", -1005498887);
        setField(term194023, term194023.getClass(), "player_name", "llbDGujrPe");
        setIntField(term194023, term194023.getClass(), "hp_vol", 1329150584);
        setBooleanField(term194023, term194023.getClass(), "btn_se_vol", true);
        setIntField(term194023, term194023.getClass(), "btn_se_vol2", -1825382367);
        setIntField(term194023, term194023.getClass(), "sldr_se_vol2", -1791371074);
        setField(term194023, term194023.getClass(), "sort_kind", enum462);
        setIntField(term194023, term194023.getClass(), "lv_num", -1151122332);
        setIntField(term194023, term194023.getClass(), "lv_pnt", 953387911);
        setField(term194023, term194023.getClass(), "lv_str", "QEoeITwBfz");
        setIntField(term194023, term194023.getClass(), "lv_efct_id", -1550025613);
        setIntField(term194023, term194023.getClass(), "lv_plt_id", 814617314);
        setField(term194023, term194023.getClass(), "mdl_eqp_ary", "rWOKjAUIvS");
        setField(term194023, term194023.getClass(), "c_itm_eqp_ary", "IcpfsIGlDf");
        setField(term194023, term194023.getClass(), "ms_itm_flg_ary", "xCfGcRdHTK");
        setIntField(term194125, term194125.getClass(), "year", 2013);
        setShortField(term194125, term194125.getClass(), "month", (short) 9);
        setShortField(term194125, term194125.getClass(), "day", (short) 13);
        setField(term194124, term194124.getClass(), "date", term194125);
        setByteField(term194129, term194129.getClass(), "hour", (byte) 14);
        setByteField(term194129, term194129.getClass(), "minute", (byte) 36);
        setByteField(term194129, term194129.getClass(), "second", (byte) 59);
        setIntField(term194129, term194129.getClass(), "nano", 363124001);
        setField(term194124, term194124.getClass(), "time", term194129);
        setField(term194023, term194023.getClass(), "mdl_eqp_tm", term194124);
        setField(term194023, term194023.getClass(), "mdl_have", "KKHQCvKTvF");
        setField(term194023, term194023.getClass(), "cstmz_itm_have", "XBhNIIxiNP");
        setBooleanField(term194023, term194023.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term194023, term194023.getClass(), "use_mdl_pri", true);
        setBooleanField(term194023, term194023.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term194023, term194023.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term194023, term194023.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term194023, term194023.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term194023, term194023.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term194023, term194023.getClass(), "vcld_pts", -159489307);
        setIntField(term194023, term194023.getClass(), "nxt_pv_id", 1317020952);
        setField(term194023, term194023.getClass(), "nxt_dffclty", enum463);
        setField(term194023, term194023.getClass(), "nxt_edtn", enum464);
        setField(term194023, term194023.getClass(), "cv_cid", "JljyXnwkuC");
        setField(term194023, term194023.getClass(), "cv_sc", "XLOxkLyvMY");
        setField(term194023, term194023.getClass(), "cv_rr", "pjUyKHjjKH");
        setField(term194023, term194023.getClass(), "cv_bv", "JApuaiAykc");
        setField(term194023, term194023.getClass(), "cv_bf", "NJWFosJfXl");
        setIntField(term194023, term194023.getClass(), "cnp_cid", -742710703);
        setIntField(term194023, term194023.getClass(), "cnp_val", -355505521);
        setField(term194023, term194023.getClass(), "cnp_rr", enum465);
        setField(term194023, term194023.getClass(), "cnp_sp", "JraVClZLWB");
        setField(term194023, term194023.getClass(), "my_lst_0", "PxscjEhxGk");
        setField(term194023, term194023.getClass(), "my_lst_1", "ePFnljQSHU");
        setField(term194023, term194023.getClass(), "my_lst_2", "wedLWAuOOY");
        setField(term194023, term194023.getClass(), "my_lst_3", "oZDNpnQlCv");
        setField(term194023, term194023.getClass(), "my_lst_4", "NdPeQAHWKN");
        setField(term194023, term194023.getClass(), "dsp_clr_brdr", "giGQTpcQuV");
        setBooleanField(term194023, term194023.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term194023, term194023.getClass(), "dsp_clr_sts", true);
        setField(term194023, term194023.getClass(), "clr_sts", "IWCccrYFQd");
        setBooleanField(term194023, term194023.getClass(), "rgo_sts", true);
        setField(term194023, term194023.getClass(), "my_qst_id", "zpkdYKWkCa");
        setField(term194023, term194023.getClass(), "my_qst_sts", "mvOJAtEcWR");
        setField(term194023, term194023.getClass(), "my_qst_prgrs", "QybezBkmJu");
        setField(term194023, term194023.getClass(), "my_qst_et", "uWIrREgpjs");
        setField(term194023, term194023.getClass(), "p_std_ie_have", "TmEdDFXkTZ");
        setField(term194023, term194023.getClass(), "p_std_se_have", "DjjdYbIhNY");
        setField(term194023, term194023.getClass(), "cmd", "AGaeaoutjJ");
        setField(term194023, term194023.getClass(), "req_id", "oHWSUbpGiK");
        setField(term194023, term194023.getClass(), "stat", "RreVzKmtxf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xHBCsghEAi";
        callMethod(klass, "setCv_rr", argTypes, term194023, args);
    }

};


