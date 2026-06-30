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

public class StartResponse_setCvbv_33165626693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196139;

    public StartResponse_setCvbv_33165626693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196593 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term196592 = ((Class) term196593).getDeclaredField((String) "FAILED");
        ((Field) term196592).setAccessible(true);
        Object enum466 = ((Field) term196592).get((Object) null);
        Class<? extends Object> term196858 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term196857 = ((Class) term196858).getDeclaredField((String) "COMPLEXITY");
        ((Field) term196857).setAccessible(true);
        Object enum467 = ((Field) term196857).get((Object) null);
        Class<? extends Object> term197195 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term197194 = ((Class) term197195).getDeclaredField((String) "EASY");
        ((Field) term197194).setAccessible(true);
        Object enum468 = ((Field) term197194).get((Object) null);
        Class<? extends Object> term197464 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term197463 = ((Class) term197464).getDeclaredField((String) "ORIGINAL");
        ((Field) term197463).setAccessible(true);
        Object enum469 = ((Field) term197463).get((Object) null);
        Class<? extends Object> term197780 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term197779 = ((Class) term197780).getDeclaredField((String) "GOLD");
        ((Field) term197779).setAccessible(true);
        Object enum470 = ((Field) term197779).get((Object) null);
        term196139 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term196237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term196238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term196242 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term196139, term196139.getClass(), "pd_id", 1227316523);
        setField(term196139, term196139.getClass(), "start_result", enum466);
        setIntField(term196139, term196139.getClass(), "accept_idx", -58633039);
        setIntField(term196139, term196139.getClass(), "start_idx", 448061908);
        setField(term196139, term196139.getClass(), "player_name", "BVlqqUSYbB");
        setIntField(term196139, term196139.getClass(), "hp_vol", -1268483887);
        setBooleanField(term196139, term196139.getClass(), "btn_se_vol", false);
        setIntField(term196139, term196139.getClass(), "btn_se_vol2", -1929689681);
        setIntField(term196139, term196139.getClass(), "sldr_se_vol2", -91240911);
        setField(term196139, term196139.getClass(), "sort_kind", enum467);
        setIntField(term196139, term196139.getClass(), "lv_num", -321227954);
        setIntField(term196139, term196139.getClass(), "lv_pnt", 373810833);
        setField(term196139, term196139.getClass(), "lv_str", "hhGHcwcBqB");
        setIntField(term196139, term196139.getClass(), "lv_efct_id", -215979293);
        setIntField(term196139, term196139.getClass(), "lv_plt_id", -19567889);
        setField(term196139, term196139.getClass(), "mdl_eqp_ary", "WIVENkFxNU");
        setField(term196139, term196139.getClass(), "c_itm_eqp_ary", "MFSosHURtm");
        setField(term196139, term196139.getClass(), "ms_itm_flg_ary", "hIBYlJpYye");
        setIntField(term196238, term196238.getClass(), "year", 2020);
        setShortField(term196238, term196238.getClass(), "month", (short) 12);
        setShortField(term196238, term196238.getClass(), "day", (short) 21);
        setField(term196237, term196237.getClass(), "date", term196238);
        setByteField(term196242, term196242.getClass(), "hour", (byte) 20);
        setByteField(term196242, term196242.getClass(), "minute", (byte) 16);
        setByteField(term196242, term196242.getClass(), "second", (byte) 59);
        setIntField(term196242, term196242.getClass(), "nano", 976524801);
        setField(term196237, term196237.getClass(), "time", term196242);
        setField(term196139, term196139.getClass(), "mdl_eqp_tm", term196237);
        setField(term196139, term196139.getClass(), "mdl_have", "LNendOzJhj");
        setField(term196139, term196139.getClass(), "cstmz_itm_have", "ZwcevQDgzv");
        setBooleanField(term196139, term196139.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term196139, term196139.getClass(), "use_mdl_pri", true);
        setBooleanField(term196139, term196139.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term196139, term196139.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term196139, term196139.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term196139, term196139.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term196139, term196139.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term196139, term196139.getClass(), "vcld_pts", 693500318);
        setIntField(term196139, term196139.getClass(), "nxt_pv_id", 1702404702);
        setField(term196139, term196139.getClass(), "nxt_dffclty", enum468);
        setField(term196139, term196139.getClass(), "nxt_edtn", enum469);
        setField(term196139, term196139.getClass(), "cv_cid", "rzkENrHYBI");
        setField(term196139, term196139.getClass(), "cv_sc", "ylJjmNVzzt");
        setField(term196139, term196139.getClass(), "cv_rr", "nwKTRDmHWk");
        setField(term196139, term196139.getClass(), "cv_bv", "UueEixdrss");
        setField(term196139, term196139.getClass(), "cv_bf", "ceafBXJyBB");
        setIntField(term196139, term196139.getClass(), "cnp_cid", 1141592999);
        setIntField(term196139, term196139.getClass(), "cnp_val", 848113442);
        setField(term196139, term196139.getClass(), "cnp_rr", enum470);
        setField(term196139, term196139.getClass(), "cnp_sp", "VNHIbCXqhH");
        setField(term196139, term196139.getClass(), "my_lst_0", "csnhUIxUaP");
        setField(term196139, term196139.getClass(), "my_lst_1", "fmWYICGnwt");
        setField(term196139, term196139.getClass(), "my_lst_2", "FlZbOFNISk");
        setField(term196139, term196139.getClass(), "my_lst_3", "zDtePZrZQH");
        setField(term196139, term196139.getClass(), "my_lst_4", "YPVZjrbvVl");
        setField(term196139, term196139.getClass(), "dsp_clr_brdr", "TWsXTUTREq");
        setBooleanField(term196139, term196139.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term196139, term196139.getClass(), "dsp_clr_sts", true);
        setField(term196139, term196139.getClass(), "clr_sts", "tVsPWASlsh");
        setBooleanField(term196139, term196139.getClass(), "rgo_sts", false);
        setField(term196139, term196139.getClass(), "my_qst_id", "PjZoebHrvq");
        setField(term196139, term196139.getClass(), "my_qst_sts", "VwpicfUdWr");
        setField(term196139, term196139.getClass(), "my_qst_prgrs", "UDKBkeWilS");
        setField(term196139, term196139.getClass(), "my_qst_et", "bNeNAYRdqb");
        setField(term196139, term196139.getClass(), "p_std_ie_have", "dcGBEVfYLI");
        setField(term196139, term196139.getClass(), "p_std_se_have", "AbYQkbUCWK");
        setField(term196139, term196139.getClass(), "cmd", "PjENVjWdrp");
        setField(term196139, term196139.getClass(), "req_id", "nNjXJbBqnD");
        setField(term196139, term196139.getClass(), "stat", "IPIWZFytSS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BOKRfsJbBj";
        callMethod(klass, "setCv_bv", argTypes, term196139, args);
    }

};


