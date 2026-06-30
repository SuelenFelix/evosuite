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

public class StartResponse_getMylst3_150609818045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95585;

    public StartResponse_getMylst3_150609818045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96026 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term96025 = ((Class) term96026).getDeclaredField((String) "SUCCESS");
        ((Field) term96025).setAccessible(true);
        Object enum225 = ((Field) term96025).get((Object) null);
        Class<? extends Object> term96294 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term96293 = ((Class) term96294).getDeclaredField((String) "MY_LIST_C");
        ((Field) term96293).setAccessible(true);
        Object enum226 = ((Field) term96293).get((Object) null);
        Class<? extends Object> term96628 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term96627 = ((Class) term96628).getDeclaredField((String) "NORMAL");
        ((Field) term96627).setAccessible(true);
        Object enum227 = ((Field) term96627).get((Object) null);
        Class<? extends Object> term96903 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term96902 = ((Class) term96903).getDeclaredField((String) "EXTRA");
        ((Field) term96902).setAccessible(true);
        Object enum228 = ((Field) term96902).get((Object) null);
        Class<? extends Object> term97210 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term97209 = ((Class) term97210).getDeclaredField((String) "GOLD");
        ((Field) term97209).setAccessible(true);
        Object enum229 = ((Field) term97209).get((Object) null);
        term95585 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term95683 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95684 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95688 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term95585, term95585.getClass(), "pd_id", 1053773809);
        setField(term95585, term95585.getClass(), "start_result", enum225);
        setIntField(term95585, term95585.getClass(), "accept_idx", 924127883);
        setIntField(term95585, term95585.getClass(), "start_idx", -751079123);
        setField(term95585, term95585.getClass(), "player_name", "avZoBQSrBy");
        setIntField(term95585, term95585.getClass(), "hp_vol", -110837188);
        setBooleanField(term95585, term95585.getClass(), "btn_se_vol", false);
        setIntField(term95585, term95585.getClass(), "btn_se_vol2", -271094506);
        setIntField(term95585, term95585.getClass(), "sldr_se_vol2", 455632030);
        setField(term95585, term95585.getClass(), "sort_kind", enum226);
        setIntField(term95585, term95585.getClass(), "lv_num", -1632929393);
        setIntField(term95585, term95585.getClass(), "lv_pnt", -431440129);
        setField(term95585, term95585.getClass(), "lv_str", "KIXGeHXdwi");
        setIntField(term95585, term95585.getClass(), "lv_efct_id", -763576148);
        setIntField(term95585, term95585.getClass(), "lv_plt_id", 1568948514);
        setField(term95585, term95585.getClass(), "mdl_eqp_ary", "tTfdvLMwEE");
        setField(term95585, term95585.getClass(), "c_itm_eqp_ary", "DiSkERzqOE");
        setField(term95585, term95585.getClass(), "ms_itm_flg_ary", "hPSZZeYqHQ");
        setIntField(term95684, term95684.getClass(), "year", 2017);
        setShortField(term95684, term95684.getClass(), "month", (short) 4);
        setShortField(term95684, term95684.getClass(), "day", (short) 3);
        setField(term95683, term95683.getClass(), "date", term95684);
        setByteField(term95688, term95688.getClass(), "hour", (byte) 6);
        setByteField(term95688, term95688.getClass(), "minute", (byte) 51);
        setByteField(term95688, term95688.getClass(), "second", (byte) 10);
        setIntField(term95688, term95688.getClass(), "nano", 316377166);
        setField(term95683, term95683.getClass(), "time", term95688);
        setField(term95585, term95585.getClass(), "mdl_eqp_tm", term95683);
        setField(term95585, term95585.getClass(), "mdl_have", "scReMUKyGq");
        setField(term95585, term95585.getClass(), "cstmz_itm_have", "FmIpnxjRxA");
        setBooleanField(term95585, term95585.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term95585, term95585.getClass(), "use_mdl_pri", true);
        setBooleanField(term95585, term95585.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term95585, term95585.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term95585, term95585.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term95585, term95585.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term95585, term95585.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term95585, term95585.getClass(), "vcld_pts", -1511130237);
        setIntField(term95585, term95585.getClass(), "nxt_pv_id", 452088587);
        setField(term95585, term95585.getClass(), "nxt_dffclty", enum227);
        setField(term95585, term95585.getClass(), "nxt_edtn", enum228);
        setField(term95585, term95585.getClass(), "cv_cid", "FTjxxGvyun");
        setField(term95585, term95585.getClass(), "cv_sc", "qsjXSwKloH");
        setField(term95585, term95585.getClass(), "cv_rr", "DDZHUPglvb");
        setField(term95585, term95585.getClass(), "cv_bv", "rWoaXvNyVg");
        setField(term95585, term95585.getClass(), "cv_bf", "FLzaBCFjGv");
        setIntField(term95585, term95585.getClass(), "cnp_cid", -1630069454);
        setIntField(term95585, term95585.getClass(), "cnp_val", 1499735894);
        setField(term95585, term95585.getClass(), "cnp_rr", enum229);
        setField(term95585, term95585.getClass(), "cnp_sp", "OLYhTSqTqJ");
        setField(term95585, term95585.getClass(), "my_lst_0", "AIHoadcpQz");
        setField(term95585, term95585.getClass(), "my_lst_1", "fWMsLtuOEV");
        setField(term95585, term95585.getClass(), "my_lst_2", "fvgZQBalnd");
        setField(term95585, term95585.getClass(), "my_lst_3", "tViQSKUCLE");
        setField(term95585, term95585.getClass(), "my_lst_4", "QbaeHheqiP");
        setField(term95585, term95585.getClass(), "dsp_clr_brdr", "gASHxChKwn");
        setBooleanField(term95585, term95585.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term95585, term95585.getClass(), "dsp_clr_sts", false);
        setField(term95585, term95585.getClass(), "clr_sts", "iasolXlEEn");
        setBooleanField(term95585, term95585.getClass(), "rgo_sts", true);
        setField(term95585, term95585.getClass(), "my_qst_id", "cAObIvLmLo");
        setField(term95585, term95585.getClass(), "my_qst_sts", "xwiCqRSWSe");
        setField(term95585, term95585.getClass(), "my_qst_prgrs", "IbUFkzIgzq");
        setField(term95585, term95585.getClass(), "my_qst_et", "dTOUSTDdbw");
        setField(term95585, term95585.getClass(), "p_std_ie_have", "PECfBejlfo");
        setField(term95585, term95585.getClass(), "p_std_se_have", "SDbDgydVpg");
        setField(term95585, term95585.getClass(), "cmd", "EEMaiNkiOH");
        setField(term95585, term95585.getClass(), "req_id", "sFdmTylvqh");
        setField(term95585, term95585.getClass(), "stat", "rgniLaOaiz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_lst_3", argTypes, term95585, args);
    }

};


