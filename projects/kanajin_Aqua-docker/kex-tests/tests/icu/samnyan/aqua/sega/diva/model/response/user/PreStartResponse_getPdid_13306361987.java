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
import java.lang.Integer;

public class PreStartResponse_getPdid_13306361987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252625;

    public PreStartResponse_getPdid_13306361987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term252783 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term252782 = ((Class) term252783).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term252782).setAccessible(true);
        Object enum596 = ((Field) term252782).get((Object) null);
        Integer term252646 = new Integer(1442160736);
        Integer term252648 = new Integer(1114000454);
        Integer term252650 = new Integer(-556405712);
        Integer term252652 = new Integer(-1772434990);
        Integer term252654 = new Integer(-1845499264);
        Class<? extends Object> term253115 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term253114 = ((Class) term253115).getDeclaredField((String) "MY_LIST_C");
        ((Field) term253114).setAccessible(true);
        Object enum597 = ((Field) term253114).get((Object) null);
        Integer term252682 = new Integer(-505439934);
        Integer term252684 = new Integer(-344842608);
        Integer term252698 = new Integer(941650513);
        Integer term252700 = new Integer(444029505);
        Integer term252724 = new Integer(-1034506028);
        Integer term252726 = new Integer(-1263114719);
        Integer term252728 = new Integer(-894662986);
        Integer term252730 = new Integer(304775596);
        Integer term252732 = new Integer(-1347665717);
        Integer term252734 = new Integer(-1888585309);
        Class<? extends Object> term253409 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term253408 = ((Class) term253409).getDeclaredField((String) "RESET");
        ((Field) term253408).setAccessible(true);
        Object enum598 = ((Field) term253408).get((Object) null);
        term252625 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term252714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252719 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term252625, term252625.getClass(), "ps_result", enum596);
        setField(term252625, term252625.getClass(), "accept_idx", term252646);
        setField(term252625, term252625.getClass(), "nblss_ltt_stts", term252648);
        setField(term252625, term252625.getClass(), "nblss_ltt_tckt", term252650);
        setField(term252625, term252625.getClass(), "nblss_ltt_is_opn", term252652);
        setField(term252625, term252625.getClass(), "pd_id", term252654);
        setField(term252625, term252625.getClass(), "player_name", "jVdmaiSLFy");
        setField(term252625, term252625.getClass(), "sort_kind", enum597);
        setField(term252625, term252625.getClass(), "lv_num", term252682);
        setField(term252625, term252625.getClass(), "lv_pnt", term252684);
        setField(term252625, term252625.getClass(), "lv_str", "QySSrixSJt");
        setField(term252625, term252625.getClass(), "lv_efct_id", term252698);
        setField(term252625, term252625.getClass(), "lv_plt_id", term252700);
        setField(term252625, term252625.getClass(), "mdl_eqp_ary", "UgIqArPAat");
        setIntField(term252715, term252715.getClass(), "year", 2014);
        setShortField(term252715, term252715.getClass(), "month", (short) 1);
        setShortField(term252715, term252715.getClass(), "day", (short) 26);
        setField(term252714, term252714.getClass(), "date", term252715);
        setByteField(term252719, term252719.getClass(), "hour", (byte) 3);
        setByteField(term252719, term252719.getClass(), "minute", (byte) 31);
        setByteField(term252719, term252719.getClass(), "second", (byte) 56);
        setIntField(term252719, term252719.getClass(), "nano", 100873602);
        setField(term252714, term252714.getClass(), "time", term252719);
        setField(term252625, term252625.getClass(), "mdl_eqp_tm", term252714);
        setField(term252625, term252625.getClass(), "skn_eqp", term252724);
        setField(term252625, term252625.getClass(), "btn_se_eqp", term252726);
        setField(term252625, term252625.getClass(), "sld_se_eqp", term252728);
        setField(term252625, term252625.getClass(), "chn_sld_se_eqp", term252730);
        setField(term252625, term252625.getClass(), "sldr_tch_se_eqp", term252732);
        setField(term252625, term252625.getClass(), "vcld_pts", term252734);
        setField(term252625, term252625.getClass(), "passwd_stat", enum598);
        setField(term252625, term252625.getClass(), "cmd", "cAfXSAOdaf");
        setField(term252625, term252625.getClass(), "req_id", "gFWxmEVAsk");
        setField(term252625, term252625.getClass(), "stat", "LmtyEJAnHW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term252625, args);
    }

};


