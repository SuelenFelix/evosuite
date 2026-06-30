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

public class PreStartResponse_getMdleqpary_80876312215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261165;

    public PreStartResponse_getMdleqpary_80876312215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term261322 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term261321 = ((Class) term261322).getDeclaredField((String) "NEW_REGISTRATION");
        ((Field) term261321).setAccessible(true);
        Object enum620 = ((Field) term261321).get((Object) null);
        Integer term261187 = new Integer(-571169753);
        Integer term261189 = new Integer(318591690);
        Integer term261191 = new Integer(-165587447);
        Integer term261193 = new Integer(-1347358701);
        Integer term261195 = new Integer(806595993);
        Class<? extends Object> term261657 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term261656 = ((Class) term261657).getDeclaredField((String) "MY_LIST_C");
        ((Field) term261656).setAccessible(true);
        Object enum621 = ((Field) term261656).get((Object) null);
        Integer term261223 = new Integer(548228925);
        Integer term261225 = new Integer(-749861210);
        Integer term261239 = new Integer(1694224101);
        Integer term261241 = new Integer(937859191);
        Integer term261265 = new Integer(-916584829);
        Integer term261267 = new Integer(-2131181468);
        Integer term261269 = new Integer(282916351);
        Integer term261271 = new Integer(880977281);
        Integer term261273 = new Integer(371943306);
        Integer term261275 = new Integer(982388293);
        Class<? extends Object> term261951 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term261950 = ((Class) term261951).getDeclaredField((String) "SET");
        ((Field) term261950).setAccessible(true);
        Object enum622 = ((Field) term261950).get((Object) null);
        term261165 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term261255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term261256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261260 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term261165, term261165.getClass(), "ps_result", enum620);
        setField(term261165, term261165.getClass(), "accept_idx", term261187);
        setField(term261165, term261165.getClass(), "nblss_ltt_stts", term261189);
        setField(term261165, term261165.getClass(), "nblss_ltt_tckt", term261191);
        setField(term261165, term261165.getClass(), "nblss_ltt_is_opn", term261193);
        setField(term261165, term261165.getClass(), "pd_id", term261195);
        setField(term261165, term261165.getClass(), "player_name", "FqpUNAOtmF");
        setField(term261165, term261165.getClass(), "sort_kind", enum621);
        setField(term261165, term261165.getClass(), "lv_num", term261223);
        setField(term261165, term261165.getClass(), "lv_pnt", term261225);
        setField(term261165, term261165.getClass(), "lv_str", "SpILHdKTKK");
        setField(term261165, term261165.getClass(), "lv_efct_id", term261239);
        setField(term261165, term261165.getClass(), "lv_plt_id", term261241);
        setField(term261165, term261165.getClass(), "mdl_eqp_ary", "LklQRqbChE");
        setIntField(term261256, term261256.getClass(), "year", 2019);
        setShortField(term261256, term261256.getClass(), "month", (short) 6);
        setShortField(term261256, term261256.getClass(), "day", (short) 12);
        setField(term261255, term261255.getClass(), "date", term261256);
        setByteField(term261260, term261260.getClass(), "hour", (byte) 5);
        setByteField(term261260, term261260.getClass(), "minute", (byte) 13);
        setByteField(term261260, term261260.getClass(), "second", (byte) 8);
        setIntField(term261260, term261260.getClass(), "nano", 838117658);
        setField(term261255, term261255.getClass(), "time", term261260);
        setField(term261165, term261165.getClass(), "mdl_eqp_tm", term261255);
        setField(term261165, term261165.getClass(), "skn_eqp", term261265);
        setField(term261165, term261165.getClass(), "btn_se_eqp", term261267);
        setField(term261165, term261165.getClass(), "sld_se_eqp", term261269);
        setField(term261165, term261165.getClass(), "chn_sld_se_eqp", term261271);
        setField(term261165, term261165.getClass(), "sldr_tch_se_eqp", term261273);
        setField(term261165, term261165.getClass(), "vcld_pts", term261275);
        setField(term261165, term261165.getClass(), "passwd_stat", enum622);
        setField(term261165, term261165.getClass(), "cmd", "wxbPKcvjhX");
        setField(term261165, term261165.getClass(), "req_id", "RmyltMpQEu");
        setField(term261165, term261165.getClass(), "stat", "ozlDkmzKuq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdl_eqp_ary", argTypes, term261165, args);
    }

};


