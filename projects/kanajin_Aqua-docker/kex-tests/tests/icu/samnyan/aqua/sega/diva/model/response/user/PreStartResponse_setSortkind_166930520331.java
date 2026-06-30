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

public class PreStartResponse_setSortkind_166930520331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278551;
     Object enum672;

    public PreStartResponse_setSortkind_166930520331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term278720 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term278719 = ((Class) term278720).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term278719).setAccessible(true);
        Object enum669 = ((Field) term278719).get((Object) null);
        Integer term278572 = new Integer(-1867239125);
        Integer term278574 = new Integer(952869601);
        Integer term278576 = new Integer(91958879);
        Integer term278578 = new Integer(-645429025);
        Integer term278580 = new Integer(-688213483);
        Class<? extends Object> term279052 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term279051 = ((Class) term279052).getDeclaredField((String) "NAME");
        ((Field) term279051).setAccessible(true);
        Object enum670 = ((Field) term279051).get((Object) null);
        Integer term278603 = new Integer(644154104);
        Integer term278605 = new Integer(76650923);
        Integer term278619 = new Integer(1003743923);
        Integer term278621 = new Integer(1887772522);
        Integer term278645 = new Integer(354196060);
        Integer term278647 = new Integer(-1840305774);
        Integer term278649 = new Integer(1365087144);
        Integer term278651 = new Integer(-1537255112);
        Integer term278653 = new Integer(934477462);
        Integer term278655 = new Integer(4900410);
        Class<? extends Object> term279331 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term279330 = ((Class) term279331).getDeclaredField((String) "REISSUE");
        ((Field) term279330).setAccessible(true);
        Object enum671 = ((Field) term279330).get((Object) null);
        term278551 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term278635 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278636 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278640 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term278551, term278551.getClass(), "ps_result", enum669);
        setField(term278551, term278551.getClass(), "accept_idx", term278572);
        setField(term278551, term278551.getClass(), "nblss_ltt_stts", term278574);
        setField(term278551, term278551.getClass(), "nblss_ltt_tckt", term278576);
        setField(term278551, term278551.getClass(), "nblss_ltt_is_opn", term278578);
        setField(term278551, term278551.getClass(), "pd_id", term278580);
        setField(term278551, term278551.getClass(), "player_name", "pzvYCQwkoA");
        setField(term278551, term278551.getClass(), "sort_kind", enum670);
        setField(term278551, term278551.getClass(), "lv_num", term278603);
        setField(term278551, term278551.getClass(), "lv_pnt", term278605);
        setField(term278551, term278551.getClass(), "lv_str", "TGLDiqWTkO");
        setField(term278551, term278551.getClass(), "lv_efct_id", term278619);
        setField(term278551, term278551.getClass(), "lv_plt_id", term278621);
        setField(term278551, term278551.getClass(), "mdl_eqp_ary", "NwjEUxXUkk");
        setIntField(term278636, term278636.getClass(), "year", 2018);
        setShortField(term278636, term278636.getClass(), "month", (short) 5);
        setShortField(term278636, term278636.getClass(), "day", (short) 22);
        setField(term278635, term278635.getClass(), "date", term278636);
        setByteField(term278640, term278640.getClass(), "hour", (byte) 16);
        setByteField(term278640, term278640.getClass(), "minute", (byte) 46);
        setByteField(term278640, term278640.getClass(), "second", (byte) 48);
        setIntField(term278640, term278640.getClass(), "nano", 72983043);
        setField(term278635, term278635.getClass(), "time", term278640);
        setField(term278551, term278551.getClass(), "mdl_eqp_tm", term278635);
        setField(term278551, term278551.getClass(), "skn_eqp", term278645);
        setField(term278551, term278551.getClass(), "btn_se_eqp", term278647);
        setField(term278551, term278551.getClass(), "sld_se_eqp", term278649);
        setField(term278551, term278551.getClass(), "chn_sld_se_eqp", term278651);
        setField(term278551, term278551.getClass(), "sldr_tch_se_eqp", term278653);
        setField(term278551, term278551.getClass(), "vcld_pts", term278655);
        setField(term278551, term278551.getClass(), "passwd_stat", enum671);
        setField(term278551, term278551.getClass(), "cmd", "CFBoXISoRu");
        setField(term278551, term278551.getClass(), "req_id", "gRmiKAUyCW");
        setField(term278551, term278551.getClass(), "stat", "rfXVAViErl");
        Class<? extends Object> term279629 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term279628 = ((Class) term279629).getDeclaredField((String) "MY_LIST_A");
        ((Field) term279628).setAccessible(true);
        enum672 = ((Field) term279628).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Object[] args = new Object[1];
        args[0] = enum672;
        callMethod(klass, "setSort_kind", argTypes, term278551, args);
    }

};


