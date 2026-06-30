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

public class StartResponse_setMsitmflgary_67194348675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158463;

    public StartResponse_setMsitmflgary_67194348675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term158922 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term158921 = ((Class) term158922).getDeclaredField((String) "SUCCESS");
        ((Field) term158921).setAccessible(true);
        Object enum376 = ((Field) term158921).get((Object) null);
        Class<? extends Object> term159190 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term159189 = ((Class) term159190).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term159189).setAccessible(true);
        Object enum377 = ((Field) term159189).get((Object) null);
        Class<? extends Object> term159533 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term159532 = ((Class) term159533).getDeclaredField((String) "EASY");
        ((Field) term159532).setAccessible(true);
        Object enum378 = ((Field) term159532).get((Object) null);
        Class<? extends Object> term159802 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term159801 = ((Class) term159802).getDeclaredField((String) "ORIGINAL");
        ((Field) term159801).setAccessible(true);
        Object enum379 = ((Field) term159801).get((Object) null);
        Class<? extends Object> term160118 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term160117 = ((Class) term160118).getDeclaredField((String) "BRONZE");
        ((Field) term160117).setAccessible(true);
        Object enum380 = ((Field) term160117).get((Object) null);
        term158463 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term158564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158569 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term158463, term158463.getClass(), "pd_id", -1270258033);
        setField(term158463, term158463.getClass(), "start_result", enum376);
        setIntField(term158463, term158463.getClass(), "accept_idx", 1677994069);
        setIntField(term158463, term158463.getClass(), "start_idx", -439999692);
        setField(term158463, term158463.getClass(), "player_name", "UDZJbJPmCC");
        setIntField(term158463, term158463.getClass(), "hp_vol", 924095007);
        setBooleanField(term158463, term158463.getClass(), "btn_se_vol", false);
        setIntField(term158463, term158463.getClass(), "btn_se_vol2", 1302110708);
        setIntField(term158463, term158463.getClass(), "sldr_se_vol2", 594705497);
        setField(term158463, term158463.getClass(), "sort_kind", enum377);
        setIntField(term158463, term158463.getClass(), "lv_num", -600102466);
        setIntField(term158463, term158463.getClass(), "lv_pnt", -899986714);
        setField(term158463, term158463.getClass(), "lv_str", "oVkgUUfHis");
        setIntField(term158463, term158463.getClass(), "lv_efct_id", 1307244466);
        setIntField(term158463, term158463.getClass(), "lv_plt_id", -252262096);
        setField(term158463, term158463.getClass(), "mdl_eqp_ary", "hoCKQzIOhx");
        setField(term158463, term158463.getClass(), "c_itm_eqp_ary", "znUxTdEvUD");
        setField(term158463, term158463.getClass(), "ms_itm_flg_ary", "PvtJhtGffh");
        setIntField(term158565, term158565.getClass(), "year", 2028);
        setShortField(term158565, term158565.getClass(), "month", (short) 7);
        setShortField(term158565, term158565.getClass(), "day", (short) 22);
        setField(term158564, term158564.getClass(), "date", term158565);
        setByteField(term158569, term158569.getClass(), "hour", (byte) 18);
        setByteField(term158569, term158569.getClass(), "minute", (byte) 33);
        setByteField(term158569, term158569.getClass(), "second", (byte) 7);
        setIntField(term158569, term158569.getClass(), "nano", 763613074);
        setField(term158564, term158564.getClass(), "time", term158569);
        setField(term158463, term158463.getClass(), "mdl_eqp_tm", term158564);
        setField(term158463, term158463.getClass(), "mdl_have", "KReGJTSQuY");
        setField(term158463, term158463.getClass(), "cstmz_itm_have", "hqZmoXoMuS");
        setBooleanField(term158463, term158463.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term158463, term158463.getClass(), "use_mdl_pri", false);
        setBooleanField(term158463, term158463.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term158463, term158463.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term158463, term158463.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term158463, term158463.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term158463, term158463.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term158463, term158463.getClass(), "vcld_pts", -37129068);
        setIntField(term158463, term158463.getClass(), "nxt_pv_id", -861014847);
        setField(term158463, term158463.getClass(), "nxt_dffclty", enum378);
        setField(term158463, term158463.getClass(), "nxt_edtn", enum379);
        setField(term158463, term158463.getClass(), "cv_cid", "PUPJWadLXP");
        setField(term158463, term158463.getClass(), "cv_sc", "TBNsemBBKA");
        setField(term158463, term158463.getClass(), "cv_rr", "DpNDxwXKkX");
        setField(term158463, term158463.getClass(), "cv_bv", "uxoFwkPfXf");
        setField(term158463, term158463.getClass(), "cv_bf", "OoVnZTvxUt");
        setIntField(term158463, term158463.getClass(), "cnp_cid", 2132934139);
        setIntField(term158463, term158463.getClass(), "cnp_val", -1261824381);
        setField(term158463, term158463.getClass(), "cnp_rr", enum380);
        setField(term158463, term158463.getClass(), "cnp_sp", "MnqnyndkhF");
        setField(term158463, term158463.getClass(), "my_lst_0", "MZzoPKpFlh");
        setField(term158463, term158463.getClass(), "my_lst_1", "skVZETaBKX");
        setField(term158463, term158463.getClass(), "my_lst_2", "jcJNIBACPb");
        setField(term158463, term158463.getClass(), "my_lst_3", "mPQmjoknqi");
        setField(term158463, term158463.getClass(), "my_lst_4", "gLgvePQRQT");
        setField(term158463, term158463.getClass(), "dsp_clr_brdr", "SCmsfHIEPK");
        setBooleanField(term158463, term158463.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term158463, term158463.getClass(), "dsp_clr_sts", true);
        setField(term158463, term158463.getClass(), "clr_sts", "dFOuezLNWb");
        setBooleanField(term158463, term158463.getClass(), "rgo_sts", false);
        setField(term158463, term158463.getClass(), "my_qst_id", "PUWJnLuyiR");
        setField(term158463, term158463.getClass(), "my_qst_sts", "ADhJCRgHaS");
        setField(term158463, term158463.getClass(), "my_qst_prgrs", "qociGUMzem");
        setField(term158463, term158463.getClass(), "my_qst_et", "HHAfSjIdNi");
        setField(term158463, term158463.getClass(), "p_std_ie_have", "oTqQEKklHi");
        setField(term158463, term158463.getClass(), "p_std_se_have", "riyKkxMvWm");
        setField(term158463, term158463.getClass(), "cmd", "WENnGcBSTd");
        setField(term158463, term158463.getClass(), "req_id", "juEYcOCxLW");
        setField(term158463, term158463.getClass(), "stat", "YsWgGEhEmC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PBcepqkBBV";
        callMethod(klass, "setMs_itm_flg_ary", argTypes, term158463, args);
    }

};


