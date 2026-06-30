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

public class StartResponse_setCnprr_200181429697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204519;
     Object enum491;

    public StartResponse_setCnprr_200181429697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term204974 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term204973 = ((Class) term204974).getDeclaredField((String) "SUCCESS");
        ((Field) term204973).setAccessible(true);
        Object enum486 = ((Field) term204973).get((Object) null);
        Class<? extends Object> term205242 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term205241 = ((Class) term205242).getDeclaredField((String) "MY_LIST_A");
        ((Field) term205241).setAccessible(true);
        Object enum487 = ((Field) term205241).get((Object) null);
        Class<? extends Object> term205576 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term205575 = ((Class) term205576).getDeclaredField((String) "UNDEFINED");
        ((Field) term205575).setAccessible(true);
        Object enum488 = ((Field) term205575).get((Object) null);
        Class<? extends Object> term205860 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term205859 = ((Class) term205860).getDeclaredField((String) "EXTRA");
        ((Field) term205859).setAccessible(true);
        Object enum489 = ((Field) term205859).get((Object) null);
        Class<? extends Object> term206167 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term206166 = ((Class) term206167).getDeclaredField((String) "SILVER");
        ((Field) term206166).setAccessible(true);
        Object enum490 = ((Field) term206166).get((Object) null);
        term204519 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term204617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204622 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term204519, term204519.getClass(), "pd_id", 2075139747);
        setField(term204519, term204519.getClass(), "start_result", enum486);
        setIntField(term204519, term204519.getClass(), "accept_idx", 2092881418);
        setIntField(term204519, term204519.getClass(), "start_idx", 1732410866);
        setField(term204519, term204519.getClass(), "player_name", "xxswizwuwy");
        setIntField(term204519, term204519.getClass(), "hp_vol", 1084102599);
        setBooleanField(term204519, term204519.getClass(), "btn_se_vol", true);
        setIntField(term204519, term204519.getClass(), "btn_se_vol2", -1743503755);
        setIntField(term204519, term204519.getClass(), "sldr_se_vol2", 1641342112);
        setField(term204519, term204519.getClass(), "sort_kind", enum487);
        setIntField(term204519, term204519.getClass(), "lv_num", -1551790945);
        setIntField(term204519, term204519.getClass(), "lv_pnt", 2039538484);
        setField(term204519, term204519.getClass(), "lv_str", "QbkfeBvHco");
        setIntField(term204519, term204519.getClass(), "lv_efct_id", 1235736068);
        setIntField(term204519, term204519.getClass(), "lv_plt_id", 329424176);
        setField(term204519, term204519.getClass(), "mdl_eqp_ary", "lLaCGEQqCV");
        setField(term204519, term204519.getClass(), "c_itm_eqp_ary", "bYFQVigzOV");
        setField(term204519, term204519.getClass(), "ms_itm_flg_ary", "TXKwwgcTVt");
        setIntField(term204618, term204618.getClass(), "year", 2019);
        setShortField(term204618, term204618.getClass(), "month", (short) 8);
        setShortField(term204618, term204618.getClass(), "day", (short) 12);
        setField(term204617, term204617.getClass(), "date", term204618);
        setByteField(term204622, term204622.getClass(), "hour", (byte) 14);
        setByteField(term204622, term204622.getClass(), "minute", (byte) 1);
        setByteField(term204622, term204622.getClass(), "second", (byte) 51);
        setIntField(term204622, term204622.getClass(), "nano", 499021786);
        setField(term204617, term204617.getClass(), "time", term204622);
        setField(term204519, term204519.getClass(), "mdl_eqp_tm", term204617);
        setField(term204519, term204519.getClass(), "mdl_have", "FgaHDSytdu");
        setField(term204519, term204519.getClass(), "cstmz_itm_have", "cmIDVqeLNI");
        setBooleanField(term204519, term204519.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term204519, term204519.getClass(), "use_mdl_pri", false);
        setBooleanField(term204519, term204519.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term204519, term204519.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term204519, term204519.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term204519, term204519.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term204519, term204519.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term204519, term204519.getClass(), "vcld_pts", -1897199214);
        setIntField(term204519, term204519.getClass(), "nxt_pv_id", -1016478729);
        setField(term204519, term204519.getClass(), "nxt_dffclty", enum488);
        setField(term204519, term204519.getClass(), "nxt_edtn", enum489);
        setField(term204519, term204519.getClass(), "cv_cid", "XoYlWxsjIF");
        setField(term204519, term204519.getClass(), "cv_sc", "xkIacuRHpE");
        setField(term204519, term204519.getClass(), "cv_rr", "xFULXQCABK");
        setField(term204519, term204519.getClass(), "cv_bv", "ONotPjASxK");
        setField(term204519, term204519.getClass(), "cv_bf", "LzgtTgYOFG");
        setIntField(term204519, term204519.getClass(), "cnp_cid", -206889003);
        setIntField(term204519, term204519.getClass(), "cnp_val", 638046409);
        setField(term204519, term204519.getClass(), "cnp_rr", enum490);
        setField(term204519, term204519.getClass(), "cnp_sp", "ouCBOakoEl");
        setField(term204519, term204519.getClass(), "my_lst_0", "wQVWUCbSgW");
        setField(term204519, term204519.getClass(), "my_lst_1", "tHzdWkkvkE");
        setField(term204519, term204519.getClass(), "my_lst_2", "OeOnaLqxoy");
        setField(term204519, term204519.getClass(), "my_lst_3", "buRlIDjuAa");
        setField(term204519, term204519.getClass(), "my_lst_4", "qDicwPaclz");
        setField(term204519, term204519.getClass(), "dsp_clr_brdr", "eZlPEKWGYm");
        setBooleanField(term204519, term204519.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term204519, term204519.getClass(), "dsp_clr_sts", true);
        setField(term204519, term204519.getClass(), "clr_sts", "KuunqhygWm");
        setBooleanField(term204519, term204519.getClass(), "rgo_sts", true);
        setField(term204519, term204519.getClass(), "my_qst_id", "wKOfSnwiZS");
        setField(term204519, term204519.getClass(), "my_qst_sts", "oIlPhWewqE");
        setField(term204519, term204519.getClass(), "my_qst_prgrs", "IfOJiWUkHp");
        setField(term204519, term204519.getClass(), "my_qst_et", "YQNWnfnWil");
        setField(term204519, term204519.getClass(), "p_std_ie_have", "ChmRdUmCnQ");
        setField(term204519, term204519.getClass(), "p_std_se_have", "WbDSdFiKLp");
        setField(term204519, term204519.getClass(), "cmd", "DNeKwjPiYD");
        setField(term204519, term204519.getClass(), "req_id", "jxryzEuKJL");
        setField(term204519, term204519.getClass(), "stat", "EPCordSkfF");
        Class<? extends Object> term206627 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term206626 = ((Class) term206627).getDeclaredField((String) "GOLD");
        ((Field) term206626).setAccessible(true);
        enum491 = ((Field) term206626).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Object[] args = new Object[1];
        args[0] = enum491;
        callMethod(klass, "setCnp_rr", argTypes, term204519, args);
    }

};


