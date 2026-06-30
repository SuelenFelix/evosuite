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

public class StartResponse_setCstmzitmhave_90918198378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164751;

    public StartResponse_setCstmzitmhave_90918198378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term165212 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term165211 = ((Class) term165212).getDeclaredField((String) "SUCCESS");
        ((Field) term165211).setAccessible(true);
        Object enum391 = ((Field) term165211).get((Object) null);
        Class<? extends Object> term165480 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term165479 = ((Class) term165480).getDeclaredField((String) "MY_LIST_A");
        ((Field) term165479).setAccessible(true);
        Object enum392 = ((Field) term165479).get((Object) null);
        Class<? extends Object> term165814 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term165813 = ((Class) term165814).getDeclaredField((String) "UNDEFINED");
        ((Field) term165813).setAccessible(true);
        Object enum393 = ((Field) term165813).get((Object) null);
        Class<? extends Object> term166098 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term166097 = ((Class) term166098).getDeclaredField((String) "ORIGINAL");
        ((Field) term166097).setAccessible(true);
        Object enum394 = ((Field) term166097).get((Object) null);
        Class<? extends Object> term166414 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term166413 = ((Class) term166414).getDeclaredField((String) "BRONZE");
        ((Field) term166413).setAccessible(true);
        Object enum395 = ((Field) term166413).get((Object) null);
        term164751 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term164849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164854 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term164751, term164751.getClass(), "pd_id", -1174440096);
        setField(term164751, term164751.getClass(), "start_result", enum391);
        setIntField(term164751, term164751.getClass(), "accept_idx", -679614653);
        setIntField(term164751, term164751.getClass(), "start_idx", -561851867);
        setField(term164751, term164751.getClass(), "player_name", "FcponInvBb");
        setIntField(term164751, term164751.getClass(), "hp_vol", -1809928454);
        setBooleanField(term164751, term164751.getClass(), "btn_se_vol", false);
        setIntField(term164751, term164751.getClass(), "btn_se_vol2", -191639503);
        setIntField(term164751, term164751.getClass(), "sldr_se_vol2", -1563700756);
        setField(term164751, term164751.getClass(), "sort_kind", enum392);
        setIntField(term164751, term164751.getClass(), "lv_num", -208314837);
        setIntField(term164751, term164751.getClass(), "lv_pnt", 697841387);
        setField(term164751, term164751.getClass(), "lv_str", "IFOOxmFxbX");
        setIntField(term164751, term164751.getClass(), "lv_efct_id", -1749591213);
        setIntField(term164751, term164751.getClass(), "lv_plt_id", 1703093401);
        setField(term164751, term164751.getClass(), "mdl_eqp_ary", "aDEuPKrSZt");
        setField(term164751, term164751.getClass(), "c_itm_eqp_ary", "aDhkmoCCUK");
        setField(term164751, term164751.getClass(), "ms_itm_flg_ary", "ibnuoVVkVm");
        setIntField(term164850, term164850.getClass(), "year", 2028);
        setShortField(term164850, term164850.getClass(), "month", (short) 5);
        setShortField(term164850, term164850.getClass(), "day", (short) 2);
        setField(term164849, term164849.getClass(), "date", term164850);
        setByteField(term164854, term164854.getClass(), "hour", (byte) 2);
        setByteField(term164854, term164854.getClass(), "minute", (byte) 59);
        setByteField(term164854, term164854.getClass(), "second", (byte) 30);
        setIntField(term164854, term164854.getClass(), "nano", 222274238);
        setField(term164849, term164849.getClass(), "time", term164854);
        setField(term164751, term164751.getClass(), "mdl_eqp_tm", term164849);
        setField(term164751, term164751.getClass(), "mdl_have", "mXVgkxjTjD");
        setField(term164751, term164751.getClass(), "cstmz_itm_have", "qodBmKUkev");
        setBooleanField(term164751, term164751.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term164751, term164751.getClass(), "use_mdl_pri", false);
        setBooleanField(term164751, term164751.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term164751, term164751.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term164751, term164751.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term164751, term164751.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term164751, term164751.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term164751, term164751.getClass(), "vcld_pts", 47607734);
        setIntField(term164751, term164751.getClass(), "nxt_pv_id", 1717232691);
        setField(term164751, term164751.getClass(), "nxt_dffclty", enum393);
        setField(term164751, term164751.getClass(), "nxt_edtn", enum394);
        setField(term164751, term164751.getClass(), "cv_cid", "QJuqwUQEyr");
        setField(term164751, term164751.getClass(), "cv_sc", "qqUAzxxpNB");
        setField(term164751, term164751.getClass(), "cv_rr", "WqaQxuPbzr");
        setField(term164751, term164751.getClass(), "cv_bv", "bjLZqJqmnv");
        setField(term164751, term164751.getClass(), "cv_bf", "TPbMBzbcHs");
        setIntField(term164751, term164751.getClass(), "cnp_cid", -938127737);
        setIntField(term164751, term164751.getClass(), "cnp_val", -1408678076);
        setField(term164751, term164751.getClass(), "cnp_rr", enum395);
        setField(term164751, term164751.getClass(), "cnp_sp", "spkDvqsOhJ");
        setField(term164751, term164751.getClass(), "my_lst_0", "faFVBESzWc");
        setField(term164751, term164751.getClass(), "my_lst_1", "baFwYJAfPz");
        setField(term164751, term164751.getClass(), "my_lst_2", "PxBSOwkatN");
        setField(term164751, term164751.getClass(), "my_lst_3", "uKjlgaHcoc");
        setField(term164751, term164751.getClass(), "my_lst_4", "ITJMSWaPGZ");
        setField(term164751, term164751.getClass(), "dsp_clr_brdr", "ivvEvcUacU");
        setBooleanField(term164751, term164751.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term164751, term164751.getClass(), "dsp_clr_sts", false);
        setField(term164751, term164751.getClass(), "clr_sts", "gbSukHPGfP");
        setBooleanField(term164751, term164751.getClass(), "rgo_sts", true);
        setField(term164751, term164751.getClass(), "my_qst_id", "jEDnJjwhoo");
        setField(term164751, term164751.getClass(), "my_qst_sts", "TkTHRRicKc");
        setField(term164751, term164751.getClass(), "my_qst_prgrs", "xwBoTnuoQg");
        setField(term164751, term164751.getClass(), "my_qst_et", "HHAcgDPghN");
        setField(term164751, term164751.getClass(), "p_std_ie_have", "GzmFcFoYft");
        setField(term164751, term164751.getClass(), "p_std_se_have", "LYRdIFgbgt");
        setField(term164751, term164751.getClass(), "cmd", "NiKeRXajei");
        setField(term164751, term164751.getClass(), "req_id", "fDNtdfDzQh");
        setField(term164751, term164751.getClass(), "stat", "VbIydgisyZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vigaMWRpCA";
        callMethod(klass, "setCstmz_itm_have", argTypes, term164751, args);
    }

};


