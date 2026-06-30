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

public class StartResponse_getVcldpts_73093632629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62305;

    public StartResponse_getVcldpts_73093632629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62749 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term62748 = ((Class) term62749).getDeclaredField((String) "SUCCESS");
        ((Field) term62748).setAccessible(true);
        Object enum145 = ((Field) term62748).get((Object) null);
        Class<? extends Object> term63017 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term63016 = ((Class) term63017).getDeclaredField((String) "MY_LIST_C");
        ((Field) term63016).setAccessible(true);
        Object enum146 = ((Field) term63016).get((Object) null);
        Class<? extends Object> term63351 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term63350 = ((Class) term63351).getDeclaredField((String) "UNDEFINED");
        ((Field) term63350).setAccessible(true);
        Object enum147 = ((Field) term63350).get((Object) null);
        Class<? extends Object> term63635 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term63634 = ((Class) term63635).getDeclaredField((String) "EXTRA");
        ((Field) term63634).setAccessible(true);
        Object enum148 = ((Field) term63634).get((Object) null);
        Class<? extends Object> term63942 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term63941 = ((Class) term63942).getDeclaredField((String) "GOLD");
        ((Field) term63941).setAccessible(true);
        Object enum149 = ((Field) term63941).get((Object) null);
        term62305 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term62403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62408 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term62305, term62305.getClass(), "pd_id", -1840305774);
        setField(term62305, term62305.getClass(), "start_result", enum145);
        setIntField(term62305, term62305.getClass(), "accept_idx", 1365087144);
        setIntField(term62305, term62305.getClass(), "start_idx", -1537255112);
        setField(term62305, term62305.getClass(), "player_name", "qQQRKGPyIM");
        setIntField(term62305, term62305.getClass(), "hp_vol", 934477462);
        setBooleanField(term62305, term62305.getClass(), "btn_se_vol", true);
        setIntField(term62305, term62305.getClass(), "btn_se_vol2", 4900410);
        setIntField(term62305, term62305.getClass(), "sldr_se_vol2", -1252345779);
        setField(term62305, term62305.getClass(), "sort_kind", enum146);
        setIntField(term62305, term62305.getClass(), "lv_num", -2063365430);
        setIntField(term62305, term62305.getClass(), "lv_pnt", 812570053);
        setField(term62305, term62305.getClass(), "lv_str", "lzcwhvjdFg");
        setIntField(term62305, term62305.getClass(), "lv_efct_id", -1488938905);
        setIntField(term62305, term62305.getClass(), "lv_plt_id", 1916544127);
        setField(term62305, term62305.getClass(), "mdl_eqp_ary", "dfzWTjcjnI");
        setField(term62305, term62305.getClass(), "c_itm_eqp_ary", "bsnZXGEvFv");
        setField(term62305, term62305.getClass(), "ms_itm_flg_ary", "osFrHWYeRy");
        setIntField(term62404, term62404.getClass(), "year", 2025);
        setShortField(term62404, term62404.getClass(), "month", (short) 11);
        setShortField(term62404, term62404.getClass(), "day", (short) 3);
        setField(term62403, term62403.getClass(), "date", term62404);
        setByteField(term62408, term62408.getClass(), "hour", (byte) 21);
        setByteField(term62408, term62408.getClass(), "minute", (byte) 24);
        setByteField(term62408, term62408.getClass(), "second", (byte) 23);
        setIntField(term62408, term62408.getClass(), "nano", 210986721);
        setField(term62403, term62403.getClass(), "time", term62408);
        setField(term62305, term62305.getClass(), "mdl_eqp_tm", term62403);
        setField(term62305, term62305.getClass(), "mdl_have", "scpIQUfPKw");
        setField(term62305, term62305.getClass(), "cstmz_itm_have", "QKYBpCjuYt");
        setBooleanField(term62305, term62305.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term62305, term62305.getClass(), "use_mdl_pri", true);
        setBooleanField(term62305, term62305.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term62305, term62305.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term62305, term62305.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term62305, term62305.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term62305, term62305.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term62305, term62305.getClass(), "vcld_pts", -1133405894);
        setIntField(term62305, term62305.getClass(), "nxt_pv_id", 1289741214);
        setField(term62305, term62305.getClass(), "nxt_dffclty", enum147);
        setField(term62305, term62305.getClass(), "nxt_edtn", enum148);
        setField(term62305, term62305.getClass(), "cv_cid", "vjiRfoGdkl");
        setField(term62305, term62305.getClass(), "cv_sc", "TwaxeSHvnR");
        setField(term62305, term62305.getClass(), "cv_rr", "paPzDETzIq");
        setField(term62305, term62305.getClass(), "cv_bv", "fufeuGfwpN");
        setField(term62305, term62305.getClass(), "cv_bf", "XJbkXbljvz");
        setIntField(term62305, term62305.getClass(), "cnp_cid", 243280944);
        setIntField(term62305, term62305.getClass(), "cnp_val", -726681073);
        setField(term62305, term62305.getClass(), "cnp_rr", enum149);
        setField(term62305, term62305.getClass(), "cnp_sp", "fuvdkDwBeH");
        setField(term62305, term62305.getClass(), "my_lst_0", "NTefzwLPhx");
        setField(term62305, term62305.getClass(), "my_lst_1", "dirFuhqyNu");
        setField(term62305, term62305.getClass(), "my_lst_2", "YVLRenzuoR");
        setField(term62305, term62305.getClass(), "my_lst_3", "JukEMhPWql");
        setField(term62305, term62305.getClass(), "my_lst_4", "ZdNcodHERG");
        setField(term62305, term62305.getClass(), "dsp_clr_brdr", "CLHomjAqIM");
        setBooleanField(term62305, term62305.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term62305, term62305.getClass(), "dsp_clr_sts", true);
        setField(term62305, term62305.getClass(), "clr_sts", "mzCFLzFuSj");
        setBooleanField(term62305, term62305.getClass(), "rgo_sts", true);
        setField(term62305, term62305.getClass(), "my_qst_id", "WQnMpDlSfA");
        setField(term62305, term62305.getClass(), "my_qst_sts", "aOIvTQtXiv");
        setField(term62305, term62305.getClass(), "my_qst_prgrs", "IyjDiknqhA");
        setField(term62305, term62305.getClass(), "my_qst_et", "IHsXSAFYKi");
        setField(term62305, term62305.getClass(), "p_std_ie_have", "KyGbLglqbW");
        setField(term62305, term62305.getClass(), "p_std_se_have", "ZKVeStsSNT");
        setField(term62305, term62305.getClass(), "cmd", "cqCXYaAnFB");
        setField(term62305, term62305.getClass(), "req_id", "UPLNFZHXjw");
        setField(term62305, term62305.getClass(), "stat", "CwrrJlrGmg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVcld_pts", argTypes, term62305, args);
    }

};


