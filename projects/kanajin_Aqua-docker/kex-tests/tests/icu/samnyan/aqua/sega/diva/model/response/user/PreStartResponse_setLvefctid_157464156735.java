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

public class PreStartResponse_setLvefctid_157464156735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283153;
     Object term283303;

    public PreStartResponse_setLvefctid_157464156735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term283306 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term283305 = ((Class) term283306).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term283305).setAccessible(true);
        Object enum682 = ((Field) term283305).get((Object) null);
        Integer term283174 = new Integer(1207142014);
        Integer term283176 = new Integer(-876426634);
        Integer term283178 = new Integer(213831054);
        Integer term283180 = new Integer(330043745);
        Integer term283182 = new Integer(-509349195);
        Class<? extends Object> term283638 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term283637 = ((Class) term283638).getDeclaredField((String) "NAME");
        ((Field) term283637).setAccessible(true);
        Object enum683 = ((Field) term283637).get((Object) null);
        Integer term283205 = new Integer(-1639041228);
        Integer term283207 = new Integer(2027686272);
        Integer term283221 = new Integer(-1494356104);
        Integer term283223 = new Integer(-695279311);
        Integer term283247 = new Integer(114279242);
        Integer term283249 = new Integer(990883365);
        Integer term283251 = new Integer(633598642);
        Integer term283253 = new Integer(1862841859);
        Integer term283255 = new Integer(-1114668574);
        Integer term283257 = new Integer(514511037);
        Class<? extends Object> term283917 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term283916 = ((Class) term283917).getDeclaredField((String) "SET");
        ((Field) term283916).setAccessible(true);
        Object enum684 = ((Field) term283916).get((Object) null);
        term283153 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term283237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283242 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term283153, term283153.getClass(), "ps_result", enum682);
        setField(term283153, term283153.getClass(), "accept_idx", term283174);
        setField(term283153, term283153.getClass(), "nblss_ltt_stts", term283176);
        setField(term283153, term283153.getClass(), "nblss_ltt_tckt", term283178);
        setField(term283153, term283153.getClass(), "nblss_ltt_is_opn", term283180);
        setField(term283153, term283153.getClass(), "pd_id", term283182);
        setField(term283153, term283153.getClass(), "player_name", "WToYKUjMGj");
        setField(term283153, term283153.getClass(), "sort_kind", enum683);
        setField(term283153, term283153.getClass(), "lv_num", term283205);
        setField(term283153, term283153.getClass(), "lv_pnt", term283207);
        setField(term283153, term283153.getClass(), "lv_str", "wbtDRRVkMv");
        setField(term283153, term283153.getClass(), "lv_efct_id", term283221);
        setField(term283153, term283153.getClass(), "lv_plt_id", term283223);
        setField(term283153, term283153.getClass(), "mdl_eqp_ary", "abzzbYwTRo");
        setIntField(term283238, term283238.getClass(), "year", 2015);
        setShortField(term283238, term283238.getClass(), "month", (short) 2);
        setShortField(term283238, term283238.getClass(), "day", (short) 1);
        setField(term283237, term283237.getClass(), "date", term283238);
        setByteField(term283242, term283242.getClass(), "hour", (byte) 11);
        setByteField(term283242, term283242.getClass(), "minute", (byte) 31);
        setByteField(term283242, term283242.getClass(), "second", (byte) 24);
        setIntField(term283242, term283242.getClass(), "nano", 461437823);
        setField(term283237, term283237.getClass(), "time", term283242);
        setField(term283153, term283153.getClass(), "mdl_eqp_tm", term283237);
        setField(term283153, term283153.getClass(), "skn_eqp", term283247);
        setField(term283153, term283153.getClass(), "btn_se_eqp", term283249);
        setField(term283153, term283153.getClass(), "sld_se_eqp", term283251);
        setField(term283153, term283153.getClass(), "chn_sld_se_eqp", term283253);
        setField(term283153, term283153.getClass(), "sldr_tch_se_eqp", term283255);
        setField(term283153, term283153.getClass(), "vcld_pts", term283257);
        setField(term283153, term283153.getClass(), "passwd_stat", enum684);
        setField(term283153, term283153.getClass(), "cmd", "HxIZqtNMYu");
        setField(term283153, term283153.getClass(), "req_id", "NVlTBmmeHa");
        setField(term283153, term283153.getClass(), "stat", "QZomwNJvGF");
        term283303 = new Integer(1713573821);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term283303;
        callMethod(klass, "setLv_efct_id", argTypes, term283153, args);
    }

};


