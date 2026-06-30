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

public class StartResponse_getCnpval_30639883639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83129;

    public StartResponse_getCnpval_30639883639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83571 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term83570 = ((Class) term83571).getDeclaredField((String) "FAILED");
        ((Field) term83570).setAccessible(true);
        Object enum195 = ((Field) term83570).get((Object) null);
        Class<? extends Object> term83836 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term83835 = ((Class) term83836).getDeclaredField((String) "COMPLEXITY");
        ((Field) term83835).setAccessible(true);
        Object enum196 = ((Field) term83835).get((Object) null);
        Class<? extends Object> term84173 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term84172 = ((Class) term84173).getDeclaredField((String) "HARD");
        ((Field) term84172).setAccessible(true);
        Object enum197 = ((Field) term84172).get((Object) null);
        Class<? extends Object> term84442 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term84441 = ((Class) term84442).getDeclaredField((String) "ORIGINAL");
        ((Field) term84441).setAccessible(true);
        Object enum198 = ((Field) term84441).get((Object) null);
        Class<? extends Object> term84758 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term84757 = ((Class) term84758).getDeclaredField((String) "NONE");
        ((Field) term84757).setAccessible(true);
        Object enum199 = ((Field) term84757).get((Object) null);
        term83129 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term83227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83232 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term83129, term83129.getClass(), "pd_id", 1981860404);
        setField(term83129, term83129.getClass(), "start_result", enum195);
        setIntField(term83129, term83129.getClass(), "accept_idx", 732174235);
        setIntField(term83129, term83129.getClass(), "start_idx", 470895808);
        setField(term83129, term83129.getClass(), "player_name", "XjIOUIzJUP");
        setIntField(term83129, term83129.getClass(), "hp_vol", 1787325291);
        setBooleanField(term83129, term83129.getClass(), "btn_se_vol", false);
        setIntField(term83129, term83129.getClass(), "btn_se_vol2", 1470349147);
        setIntField(term83129, term83129.getClass(), "sldr_se_vol2", -255317272);
        setField(term83129, term83129.getClass(), "sort_kind", enum196);
        setIntField(term83129, term83129.getClass(), "lv_num", -706253892);
        setIntField(term83129, term83129.getClass(), "lv_pnt", -1341439819);
        setField(term83129, term83129.getClass(), "lv_str", "iGTpXnnTqB");
        setIntField(term83129, term83129.getClass(), "lv_efct_id", -728760750);
        setIntField(term83129, term83129.getClass(), "lv_plt_id", -1617383807);
        setField(term83129, term83129.getClass(), "mdl_eqp_ary", "XgJzBOYfQB");
        setField(term83129, term83129.getClass(), "c_itm_eqp_ary", "GAPGgDekVG");
        setField(term83129, term83129.getClass(), "ms_itm_flg_ary", "WmTogHwGLE");
        setIntField(term83228, term83228.getClass(), "year", 2018);
        setShortField(term83228, term83228.getClass(), "month", (short) 7);
        setShortField(term83228, term83228.getClass(), "day", (short) 12);
        setField(term83227, term83227.getClass(), "date", term83228);
        setByteField(term83232, term83232.getClass(), "hour", (byte) 1);
        setByteField(term83232, term83232.getClass(), "minute", (byte) 3);
        setByteField(term83232, term83232.getClass(), "second", (byte) 47);
        setIntField(term83232, term83232.getClass(), "nano", 2729929);
        setField(term83227, term83227.getClass(), "time", term83232);
        setField(term83129, term83129.getClass(), "mdl_eqp_tm", term83227);
        setField(term83129, term83129.getClass(), "mdl_have", "qYOIXsGycY");
        setField(term83129, term83129.getClass(), "cstmz_itm_have", "sJNXNshRLe");
        setBooleanField(term83129, term83129.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term83129, term83129.getClass(), "use_mdl_pri", true);
        setBooleanField(term83129, term83129.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term83129, term83129.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term83129, term83129.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term83129, term83129.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term83129, term83129.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term83129, term83129.getClass(), "vcld_pts", -1244386281);
        setIntField(term83129, term83129.getClass(), "nxt_pv_id", -885788574);
        setField(term83129, term83129.getClass(), "nxt_dffclty", enum197);
        setField(term83129, term83129.getClass(), "nxt_edtn", enum198);
        setField(term83129, term83129.getClass(), "cv_cid", "AYnbmgRCKr");
        setField(term83129, term83129.getClass(), "cv_sc", "iQRfDlaoYD");
        setField(term83129, term83129.getClass(), "cv_rr", "kpcyrjDQzN");
        setField(term83129, term83129.getClass(), "cv_bv", "IyukykAHLQ");
        setField(term83129, term83129.getClass(), "cv_bf", "CwZcgFJqMh");
        setIntField(term83129, term83129.getClass(), "cnp_cid", -865722613);
        setIntField(term83129, term83129.getClass(), "cnp_val", -1551355284);
        setField(term83129, term83129.getClass(), "cnp_rr", enum199);
        setField(term83129, term83129.getClass(), "cnp_sp", "RldCZqgRbO");
        setField(term83129, term83129.getClass(), "my_lst_0", "LOVugCAgJs");
        setField(term83129, term83129.getClass(), "my_lst_1", "SNmHXwCiFY");
        setField(term83129, term83129.getClass(), "my_lst_2", "HZfkWoqyUW");
        setField(term83129, term83129.getClass(), "my_lst_3", "QRwANPSyfT");
        setField(term83129, term83129.getClass(), "my_lst_4", "DbZKLwYBgy");
        setField(term83129, term83129.getClass(), "dsp_clr_brdr", "LnNRVsjmxw");
        setBooleanField(term83129, term83129.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term83129, term83129.getClass(), "dsp_clr_sts", true);
        setField(term83129, term83129.getClass(), "clr_sts", "PlOnDkNrvX");
        setBooleanField(term83129, term83129.getClass(), "rgo_sts", true);
        setField(term83129, term83129.getClass(), "my_qst_id", "MltgFGldop");
        setField(term83129, term83129.getClass(), "my_qst_sts", "JCWSoxnBJs");
        setField(term83129, term83129.getClass(), "my_qst_prgrs", "vAxcpvjEEa");
        setField(term83129, term83129.getClass(), "my_qst_et", "FCkOgIBqXE");
        setField(term83129, term83129.getClass(), "p_std_ie_have", "kadRHthQRD");
        setField(term83129, term83129.getClass(), "p_std_se_have", "cGbJSRSpNn");
        setField(term83129, term83129.getClass(), "cmd", "MzXzaqaiHW");
        setField(term83129, term83129.getClass(), "req_id", "jWOWtrhVkA");
        setField(term83129, term83129.getClass(), "stat", "IyOhWYyaDV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCnp_val", argTypes, term83129, args);
    }

};


