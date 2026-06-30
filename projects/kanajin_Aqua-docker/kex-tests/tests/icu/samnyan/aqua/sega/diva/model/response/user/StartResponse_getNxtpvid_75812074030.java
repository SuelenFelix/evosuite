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

public class StartResponse_getNxtpvid_75812074030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64395;

    public StartResponse_getNxtpvid_75812074030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64834 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term64833 = ((Class) term64834).getDeclaredField((String) "SUCCESS");
        ((Field) term64833).setAccessible(true);
        Object enum150 = ((Field) term64833).get((Object) null);
        Class<? extends Object> term65102 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term65101 = ((Class) term65102).getDeclaredField((String) "MY_LIST_C");
        ((Field) term65101).setAccessible(true);
        Object enum151 = ((Field) term65101).get((Object) null);
        Class<? extends Object> term65436 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term65435 = ((Class) term65436).getDeclaredField((String) "EASY");
        ((Field) term65435).setAccessible(true);
        Object enum152 = ((Field) term65435).get((Object) null);
        Class<? extends Object> term65705 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term65704 = ((Class) term65705).getDeclaredField((String) "EXTRA");
        ((Field) term65704).setAccessible(true);
        Object enum153 = ((Field) term65704).get((Object) null);
        Class<? extends Object> term66012 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term66011 = ((Class) term66012).getDeclaredField((String) "GOLD");
        ((Field) term66011).setAccessible(true);
        Object enum154 = ((Field) term66011).get((Object) null);
        term64395 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term64493 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64494 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64498 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term64395, term64395.getClass(), "pd_id", -1724487863);
        setField(term64395, term64395.getClass(), "start_result", enum150);
        setIntField(term64395, term64395.getClass(), "accept_idx", -128490829);
        setIntField(term64395, term64395.getClass(), "start_idx", 202214133);
        setField(term64395, term64395.getClass(), "player_name", "HejzvyejjG");
        setIntField(term64395, term64395.getClass(), "hp_vol", 1543091617);
        setBooleanField(term64395, term64395.getClass(), "btn_se_vol", false);
        setIntField(term64395, term64395.getClass(), "btn_se_vol2", -763166094);
        setIntField(term64395, term64395.getClass(), "sldr_se_vol2", -222941705);
        setField(term64395, term64395.getClass(), "sort_kind", enum151);
        setIntField(term64395, term64395.getClass(), "lv_num", 291864719);
        setIntField(term64395, term64395.getClass(), "lv_pnt", -1549607466);
        setField(term64395, term64395.getClass(), "lv_str", "pbqJjeooBM");
        setIntField(term64395, term64395.getClass(), "lv_efct_id", 853609788);
        setIntField(term64395, term64395.getClass(), "lv_plt_id", -197820800);
        setField(term64395, term64395.getClass(), "mdl_eqp_ary", "ccnotFfPXt");
        setField(term64395, term64395.getClass(), "c_itm_eqp_ary", "plWlgdgIhn");
        setField(term64395, term64395.getClass(), "ms_itm_flg_ary", "RZaKVKWtND");
        setIntField(term64494, term64494.getClass(), "year", 2016);
        setShortField(term64494, term64494.getClass(), "month", (short) 6);
        setShortField(term64494, term64494.getClass(), "day", (short) 15);
        setField(term64493, term64493.getClass(), "date", term64494);
        setByteField(term64498, term64498.getClass(), "hour", (byte) 21);
        setByteField(term64498, term64498.getClass(), "minute", (byte) 23);
        setByteField(term64498, term64498.getClass(), "second", (byte) 23);
        setIntField(term64498, term64498.getClass(), "nano", 433372070);
        setField(term64493, term64493.getClass(), "time", term64498);
        setField(term64395, term64395.getClass(), "mdl_eqp_tm", term64493);
        setField(term64395, term64395.getClass(), "mdl_have", "vXiaNiquft");
        setField(term64395, term64395.getClass(), "cstmz_itm_have", "lucCeiVnYe");
        setBooleanField(term64395, term64395.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term64395, term64395.getClass(), "use_mdl_pri", true);
        setBooleanField(term64395, term64395.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term64395, term64395.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term64395, term64395.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term64395, term64395.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term64395, term64395.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term64395, term64395.getClass(), "vcld_pts", 723812297);
        setIntField(term64395, term64395.getClass(), "nxt_pv_id", 1639448749);
        setField(term64395, term64395.getClass(), "nxt_dffclty", enum152);
        setField(term64395, term64395.getClass(), "nxt_edtn", enum153);
        setField(term64395, term64395.getClass(), "cv_cid", "iYwkCLMsbJ");
        setField(term64395, term64395.getClass(), "cv_sc", "MXLsVQWrwc");
        setField(term64395, term64395.getClass(), "cv_rr", "lRaSlqzqNY");
        setField(term64395, term64395.getClass(), "cv_bv", "TiEyxWXsra");
        setField(term64395, term64395.getClass(), "cv_bf", "TuLgwTZsPP");
        setIntField(term64395, term64395.getClass(), "cnp_cid", 873659088);
        setIntField(term64395, term64395.getClass(), "cnp_val", -975748721);
        setField(term64395, term64395.getClass(), "cnp_rr", enum154);
        setField(term64395, term64395.getClass(), "cnp_sp", "KoasxTJGpx");
        setField(term64395, term64395.getClass(), "my_lst_0", "ceGeARYMoa");
        setField(term64395, term64395.getClass(), "my_lst_1", "fFWllaiFvh");
        setField(term64395, term64395.getClass(), "my_lst_2", "PFTdEDSbvZ");
        setField(term64395, term64395.getClass(), "my_lst_3", "TbiwoiebNe");
        setField(term64395, term64395.getClass(), "my_lst_4", "laTITSWZuc");
        setField(term64395, term64395.getClass(), "dsp_clr_brdr", "fkzRpxlAqS");
        setBooleanField(term64395, term64395.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term64395, term64395.getClass(), "dsp_clr_sts", true);
        setField(term64395, term64395.getClass(), "clr_sts", "VYvbTGKslj");
        setBooleanField(term64395, term64395.getClass(), "rgo_sts", false);
        setField(term64395, term64395.getClass(), "my_qst_id", "owLqDDnwZA");
        setField(term64395, term64395.getClass(), "my_qst_sts", "eBcTbweeYp");
        setField(term64395, term64395.getClass(), "my_qst_prgrs", "drcmjfQUDq");
        setField(term64395, term64395.getClass(), "my_qst_et", "GjdWUoUSyA");
        setField(term64395, term64395.getClass(), "p_std_ie_have", "YEkxWsWaUl");
        setField(term64395, term64395.getClass(), "p_std_se_have", "RINhPkhhct");
        setField(term64395, term64395.getClass(), "cmd", "vjNPcTSqmS");
        setField(term64395, term64395.getClass(), "req_id", "fFhdWuJbdC");
        setField(term64395, term64395.getClass(), "stat", "JlgLIHPabR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNxt_pv_id", argTypes, term64395, args);
    }

};


